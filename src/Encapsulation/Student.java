package Encapsulation;

public class Student {
    public String name;
    protected int age;
    double psp;
    private String batch;

    void scheduleSession () {
        //this keyword refers to the current object.
        System.out.println("Schedule a session for " + this.name);
    }

    void changePsp(double psp) {
        this.psp = psp;
    }
}
