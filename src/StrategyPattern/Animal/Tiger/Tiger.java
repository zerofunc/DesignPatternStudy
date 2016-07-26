package StrategyPattern.Animal.Tiger;

import StrategyPattern.Animal.Animal;
import StrategyPattern.Cry.TigerCry.TigerCry;
import StrategyPattern.Fly.FlyNoway.FlyNoway;

/**
 * Created by YooHyeongJu on 2016-07-26.
 */
public class Tiger extends Animal {
    public Tiger() {
        cry = new TigerCry();
        fly = new FlyNoway();
    }

    public void display() {
        System.out.println("I am a Tiger");
    }
}
