package decorator;

public class Espresso extends Beverage {

    public Espresso() { // 객체 생성시 기본 description 설정
        description = "에스프레소";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}
