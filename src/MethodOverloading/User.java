package MethodOverloading;

public class User {
    //method Signature -> hello(String)
    String hello(String name) {
        System.out.println("hello " + name);
        return "";
    }

    //2 methods with same method signatures are not allowed in the Class.
    //method signature -> hello(int)
    Integer hello(int i) {
        System.out.println("Hello " + i);
        return 0;
    }
}
