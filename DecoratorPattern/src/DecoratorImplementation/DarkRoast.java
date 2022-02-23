package DecoratorImplementation;

public class DarkRoast extends DIBeverage {
    public DarkRoast() {
        description = "This is our dark roast";
    }

    public double cost() {
        return 10.00;
    }
}
