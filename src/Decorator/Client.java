package Decorator;

public class Client {
    public static void main(String[] args) {
        IceCreamConeConstituents iceCreamConeConstituents =
                new ChocoChips(
                        new BlueBerryScoop(
                            new VanillaScoop(
                                    new StrawberryScoop(
                                            new ChocoChips(
                                                        new ChocolateCone(
                                                                new OrangeCone()
                                                        )
                                            )
                                    )
                            )
                        )
                );

        System.out.println(iceCreamConeConstituents.getDescription());
        System.out.println(iceCreamConeConstituents.getCost());
    }
}
