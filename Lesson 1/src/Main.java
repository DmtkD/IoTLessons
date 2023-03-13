import model.*;
import model.impl.Lpml;
import model.impl.UniversityImpl;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Pavlo", "Rybak", 20, "IoT-21", 5);
        Employee employee = new Employee("Zeylik", "Veres", 36, "Softserver");

        Person obj = new Student("avplo", "dfd", 20, "fd", 40);

        int value = (int) 10.F;

        University university = new UniversityImpl();
        int numberOfStudent = university.calculateStudent();
        System.out.println(numberOfStudent);
        university.session("осіння");

        School lpml = new Lpml();

        List<Person> personList = new ArrayList<>();
        personList.add(student);
        personList.add(employee);
        System.out.println(personList);

    }
}
