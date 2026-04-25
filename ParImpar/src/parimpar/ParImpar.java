package parimpar;

import java.util.Scanner;

public class ParImpar {

    public static void main(String[] args) {

        System.out.println("type any number u want: ");
        Scanner keyboard = new Scanner(System.in);

        int n = keyboard.nextInt();

        if (n % 2 == 0) {

            System.out.println("the number u typed is even");

        } else {

            System.out.println("the number u typed is odd");

        }

    }
    
}
