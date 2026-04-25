package calcularidade;

import java.time.Year;
import java.util.Scanner;

public class CalcularIdade {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("type the year u were born: ");
        
        int date = scanner.nextInt();
        int currentYear = Year.now().getValue();
        
        System.out.println(currentYear - date);
        
    }
    
}