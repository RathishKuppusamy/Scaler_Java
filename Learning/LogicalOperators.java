
import java.util.Scanner;

public class LogicalOperators {
    public static void main(String[] args) {
  /*  Scanner sc = new Scanner(System.in);
    System.out.println("Enter Age:");
    int age = sc.nextInt();
    System.out.println("Enter Nationality:");
    String Nationality = sc.next();
*/

        //Logical AND --> &
        //Checks both the values

        //Short Circuit AND --> && (to increase performance and speed)
        //If first value is False then result is False, no need to navigate to second

        int age = 28;
        String Nationality = "Indian";
        boolean age1 = false;

   /* if(age>=21 && Nationality == "Indian"){
        System.out.println("You can Vote");
    }
    else{
        System.out.println("Not eligible to Vote");
}
----------------------------------------------------------------------------------------------------------
*/
        //Logical OR --> |
        //Checks both the values

        //Short Circuit OR --> || (to increase performance and speed)
        //If first value is True then result is True, no need to navigate to second

       /* if (age >= 21 || Nationality == "Indian") {
            System.out.println("You can Drive");
        } else {
            System.out.println("Not eligible to Drive");
        }
--------------------------------------------------------------------------------------------------------------
        */
        //Logical NOT --> ! (gives the opposite false with ! = true, true with ! = false)

        if (!age1) { //false changes to true --> so true value only will be printed, likewise opposite
            System.out.println("Major");
        } else {
            System.out.println("Minor");
        }
    }
}
