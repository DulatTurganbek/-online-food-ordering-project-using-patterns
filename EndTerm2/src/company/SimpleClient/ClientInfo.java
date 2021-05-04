package company.SimpleClient;

import company.IAllClients;
import company.IVisitor;
import company.Visitor;

public class ClientInfo implements IAllClients {
     public String name;
     public int amountOfOrder;
     public String address;
     public int attendance;

     public ClientInfo(String name,int amountOfOrder,String address,int attendance){
         this.name = name;
         this.amountOfOrder = amountOfOrder;
         this.address = address;
         this.attendance = attendance;
     }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountOfOrder() {
        return amountOfOrder;
     }

    public void setAmountOfOrder(int amountOfOrder) {
        this.amountOfOrder = amountOfOrder;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAttendance() {
        return attendance;
    }

    public void setAttendance(int attendance) {
        this.attendance = attendance;
    }

    public void doWork(){

    }

    @Override
    public void Accept(IVisitor visitor) {
        visitor.forSimpleClients(this);
    }
}
