package company.Student;

public abstract class Student{
    private Student student;



    public void setStudent(Student student) {
        this.student = student;
    }

    public abstract void make(StudentInfo info);
}
