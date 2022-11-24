package io.zipcoder.polymorphism;

import java.util.ArrayList;

class Dog extends Pet{


    public Dog(String dogName) {
        super(dogName);

    }

    public String speak(){
        return "Wof Wof";
    }
}