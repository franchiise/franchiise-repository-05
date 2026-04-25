package dowhilenumeros;

import java.util.Scanner;

public class DoWhileNumeros {

    public static void main(String[] args) {

        int n, s = 0;
        String answ;
        
        Scanner keyboard = new Scanner(System.in);
        
        do {
        
            System.out.println("type a number: ");
            n = keyboard.nextInt();
            s += n;
            
            System.out.println("do u wanna continue? [Y/N]");
            answ = keyboard.next().toUpperCase();
        
        } while (answ.equals("Y"));
        
        System.out.println("the sum of all numbers mentioned is " + s);
        
    }
    
}
