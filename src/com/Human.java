package com;

public class Human {
    int age = 17;
    double weight = 77.3;


    public void buyMilk() {
        System.out.println("Buy milk!!!");
    }

    public void buyBread() {
        System.out.println("Buy Bread!!!");
        this.weight = this.weight + 1;
        System.out.println("I got fatter and now im " + this.weight);
    }

    public void helloWorld() {
        System.out.println("Human says Hello World!!!!");
    }

    public void birthday() {
        this.age = this.age + 1;
    }

}
