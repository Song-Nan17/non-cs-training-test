package com.thoughtworks.training.test.task3;

public class Student extends Person {
    private int classNumber;

    public Student(int classNumber) {
        this.classNumber = classNumber;
    }

    public int getClassNumber() {
        return this.classNumber;
    }

    public void setClassNumber(int classNumber) {
        this.classNumber = classNumber;
    }

    @Override
    public String report() {
        return "I am a student from Class " + this.classNumber;
    }
}
