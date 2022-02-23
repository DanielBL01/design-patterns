package DecoratorImplementation;

public class HouseBlend extends DIBeverage {
    public HouseBlend() {
        description = "This is our house blend special";
    }

    public double cost() {
        return 5.00;
    }
}
