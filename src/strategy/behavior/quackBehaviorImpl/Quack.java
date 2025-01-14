package strategy.behavior.quackBehaviorImpl;

import strategy.behavior.QuackBehavior;

public class Quack implements QuackBehavior {
    @Override
    public void quack() {
        System.out.println("Quack!!!!");
    }
}
