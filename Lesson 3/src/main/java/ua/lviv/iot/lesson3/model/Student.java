package ua.lviv.iot.lesson3.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@NoArgsConstructor
public class Student extends Person{
    private int mark;
    private String university;
    public Student(String name, String surname, int age, int mark, String university) {
        super(name, surname, age);
        this.mark = mark;
        this.university = university;
    }

    @Override
    public String toString() {
        return "Student {" +
                "mark=" + mark + '\'' +
                ", university=" +  university + '\'' +
                ", Person=" + super.toString() +
                '}';
    }
}
