package StrategyPattern.Animal.Eagle;

import StrategyPattern.Animal.Animal;
import StrategyPattern.Cry.BirdCry.BirdCry;
import StrategyPattern.Fly.Fly;
import StrategyPattern.Fly.FlyWithWings.FlyWithWings;

/**
 * Created by YooHyeongJu on 2016-07-26.
 */
public class Eagle extends Animal{
    public Eagle() {
        cry = new BirdCry();

        fly = new FlyWithWings();


    }

    public void display() {
        System.out.println("I am a Eagle");
    }
}
