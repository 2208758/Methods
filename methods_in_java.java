package java_methods;

import java.util.Scanner;

public class Methods {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Enter three numbers:");
        int num1 = input.nextInt();
        int num2 = input.nextInt();
        int num3 = input.nextInt();
        
        findLargestAndSmallest(num1, num2, num3);
    }
    
    public static void findLargestAndSmallest(int num1, int num2, int num3) {
        int smallest = Math.min(Math.min(num1, num2), num3);
        int largest = Math.max(Math.max(num1, num2), num3);
        
        System.out.println("The smallest number: " + smallest);
        System.out.println("The largest number: " + largest);
        System.out.printf("%d is your largest number and %d is your smallest number.", largest, smallest);
    }
}