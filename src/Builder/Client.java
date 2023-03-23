package Builder;

public class Client {
    public static void main(String[] args) {
        Builder builder = new Builder();
        builder.setName("Viresh");
        builder.setAge(20);
        builder.setGradYear(2021);

        Student student = new Student(builder);
        System.out.println("DEBUG");
    }
}

//break till 8:46 AM.

