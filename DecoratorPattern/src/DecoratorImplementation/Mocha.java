package DecoratorImplementation;

public class Mocha extends CondimentDecorator {
    public Mocha(DIBeverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + " with mocha";
    }

    public double cost() {
        return beverage.cost() + 2.00;
    }
}
