// Write a program with printf and use all the flags

import java.util.Scanner;

public class Test6Printf {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter String");
        String s = sc.next();
        System.out.println("Enter integer");
        int i = sc.nextInt();
        System.out.println("Enter Float");
        float f = sc.nextFloat();

        System.out.printf("String%10s\n",s);    // Forward space
        System.out.printf("String%-10s\n",s);   // Backward space
        System.out.printf("%+d\n",i);   // Given sign
        System.out.printf("%,d\n",i);   // Gives comma based on the number
        System.out.printf("%020d\n",i); // Fills 0 until count is 20
        System.out.printf("%.4f\n",f);  // 4 values after .
    }
}