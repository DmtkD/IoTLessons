package ua.lviv.iot.manager;

import ua.lviv.iot.model.Student;

import java.util.List;

public interface University {
    void kickStudent(Student student);
    void kickAllStudent(List<Student> studentList);
    void studentEnter(Student student);
    void studentEnterAllStudent(List<Student> studentList);

    int countStudent();
    void createGroup(String name, String department, int count);

    List<Student> sortBySurname();

    List<Student> getAllStudentFromCourse(int course);
}
