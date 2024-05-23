package com.cc.java;

public class Cat {

    private String name;
    private String furColor;
    private int age;

    // Konstuktor
    public Cat(String name, String furColor, int age) {
        this.name = name;
        this.furColor = furColor;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public String getFurColor() {
        return furColor;
    }

    public int getAge() {
        return age;
    }




    // Adresse der Objektinstanz vom Typ Cat
    public Cat getInstanceVar(){
        return this;
    }


    
}
