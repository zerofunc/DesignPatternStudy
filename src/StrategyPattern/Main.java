package StrategyPattern;

import StrategyPattern.Animal.Animal;
import StrategyPattern.Animal.Eagle.Eagle;
import StrategyPattern.Animal.Tiger.Tiger;

/**
 * Created by YooHyeongJu on 2016-07-26.
 */
public class Main {
    public static void main(String[] args) {
        Animal tiger = new Tiger();

        tiger.display();
        tiger.performCry();
        tiger.performFly();

        System.out.println("---------------------");

        Animal eagle = new Eagle();
        eagle.display();
        eagle.performCry();
        eagle.performFly();

        System.out.println("---------------------");


    }
}
