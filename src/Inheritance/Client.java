package Inheritance;

public class Client {
    public static void main(String[] args) {
        Instructor i = new Instructor();

        i.userName = "Binod";
        i.averageRating = 4.56;
        i.login();


        Student student = new Student();
        student.userName = "Deepak";
        student.psp = 90;
        student.login();
        student.scheduleClass();

        //Student class doesn't have averageRating attribute.
        //student.averageRating = 4.56;
    }
}
