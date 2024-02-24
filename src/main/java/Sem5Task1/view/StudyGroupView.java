package Sem5Task1.view;

import Sem5Task1.model.User;

import java.util.List;

public class StudyGroupView {
    public void printStudyGroup(List<User> studyGroup){
        System.out.printf("Учебная группа: \n" + studyGroup);
    }
}
