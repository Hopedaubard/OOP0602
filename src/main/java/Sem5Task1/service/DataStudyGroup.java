package Sem5Task1.service;

import Sem5Task1.model.Student;
import Sem5Task1.model.Teacher;
import Sem5Task1.model.User;

import java.util.ArrayList;
import java.util.List;

public class DataStudyGroup implements StudyGroupService {
    Teacher teacher;
    List<Student> studentList = new ArrayList<>();
    List<User> studyGroup = new ArrayList<>();

    public DataStudyGroup() {
    }

    @Override
    public void createGroup(Teacher teacher, List<Student> studentList) {
        this.teacher = teacher;
        this.studentList = studentList;
        List<User> studyGroup = new ArrayList<>();
        studyGroup.add(teacher);
        studyGroup.addAll(studentList);
        this.studyGroup = studyGroup;
    }

    @Override
    public List<User> toReadStudyGroup() {
        return this.studyGroup;
    }
}
