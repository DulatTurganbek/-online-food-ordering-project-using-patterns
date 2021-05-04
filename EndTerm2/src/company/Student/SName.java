package company.Student;

public class SName extends Student {
    @Override
    public void make(StudentInfo info) {
        System.out.println("Заказчик // Orderer: " + info.getName());
    }
}
