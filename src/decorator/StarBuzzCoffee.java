package decorator;

import decorator.decoratorSub.Mocha;
import decorator.decoratorSub.Whip;

/*
커피 주문 테스트
 */
public class StarBuzzCoffee {

    public static void main(String[] args) {
        // 아무것도 넣지 않은 커피 주문
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        // 모카와 휘핑크림을 넣은 커피 주문
        Beverage beverage1 = new Espresso();
        beverage1 = new Mocha(beverage1); // 에스프레소에 모카 가격이 더해짐
        beverage1 = new Whip(beverage1); // 에스프레소에 모카 + 휘핑크림 가격이 더해짐
        System.out.println(beverage1.getDescription() + " $" + beverage1.cost());
    }
}
