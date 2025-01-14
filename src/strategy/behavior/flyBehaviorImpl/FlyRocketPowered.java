package strategy.behavior.flyBehaviorImpl;

import strategy.behavior.FlyBehavior;

public class FlyRocketPowered implements FlyBehavior {
    @Override
    public void fly() {
        System.out.println("이 오리는 로켓으로 나는 중");
    }
}
