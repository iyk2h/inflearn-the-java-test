package com.example.inflearnthejavatest;

public class TPC19 {

    public void run() {
        System.out.println(" ani --- ");
        Animal ani = new Dog();
        ani.eat();

        ani = new Cat();
        ani.eat();
        ((Cat) ani).night();

        System.out.println(" --- ");

        Dog dog = new Dog();
        dog.eat();

        Cat cat = new Cat();
        cat.eat();
        cat.night();
        System.out.println(" --- ");

    }

}
