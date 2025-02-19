package decorator.decoratorSub;

import decorator.Beverage;
import decorator.CondimentDecorator;

public class Whip extends CondimentDecorator {
    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return .10 + beverage.cost(); // 음료에 휘핑크림 가격 더하기
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 휘핑크림";
    }
}
