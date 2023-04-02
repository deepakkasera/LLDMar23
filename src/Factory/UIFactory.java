package Factory;

import Factory.Components.Button.Button;
import Factory.Components.Menu.Menu;

public interface UIFactory {
    public Button createButton();

    public Menu createMenu();
}
