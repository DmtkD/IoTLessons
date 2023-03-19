package ua.lviv.iot.lesson3.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
public class Employee extends Person {
    private String company;
    private String role;

    public Employee(String name, String surname, int age, String company, String role) {
        super(name, surname, age);
        this.company = company;
        this.role = role;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "company='" + company + '\'' +
                ", role='" + role + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
