/* Problem with Younger Brother
Your younger brother is going to a modern school. In his school, there was a coding competition planned. The pannel asked a question "Write a program which can perform the task - Add two numbers and divide them by a third number and print the remainder".
You are a programmer and your brother asks you to write a code that helps him to check his approach.*/

import java.util.Scanner;

public class Challenge1 {

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n1 value:");
        int n1 = sc.nextInt();
        System.out.println("Enter n2 value:");
        int n2 = sc.nextInt();
        System.out.println("Enter n3 value:");
        int n3 = sc.nextInt();

        int n4 = (n1+n2)%n3;
        System.out.println("The reminder is:" + n4);
    }
}
