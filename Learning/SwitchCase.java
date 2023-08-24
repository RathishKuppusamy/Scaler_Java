import java.util.Scanner;
public class SwitchCase {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any character:");
        char ch = sc.next().charAt(0);

    /* // Switchcase 1 --> Normal

    switch (ch) {
            case 'a':
                System.out.println("Vowel");
                break;
            case 'e':
                System.out.println("Vowel");
                break;
            case 'i':
                System.out.println("Vowel");
                break;
            case 'o':
                System.out.println("Vowel");
                break;
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
                break;
        }
    */    // SwitchCase 2 --> Simple

      /*  switch (ch) {

            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println("Vowel");
                break;
            default:
                System.out.println("Consonant");
                break;

        }*/

        // SwitchCase 3 --> Easy

    /*switch (ch){
        case 'a','e','i','o','u':
            System.out.println("Vowel");
            break;
        default:
            System.out.println("Consonant");
            break;
    }*/
        // Enhanced Switch

        switch (ch) {
            case 'a', 'e', 'i', 'o', 'u' -> {
                System.out.println("Vowel");
            }
            default -> {
                System.out.println("Consonant");
            }
        }
    }
}