package Sem5Task1.service;

import Sem5Task1.model.Teacher;
import Sem5Task1.model.User;

import java.util.List;

public interface TeacherService {
    Teacher create(User user);

    List<Teacher> read();
}
