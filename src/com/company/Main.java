package com.company;
import java.util.*;

public class Main {
    public static void main(String[] args) {
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
        StringBuilder sb = new StringBuilder();
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

}