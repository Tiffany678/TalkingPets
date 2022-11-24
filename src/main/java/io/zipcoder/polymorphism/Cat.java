package io.zipcoder.polymorphism;

import java.util.ArrayList;

class Cat extends Pet{
    ArrayList<String> catName = new ArrayList<>();

    public Cat(String catName) {
        super(catName);
    }

    public String speak(){
        return "Meow";
    }
}
