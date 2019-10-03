package com.CodeWithScott;


public class Main {

    public static void main(String[] args) {

        Animal elephant = new Animal(){};


        elephant.setTopSpeed(45);
        elephant.setIsEndangered(false);
        elephant.setNumOfLegs(4);
        elephant.setName("Dumbo");
        System.out.println(elephant.getName());
        System.out.println(elephant.getIsEndangered());
        System.out.println(elephant.getNumOfLegs());
        System.out.println("The elephant has a top speed of " + elephant.getTopSpeed() + " mph.");


        Animal lion = new Animal(){};

        lion.setTopSpeed(18);
        lion.setIsEndangered(false);
        lion.setNumOfLegs(4);
        lion.setName("Simba");
        System.out.println(lion.getName());
        System.out.println(lion.getIsEndangered());
        System.out.println(lion.getNumOfLegs());
        System.out.println("The lion has a top speed of " + lion.getTopSpeed() + " mph.");

    }
}
