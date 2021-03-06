/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Principal;

import Interfaces.*;
import java.awt.BorderLayout;
import javax.swing.JPanel;

/**
 *
 * @author Chefu
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        PanelPrincipal = new javax.swing.JPanel();
        bArticulos = new javax.swing.JButton();
        bProveedores = new javax.swing.JButton();
        bEmpleados = new javax.swing.JButton();
        bFacturas = new javax.swing.JButton();
        bRegistroFac = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Supertiendas \"MAS\"");

        PanelPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PanelPrincipalLayout = new javax.swing.GroupLayout(PanelPrincipal);
        PanelPrincipal.setLayout(PanelPrincipalLayout);
        PanelPrincipalLayout.setHorizontalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 592, Short.MAX_VALUE)
        );
        PanelPrincipalLayout.setVerticalGroup(
            PanelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        bArticulos.setText("Articulos");
        bArticulos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bArticulosActionPerformed(evt);
            }
        });

        bProveedores.setText("Proveedores");
        bProveedores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bProveedoresActionPerformed(evt);
            }
        });

        bEmpleados.setText("Empleados");
        bEmpleados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEmpleadosActionPerformed(evt);
            }
        });

        bFacturas.setText("Facturacion");
        bFacturas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFacturasActionPerformed(evt);
            }
        });

        bRegistroFac.setText("Registro de Facturas");
        bRegistroFac.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bRegistroFacActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bArticulos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 190, Short.MAX_VALUE)
                    .addComponent(bProveedores, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bEmpleados, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bFacturas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bRegistroFac, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(PanelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(bArticulos)
                        .addGap(18, 18, 18)
                        .addComponent(bProveedores)
                        .addGap(18, 18, 18)
                        .addComponent(bEmpleados)
                        .addGap(18, 18, 18)
                        .addComponent(bFacturas)
                        .addGap(18, 18, 18)
                        .addComponent(bRegistroFac)
                        .addGap(0, 322, Short.MAX_VALUE)))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bArticulosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bArticulosActionPerformed
        // TODO add your handling code here:
        addpanel(new pArticulos());
    }//GEN-LAST:event_bArticulosActionPerformed

    private void bProveedoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bProveedoresActionPerformed
        // TODO add your handling code here:
        addpanel(new pProveedores());
    }//GEN-LAST:event_bProveedoresActionPerformed

    private void bEmpleadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEmpleadosActionPerformed
        // TODO add your handling code here:
        addpanel(new pEmpleados());
    }//GEN-LAST:event_bEmpleadosActionPerformed

    private void bFacturasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFacturasActionPerformed
        // TODO add your handling code here:
        addpanel(new pFacturas());
    }//GEN-LAST:event_bFacturasActionPerformed

    private void bRegistroFacActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bRegistroFacActionPerformed
        // TODO add your handling code here:
        addpanel(new pRegistroF());
    }//GEN-LAST:event_bRegistroFacActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    public JPanel getPanelPrincipal() {
        return PanelPrincipal;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private static javax.swing.JPanel PanelPrincipal;
    private javax.swing.JButton bArticulos;
    private javax.swing.JButton bEmpleados;
    private javax.swing.JButton bFacturas;
    private javax.swing.JButton bProveedores;
    private javax.swing.JButton bRegistroFac;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
    private static void addpanel(JPanel p) {
        p.setLocation(0, 0);
        p.setSize(PanelPrincipal.getWidth(), PanelPrincipal.getHeight());
        PanelPrincipal.removeAll();
        PanelPrincipal.add(p, BorderLayout.CENTER);
        PanelPrincipal.revalidate();
        PanelPrincipal.repaint();
    }
    public static void resetpanel(){
        addpanel(new pFacturas());
    }
}
