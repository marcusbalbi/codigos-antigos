

package flx1;

import java.io.File;


public class flx {
    
    public void analisa(String path)
    {
        File f1 = new File(path);
        
        if(f1.exists())
        {
            System.out.printf("%s\n%s\n%s\n%s\n%s\n%s%s\n%s%s",
                    f1.getName(),"existe",(f1.isFile()?"é arquivo": "nao é arquivo"),
                    (f1.isDirectory()? "é diretorio": "nao é diretorio"),
                    (f1.isAbsolute()? "caminho absoluto":"caminho nao absoluto"),
                    "ultima modificação:",f1.lastModified(),"comprimento:",f1.length());
                    
        }
    }

}
