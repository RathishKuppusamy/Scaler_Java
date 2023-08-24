// Write a program to find the Vowels and Consonants

import java.util.Scanner;
public class Test5Vowel{

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the character in Lower Case only:");
        char ch = sc.next().charAt(0);

        switch (ch) {
            case 'a':
                System.out.println("A is an Vowel");
                break;
            case 'e':
                System.out.println("E is an Vowel");
                break;
            case 'i':
                System.out.println("I is an Vowel");
                break;
            case 'o':
                System.out.println("O is an Vowel");
                break;
            case 'u':
                System.out.println("U is an Vowel");
                break;
            default:
                System.out.println("It is a Consonant");
                break;
        }
    }
}