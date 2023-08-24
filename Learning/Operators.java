import java.util.Scanner;
public class Operators {

        public static void main(String[] args){

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter integer A:");
            int a = sc.nextInt();
            System.out.println("Enter integer B:");
            int b = sc.nextInt();

// Arithmetic operators

            System.out.println(a + b);      // --> Gives the sum
            System.out.println(a - b);      // --> Gives the difference
            System.out.println(a * b);      // --> Gives the product
            System.out.println(a / b);      // --> Gives the Quotient
            System.out.println(a % b);      // --> Gives the remainder

// Relational operators

            System.out.println(a > b);      // --> Greater than
            System.out.println(a < b);      // --> Lesser than
            System.out.println(a >= b);     // --> Greater than or equal to
            System.out.println(a <= b);     // --> Lesser than or equal to
            System.out.println(a == b);     // --> Equal to
            System.out.println(a != b);     // --> Not equal to
        }

}
