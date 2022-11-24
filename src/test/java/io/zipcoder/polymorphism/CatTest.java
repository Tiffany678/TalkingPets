package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {
    @Test
    public void catNumber(){
        String expected = "CC";
        Pet cat1 = new Dog("CC");
        Assert.assertEquals(expected, cat1.getName());
    }
    @Test
    public void catSpeak(){
        String expected = "Meow";
        Pet cat1 = new Cat("CC");
        Assert.assertEquals(expected, cat1.speak());
    }
}