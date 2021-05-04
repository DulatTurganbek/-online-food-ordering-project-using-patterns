package company.Student;

public class SAttendance extends Student {
    @Override
    public void make(StudentInfo info) {
        System.out.println("сколько раз заказывалы в нашем приложение  // How many times have you ordered in our app: " + info.getAttendance());
    }
}
