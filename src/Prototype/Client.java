package Prototype;

import org.w3c.dom.UserDataHandler;

public class Client {
    public static void fillRegistry(StudentRegistry studentRegistry) {
        //Student template for Apr22 batch.
        Student apr22Student = new Student();
        apr22Student.setBatch("Apr22");
        apr22Student.setAverageBatchPsp(85.0);

        //Inserting the template in the registry
        studentRegistry.register("Apr22", apr22Student);

        Student may22Student = new Student();
        apr22Student.setBatch("May22");
        apr22Student.setAverageBatchPsp(90.0);
        studentRegistry.register("May22", may22Student);

        IntelligentStudent apr22IntelligentStudent = new IntelligentStudent();
        apr22IntelligentStudent.setAverageBatchPsp(89.0);
        apr22IntelligentStudent.setBatch("April 22");
        apr22IntelligentStudent.setIq(180);
        studentRegistry.register("apr22IntelligentStudent", apr22IntelligentStudent);

    }

    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);

        Student studentPrototype = studentRegistry.get("Apr22");
        Student shantanu = studentPrototype.clone();
        shantanu.setName("Shantanu");
        shantanu.setAge(24);
        shantanu.setStudentPsp(80.0);

        Student asha = studentPrototype.clone();
        asha.setName("Asha");
        asha.setAge(24);
        asha.setStudentPsp(81.0);
        asha.setBatch("April 22");

        Student rapheal = studentRegistry.get("May22").clone();
        rapheal.setName("Raphael");
        rapheal.setAge(25);
        rapheal.setStudentPsp(82.0);

        Student deepak = studentRegistry.get("apr22IntelligentStudent").clone();
        deepak.setName("Deepak");
        deepak.setAge(27);
        deepak.setStudentPsp(75);
        // ((IntelligentStudent)deepak).iq = 180;


        System.out.println("DEBUG");
    }
}
