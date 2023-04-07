package ua.lviv.iot;

import ua.lviv.iot.manager.University;
import ua.lviv.iot.manager.impl.IUniversity;
import ua.lviv.iot.model.Student;

import java.util.*;

public class Main {
    public static void main(String[] args)  {
        Student student1 = new Student("Zenoviy", "Veres", 2, 20);
        Student student2 = new Student("Yana", "Turchynyak", 2, 30);
        Student student3 = new Student("Ana", "Turchynyak", 2, 16);
        Student student4 = new Student("Pavlo", "Turchynyak", 3, 20);

        University Lpnu = new IUniversity();

        Lpnu.studentEnter(student1);
        Lpnu.studentEnterAllStudent(Arrays.asList(student2, student3, student4));

        System.out.println(Lpnu.countStudent());

        Lpnu.sortBySurname().forEach(System.out::println);
        System.out.println("#################");
        Lpnu.getAllStudentFromCourse(2).forEach(student -> System.out.println(student));
    }
}