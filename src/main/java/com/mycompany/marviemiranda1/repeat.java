/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.rain;
import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author Rei
 */
public class repeat {
    public static void main (String[]args){
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Fort");
        cars.add("Mazda");
        cars.add("rusi");
    
        Iterator<String> it = cars.iterator();
    
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
