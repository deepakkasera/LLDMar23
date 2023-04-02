package Factory;

//Practical Factory
// X -> UIFactory

//Responsibility of this class is to only create an object of
//UIFactory based on the params.
public class UIFactoryFactory {
    public static UIFactory getUIFactoryFromPlatform(SupportedPlatforms platforms) {
        return switch (platforms) {
            case IOS -> new IosUIFactory();
            case ANDROID -> new AndroidUIFactory();
        };
    }
}
