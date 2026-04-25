package entradadados;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class EntradaDados {

    public static void main(String[] args) {
        
        int s = 0, e = 0, o = 0, a100 = 0, t = 0;
        double av = 0;
        float n;
                
        do {
        
            n = Integer.parseInt(JOptionPane.showInputDialog("type any number (type 0 to stop)", null));
            
            if (n != 0) {
            
                s += 1;
                t += n;
            
                if (n % 2 == 0) {

                    ++e;

                } else {

                    ++o;

                }

                if (n > 100) {

                    ++a100;

                }
            
                av = (double) t/s;
                
            }           
            
        } while (n != 0);
        
        System.out.println(String.format("numbers: %d\neven numbers: %d\nodd numbers: %d\nabove 100: %d\naverage: %.1f", s, e, o, a100, av));
        
    }
    
}
