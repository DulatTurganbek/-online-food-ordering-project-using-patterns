package company;
import company.SimpleClient.*;
import company.Student.*;

public class Facade {
    IVisitor visitor = new Visitor();

    Client Name = new CName();
    Client AmountOfOrder = new CAmountOfOrder();
    Client Address = new CAddress();
    Client attendance = new CAttendance();

    NewOrderr initialState1 = new NewOrderr();
    Order order1 = new Order(initialState1);


    ClientInfo Clien1 = new ClientInfo("Dulat",1800,"Abaya98",3);
    public void Cprinter() {
        Name.make(Clien1);
        AmountOfOrder.make(Clien1);
        Address.make(Clien1);
        attendance.make(Clien1);
        order1.OrderConfirmed();
        order1.Shipped();
        Clien1.Accept(visitor);
    }



    Student sName = new SName();
    Student sAmountOfOrder = new SAmountOfOrder();
    Student sAddress = new SAddress();
    Student sAttendance = new SAttendance();

    NewOrderr InitialState2 = new NewOrderr();
    Order order2 = new Order(InitialState2);


    StudentInfo Student1 = new StudentInfo("Zhasulan",2500,"Pushkina68",3);
    void Sprinter(){
        sName.make(Student1);
        sAmountOfOrder.make(Student1);
        sAddress.make(Student1);
        sAttendance.make(Student1);
        order2.OrderConfirmed();
        order2.Shipped();
        Student1.Accept(visitor);

    }

}
