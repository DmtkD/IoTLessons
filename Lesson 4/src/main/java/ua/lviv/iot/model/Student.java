package ua.lviv.iot.model;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Student {
    private String name;
    private String surname;
    private int course;
    // private Date date;
    private int age;

}
