package BuilderProduction;

public class Student {
    String name;
    int age;
    double psp;
    String universityName;
    String batch;
    long id;
    int gradYear;
    String phoneNumber;

    public static Builder getBuilder() {
        return new Builder();
    }

    private Student (Builder builder) {
        //validations
        if (builder.getGradYear() > 2022) {
            throw new IllegalArgumentException("Grad year can't be after 2022");
        }
        this.name = builder.getName();
        this.age = builder.getAge();
        this.gradYear = builder.getGradYear();
    }

    public static class Builder {
        String name;
        int age;
        double psp;
        String universityName;
        String batch;
        long id;
        int gradYear;
        String phoneNumber;

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public String getUniversityName() {
            return universityName;
        }

        public Builder setUniversityName(String universityName) {
            this.universityName = universityName;
            return this;
        }

        public String getBatch() {
            return batch;
        }

        public void setBatch(String batch) {
            this.batch = batch;
        }

        public long getId() {
            return id;
        }

        public Builder setId(long id) {
            this.id = id;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public Builder setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            return this;
        }

        public Student build() {
            //responsibility of build() method is to build the student object.

            //Validations
            if (getGradYear() > 2022) {
                throw new IllegalArgumentException("Grad year can't be after 2022");
            }
            //Before even the creation of Student object, we are validating the parameters.

            return new Student(this);
        }
    }
}

//refactoring.guru
//Head first design pattern -> BOOK


