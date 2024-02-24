package Sem5Task1.service;

import Sem5Task1.model.Student;
import Sem5Task1.model.User;

import java.util.List;

public interface StudentService {
    Student create(User user);
    List <Student> read();
}
