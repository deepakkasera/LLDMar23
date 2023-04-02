package Prototype;

public class Student implements Prototype<Student> {
    private String name;
    private int age;
    private String batch;
    private double studentPsp;
    private double averageBatchPsp;

    public Student() {}

    public Student(Student student) {
        this.name = student.name;
        this.age = student.age;
        this.batch = student.batch;
        this.studentPsp = student.studentPsp;
        this.averageBatchPsp = student.averageBatchPsp;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public void setStudentPsp(double studentPsp) {
        this.studentPsp = studentPsp;
    }

    public void setAverageBatchPsp(double averageBatchPsp) {
        this.averageBatchPsp = averageBatchPsp;
    }

    @Override
    public Student clone() {
        return new Student(this);
    }
}
//Student copyObj = original.clone() -> returns the same original object.
