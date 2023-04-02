package Factory.Components.Button;

public class IosButton implements Button {
    @Override
    public void changeSize() {
        System.out.println("Changing IOS Button size");
    }
}
