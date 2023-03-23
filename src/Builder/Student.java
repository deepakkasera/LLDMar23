package Builder;

public class Student {
    String name;
    int age;
    double psp;
    String universityName;
    String batch;
    long id;
    int gradYear;
    String phoneNumber;

    Student (Builder builder) {
        //validations
        if (builder.getGradYear() > 2022) {
            throw new IllegalArgumentException("Grad year can't be after 2022");
        }
        this.name = builder.getName();
        this.age = builder.getAge();
        this.gradYear = builder.getGradYear();
    }
}
