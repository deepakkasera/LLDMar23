package Factory.Components.Button;

public class AndroidButton implements Button {
    @Override
    public void changeSize() {
        System.out.println("Changing Android Button size");
    }
}
