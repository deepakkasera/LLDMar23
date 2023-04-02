package Factory;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter();
        //UIFactory uiFactory = flutter.createUIFactory(SupportedPlatforms.ANDROID);

        //uiFactory is containing an object of AndroidUIFactory.
        //uiFactory.createButton();
        //uiFactory.createMenu();

        UIFactory uiFactory = flutter.createUIFactory(SupportedPlatforms.ANDROID);

        flutter.createTheme();
        flutter.setRefreshRate();
        System.out.println("DEBUG");
    }
}

//SOLID
