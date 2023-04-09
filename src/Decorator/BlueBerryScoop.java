package Decorator;

public class BlueBerryScoop implements IceCreamConeConstituents {
    private IceCreamConeConstituents iceCreamConeConstituents;

    public BlueBerryScoop(IceCreamConeConstituents iceCreamConeConstituents) {
        this.iceCreamConeConstituents = iceCreamConeConstituents;
    }

    @Override
    public String getDescription() {
        return iceCreamConeConstituents.getDescription() + " + BlueBerry Scoop";
    }

    @Override
    public int getCost() {
        return iceCreamConeConstituents.getCost() + 25;
    }
}
