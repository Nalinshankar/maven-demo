package com.xam;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HelloMavenTest {
    private HelloMaven helloMaven;
    @Before
    public void setUp(){
           helloMaven=new HelloMaven();
    }
    @Test
    public void testGreetUser() {

        String actual=helloMaven.greetUser();
        assertEquals("Hello Maven", actual);
    }


}