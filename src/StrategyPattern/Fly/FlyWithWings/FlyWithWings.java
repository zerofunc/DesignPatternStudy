package StrategyPattern.Fly.FlyWithWings;

import StrategyPattern.Fly.Fly;

/**
 * Created by YooHyeongJu on 2016-07-27.
 */
public class FlyWithWings implements Fly{

    @Override
    public void fly() {
        System.out.println("펄럭펄럭");
    }
}
