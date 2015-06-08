
package gui22;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;


public class cadclientejanela extends JFrame {
    
    private JLabel nome = new JLabel("NOME:");
    private JLabel sobrenome = new JLabel("SOBRENOME:");
    private JLabel tel1 = new JLabel("TELEFONE 1:");
    private JLabel tel2 = new JLabel("TELEFONE 2:");
    private JLabel cel = new JLabel("CELULAR:");
    private JLabel email = new JLabel("E-MAIL:");
    private JLabel endereco = new JLabel("ENDEREÇO:");
    private JTextField caixa1 = new JTextField(15);
    private JTextField caixa2 = new JTextField(15);
    private JTextField caixa3 = new JTextField(15);
    private JTextField caixa4 = new JTextField(15);
    private JTextField caixa5 = new JTextField(15);
    private JTextField caixa6 = new JTextField(15);
    private JButton botaook = new JButton("CADASTRAR");
    private JButton botaofecha = new JButton("FECHAR");

    
    
    
    
    
    
    public cadclientejanela()
    {
        super("cadastro de Clientes");

        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setSize(220, 600);
     

        add(nome);
        add(caixa1);
        add(sobrenome);
        add(caixa2);
        add(tel1);
        add(caixa3);
        add(tel2);
        add(caixa4);
        add(cel);
        add(caixa5);
        add(email);
        add(caixa6);
        add(botaook);
        add(botaofecha);

        botaook.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                cliente c1 = new cliente();
                c1.set_nome(caixa1.getText());
                c1.set_sobrenome(caixa2.getText());
                c1.set_tel1(caixa3.getText());
                c1.set_tel2(caixa4.getText());
                c1.set_cel(caixa5.getText());
                c1.set_email(caixa6.getText());
                c1.gravar();
                JOptionPane.showMessageDialog(cadclientejanela.this, "Cadastro  efetuado com sucesso");
                limpacaixas();
            }
        });

botaofecha.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                dispose();           }
        });
        
    }

    private void limpacaixas()
    {
        caixa1.setText("");
        caixa2.setText("");
        caixa3.setText("");
        caixa4.setText("");
        caixa5.setText("");
        caixa6.setText("");
    }


}
