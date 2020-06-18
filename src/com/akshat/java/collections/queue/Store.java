/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akshat.java.collections.queue;

import java.util.LinkedList;

public class Store {
    
    public static void main(String[] args) {                
        
        LinkedList<Customer> queue = new LinkedList<Customer>();
        queue.add(new Customer("Sally"));
        queue.add(new Customer("Ben"));
        queue.add(new Customer("Emma"));
        queue.add(new Customer("Fred"));
        System.out.println(queue);
        serveCustomer(queue);
        System.out.println(queue);

    }
    
    static void serveCustomer(LinkedList<Customer> queue) {
        
        Customer c = queue.poll();
        c.serve();
        
    }
    
}
