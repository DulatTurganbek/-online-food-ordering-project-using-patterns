package company;
import company.SimpleClient.ClientInfo;
import company.Student.StudentInfo;


public interface IVisitor {
    void forStudents(StudentInfo student);
    void forSimpleClients(ClientInfo client);
}
