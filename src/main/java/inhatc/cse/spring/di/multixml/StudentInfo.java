package inhatc.cse.spring.di.multixml;



public class StudentInfo {
    private Student student;

    public StudentInfo(Student student) {
        this.student = student;
    }

    public Student getStudent() {
        return student;
    }

    public StudentInfo() {
    }

    public void setStudent(Student student) {
        this.student = student;
    }
}
