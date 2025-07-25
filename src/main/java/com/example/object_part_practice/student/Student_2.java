package com.example.object_part_practice.student;

import java.util.Objects;

public class Student_2 {
    // If you only define values using constructors, it's a good idea to force it to be final.
    private final String name;
    private final int age;
    public Student_2(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Student_2 student = (Student_2) object;
        return age == student.age && Objects.equals(name, student.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
