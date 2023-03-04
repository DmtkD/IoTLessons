package model;

public class Employee extends Person {
    private String nameCompany;

    public Employee(String name, String surname, int age, String nameCompany) {
        super(name, surname, age);
        this.nameCompany = nameCompany;
    }

    @Override
    public void display() {
        System.out.println("Hello! I am working in " + nameCompany);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "nameCompany='" + nameCompany + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
