package strategy;

import strategy.behavior.flyBehaviorImpl.FlyWithWings;
import strategy.behavior.quackBehaviorImpl.MuteQuack;
import strategy.behavior.quackBehaviorImpl.Quack;

public class MallardDuck extends Duck{

    public MallardDuck() {
        // 결과적으로 꽥 소리가 남.
        quackBehavior = new Quack();
        // 소리를 안 내고 싶을때
//        quackBehavior = new MuteQuack();

        flyBehavior = new FlyWithWings();
    }
}
