package com.karmendurbin.animalkingdomapp.model;

public class Bird extends AbstractAnimals {
    public Bird(String name, int year) {
        this.name = name;
        this.year = year;
        this.id = this.maxId;
        maxId++;

    }

    @Override
    public String move() {
        return "flying";
    }
    @Override
    public String breathe() {
        return " with lungs";
    }
    @Override
    public String reproduce() {
        return "lays eggs";
    }
    @Override
    public String toString(){
        return "The" + name + "moves by" + move() + "breathes" + breathe() +  "and reproduces by" + reproduce() + ".";
    }
}
// move, fly, breathe, lungs, reproduce, lays eggs
//must add the toString method to print like this.... 