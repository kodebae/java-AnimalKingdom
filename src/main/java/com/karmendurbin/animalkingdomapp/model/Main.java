package com.karmendurbin.animalkingdomapp.model;

public class Main {
    public static void main(String[] args) {
        System.out.println("My Java Animals");
        //Mammals
        Mammal Panda = new Mammal("Panda", 1869);
        Mammal Zebra = new Mammal("Zebra", 1778);
        Mammal Koala = new Mammal("Koala", 1816);
        Mammal Sloth = new Mammal("Sloth", 1804);
        Mammal Armadillo = new Mammal("Armadillo", 1758);
        Mammal Raccoon = new Mammal("Raccoon", 1758);
        Mammal Bigfoot = new Mammal("Bigfoot", 2021);

        //Birds
        Bird Pigeon = new Bird("Pigeon", 1837);
        Bird Peacock = new Bird("Peacock", 1821);
        Bird Toucan = new Bird("Toucan", 1758);
        Bird Parrot = new Bird("Parrot", 1824);
        Bird Swan = new Bird("Swan", 1758);

        //Fish
        Fish Salmon = new Fish("Salmon", 1758);
        Fish Catfish = new Fish("Catfish", 1817);
        Fish Perch = new Fish("Perch", 1758);
    }
}

//* [ ] **Mammals:**

//    | Name      | Year Named |
//    |-----------|-------|
//    | Panda     | 1869  |
//    | Zebra     | 1778  |
//    | Koala     | 1816  |
//    | Sloth     | 1804  |
//    | Armadillo | 1758  |
//    | Raccoon   | 1758  |
//    | Bigfoot   | 2021  |


//* [ ] **Birds:**

//        | Name      | Year Named |
//        |-----------|------|
//        | Pigeon    | 1837 |
//        | Peacock   | 1821 |
//        | Toucan    | 1758 |
//        | Parrot    | 1824 |
//        | Swan      | 1758 |


//* [ ] **Fish:**
//
//        | Name      | Year Named |
//        |-----------|------|
//        | Salmon    | 1758 |
//        | Catfish   | 1817 |
//        | Perch     | 1758 |