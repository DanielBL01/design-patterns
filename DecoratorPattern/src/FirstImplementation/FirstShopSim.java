package FirstImplementation;

public class FirstShopSim {
    public static void main(String[] args) {
        FIBeverage houseBlend = new HouseBlend();
        System.out.println(houseBlend.description);
        System.out.println(houseBlend.cost());

        FIBeverage darkRoastWithMocha = new DarkRoastWithMocha();
        System.out.println(darkRoastWithMocha.description);
        System.out.println(darkRoastWithMocha.cost());
    }
}
