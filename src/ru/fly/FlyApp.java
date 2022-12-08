package ru.fly;

import ru.fly.model.Airbus;
import ru.fly.model.Bird;
import ru.fly.model.Flyer;
import ru.fly.model.Mosquito;

public class FlyApp {

    public static void main(String[] args) {

        Flyer whoCanFlyArray[] = {new Bird(), new Airbus(), new Mosquito()};
        for (Flyer anyWannaFly : whoCanFlyArray){
            anyWannaFly.fly();
        }

    }
}
