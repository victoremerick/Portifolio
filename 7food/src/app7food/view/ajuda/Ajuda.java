/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app7food.view.ajuda;

import app7food.view.icones.GetIcon;
import java.net.URL;
import javax.swing.ImageIcon;

/**
 *
 * @author emeri
 */
public class Ajuda extends javax.swing.JDialog {

    /**
     * Creates new form Ajuda
     */
    public Ajuda(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        URL is = Ajuda.class.getResource("help.png");
        ImageIcon ii = new ImageIcon(is);
        ajuda.setIcon(ii);
    }
    
    public static void main(String[] args) {
        new Ajuda(null, false).setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ajuda = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Ajuda");
        setSize(new java.awt.Dimension(686, 247));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ajuda, javax.swing.GroupLayout.DEFAULT_SIZE, 686, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(ajuda, javax.swing.GroupLayout.DEFAULT_SIZE, 248, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ajuda;
    // End of variables declaration//GEN-END:variables
}