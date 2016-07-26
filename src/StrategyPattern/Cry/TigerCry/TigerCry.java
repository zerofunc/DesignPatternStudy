package StrategyPattern.Cry.TigerCry;

import StrategyPattern.Cry.Cry;

/**
 * Created by YooHyeongJu on 2016-07-27.
 */
public class TigerCry implements Cry {
    @Override
    public void cry() {
        System.out.println("크앙");
    }
}
