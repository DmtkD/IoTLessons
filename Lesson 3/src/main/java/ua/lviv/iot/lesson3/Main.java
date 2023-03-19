package ua.lviv.iot.lesson3;

import ua.lviv.iot.lesson3.model.Employee;
import ua.lviv.iot.lesson3.model.Person;
import ua.lviv.iot.lesson3.model.Student;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Person student1 = new Student("Zenyk", "Veres", 38, 3, "LPNU");
        Person student2 = new Student("Pavlo", "Turchynyak", 20, 5, "LPNU");
        Person employee1 = new Employee("Zenyk", "Veres", 30, "Softserv", "Trainne");
        Person employee2 = new Employee("Sasha", "Sobran", 18, "Hurtozytok15", "Senior");

        List<Person> list = new ArrayList<>();
        list.add(employee1);
        list.add(student1);
        list.add(employee2);
        list.add(student2);

        list.stream()
                .sorted(Comparator.comparing(Person::getAge))
                .toList()
                .stream()
                .filter((person -> person.getAge() > 18))
                .toList()
                .forEach(System.out::println);


        System.out.println("########################");
        List<Person> tempList = new ArrayList<>();
        for (Person person: list) {
            if (person.getAge() > 18)  tempList.add(person);
        }

        for (Person person: tempList) {
            System.out.println(person);
        }

        // чи є коректним використання var в мейні ?

        var temp1 = Person.getPerson("Робота");

        Person temp2 = Person.getPerson("Студент");
        System.out.println(Arrays.asList(temp1, temp2));
    }
}