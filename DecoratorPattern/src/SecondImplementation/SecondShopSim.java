package SecondImplementation;

public class SecondShopSim {
    public static void main(String[] args) {
        SIBeverage houseBlend = new HouseBlend();
        System.out.println(houseBlend.description);
        System.out.println(houseBlend.cost());

        SIBeverage darkRoastWithMocha = new DarkRoast();
        darkRoastWithMocha.setMocha();
        System.out.println(darkRoastWithMocha.description + " with mocha");
        System.out.println(darkRoastWithMocha.cost());
    }
}
