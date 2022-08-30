package com.bot;

public class App {
    public String getGreeting() {
        return "Hello Bot!";
    }

    public static void main(String[] args) {
        System.out.println(new App().getGreeting());
    }
}
