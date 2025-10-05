package main.java.ua.opnu;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student student1= new Student(19,"Олексій","Петренко","АІ-212", 5);
        Student student2 = new Student(23, "Ольга", "Мельник", "АІ-217", 5);
        Student student3 = new Student(20, "Іван", "Коваленко", "АІ-213", 4);
        Student student4 = new Student(21, "Марія", "Шевченко", "АІ-214", 5);
        Student student5 = new Student(22, "Дмитро", "Сидоренко", "АІ-215", 3);
        Student student6 = new Student(18, "Анна", "Ткаченко", "АІ-216", 4);

        Lecturer lecturer1 = new Lecturer(45, "Олександр", "Іванов", 20000, "Програмування");
        Lecturer lecturer2 = new Lecturer(38, "Марія", "Петренко", 18000, "Математика");
        Lecturer lecturer3 = new Lecturer(50, "Іван", "Коваленко", 25000, "ОБДЗ");
        Lecturer lecturer4 = new Lecturer(42, "Анна", "Шевченко", 22000, "Фізика");
        Lecturer lecturer5 = new Lecturer(35, "Дмитро", "Сидоренко", 19000, "Психологія");

        ArrayList<Person> list1 = new ArrayList<>();
        list1.add(student1);
        list1.add(student2);
        list1.add(student3);
        list1.add(student4);
        list1.add(student5);
        list1.add(student6);
        list1.add(lecturer1);
        list1.add(lecturer2);
        list1.add(lecturer3);
        list1.add(lecturer4);
        list1.add(lecturer5);


        for(Person p : list1){
            System.out.println(p.toString());
        }
    }
}