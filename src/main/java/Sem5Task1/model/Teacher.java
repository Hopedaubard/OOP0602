package Sem5Task1.model;

public class Teacher extends User {
    protected Integer teacherID;

    protected String subject;
    public Teacher(String name, Integer age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    public void setTeacherID(Integer teacherID) {
        this.teacherID = teacherID;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "teacherID=" + teacherID +
                ", subject='" + subject + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
