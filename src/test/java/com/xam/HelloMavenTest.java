package com.xam;

public class HelloMavenTest {

    public void testGreetUser() {
        HelloMaven helloMaven = new HelloMaven();
        String actual=helloMaven.greetUser();
       assert "Hello Maven".equals(actual);
    }

    public void testGreetUserWithStringUtils() {
        HelloMaven helloMaven = new HelloMaven();
        String actual=helloMaven.greetUserWithStringUtils();
        assert "Hello maven".equals(actual);
    }
}