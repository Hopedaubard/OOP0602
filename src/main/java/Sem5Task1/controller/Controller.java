package Sem5Task1.controller;

import Sem3HW.View;
import Sem5Task1.model.Student;
import Sem5Task1.model.Teacher;
import Sem5Task1.model.User;
import Sem5Task1.service.DataStudent;
import Sem5Task1.service.DataStudyGroup;
import Sem5Task1.service.DataTeacher;
import Sem5Task1.view.StudentView;
import Sem5Task1.view.StudyGroupView;

import java.util.List;

public class Controller {
    private DataStudent dataStudent;
    private DataTeacher dataTeacher;
    private StudentView studentView;
    private StudyGroupView studyGroupView;

    public void start() {
        User user1 = new Student("Игорь", 21, 4.5);
        User user2 = new Teacher("Игорь", 38, "Математика");
        User user3 = new Student("Сергей", 22, 4.2);
        createStudent(user1);
        createTeacher(user2);
        createStudent(user3);
        List<Student> studentList = dataStudent.read();
        studentView.printStudent(studentList);
        DataStudyGroup dataStudyGroup = new DataStudyGroup(createTeacher(user2), studentList);
        List <User> userList = dataStudyGroup.toReadStudyGroup();
        studyGroupView.printStudyGroup(userList);
    }

    public Student createStudent(User user) {
        return dataStudent.create(user);
    }

    public Teacher createTeacher(User user) {
        return dataTeacher.create(user);
    }

    public Controller() {
        dataStudent = new DataStudent();
        dataTeacher = new DataTeacher();
        studentView = new StudentView();
    }
}
