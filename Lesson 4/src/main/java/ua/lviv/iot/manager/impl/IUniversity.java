package ua.lviv.iot.manager.impl;


import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import ua.lviv.iot.manager.ReadData;
import ua.lviv.iot.manager.University;
import ua.lviv.iot.model.Group;
import ua.lviv.iot.model.Student;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class IUniversity implements University, ReadData {
    private List<Student> studentList = new ArrayList<>();
    private List<Group> groupList;
    @Override
    public void kickStudent(Student student) {
        this.studentList.remove(student);
    }

    @Override
    public void kickAllStudent(List<Student> studentList) {
        this.studentList.removeAll(studentList);
    }

    @Override
    public void studentEnter(Student student) {
        this.studentList.add(student);
    }

    @Override
    public void studentEnterAllStudent(List<Student> studentList) {
        this.studentList.addAll(studentList);
    }

    @Override
    public int countStudent() {
        return studentList.size();
    }

    @Override
    public void createGroup(String name, String department, int count) {
        groupList.add(new Group(name, department, count));
    }

    @Override
    public List<Student> sortBySurname() {
        return this.studentList
                .stream()
                .sorted(Comparator.comparing(Student::getName))
                .toList();
    }

    @Override
    public List<Student> getAllStudentFromCourse(int course) {
        return this.studentList
                .stream()
                .filter((student) -> student.getCourse() == course)
                .toList();
    }

    @Override
    public void readDataAboutStudent(String file) throws FileNotFoundException {
        FileReader fileReader = new FileReader(new File(file));
        try {

        } catch (Exception e) {
            e.getMessage();
        } finally {
            System.out.print("Операція пройшла успішно");
        }
    }
}
