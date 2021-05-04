package company;
import company.SimpleClient.ClientInfo;
import company.Student.StudentInfo;
public class Visitor implements IVisitor {


    @Override
    public void forStudents(StudentInfo student) {
        if(student.getAttendance() > 2){
            System.out.println("You have 10% discount total sum is: " + (student.getAmountOfOrder() - student.getAmountOfOrder()*0.10));
        }
        else{
            System.out.println("You dont have discounts");
        }

    }

    @Override
    public void forSimpleClients(ClientInfo client) {
        if(client.getAttendance() > 2){
            System.out.println("You have 5% discount total sum is: " + (client.getAmountOfOrder() - client.getAmountOfOrder()*0.05));
        }
        else {
            System.out.println("You dont have discounts");
        }

    }
}
