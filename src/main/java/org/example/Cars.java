package org.example;

import java.util.ArrayList;

public class Cars {
    //Create an arraylist of cars and retrieve all the values using 2 different ways.
    public static void main(String[] args) {
        ArrayList <String> cars = new ArrayList<>();
        cars.add("Subaru");
        cars.add("BMW");
        cars.add("MB");
        cars.add("Toyota");
        for (String a:cars){
            System.out.print(a+", ");
        }
        System.out.println();
        System.out.println("*******************");
        System.out.println(cars);
    }
}
