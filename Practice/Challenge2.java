/* Write a program to input from user three numbers(A, B & C) representing side lengths of a triangle.
You have to print if the traingle is "equilateral", "scalene" or "isosceles".*/

import java.util.Scanner;

public class Challenge2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 3 values:");
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        int n3 = sc.nextInt();

        if (n1 == n2 && n2 == n3 && n3 == n1) {
            System.out.println("Equilateral");
        } else if (n1 == n2 || n2 == n3 || n3 == n1) {
            System.out.println("Isosceles");
        } else {
            System.out.println("Scalene");
        }
    }
}
