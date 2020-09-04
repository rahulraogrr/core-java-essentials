package org.example.interview;

import java.util.Scanner;

public class Fibonacci {
    private static final Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        try {
            System.out.println("Please Enter Number : ");
            int nTerm = scanner.nextInt();

            int n1 = 0;
            int n2 = 1;
            int count = 0;

            if(nTerm <= 0)
                System.out.println("Please enter a positive integer");
            else if(nTerm == 1){
                System.out.println("Fibonacci Series");
                System.out.println(n1);
            }else{
                System.out.println("Fibonacci Series");
                int nth = 0;
                while (count<nTerm)
                {
                    System.out.println(n1);
                    nth = n1+n2;
                    n1=n2;
                    n2=nth;
                    count++;
                }
            }
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}