package DecoratorImplementation;

public abstract class CondimentDecorator extends DIBeverage {
    DIBeverage beverage;

    public abstract String getDescription();
}
