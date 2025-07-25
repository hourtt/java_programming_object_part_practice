package com.example.object_part_practice.student;

public class StudentMain {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 20);
        Student student2 = new Student("Alice", 20);

        //Add a new class name called Student_2
        Student_2 student_1 = new Student_2("Bob", 27);
        Student_2 student_2 = new Student_2("Bob", 27);

        System.out.println(student1.toString());
        System.out.println(student2.toString());

        //Print out the value
        System.out.println(student_1.toString());
        System.out.println(student_2.toString());

        System.out.println(student1 == student2);
        System.out.println(student1.equals(student2));

        //Compare the value
        System.out.println(student_1 == student_2);
        System.out.println(student_1.equals(student_2));
    }
}
