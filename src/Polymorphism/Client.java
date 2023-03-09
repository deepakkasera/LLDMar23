package Polymorphism;

public class Client {
    public static void main(String[] args) {
        A a = new C();
        //companyName isn't accessible because it is not present in the reference i.e object of A.
        // a.companyName;

//        C c = new C();
//        c.companyName = "Google";
    }
}
