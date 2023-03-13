package ua.lviv.iot.lesson2.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
@AllArgsConstructor
public class Student {
    private String name;
    private String surname;
}
