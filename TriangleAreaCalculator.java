package com.geometry;

import java.util.Scanner;

public class TriangleAreaCalculator {
    private double base;
    private double height;
    
    public static void main(String[] args) {
        TriangleAreaCalculator calculator = new TriangleAreaCalculator();
        calculator.getUserInput();
        double area = calculator.calculateArea();
        calculator.displayArea(area);
    }
    
    public void getUserInput() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter the base of the triangle:");
        base = input.nextDouble();
        
        System.out.println("Enter the height of the triangle:");
        height = input.nextDouble();
    }
    
    public double calculateArea() {
        return 0.5 * base * height;
    }
    
    public void displayArea(double area) {
        System.out.println("The calculated area of the triangle is: " + area);
    }
}