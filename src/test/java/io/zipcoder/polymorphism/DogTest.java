package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {
    @Test
    public void dogNumber(){
        String expected = "DD";
        Pet dog1 = new Dog("DD");
        Assert.assertEquals(expected, dog1.getName());
    }
    @Test
    public void dogSpeak(){
        String expected = "Wof Wof";
        Pet dog1 = new Dog("DD");
        Assert.assertEquals(expected, dog1.speak());
    }
}
