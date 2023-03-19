package ua.lviv.iot.lesson3.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Person {
    protected String name;
    protected String surname;
    protected int age;

    public static Person getPerson(String obj) {
        if (obj.equals("Студент")) {
            return new Student();
        } else {
            return new Employee();
        }
    }
}
