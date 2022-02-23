package DecoratorImplementation;

public class FinalShopSim {
    public static void main(String[] args) {
        DIBeverage houseBlend = new HouseBlend();
        System.out.println(houseBlend.getDescription());
        System.out.println(houseBlend.cost());

        DIBeverage darkRoastWithMocha = new DarkRoast();
        darkRoastWithMocha = new Mocha(darkRoastWithMocha);
        System.out.println(darkRoastWithMocha.getDescription());
        System.out.println(darkRoastWithMocha.cost());
    }
}
