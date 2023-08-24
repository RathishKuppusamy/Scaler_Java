// Write a program to calculate the Simple Interest for given values

import java.util.Scanner;
public class Test2SI {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the principle amount");
        double p = sc.nextDouble();
        p = p*12;

        System.out.println("Please enter the number of years");
        double n = sc.nextDouble();

        System.out.println("Please enter the annual interest rate");
        double r = sc.nextDouble();

        double SI = (p*n*r)/100;
        System.out.println("Simple Interest is:" + SI);
    }

}
