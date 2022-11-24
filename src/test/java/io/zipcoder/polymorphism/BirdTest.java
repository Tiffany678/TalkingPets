package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class BirdTest {
    @Test
    public void dogNumber(){
        String expected = "BB";
        Pet bird1 = new Bird("BB");
        Assert.assertEquals(expected, bird1.getName());
    }
    @Test
    public void dogSpeak(){
        String expected = "Tweet Tweet Tweet";
        Pet bird1 = new Bird("BB");
        Assert.assertEquals(expected, bird1.speak());
    }
}