package Sem5Task1.service;

import Sem5Task1.model.Student;
import Sem5Task1.model.Teacher;
import Sem5Task1.model.User;
import java.util.ArrayList;
import java.util.List;

public class DataTeacher implements TeacherService{
    List<Teacher> teacherList = new ArrayList<>();
    @Override
    public Teacher create(User user) {
        Teacher teacher = (Teacher) user;
        teacher.setTeacherID(teacherList.size() + 1);
        teacherList.add(teacher);
        return teacher;
    }

    @Override
    public List<Teacher> read() {
        return teacherList;
    }
}
