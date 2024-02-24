package Sem5Task1.view;

import Sem5Task1.model.Student;

import java.util.List;

public class StudentView {
    public void printStudent(List <Student> studentList){
        System.out.println("Все студенты: " + "\n" + studentList);
    }
}
