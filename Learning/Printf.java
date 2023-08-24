import java.util.Scanner;

public class Printf {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s = "Bro";
        double db = 1000;

        for(int i=0;i<3;i++)
        {
           String s1=sc.next();
           int x=sc.nextInt();
            System.out.printf("%-15s%03d\n",s1,x); //
        }
//Printf() is used to format the output text in console
//Arguments --> format string + object/variable/value
// %(flags) are used for different uses


//Conversion Character

/*  %d --> used to place the value anywhere
      System.out.printf("%d Format String",123)-->OUTPUT = 123 Format String  */

/*  Likewise    %d-->Integer
                %b-->Boolean
                %c-->Char
                %s-->String
                %f-->Double/Float   */

// Width
//Gives minimum number of characters to be written
    System.out.printf("Hello %10s",s);  //Prints --> Hello 10spaces Bro, if -10 is given --> Hello Bro 10 spaces

// Precision
//Gives the number of digits after the decimal point
    System.out.printf("Money left: %.2f",db); //Prints-->Money left: 1000.00; Usually it give 6 digits, we limited it to 2

//Flags
        // - : left justify                                 --> Gives space after the output, Usually space will be given before the output
        // + : (+) (-) sign in front of numbers              --> Gives + sign for normal value (+3), - sign for minus value (-3)
        // 0 : numeric values are zero padded               --> Gives extra zeroes, if 03 is given and input is 25 output will be 025. 3 values should come or else 0 will be added in front
        // , : gives comma to numbers                       --> Gives comma, %,d 10000 --> 10,000
    }
}