/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.akshat.java.io.try_with_resources;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.StringReader;
import java.io.StringWriter;

public class TryWithResourcesExample {

    public static void main(String[] args) {
        
        try(BufferedReader reader = new BufferedReader(new StringReader("Hello World"));
                StringWriter writer = new StringWriter();) {
            
            
            writer.write(reader.readLine());
            System.out.println(writer.toString());
        } catch (IOException ioe) {
            
        }

    }

}