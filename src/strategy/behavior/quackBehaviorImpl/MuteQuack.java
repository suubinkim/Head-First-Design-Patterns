package strategy.behavior.quackBehaviorImpl;

import strategy.behavior.QuackBehavior;

public class MuteQuack implements QuackBehavior {
    @Override
    public void quack() {
        // 소리 못 냄
        System.out.println("---");
    }
}
