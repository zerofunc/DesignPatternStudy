package StrategyPattern.Animal;

import StrategyPattern.Cry.Cry;
import StrategyPattern.Fly.Fly;

/**
 * Created by YooHyeongJu on 2016-07-26.
 */
public abstract class Animal {
    protected Fly fly;

    protected Cry cry;

    public Animal() {

    }

    public void performFly() {
        fly.fly();
    }

    public void performCry() {
        cry.cry();
    }

    public void move() {
        System.out.println("움직임");
    }

    public abstract void display();

}
