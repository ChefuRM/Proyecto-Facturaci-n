/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interfaces;

import Clases.cCliente;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;

/**
 *
 * @author Chefu
 */
public class pClientes extends javax.swing.JPanel {

    /**
     * Creates new form pClientes
     */
    cCliente ClienteEncontrado = null;

    public static ArrayList<cCliente> getArregloC() {
        return ArregloC;
    }
    private static ArrayList<cCliente> ArregloC = new ArrayList<cCliente>();

    public pClientes() {
        initComponents();
        leerBinario();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tDireccionC = new javax.swing.JTextField();
        lProveedores = new javax.swing.JLabel();
        bAgregarC = new javax.swing.JButton();
        eNitC = new javax.swing.JLabel();
        bEliminarC = new javax.swing.JButton();
        eNombreC = new javax.swing.JLabel();
        bBuscarC = new javax.swing.JButton();
        eDireccionC = new javax.swing.JLabel();
        bModificarC = new javax.swing.JButton();
        tNitC = new javax.swing.JTextField();
        tNombreC = new javax.swing.JTextField();
        bReporteC = new javax.swing.JButton();

        lProveedores.setText("Clientes");

        bAgregarC.setText("Agregar");
        bAgregarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAgregarCActionPerformed(evt);
            }
        });

        eNitC.setText("Nit de Cliente:");

        bEliminarC.setText("Eliminar");
        bEliminarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEliminarCActionPerformed(evt);
            }
        });

        eNombreC.setText("Nombre de Cliente:");

        bBuscarC.setText("Buscar");
        bBuscarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarCActionPerformed(evt);
            }
        });

        eDireccionC.setText("Direccion de Cliente:");

        bModificarC.setText("Modificar");
        bModificarC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bModificarCActionPerformed(evt);
            }
        });

        bReporteC.setText("Reporte");
        bReporteC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bReporteCActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(eDireccionC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tDireccionC, javax.swing.GroupLayout.PREFERRED_SIZE, 285, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(bEliminarC)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(bModificarC))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(255, 255, 255)
                        .addComponent(lProveedores)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eNombreC)
                            .addComponent(eNitC))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tNombreC, javax.swing.GroupLayout.DEFAULT_SIZE, 286, Short.MAX_VALUE)
                            .addComponent(tNitC))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(bAgregarC, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(bBuscarC, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(bReporteC, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lProveedores, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eNitC)
                    .addComponent(tNitC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bAgregarC)
                    .addComponent(bBuscarC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eNombreC)
                    .addComponent(tNombreC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bReporteC))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eDireccionC)
                    .addComponent(tDireccionC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bModificarC)
                    .addComponent(bEliminarC))
                .addContainerGap(14, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bAgregarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAgregarCActionPerformed
        // TODO add your handling code here:
        if (!buscarN(tNitC.getText())) {
            cCliente oClientes = new cCliente();
            oClientes.setNitCliente(tNitC.getText());
            oClientes.setNombreCliente(tNombreC.getText());
            oClientes.setDireccionCliente(tDireccionC.getText());
            JOptionPane.showMessageDialog(null, "Cliente Guardado", "MENSAJE", JOptionPane.INFORMATION_MESSAGE);
            ArregloC.add(oClientes);
        } else {
            JOptionPane.showMessageDialog(null, "Cliente Existente", "MENSAJE", JOptionPane.ERROR_MESSAGE);
        }
        setteo();
        binarioa();
        pFacturas.setearCB();
    }//GEN-LAST:event_bAgregarCActionPerformed

    private void bEliminarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEliminarCActionPerformed
        // TODO add your handling code here:
        if (eliminarC(ClienteEncontrado) && ClienteEncontrado != null) {
            JOptionPane.showMessageDialog(null, "Cliente Eliminado Correctamente", "MENSAJE", JOptionPane.INFORMATION_MESSAGE);
            setteo();
            binarioa();
            pFacturas.setearCB();
        } else {
            JOptionPane.showMessageDialog(null, "Cliente No Eliminado", "MENSAJE", JOptionPane.ERROR_MESSAGE);
            setteo();
        }
    }//GEN-LAST:event_bEliminarCActionPerformed

    private void bBuscarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarCActionPerformed
        // TODO add your handling code here:
        ClienteEncontrado = buscarC(tNitC.getText());
        if (ClienteEncontrado != null) {
            tNitC.setText(ClienteEncontrado.getNitCliente());
            tNombreC.setText(ClienteEncontrado.getNombreCliente());
            tDireccionC.setText(ClienteEncontrado.getDireccionCliente());
        } else {
            setteo();
            JOptionPane.showMessageDialog(null, "Cliente no encontrado", "MENSAJE", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bBuscarCActionPerformed

    private void bModificarCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bModificarCActionPerformed
        // TODO add your handling code here:
        if (modificarC(ClienteEncontrado) && ClienteEncontrado != null) {

            JOptionPane.showMessageDialog(null, "Cliente Modificado Correctamente", "MENSAJE", JOptionPane.INFORMATION_MESSAGE);
            setteo();
            binarioa();
            pFacturas.setearCB();
        } else {
            JOptionPane.showMessageDialog(null, "Cliente No Modificado", "MENSAJE", JOptionPane.ERROR_MESSAGE);
            setteo();
        }
    }//GEN-LAST:event_bModificarCActionPerformed

    private void bReporteCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bReporteCActionPerformed
        // TODO add your handling code here:
        html();
    }//GEN-LAST:event_bReporteCActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAgregarC;
    private javax.swing.JButton bBuscarC;
    private javax.swing.JButton bEliminarC;
    private javax.swing.JButton bModificarC;
    private javax.swing.JButton bReporteC;
    private javax.swing.JLabel eDireccionC;
    private javax.swing.JLabel eNitC;
    private javax.swing.JLabel eNombreC;
    private javax.swing.JLabel lProveedores;
    private javax.swing.JTextField tDireccionC;
    private javax.swing.JTextField tNitC;
    private javax.swing.JTextField tNombreC;
    // End of variables declaration//GEN-END:variables
 private cCliente buscarC(String NitC) {
        Iterator<cCliente> ITC = ArregloC.iterator();
        cCliente c = null;
        while (ITC.hasNext()) {
            cCliente C = ITC.next();
            if (C.getNitCliente().equals(NitC)) {
                c = C;
            }
        }
        return c;
    }

    private void setteo() {
        tNitC.setText("");
        tNombreC.setText("");
        tDireccionC.setText("");

        tNitC.requestFocus(); //Solicita la colocacion del cursor en el campo de texto Nit
    }

    private boolean eliminarC(cCliente e) {
        boolean flag = false;
        try {
            Iterator<cCliente> ITC = ArregloC.iterator();
            while (ITC.hasNext()) {
                cCliente C = ITC.next();
                if (C.getNitCliente().equals(e.getNitCliente())) {
                    ITC.remove();
                    flag = true;
                }
            }
        } catch (Exception error) {
            flag = false;
            System.out.println("El Erro fue:" + error.getMessage());
        }

        return flag; //Flag es igual a true solo si lo removio dentro del void
    }

    private boolean buscarN(String e) {
        boolean flag = false;
        try {
            Iterator<cCliente> ITC = ArregloC.iterator();
            while (ITC.hasNext()) {
                cCliente C = ITC.next();
                if (C.getNitCliente().equals(e)) {

                    flag = true;
                }
            }
        } catch (Exception error) {
            flag = false;
            System.out.println("El Erro fue:" + error.getMessage());
        }

        return flag; //Flag es igual a true solo si lo removio dentro del void
    }

    private boolean modificarC(cCliente m) {
        boolean flag = false;
        try {
            Iterator<cCliente> ITC = ArregloC.iterator();
            while (ITC.hasNext()) {
                cCliente C = ITC.next();
                if (C.getNitCliente().equals(m.getNitCliente())) {
                    flag = true;
                    C.setNitCliente(tNitC.getText());
                    C.setNombreCliente(tNombreC.getText());
                    C.setDireccionCliente(tDireccionC.getText());
                }
            }
        } catch (Exception error) {
            flag = false;
            System.out.println("El Error fue:" + error.getMessage());
        }

        return flag; //Flag es igual a true solo si lo removio dentro del void
    }

    private void html() {

        BufferedWriter ficheroSalida;
        try {
            String rows = "";
            Iterator<cCliente> ITC = ArregloC.iterator();

            ficheroSalida = new BufferedWriter(new FileWriter(new File("ReporteC.html")));
            while (ITC.hasNext()) {
                cCliente C = ITC.next();
                rows = rows + "            <tr>\n"
                        + "                <td>" + C.getNitCliente() + "</td>\n"
                        + "                <td>" + C.getNombreCliente() + "</td>\n"
                        + "                <td>" + C.getDireccionCliente() + "</td>\n"
                        + "            </tr>";
            }
            ficheroSalida.write("<!DOCTYPE html>\n"
                    + "<html lang=\"en\">\n"
                    + "\n"
                    + "<head>\n"
                    + "    <link href=\"https://cdn.jsdelivr.net/npm/bootstrap@5.1.3/dist/css/bootstrap.min.css\" rel=\"stylesheet\"\n"
                    + "        integrity=\"sha384-1BmE4kWBq78iYhFldvKuhfTAU6auU8tT94WrHftjDbrCEXSU1oBoqyl2QvZ6jIW3\" crossorigin=\"anonymous\">\n"
                    + "    <meta charset=\"UTF-8\">\n"
                    + "    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n"
                    + "    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n"
                    + "    <title>Reportes</title>\n"
                    + "</head>\n"
                    + "\n"
                    + "<body class=\"p-4\">\n"
                    + "    <table class=\"w-100 table table-dark table-hover\">\n"
                    + "        <thead>\n"
                    + "            <tr>\n"
                    + "                <th>Nit</th>\n"
                    + "                <th>Nombre</th>\n"
                    + "                <th>Direccion</th>\n"
                    + "            </tr>\n"
                    + "        </thead>\n"
                    + "        <tbody>\n"
                    + rows
                    + "        </tbody>\n"
                    + "    </table>\n"
                    + "</body>\n"
                    + "\n"
                    + "</html>");
            ficheroSalida.close();
        } catch (IOException error) {
            System.out.println("El Error fue:" + error.getMessage());
        }
    }

    public static void leerBinario() {
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {

            fis = new FileInputStream("bClientes.dat");
            ois = new ObjectInputStream(fis);
            ArregloC = (ArrayList<cCliente>) ois.readObject(); //es necesario el casting

        } catch (FileNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (fis != null) {
                    fis.close();
                }
                if (ois != null) {
                    ois.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    private void binarioa() {
        FileOutputStream fos = null;
        ObjectOutputStream ous = null;

        try {
            //Se crea el fichero
            fos = new FileOutputStream("bClientes.dat");
            ous = new ObjectOutputStream(fos);

            //Se escribe el objeto en el fichero
            ous.writeObject(ArregloC);

        } catch (FileNotFoundException e) {
            System.out.println("1" + e.getMessage());
        } catch (IOException e) {
            System.out.println("2" + e.getMessage());
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
                if (ous != null) {
                    ous.close();
                }
            } catch (IOException e) {
                System.out.println("3" + e.getMessage());
            }
        }
    }

}
