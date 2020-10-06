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

        Item item1 = new Item("goldfish", 45);
        Item item2 = new Item("watch", 15);
        Item item3 = new Item("dog", 53);
        Item[] items1 = {item1};
        Item[] items2 = {item2, item3};
        Warrior warrior1 = new Warrior("warrior1", 10, 4, 7, items1);
        Warrior warrior2 = new Warrior("warrior2", 9, 5, 3, items2);

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
        System.out.println("11. ) " + canCapture(new String[] {"C2", "C8"}));
        System.out.println("12.a ) " + student1.getName() + ": " + student1.getStudentNumber());
        System.out.println("12.b ) " + student1.getStudentNumber() + ", " + student1.getPhoneNumber() + ", " + student1.getAddress());
        System.out.println("      " + student2.getStudentNumber() + ", " + student2.getPhoneNumber() + ", " + student2.getAddress());
        System.out.println("13. ) " + calculateBudget(new Person[]{ person1, person2, person3}));
        System.out.println("14. ) Area: " + Triangle.getArea(new Triangle(3, 4,5)));
        System.out.println("      Perimeter: " + Triangle.getPerimeter(new Triangle(3, 4,5)));
        System.out.println("15. ) " + employee.name + " " +employee.surname + ", " + employee.jobPosition.name + ", salary: " + employee.jobPosition.salary + " eur.");
        System.out.println("16. ) " + battle(warrior1, warrior2));
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
        if (a == b && b == c) return 3;
        else if (a == b || b == c || a == c) return 2;
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
    public static boolean canCapture(String[] input){
        return false;
    }
    public static int warOfNumbers(int[] numbers) {
        return 0;
    }
    public static int calculateBudget(Person[] people){
        int totalBudget = 0;
        for (Person p:people){
            totalBudget += p.getBudget();
        }
        return totalBudget;
    }
    public static int battle(Warrior warrior1, Warrior warrior2){
        int totalForce1 = warrior1.life + warrior1.muscle + warrior1.speed;
        int totalForce2 = warrior2.life + warrior2.muscle + warrior2.speed;
        if (totalForce1 > totalForce2) return 1;
        else if (totalForce1 < totalForce2) return 2;
        return 0;
    }
}