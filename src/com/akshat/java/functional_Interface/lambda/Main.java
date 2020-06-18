
package com.akshat.java.functional_Interface.lambda;

import com.akshat.java.functional_Interface.GreetingMessage;

public class Main {

    public static void main(String[] args) {        
        GreetingMessage gm = new GreetingMessage() {
            @Override
            public void greet(String name) {
                System.out.println("Hello " + name);
            }
        };
        gm.greet("Bethan");    
        
        GreetingMessage gm2 = (String name) -> {
            System.out.println("Hello " + name);
        };
        gm2.greet("Bethan");
        
        MessagePrinter mp = () -> {
            System.out.println("This is a message");
        };
        mp.printMessage();
        
       
    }
    
}