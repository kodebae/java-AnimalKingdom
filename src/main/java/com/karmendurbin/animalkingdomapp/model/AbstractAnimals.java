package com.karmendurbin.animalkingdomapp.model;

public abstract class AbstractAnimals { // class fields
    protected static int maxId = 0;
    protected int id;
    protected String name;
    protected int year;

    AbstractAnimals() { //empty constructor

    }

    abstract String move(); {

    }
    abstract String breathe(); {

    }
    abstract String reproduce(); {

    }

    // Getters and Setters

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}

// create an abstract class for animals
// the id is created by referencing max id
// we use this class to define methods and behaviors that all our animals can have.
// so any affiliated animal class that is an animal must be able to do all these things.
// In other words all animals will eat, get a unique id, have a name, and a year discovered.
// There is not implementation is an abstract class. We can not create methods within our abstract class.
// The child class decides what we mean and do.
// when we say move... Interfaces by tradition do not have fields they only have methods --->
// with headers and the child class decides what that methods does.
// you can not create objects from interfaces, you must have a child that implements the interface
// you can not use an abstract class like a regular class, it helps make a regular class that you
// use elsewhere.

//public abstract class Person <-- access modifier abstract modifier "class" name
//{
//    protected String name;  <-- class fields access modifier type name
//    protected int age;
//
//    Person() <-- empty constructor can be used if the constructor should set up a part of each sub class
//    {         that remains the same across subclasses
//    }
//
//    abstract void makeNoise(); <-- abstract method functionality is defined in subclass
//
//    public void setName(String name) <-- concrete method functionality is defined here
//    {
//      this.name = name;
//    }
//
//    public String getName()
//    {
//      return this.name;
//    }
//}