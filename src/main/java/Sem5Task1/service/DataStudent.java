package Sem5Task1.service;

import Sem5Task1.model.Student;
import Sem5Task1.model.User;

import java.util.ArrayList;
import java.util.List;

public class DataStudent implements StudentService {
    List<Student> studentList = new ArrayList<>();

    @Override
    public Student create(User user) {
        Student student = (Student) user;
        student.setStudentID(studentList.size() + 1);
        studentList.add(student);
        return student;
    }

    @Override
    public List<Student> read() {
        return studentList;
    }
}
