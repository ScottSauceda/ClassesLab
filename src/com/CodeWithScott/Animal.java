package com.CodeWithScott;

public class Animal {

    private int numOfLegs;
    private int topSpeed;
    private Boolean isEndangered;
    private String name;


    public int getNumOfLegs() {
        return numOfLegs;
    }

    public void setNumOfLegs(int numOfLegs) {
        this.numOfLegs = numOfLegs;
    }

    public int getTopSpeed() {
        return topSpeed;
    }

    public void setTopSpeed(int topSpeed) {
        this.topSpeed = topSpeed;
    }

    public Boolean getIsEndangered() {
        return isEndangered;
    }

    public void setIsEndangered(Boolean isEndangered) {
        this.isEndangered = isEndangered;
    }


    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
