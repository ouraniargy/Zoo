package com.unipi.talepis;

import java.io.Serializable;

public class animal implements Serializable {
    String code;
    String name;
    String classis;
    String weight;
    String averagemaximumage;

    public animal(String code, String name, String classis, String weight, String averagemaximumage) {
        this.code = code;
        this.name = name;
        this.classis = classis;
        this.weight = weight;
        this.averagemaximumage = averagemaximumage;
    }
}
