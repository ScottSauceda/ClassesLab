package com.CodeWithScott;

import java.lang.reflect.InaccessibleObjectException;

public class Main {

    public static void main(String[] args) {

        Animal Elephant = new Animal(){};


        Elephant.setTopSpeed(45);
        Elephant.setIsEndangered(false);
        Elephant.setNumOfLegs(4);
        Elephant.setName("Dumbo");
         System.out.println(Elephant.getTopSpeed());
         System.out.println(Elephant.getIsEndangered());
         System.out.println(Elephant.getName());
         System.out.println(Elephant.getNumOfLegs());


    }
}
