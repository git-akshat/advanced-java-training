
package com.akshat.java.multiThreading.runnable_interface;

public class RunnableExample implements Runnable {
    
    @Override
    public void run(){
        int i = 0;
        while(i <= 100) {
            System.out.println(i + " " + Thread.currentThread().getName());
            i++;
        }
    }
    
}
