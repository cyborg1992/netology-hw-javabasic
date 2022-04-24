package ru.netology.javabasic;

import java.util.Objects;

public class Student {
    private final String studentId;
    private final String name;
    private final String group;

    public Student(String name, String group, String studentId) {
        this.name = name;
        this.group = group;
        this.studentId = studentId;
    }

    @Override
    public int hashCode() {
        return Objects.hash(studentId);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj == null) || (this.getClass() != obj.getClass())) {
            return false;
        }
        Student student = (Student) obj;
        return this.studentId.equals(student.studentId);
    }

    @Override
    public String toString() {
        return "- " +
                name + ", " +
                group + ", " +
                studentId;
    }
}
