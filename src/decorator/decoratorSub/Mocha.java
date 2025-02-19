package decorator.decoratorSub;

import decorator.Beverage;
import decorator.CondimentDecorator;

public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    @Override
    public double cost() {
        return .20 + beverage.cost(); //음료 자체에 모카 가격 더하기
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", 모카";
    }
}
