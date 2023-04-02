package Factory;

import Factory.Components.Button.Button;
import Factory.Components.Button.IosButton;
import Factory.Components.Menu.IosMenu;
import Factory.Components.Menu.Menu;

public class IosUIFactory implements UIFactory {
    @Override
    public Button createButton() {
        return new IosButton();
    }

    @Override
    public Menu createMenu() {
        return new IosMenu();
    }
}
