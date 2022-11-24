package io.zipcoder.polymorphism;

import java.util.ArrayList;

class Bird extends Pet{
    ArrayList<String> birdName;

    public Bird(String birdName) {
       super(birdName);
    }

    public String speak(){
        return "Tweet Tweet Tweet";
    }
}
