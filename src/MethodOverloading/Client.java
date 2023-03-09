package MethodOverloading;

import MethodOverloading.Student;

public class Client {
    public static void main(String[] args) {
        Student student = new Student();
        student.hello();
        student.hello("Deepak");
    }
}
