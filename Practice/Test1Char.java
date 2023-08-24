// Scan a string and print only one character from it

import java.util.Scanner;
public class Test1Char {

    public static void main(String[] args){

        Scanner sc = new Scanner (System.in);
        char c = sc.next().charAt(2);

        System.out.println(c);
    }

}
