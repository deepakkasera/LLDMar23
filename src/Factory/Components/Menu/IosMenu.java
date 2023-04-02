package Factory.Components.Menu;

public class IosMenu implements Menu {
    @Override
    public void setSize() {
        System.out.println("IOS set size");
    }
}
