package decorator;

public abstract class CondimentDecorator extends Beverage{
    public abstract String getDescription(); // 각 서브클래스(첨가물)마다 구현하여 description 추가 필요.
}
