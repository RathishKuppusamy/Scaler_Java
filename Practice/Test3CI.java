// Write a program to calculate the Compound Interest for given values

import java.util.Scanner;
public class Test3CI {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the principle amount");
        double p = sc.nextDouble();
        p = p*12;

        System.out.println("Please enter the number of years");
        double n = sc.nextDouble();

        System.out.println("Please enter the annual interest rate");
        double r = sc.nextDouble();

        int CI = (int) (p * (Math.pow((1 + r / 100), n)));
        System.out.println("Compound Interest is:" + CI);

    }
}
