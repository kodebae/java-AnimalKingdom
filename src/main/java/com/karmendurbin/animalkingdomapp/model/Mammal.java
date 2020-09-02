package com.karmendurbin.animalkingdomapp.model;

import com.karmendurbin.animalkingdomapp.model.AbstractAnimals;

public class Mammal extends AbstractAnimals {
    public Mammal(String name, int year) {
        this.name = name;
        this.year = year;
        this.id = this.maxId;
        maxId++;
    }



    @Override
    public String move() {
        return "walking";
    }
    @Override
    public String breathe() {
        return " with lungs";
    }
    @Override
    public String reproduce() {
        return "live birth";
    }
    @Override
    public String toString() {
        return "The" + name + "moves by" + move() + "breathes" + breathe() +  "and reproduces by" + reproduce() + ".";
    }
}
// move, walk, breathe lungs, birth, live
