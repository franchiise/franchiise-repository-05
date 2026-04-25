package fatorial;

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {

        System.out.println("type any number: ");
        Scanner keyboard = new Scanner(System.in);
        
        int n = keyboard.nextInt();
        int c = 1;
        
        while (n >= 1) {
        
            c *= n;
            n--;
        
        }
        
        System.out.println(c);
                       
    }
    
}
