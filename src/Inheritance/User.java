package Inheritance;

public class User {
    String userName;
    //private String password; -> private members can't be inherited.

    void login() {
        System.out.println("User is logging in");
    }
}