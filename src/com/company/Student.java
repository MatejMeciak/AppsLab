package com.company;
class Student {
    private String name;
    private String address;
    private int studentNumber;
    private int phoneNumber;

    public Student(String name, int studentNumber, int phoneNumber, String address) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }
    public String getNameAndSurname() { return this.name + ": " + this.studentNumber; }

    public String getName() {
        return name;
    }

    public int getStudentNumber() {
        return studentNumber;
    }

    public String getAddress() {
        return address;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }
}