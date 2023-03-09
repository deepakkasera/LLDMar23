package CopyConstructor;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Deepak", 26);
//        Student st2 = student;
//
//        System.out.println(student.name + " " + student.age);
//        System.out.println(st2.name + " " + st2.age);
//
//        st2.name = "Harshit";
//        System.out.println(student.name + " " + student.age);
//        System.out.println(st2.name + " " + st2.age);
//
//        st2.age = 30;
//        System.out.println(student.name + " " + student.age);
//        System.out.println(st2.name + " " + st2.age);

        Student st = new Student();
        st.name = student.name;
        st.age = student.age;

        System.out.println(student.name + " " + student.age);
        System.out.println(st.name + " " + st.age);

        st.name = "Gunalan";

        System.out.println(student.name + " " + student.age);
        System.out.println(st.name + " " + st.age);

//        st.age = 27;
        student.age = 27;
        System.out.println(student.name + " " + student.age);
        System.out.println(st.name + " " + st.age);
    }
}
