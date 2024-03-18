package com.example;

import java.util.Scanner;

public class LecturerMarks {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter marks for Java Programming:");
        double javaMarks = input.nextDouble();
        
        System.out.println("Enter marks for Networking:");
        double networkingMarks = input.nextDouble();
        
        System.out.println("Enter marks for Maths:");
        double mathsMarks = input.nextDouble();
        
        computeAverageMarks(javaMarks, networkingMarks, mathsMarks);
    }
    
    public static void computeAverageMarks(double javaMarks, double networkingMarks, double mathsMarks) {
        double average = (javaMarks + networkingMarks + mathsMarks) / 3;
        
        System.out.println("Marks for Java Programming is: " + javaMarks);
        System.out.println("Marks for Networking is: " + networkingMarks);
        System.out.println("Marks for Maths is: " + mathsMarks);
        System.out.println("The average is: " + average);
    }
}