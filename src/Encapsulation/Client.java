package Encapsulation;

public class Client {
    public static void main(String[] args) {
        Student student = new Student();
        //Student Object has been created in the memory.
        //If we don't initialize the attributes, it will take default values.
        student.name = "Manish";
        student.age = 25;
        student.psp = 99;
//        student.batch = "May22 Beginner Monday";

        System.out.println(student.name);
        System.out.println(student.age);
        System.out.println(student.psp);

        student.scheduleSession();

        Student student1 = new Student();
        student1.name = "Mainak";
        student1.age = 24;
        student1.psp = 98;

        student1.scheduleSession();
    }
}
