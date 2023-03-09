package AccessModifiers;

import Encapsulation.Student;

public class Main extends Student {
    public static void main(String[] args) {
        Main main = new Main();
        main.age = 25;
        main.name = "Viresh";
        //psp is default;
        // main.psp = 99;

        //batch -> private
        // main.batch

        Student student = new Main();
        System.out.println(student);
        student.name = "XYZ";
        //student.age = 25;

//        Main main1 = new Student();
    }
}
