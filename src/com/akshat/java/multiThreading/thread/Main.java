package com.akshat.java.multiThreading.thread;

public class Main {
    
    public static void main(String[] args) {

        ThreadExample thread1 = new ThreadExample();
        thread1.setName("My first thread");
        thread1.start();
        
        ThreadExample thread2 = new ThreadExample();
        thread2.setName("My second thread");
        thread2.start();
        
    }
    
}
