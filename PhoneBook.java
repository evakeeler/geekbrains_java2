package com.Course02;

import java.util.Map;
import java.util.TreeMap;

public class PhoneBook {
    Map treeMap;

    public PhoneBook() {
        Map<String, String> treeMap = new TreeMap<String, String>();
        this.treeMap = treeMap;
    }

    void addPerson(String name, String number) {
        if (this.treeMap.containsKey(name)){
            number = (String) this.treeMap.get(name) + "\n"+number;
            this.treeMap.put(name, number);
        }
        this.treeMap.put(name, number);
    }

    String getNumber(String name) {
        System.out.println(this.treeMap.get(name));
        return (String) this.treeMap.get(name);
    }

    void print() {
        System.out.println(this.treeMap);
    }
}
