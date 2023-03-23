package Interface;

public class Client {
    public static void main(String[] args) {
        Animal animal = new Cat();
        
        animal.walk();
        animal.run();
        animal.eat();
    }
}
