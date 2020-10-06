package com.company;
class Student {
    String name;
    String address;
    int studentNumber;
    int phoneNumber;

    public Student(String name, int studentNumber, int phoneNumber, String address) {
        this.name = name;
        this.studentNumber = studentNumber;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

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