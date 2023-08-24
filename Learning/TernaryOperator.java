import java.util.Scanner;
public class TernaryOperator {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any number here :");
        int x = sc.nextInt();

        String Result = (x % 2 == 0) ? "Even" : "ODD";
        System.out.println("The given number is :" + Result);

        /*It is a compact form of If-Else statement..
        Syntax: condition ? Expression1 : Exprseeion2;*/
    }
}
