package com.example.object_part_practice.student;

import java.util.Objects;

public class Student_2 {
    private final String name;
    private final int age;

    public Student_2(String name, int age){
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object object) {
        if (object == null || getClass() != object.getClass()) return false;
        Student_2 student2 = (Student_2) object;
        return age == student2.age && Objects.equals(name, student2.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Student_2{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

}
