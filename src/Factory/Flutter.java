package Factory;

public class Flutter {
    public void createTheme() {
        System.out.println("Creating Theme");
    }

    public void setRefreshRate() {
        System.out.println("Setting Refresh Rate");
    }

    public UIFactory createUIFactory(SupportedPlatforms params) {
//        if (params.equals(SupportedPlatforms.ANDROID)) {
//            return new AndroidUIFactory();
//        } else if (params.equals(SupportedPlatforms.IOS)) {
//            return new IosUIFactory();
//        }

        return UIFactoryFactory.getUIFactoryFromPlatform(params);
    }
}
