package ru.fly.model;

public interface Flyer {

    default void fly() {

        System.out.println("AnyFlyer is flying");

    }


}
