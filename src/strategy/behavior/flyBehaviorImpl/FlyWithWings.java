package strategy.behavior.flyBehaviorImpl;

import strategy.behavior.FlyBehavior;

public class FlyWithWings implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("이 오리는 나는 중");
    }
}
