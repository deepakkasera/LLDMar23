package BuilderProduction;

public class Client {
    public static void main(String[] args) {
//        Builder builder = Student.getBuilder();
//        builder.setName("Viresh");
//        builder.setAge(20);
//        builder.setGradYear(2021);

//        Student student = builder.build();
//        System.out.println("DEBUG");

        //1. Builder object is getting created
        //2. Set the attributes on the builder object.
        //3. Do the validations on the builder object.

        Student student = Student.getBuilder()
                .setName("Viresh")
                .setAge(20)
                .setGradYear(2023)
                .build();
        System.out.println("Debug");
    }
}
