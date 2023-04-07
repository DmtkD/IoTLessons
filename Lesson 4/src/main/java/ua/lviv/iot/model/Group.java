package ua.lviv.iot.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Group {
    private String name;
    private String department;
    private int studentCount;
}
