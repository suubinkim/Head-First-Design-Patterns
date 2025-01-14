package strategy;

import strategy.behavior.FlyBehavior;
import strategy.behavior.QuackBehavior;

public class Duck {
    // 모든 서브 클래스들은 해당 변수를 상속 받는다.
    QuackBehavior quackBehavior;
    FlyBehavior flyBehavior;

    public void performQuack() {
        // 꽥꽥거리는 행동을 직접 처리하는 대신, quackBehavior로 참조되는 객체에 그 행동을 위임.
        quackBehavior.quack();
    }

    public void performFly() {
        // 나는 것도 마찬가지. 직접 구현하여 상속하지 않고 인터페이스 사용
        flyBehavior.fly();
    }

    public void swim() {
        System.out.println("오리는 항상 수영을 한다");
    }

    // 동적으로 행동 지정하기
    public void setQuackBehavior(QuackBehavior quackBehavior) {
        this.quackBehavior = quackBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }
}
