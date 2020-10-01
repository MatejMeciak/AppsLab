package com.company;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("John", 12345, 543452,"01001 Zilina");
        Student student2 = new Student("John", 12345, 413453,"01001 Zilina" );

        Person person1 = new Person("John", 21, 29000);
        Person person2 = new Person("Steve", 32, 32000);
        Person person3 = new Person("Martin", 16, 1600);

        JobPosition jobPosition = new JobPosition("IT programmer", 2100);
        Date date = new Date(1990, Calendar.AUGUST, 4);
        Employee employee = new Employee("Jozko", "Mrkvicka", date, jobPosition);

        System.out.println("1. ) " + totalDistance(0.2, 0.4, 100.0));
        System.out.println("2. ) " + equal(3, 4, 3));
        System.out.println("3. ) " + isTriangle(2, 3, 4));
        System.out.println("4. ) " + equalSlices(11, 5, 2));
        System.out.println("5. ) " + checkPalindrome("mom"));
        System.out.println("6. ) " + rps("rock", "paper"));
        System.out.println("7. ) " + Arrays.toString(multiplyByLength(new int[] {2, 3, 1, 0})));
        System.out.println("8. ) " + differenceMaxMin(new int[] {10, 4, 1, 4, -10, -50, 32, 21}));
        System.out.println("9. ) " + warOfNumbers(new int[] {2, 3, 1, 0}));
        System.out.println("10. ) " + checkEnding("abc", "bc"));
        System.out.println("11. ) " + canCapture("F5", "C8"));
        System.out.println("12.a ) " + student1.getName() + ": " + student1.getStudentNumber());
        System.out.println("12.b ) " + student1.getStudentNumber() + ", " + student1.getPhoneNumber() + ", " + student1.getAddress());
        System.out.println("      " + student2.getStudentNumber() + ", " + student2.getPhoneNumber() + ", " + student2.getAddress());
        System.out.println("13. ) " + calculateBudget(new Person[]{ person1, person2, person3}));
        System.out.println("14. ) Area: " + Triangle.getArea(new Triangle(3, 4,5)));
        System.out.println("      Perimeter: " + Triangle.getPerimeter(new Triangle(3, 4,5)));
        System.out.println("15. ) " + employee.name + " " +employee.surname + ", " + employee.jobPosition.name + ", salary: " + employee.jobPosition.salary + " eur.");
    }

    public static double totalDistance(double stairHeight, double stairLength, double towerLength) {
        double stairs = towerLength / stairHeight;
        double totalLength = stairs * (stairHeight + stairLength);
        if (totalLength <= 0.0) {
            System.out.println("You can't enter 0!");
        }
        return totalLength;
    }
    public static int equal(int a, int b, int c){
        int[] args = { a, b, c };
        if (a == b && b == c){
            return 3;
        }
        else if (a == c){
            return 2;
        }
        for (int i = 0; i < 2; i++){
            if (args[i] == args[i+1]){
                return 2;
            }
        }
        return 0;
    }

    public static boolean isTriangle(int a, int b, int c){
        return (a + b) > c && (b + c) > a && (c + a) > b;
    }

    public static int[] multiplyByLength(int[] array){
        int arrLength = array.length;
        for (int i = 0; i < arrLength; i++){
            array[i] *= arrLength;
        }
        return array;
    }
    public static boolean equalSlices(int slices, int people, int each){
        return (people * each) <= slices;
    }
    public static boolean checkPalindrome(String word) {
        StringBuilder reversedWord = new StringBuilder();
        char[] charArr = word.toCharArray();
        int length = word.length() - 1;
        for (int i = 0; i <= length; i++) {
            reversedWord.append(charArr[length - i]);
        }
        return word.equals(reversedWord.toString());
    }
    public static String rps(String playerOne, String playerTwo){
        return "Invalid input";
    }
    public static int differenceMaxMin(int[] array){
        Arrays.sort(array);
        return Math.abs(array[array.length - 1] - array[0]);
    }
    public static boolean checkEnding(String first, String second){
        var sb = new StringBuilder();
        sb.append(first, first.length() - 1, second.length());
        return sb.toString().equals(second);
    }
    public static boolean canCapture(String a, String b){
        if (a.length() > 2 || b.length() > 2){
            System.out.println("Invalid Input");
        }
        return false;
    }
    public static int warOfNumbers(int[] numbers) {
        return 0;
    }
    public static int calculateBudget(Person[] people){
        int totalBudget = 0;
        for (Person p:people){
            totalBudget += p.budget;
        }
        return totalBudget;
    }

}
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
class Person {
    String name;
    int age;
    int budget;

    public Person(String name, int age, int budget) {
        this.name = name;
        this.age = age;
        this.budget = budget;
    }
}
class Triangle {
    int a;
    int b;
    int c;

    public Triangle(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    public static int getPerimeter(Triangle triangle){
        return triangle.a + triangle.b + triangle.c;
    }

    public static int getArea(Triangle triangle){
        int s = (triangle.a + triangle.b + triangle.c) / 2;
        return (int) Math.sqrt(s*(s - triangle.a)*(s - triangle.b)*(s- triangle.c));
    }
}
class Employee{
    String name;
    String surname;
    Date dateOfBirth;
    JobPosition jobPosition;

    public Employee(String name, String surname, Date dateOfBirth, JobPosition jobPosition) {
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.jobPosition = jobPosition;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Date getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(Date dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public JobPosition getJobPosition() {
        return jobPosition;
    }

    public void setJobPosition(JobPosition jobPosition) {
        this.jobPosition = jobPosition;
    }
}
class JobPosition{
    String name;
    double salary;

    public JobPosition(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}