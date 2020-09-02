package com.karmendurbin.animalkingdomapp.model;

public class Fish extends AbstractAnimals {
    public Fish(String name, int year) {
        this.name = name;
        this.year = year;
        this.id = this.maxId;
        maxId++;

    }

    @Override
    public String move() {
        return "swimming";
    }
    @Override
    public String breathe() {
        return " with gills";
    }
    @Override
    public String reproduce() {
        return "both eggs live births";
    }
    @Override
     public String toString(){
        return "The" + name + "moves by" + move() + "breathes" + breathe() +  "and reproduces by" + reproduce() + ".";
    }
}
// move, swim, breathe, gills, reproduce, both eggs and live birth

// EXAMPLE CODE
//public class Adult extends Person <-- declare class extending abstract class
//{
//  public Adult(String name, int age) <-- constructor
//  {
//    this.name = name; <-- references fields on abstract class
//    this.age = age;
//  }
//
//  @Override public void makeNoise() <-- override abstract method to perform task specific to subclasses
//                                      it is necessary to override every abstract method on the abstract class
//  {
//    System.out.println("Hi!");
//  }
//
//}