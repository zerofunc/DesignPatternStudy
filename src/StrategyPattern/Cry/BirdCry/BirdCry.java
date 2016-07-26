package StrategyPattern.Cry.BirdCry;

import StrategyPattern.Cry.Cry;

/**
 * Created by YooHyeongJu on 2016-07-27.
 */
public class BirdCry implements Cry{

    @Override
    public void cry() {
        System.out.println("짹짹");
    }
}
