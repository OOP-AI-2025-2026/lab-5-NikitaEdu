package main.java.ua.opnu;


public class Lecturer extends Person {
    private int salary;
    private String course;

    public Lecturer(int age, String name, String surname, int salary, String course) {
        super(age, name, surname);
        this.salary = salary;
        this.course = course;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }
    @Override
    public String toString() {
        return "Викладач кафедри "+course+", "+getSurname()+" "+getName()+", вік:" + getAge()+". Зарплата: "+getSalary();

    }
}
