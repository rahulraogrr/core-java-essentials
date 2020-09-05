package org.example.interview;

import java.util.Scanner;

public class StringPalindrome {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter String : ");
        String palindromeString = scanner.next();

        int method = 1;

        switch (method){
            case 1:
                String reverse = new StringBuffer(palindromeString).reverse().toString();
                if (palindromeString.equalsIgnoreCase(reverse))
                    System.out.println("Palindrome");
                else
                    System.out.println("Not a Palindrome");
                break;
            case 2:
                break;
        }
    }
}
