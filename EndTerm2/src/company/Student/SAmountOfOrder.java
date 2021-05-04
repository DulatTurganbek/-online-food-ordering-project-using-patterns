package company.Student;

public class SAmountOfOrder extends Student {
    @Override
    public void make(StudentInfo info) {
        System.out.println("Сумма заказа // Amount of order is:  " + info.getAmountOfOrder() + " KZT");
    }
}
