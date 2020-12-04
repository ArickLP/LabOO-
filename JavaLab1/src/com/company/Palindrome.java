package com.company;

import java.util.Scanner;

public class Palindrome {  public static void main(String[] args) {

    String[] s = {"java", "Palindrome", "apple", "racecar", "madam", "kayak", "moon", "song"};
    for (int i = 0; i < s.length; i++) {
        System.out.println("Введённое слово "+s [i] +" является палиндромом - " + isPalindrome(s[i]));
    }
    Scanner in = new Scanner(System.in);
    System.out.print("Введите слово для проверки: ");
    String str = in.next();
    System.out.print("Введённое слово является палиндромом - " + isPalindrome(str));

}
    public static String reverseString(String s)
    {
        String reverse ="";
        for (int i = s.length()-1; i >=0 ; i--) {
            reverse+=s.charAt(i);
        }
        return reverse;
    }
    public static boolean isPalindrome(String s)
    {
        String reverse = reverseString(s);
        return s.equals(reverse);
    }
}

