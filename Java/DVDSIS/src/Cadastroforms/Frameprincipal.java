/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Frameprincipal.java
 *
 * Created on 24/11/2009, 12:40:12
 */

package Cadastroforms;

import Cadastroforms.CadFilme;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 *
 * @author Marcus
 */
public class Frameprincipal extends javax.swing.JFrame {

    /** Creates new form Frameprincipal */
    public Frameprincipal() {
        initComponents();

    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btcadfilme = new javax.swing.JButton();
        btcadamigo = new javax.swing.JButton();
        btemprestar = new javax.swing.JButton();
        btconfilme = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        btdevolver = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btcadfilme.setText("Cadastrar Filme");
        btcadfilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btcadfilmeActionPerformed(evt);
            }
        });

        btcadamigo.setText("Cadastrar Amigo");

        btemprestar.setText("Emprestar");

        btconfilme.setText("Consultar Filme");

        jButton5.setText("Consultar Amigo");

        btdevolver.setText("Devolver");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btconfilme)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btemprestar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btdevolver))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btcadfilme, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btcadamigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton5)))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btcadamigo, btcadfilme, btconfilme, btdevolver, btemprestar, jButton5});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btcadfilme, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btcadamigo)
                    .addComponent(jButton5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btconfilme)
                    .addComponent(btemprestar)
                    .addComponent(btdevolver))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {btcadamigo, btcadfilme, btconfilme, btdevolver, btemprestar, jButton5});

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btcadfilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btcadfilmeActionPerformed
        CadFilme cadfilme = new CadFilme();
        
        cadfilme.addWindowListener(new WindowListener() {

            public void windowOpened(WindowEvent e) {
                setEnabled(false);
            }

            public void windowClosing(WindowEvent e) {
                setEnabled(true);
            }

            public void windowClosed(WindowEvent e) {
                setEnabled(true);
            }

            public void windowIconified(WindowEvent e) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            public void windowDeiconified(WindowEvent e) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            public void windowActivated(WindowEvent e) {
                throw new UnsupportedOperationException("Not supported yet.");
            }

            public void windowDeactivated(WindowEvent e) {
                throw new UnsupportedOperationException("Not supported yet.");
            }
        });
    }//GEN-LAST:event_btcadfilmeActionPerformed


    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frameprincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btcadamigo;
    private javax.swing.JButton btcadfilme;
    private javax.swing.JButton btconfilme;
    private javax.swing.JButton btdevolver;
    private javax.swing.JButton btemprestar;
    private javax.swing.JButton jButton5;
    // End of variables declaration//GEN-END:variables

}