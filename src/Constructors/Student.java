package Constructors;

public class Student {
    String name;
    int age;

    Student(String name, int age) {
        System.out.println("Inside Student Constructor " + this.name + " " + this.age);
        this.name = name;
        this.age = age;
    }
}
