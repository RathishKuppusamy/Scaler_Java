// Write a program to print Odd or Even for given values

import java.util.Scanner;
public class Test4OrE {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to check:");
        int a = sc.nextInt();
        
        int x = a % 2;

        if (x == 0){
            System.out.println("The given number is an Even number.");
        }
        else {
            System.out.println("The given number is an ODD number.");
        }




    }

}
