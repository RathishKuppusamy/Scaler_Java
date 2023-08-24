import java.util.Scanner;
public class IfElse {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter integer A:");
        int a = sc.nextInt();
        System.out.println("Enter integer B:");
        int b = sc.nextInt();

        if (a>b)
        {
            System.out.println("A is greater than B");
        }
        else if (a<b)
        {
            System.out.println("A is lessser than B");
        }
        else
        {
            System.out.println("A equals B");
        }
        // If there are more than 5 If conditions go for Switch case for faster performance
    }

}