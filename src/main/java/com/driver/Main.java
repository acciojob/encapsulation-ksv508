package com.driver;

public class Main {
    public static void main(String[] args) {
        RWOnly obj = new RWOnly();
        //obj.name = "Keshav"; //Make RWOnly private to public, so we use get and set
        obj.setName("Keshav");
        obj.getName();
    }
}