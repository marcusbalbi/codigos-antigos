package testgui;
import java.awt.*;
import javax.swing.*;
public class janela extends Jframe {


     Jlabel l1,l2,l3;
    public janela() {
    	
    	super("testando rotulos");
    	setLayout(new FlowLayout());
    	
    	l1 = new Jlabel("label em texto");
    	l1.setToolTipText("este é o label 1");
    	add(l1);
    	Icon foto = ImageIcon(get.Class().getResource("c:/foto.jpeg"));
    	l2 = new Jlabel("label com texto e icone",foto,SwingConstants.LEFT);
    	l2.setToolTipText("merda");
    	add(l2);
    	
    	
    	
    	

    	
    	
    	
    	
    }
    
    
}