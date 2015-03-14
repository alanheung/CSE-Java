package com.practice;


public class Student {
    private String id, name;
    private int grade;
    
    public Student(String id, String name, int grade){
        this.id     = id;
        this.name   = name;
        this.grade  = grade;
    }

    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", name=" + name + ", grade=" + grade + '}';
    }

}
