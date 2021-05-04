package company.Student;

public class SAddress extends Student {
    @Override
    public void make(StudentInfo info) {
        System.out.println("Адрес // Address: " + info.getAddress());

    }
}
