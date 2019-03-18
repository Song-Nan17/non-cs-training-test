package com.thoughtworks.training.test.task3;

public class Teacher extends Person {
    private int classNumber;

    public Teacher(int classNumber) {
        this.classNumber = classNumber;
    }

    @Override
    public String report() {
        return "I am a teacher from Class " + this.classNumber;
    }

    public int getClassNumber() {
        return this.classNumber;
    }

    public void setClassNumber(int classNumber) {
        this.classNumber = classNumber;
    }
}
