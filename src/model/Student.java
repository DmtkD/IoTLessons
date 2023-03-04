package model;

public class Student extends Person {
    private String group;
    private int mark;

    public Student(String name, String surname, int age, String group, int mark) {
        super(name, surname, age);
        this.group = group;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return String.format("Student {%s, group: %s, mark: %s}", super.toString(), group, mark);
    }

    @Override
    public void display() {
        System.out.println("Hello! I am " + name);
    }
}
