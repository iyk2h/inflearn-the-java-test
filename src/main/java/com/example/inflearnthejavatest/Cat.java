package com.example.inflearnthejavatest;

public class Cat extends Animal {
    public void night() {
        System.out.println("밤에 눈이 반작 반짝");
    }

    @Override
    public void eat() {
        System.out.println("야옹 야옹");
    }
}
