package com.xam;

public class HelloMaven {
    public static void main(String[] args){
        HelloMaven helloMaven=new HelloMaven();
        System.out.println(helloMaven.greetUser());
    }
    public String greetUser(){
        return "Hello Maven";
    }

}
