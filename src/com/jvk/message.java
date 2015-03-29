package com.jvk;

/**
 * Created by user on 29/03/2015.
 */
public class Message {
    private static int counter;
    private String label;

    public Message(String name) {
        label = name;
        counter++;
    }

    public void Speak() {
        System.out.println(label);
        System.out.println(counter);
    }

}
