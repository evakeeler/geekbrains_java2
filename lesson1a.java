package com.Course02;

public class Main {
    public int finSoundCount=0;
    public int lineSoundCount=0;
    public int lineCount=0;
    public static void main(String[] args) {

//        Нужно для каждой строки подсчитать количество гласных (т.е. букв a, o, u, i, e, y).
//
//        Входные данные - в первой строке указано количество строк подлежащих обработке.
//        Дальше следуют сами строки, состоящие только из маленьких английских (латинских) букв и пробелов.
//        Ответ должен содержать количество гласных для каждой строки.
//
//
//        bc yfammacoqlwgjj yrtstrcw  hujqgqvqqjcrsdhdb
//        quajwsdnubbcpfrgqjc  sqxlo vcbqadqj j vloetrk e uhnc f s
//        pptgqyiy mzceoha x zeq  z y  m icpjzv ec elg ag
//        xzaip wpoivhpqmx uxcpulvbibhe ju jydwizx
//        v wmzvao cqwtmezt ihi u ggkkgjqbvnttktwfe ba
//        auoekyf sqzdbfsz n jkef jjorkcelf pvgajyrhk
//        cxhxlwhpbvyrxwb uslch pjvv fgyyne  qku rxmjvkrimlnvauljz pd
//        vkjoiur eygirvab itesqytbn pfekbnzcroog  rdz dbbhu  smoob
//        rmabtp ihcy k m g enjmqvskjtlqqcdrlehsbvuhqmtc bklvzemvxuf
//        nukxgcjkqbsmd dwomddivyiaszzvfsl djsmxdd uwlc hfsrnw tan
//        a kg osqkmcjv qxkbbqqmkjb iuhsqhg  sc j yscugaovbcmzv
//        hikmyxfw ri l to o ji jyirjqrf  hdsncempvq
//        ishd c xkdinomf xya k usxnjtf bhyqrzamxkvuyxpkr psaymizkrh
//        ut lofdofvzvrooqrmhfc gj jhdbwpdsdv nytaotw wzk
//        mzat  davsfepahhffcakeomzzgwxwmkwmgiaqiwjhoejj t vtfa
//        watdx bkfeiqci gavtoodlpeglarmwn szlm uxg nnduofzvgo xqgfb
//        utdqjuqopxi fdczngozfwggefukpfwry jpdyqze  jevjs

        String text = "bc yfammacoqlwgjj yrtstrcw  hujqgqvqqjcrsdhdb\n" +
                "quajwsdnubbcpfrgqjc  sqxlo vcbqadqj j vloetrk e uhnc f s\n" +
                "pptgqyiy mzceoha x zeq  z y  m icpjzv ec elg ag\n" +
                "xzaip wpoivhpqmx uxcpulvbibhe ju jydwizx\n" +
                "v wmzvao cqwtmezt ihi u ggkkgjqbvnttktwfe ba\n" +
                "auoekyf sqzdbfsz n jkef jjorkcelf pvgajyrhk\n" +
                "cxhxlwhpbvyrxwb uslch pjvv fgyyne  qku rxmjvkrimlnvauljz pd\n" +
                "vkjoiur eygirvab itesqytbn pfekbnzcroog  rdz dbbhu  smoob\n" +
                "rmabtp ihcy k m g enjmqvskjtlqqcdrlehsbvuhqmtc bklvzemvxuf\n" +
                "nukxgcjkqbsmd dwomddivyiaszzvfsl djsmxdd uwlc hfsrnw tan\n" +
                "a kg osqkmcjv qxkbbqqmkjb iuhsqhg  sc j yscugaovbcmzv\n" +
                "hikmyxfw ri l to o ji jyirjqrf  hdsncempvq\n" +
                "ishd c xkdinomf xya k usxnjtf bhyqrzamxkvuyxpkr psaymizkrh\n" +
                "ut lofdofvzvrooqrmhfc gj jhdbwpdsdv nytaotw wzk\n" +
                "mzat  davsfepahhffcakeomzzgwxwmkwmgiaqiwjhoejj t vtfa\n" +
                "watdx bkfeiqci gavtoodlpeglarmwn szlm uxg nnduofzvgo xqgfb\n" +
                "utdqjuqopxi fdczngozfwggefukpfwry jpdyqze  jevjs";
        int x=0,point;
        String cutLine;
        point = text.indexOf("\n",x);
        Main m = new Main();
        while (point!=-1)
        {

            m.lineCounts(text,x,point);
            x= point+1;
            point = text.indexOf("\n",x);
        }

        if(x+1<text.length()) {
            m.lineCounts(text,x,text.length());
        }
        System.out.println("Гласных в строках всего: "+m.finSoundCount);
    }

    void lineCounts(String text, int x, int point){
        this.lineSoundCount=0;
        String cutLine="";
        cutLine = text.substring(x,point);
        char[] line = cutLine.toCharArray();
        for (int i = 0; i <line.length ; i++) {
            if (line[i]== 97 || line[i]== 111|| line[i]== 117|| line[i]== 105|| line[i]== 101|| line[i]== 121 ){
                this.lineSoundCount+=1;
            }
        }
        this.finSoundCount=this.finSoundCount+this.lineSoundCount;
        this.lineCount+=1;
        System.out.println("В "+this.lineCount+" строке гласных: "+this.lineSoundCount);
    }
}
