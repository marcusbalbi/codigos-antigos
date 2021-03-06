/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * formAluno.java
 *
 * Created on 13/02/2012, 19:34:30
 */

package havahibernate;

import java.util.ArrayList;
import java.util.List;
import javax.print.DocFlavor.STRING;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Marcus
 */
public class formAluno extends javax.swing.JFrame {

    /** Creates new form formAluno */

    AlunoHibernate alunoh;


    public formAluno() {
        initComponents();

        alunoh  = new AlunoHibernate();

        PreencherJTable(alunoh.getAlunos());
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        tf_codigo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        tf_nome = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tf_curso = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tf_fone = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tf_cidade = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtAlunos = new javax.swing.JTable();
        bt_novo = new javax.swing.JButton();
        bt_salvar = new javax.swing.JButton();
        bt_alterar = new javax.swing.JButton();
        bt_excluir = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cadastro de Alunos");

        jLabel2.setText("Código.:");

        tf_codigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_codigoActionPerformed(evt);
            }
        });

        jLabel3.setText("Nome.:");

        tf_nome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_nomeActionPerformed(evt);
            }
        });

        jLabel4.setText("Curso.:");

        tf_curso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_cursoActionPerformed(evt);
            }
        });

        jLabel5.setText("Fone.:");

        tf_fone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_foneActionPerformed(evt);
            }
        });

        jLabel6.setText("Cidade.:");

        jtAlunos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nome", "Curso", "Fone", "Cidade"
            }
        ));
        jtAlunos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtAlunosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtAlunos);

        bt_novo.setText("Novo");
        bt_novo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_novoActionPerformed(evt);
            }
        });

        bt_salvar.setText("Salvar");
        bt_salvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_salvarActionPerformed(evt);
            }
        });

        bt_alterar.setText("Alterar");
        bt_alterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_alterarActionPerformed(evt);
            }
        });

        bt_excluir.setText("Excluir");
        bt_excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bt_excluirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_cidade))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_curso)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tf_fone, javax.swing.GroupLayout.DEFAULT_SIZE, 274, Short.MAX_VALUE))
                            .addComponent(tf_nome, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(bt_novo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_salvar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_alterar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bt_excluir)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bt_alterar, bt_excluir, bt_novo, bt_salvar});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_codigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(tf_nome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(tf_curso, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(tf_fone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tf_cidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bt_novo)
                    .addComponent(bt_salvar)
                    .addComponent(bt_alterar)
                    .addComponent(bt_excluir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tf_codigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_codigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_codigoActionPerformed

    private void tf_nomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_nomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_nomeActionPerformed

    private void tf_cursoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_cursoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_cursoActionPerformed

    private void tf_foneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_foneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tf_foneActionPerformed

    private void bt_salvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_salvarActionPerformed
      

        alunos aluno = new alunos();
        
        int codigo = Integer.parseInt( tf_codigo.getText() );

        aluno.setAluno_codigo(codigo);
        aluno.setAluno_nome(tf_nome.getText());
        aluno.setAluno_curso(tf_curso.getText());
        aluno.setAluno_fone(tf_fone.getText());
        aluno.setAluno_cidade(tf_cidade.getText());
        

       if(alunoh.gravarAluno(aluno))
       {
            PreencherJTable(alunoh.getAlunos());
       }
      


    }//GEN-LAST:event_bt_salvarActionPerformed

    private void jtAlunosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtAlunosMouseClicked
      int linha = jtAlunos.getSelectedRow();
      //JOptionPane.showMessageDialog(null, linha);
      
      tf_codigo.setText(jtAlunos.getValueAt(linha, 0).toString());
      tf_nome.setText(jtAlunos.getValueAt(linha, 1).toString());
      tf_curso.setText(jtAlunos.getValueAt(linha, 2).toString());
      tf_fone.setText(jtAlunos.getValueAt(linha, 3).toString());
      tf_cidade.setText(jtAlunos.getValueAt(linha, 4).toString());

    /* alunos aluno = new alunos();

     aluno.setAluno_codigo( Integer.parseInt(jtAlunos.getValueAt(linha, 0).toString()));
     aluno.setAluno_nome(jtAlunos.getValueAt(linha, 1).toString());*/
     

      
    }//GEN-LAST:event_jtAlunosMouseClicked

    private void bt_novoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_novoActionPerformed

        tf_codigo.setText("");
        tf_nome.setText("");
        tf_curso.setText("");
        tf_fone.setText("");
        tf_cidade.setText("");
      
    }//GEN-LAST:event_bt_novoActionPerformed

    private void bt_alterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_alterarActionPerformed

        alunos aluno = new alunos();

        int codigo = Integer.parseInt( tf_codigo.getText() );

        aluno.setAluno_codigo(codigo);
        aluno.setAluno_nome(tf_nome.getText());
        aluno.setAluno_curso(tf_curso.getText());
        aluno.setAluno_fone(tf_fone.getText());
        aluno.setAluno_cidade(tf_cidade.getText());

      

       if(alunoh.alterarAluno(aluno))
       {
            PreencherJTable(alunoh.getAlunos());
       }
    }//GEN-LAST:event_bt_alterarActionPerformed

    private void bt_excluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bt_excluirActionPerformed


        if(JOptionPane.showConfirmDialog(null, "Tem certeza que deseja excluir o registro "+tf_nome.getText()+"?","Exclusão" , JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION)
        {
           alunos aluno = new alunos();

           aluno.setAluno_codigo(Integer.parseInt(tf_codigo.getText()));


           if(alunoh.ExcluirAluno(aluno))
           {
                 PreencherJTable(alunoh.getAlunos());
           }



        }


    }//GEN-LAST:event_bt_excluirActionPerformed



    private  void PreencherJTable(List<alunos> alunos)
    {

        DefaultTableModel modelo = (DefaultTableModel)jtAlunos.getModel();


        modelo.setNumRows(0);

        int i  = 0;

        for(alunos aluno : alunos)
        {
            
            modelo.addRow(new Object[]{aluno.getAluno_codigo(),aluno.getAluno_nome(),aluno.getAluno_curso(),aluno.getAluno_fone(),aluno.getAluno_cidade()});
            i++;
        }

        if(!alunos.isEmpty())
        {
            alunos aluno = alunos.get(0);

               tf_codigo.setText( String.valueOf(aluno.getAluno_codigo()));
               tf_nome.setText(aluno.getAluno_nome());
               tf_curso.setText(aluno.getAluno_curso());
               tf_fone.setText(aluno.getAluno_fone());
               tf_cidade.setText(aluno.getAluno_cidade());

            
        }



        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bt_alterar;
    private javax.swing.JButton bt_excluir;
    private javax.swing.JButton bt_novo;
    private javax.swing.JButton bt_salvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtAlunos;
    private javax.swing.JTextField tf_cidade;
    private javax.swing.JTextField tf_codigo;
    private javax.swing.JTextField tf_curso;
    private javax.swing.JTextField tf_fone;
    private javax.swing.JTextField tf_nome;
    // End of variables declaration//GEN-END:variables

}
