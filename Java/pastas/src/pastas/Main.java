
package pastas;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

public  class Main {
    static File dir;
  static Locale lc1 = new Locale("/home/aluno/oi");
    public static void main(String[] args) {
        try {

            dir = new File("/home/aluno/olha");
            dir.mkdir();

            Formatter saida = new Formatter("/home/aluno/olha/oi.txt");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
                
       
       
        
    }

}
