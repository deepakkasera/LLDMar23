package Prototype;

public class Student implements Prototype{
    private String name;
    private int age;
    private String batch;
    private double studentPsp;
    private double averageBatchPsp;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public double getStudentPsp() {
        return studentPsp;
    }

    public void setStudentPsp(double studentPsp) {
        this.studentPsp = studentPsp;
    }

    public double getAverageBatchPsp() {
        return averageBatchPsp;
    }

    public void setAverageBatchPsp(double averageBatchPsp) {
        this.averageBatchPsp = averageBatchPsp;
    }

    @Override
    public Student clone() {
        Student student = new Student();
        student.averageBatchPsp = this.averageBatchPsp;
        student.batch = this.batch;
        return student;
    }
}
//Student copyObj = original.clone() -> returns the same original object.
