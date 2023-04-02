package Prototype;

public class IntelligentStudent extends Student {
    int iq;

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public IntelligentStudent() {}

    public IntelligentStudent(IntelligentStudent intelligentStudent) {
        super(intelligentStudent);
        this.iq = intelligentStudent.iq;
    }

    @Override
    public IntelligentStudent clone() {
        //this -> will be an intelligentStudent object
        return new IntelligentStudent(this);
    }
}

//Student st = new Student(); new IntelligentStudent();

