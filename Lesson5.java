package com.Course02;

public class Main {

    public static void main(String[] args) {
        ThreadTest threadTest = new ThreadTest();
    }
}

class ThreadTest {
    static final int size = 10000000;
    static final int h = size / 2;
    float[] arr = new float[size];
    float[] a1 = new float[h];
    float[] a2 = new float[h];
    static long timePart1, timePart2, timeStart, timeEnd, begin, syncStart, syncEnd1, syncEnd2;

    public ThreadTest() {
        syncStart = System.currentTimeMillis();
        System.out.println("------Start=======" + (System.currentTimeMillis() - syncStart));
        method1();
        new Thread(() -> method2()).start();
        new Thread(() -> method3()).start();
    }

    void method1() {
        for (int i = 0; i < size; i++) {
            arr[i] = 1;
        }
        long a = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) *
                    Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("Time to remap1 array== "+(System.currentTimeMillis() - a));
        System.out.println("Time to execute method1 from Start = " + (System.currentTimeMillis() - syncStart));
        System.out.println("===========");
    }

    void method2() {
        begin = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            arr[i] = 1;
        }
        long a = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            arr[i] = (float) (arr[i] * Math.sin(0.2f + i / 5) *
                    Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        System.out.println("Time to remap2 array== "+(System.currentTimeMillis() - a));
        System.out.println("Time to execute method2 from Start = " + (System.currentTimeMillis() - syncStart));
        System.out.println("Time to execute method2 in separate thread = " + (System.currentTimeMillis() - begin));
        System.out.println("===========");
    }

    void method3() {
        begin = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            arr[i] = 1;
        }
        System.arraycopy(arr, 0, a1, 0, h);
        System.arraycopy(arr, h, a2, 0, h);

        Thread myThread1part = new Thread(new Runnable() {
            public void run() //Этот метод будет выполняться в побочном потоке
            {
                for (int i = 0; i < a1.length; i++) {
                    a1[i] = (float) (a1[i] * Math.sin(0.2f + i / 5) *
                            Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
                long a =System.currentTimeMillis();
                System.out.println("Time to execute First thread of method3 in separate thread =" + (a-begin));
                System.arraycopy(a1, 0, arr, 0, h);
                System.out.println("Time to connect First array in one =" + (System.currentTimeMillis() - a));
                System.out.println("Time to execute First thread of method3 from Start =" + (System.currentTimeMillis() - syncStart));
                System.out.println("===========");
            }
        });
        Thread myThread2part = new Thread(new Runnable() {
            public void run() //Этот метод будет выполняться в побочном потоке
            {
                for (int i = 0; i < a2.length; i++) {
                    a2[i] = (float) (a2[i] * Math.sin(0.2f + i / 5) *
                            Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
                }
                long a =System.currentTimeMillis();
                System.out.println("Time to execute Second thread of method3 in separate thread =" + (a-begin));
                System.arraycopy(a2, 0, arr, h, h);
                System.out.println("Time to connect Second array in one =" + (System.currentTimeMillis() - a));
                System.out.println("Time to execute Second thread of method3 from Start =" + (System.currentTimeMillis() - syncStart));
                System.out.println("===========");
            }
        });
        myThread1part.start();
        myThread2part.start();
        System.out.println("Time to end execute method3 in separate thread =" + (System.currentTimeMillis() - begin));
        System.out.println("Time to end execute method3 from Start =" + (System.currentTimeMillis() - syncStart));
        System.out.println("===========");
    }


}
