package main.java.ua.opnu;


public class  Student extends Person {

    private String group;
    private int studentCardNumber;

    public Student(int age, String name, String surname, String group, int studentCardNumber) {
        super(age, name, surname);
        this.group = group;
        this.studentCardNumber = studentCardNumber;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public int getStudentCardNumber() {
        return studentCardNumber;
    }

    public void setStudentCardNumber(int studentCardNumber) {
        this.studentCardNumber = studentCardNumber;
    }
    public String toString() {
        return "Студент групи "+group+", "+getSurname()+" "+getName()+", вік:" + getAge()+". Номер студентського квитка: "+ studentCardNumber;
    }

}