package Sem5Task1.service;

import Sem5Task1.model.Student;
import Sem5Task1.model.Teacher;
import Sem5Task1.model.User;

import java.util.ArrayList;
import java.util.List;

public interface StudyGroupService {
    public void createGroup(Teacher teacher, List<Student> studentList);

    public List<User> toReadStudyGroup();
}
