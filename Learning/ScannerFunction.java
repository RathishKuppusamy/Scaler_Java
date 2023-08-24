import java.util.Scanner;

public class ScannerFunction {

    public static void main (String[] args){

       /* Syntax:
        Scanner name = new Scanner(System.in);
        int variable = name.nextInt();*/

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = (int) sc.nextLong();
        float z = sc.nextFloat();
        System.out.println(x + " " + y + " " + z);

        String str = sc.next(); //only prints first word
        System.out.println(str);
        /*  hai all how are you
        output -->   hai */

        String str1 = sc.nextLine();
        System.out.println(str1);
        /*  hai all how are u
        output --> hai all how are u    */

        char c1 = sc.next().charAt(0);
        //for Char we dont have seperate function, so we have toprint char from string only
        System.out.println(c1);
    sc.close();
        //always use scanner close to avoid memory leak

        //Scanner int and scanner string cannot be used immediately in the next line-->Java will think /n (internal command after each enter) as a string
        //so use this sc.nextLine();-->where sc is the scanner name
        //this will give another /n and create a buffer

    }
}
