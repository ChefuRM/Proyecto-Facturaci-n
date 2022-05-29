/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interfaces;

import Clases.cArticulo;
import Clases.cFactura;
import Clases.cVentaArticulo;
import java.awt.Color;
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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Chefu
 */
public class pRegistroF extends javax.swing.JPanel {

    /**
     * Creates new form pRegistroF
     */
    private static ArrayList<cFactura> ArregloFac = new ArrayList<cFactura>();
    cFactura fact = null;

    public pRegistroF() {
        initComponents();
        leerbinario();
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
        tCorrelativo = new javax.swing.JTextField();
        bBuscar = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        tFecha = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        tNombreC = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        tNitC = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        tDireccionC = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        tEmpleado = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        tNoCaja = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tArticulos = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        tPago = new javax.swing.JTextField();
        tCambio = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        tIVA = new javax.swing.JTextField();
        tTotal = new javax.swing.JTextField();
        lEstado = new javax.swing.JLabel();
        bCancelar = new javax.swing.JButton();
        bReporte = new javax.swing.JButton();

        jLabel1.setText("No. Correlativo de Factura:");

        bBuscar.setText("Buscar");
        bBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bBuscarActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setText("Fecha:");

        tFecha.setEditable(false);

        jLabel4.setText("Nombre:");

        tNombreC.setEditable(false);

        jLabel5.setText("Nit:");

        tNitC.setEditable(false);

        jLabel6.setText("Direccion:");

        tDireccionC.setEditable(false);

        jLabel7.setText("Empleado:");

        tEmpleado.setEditable(false);

        jLabel8.setText("No. Caja:");

        tNoCaja.setEditable(false);

        tArticulos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tArticulos);

        jLabel2.setText("Pago:");

        jLabel9.setText("Cambio:");

        tPago.setEditable(false);

        tCambio.setEditable(false);

        jLabel10.setText("IVA:");

        jLabel11.setText("Total:");

        tIVA.setEditable(false);

        tTotal.setEditable(false);

        lEstado.setForeground(new java.awt.Color(255, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(10, 10, 10)
                        .addComponent(tDireccionC))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel8))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(tNoCaja, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tNitC, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tNombreC)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lEstado)
                        .addGap(45, 45, 45)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tPago, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tIVA, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tCambio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(tFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(tNoCaja, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(tEmpleado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tNitC)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tNombreC)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(tDireccionC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 280, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10)
                    .addComponent(tIVA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11)
                    .addComponent(tCambio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(lEstado))
                .addGap(58, 58, 58))
        );

        bCancelar.setText("Cancelar Factura");
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        bReporte.setText("Reporte");
        bReporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bReporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tCorrelativo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bBuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bCancelar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bReporte)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tCorrelativo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 469, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bCancelar)
                    .addComponent(bReporte))
                .addGap(0, 7, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bBuscarActionPerformed
        // TODO add your handling code here:
        if (buscarfactura()) {
            setearcampos();
        } else {
            JOptionPane.showMessageDialog(null, "Esta factura no existe!!(", "MENSAJE", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bBuscarActionPerformed

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        // TODO add your handling code here:
        if (validarfac()) {
            if (buscarfactura()) {
                cancelarfac();
                JOptionPane.showMessageDialog(null, "Factura Cancelada con Exito!(", "MENSAJE", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(null, "Esta factura no existe!!(", "MENSAJE", JOptionPane.ERROR_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Esta factura ya ha sido Cancelada(", "MENSAJE", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bCancelarActionPerformed

    private void bReporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bReporteActionPerformed
        // TODO add your handling code here:
        html();
    }//GEN-LAST:event_bReporteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bBuscar;
    private javax.swing.JButton bCancelar;
    private javax.swing.JButton bReporte;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lEstado;
    private javax.swing.JTable tArticulos;
    private javax.swing.JTextField tCambio;
    private javax.swing.JTextField tCorrelativo;
    private javax.swing.JTextField tDireccionC;
    private javax.swing.JTextField tEmpleado;
    private javax.swing.JTextField tFecha;
    private javax.swing.JTextField tIVA;
    private javax.swing.JTextField tNitC;
    private javax.swing.JTextField tNoCaja;
    private javax.swing.JTextField tNombreC;
    private javax.swing.JTextField tPago;
    private javax.swing.JTextField tTotal;
    // End of variables declaration//GEN-END:variables

    private boolean buscarfactura() {
        boolean flag = false;
        fact = null;
        for (cFactura f : ArregloFac) {
            if (tCorrelativo.getText().equals(f.getCorrelativo())) {
                flag = true;
                fact = f;
            }
        }
        return flag;
    }

    private void setearcampos() {
        tNoCaja.setText(fact.getCaja());
        tEmpleado.setText(fact.getEmpleado().getNombreEmpleado());
        tFecha.setText(fact.getFecha());
        tNitC.setText(fact.getCliente().getNitCliente());
        tNombreC.setText(fact.getCliente().getNombreCliente());
        tDireccionC.setText(fact.getCliente().getDireccionCliente());
        tPago.setText(fact.getPago());
        tCambio.setText(fact.getCambio());
        tTotal.setText(fact.getTotal());
        tIVA.setText(fact.getTotalIva());
        seteartabla();
        if(fact.getEstado().equals("Cancelada")){
            lEstado.setText("CANCELADA");
            lEstado.setForeground(Color.red);
        }else{
            lEstado.setText("Vigente");
            lEstado.setForeground(Color.GREEN);
        }
    }

    private void seteartabla() {
        Object[] Columnas = {"CODIGO", "NOMBRE", "DESCRIPCION", "PRECIO U", "CANTIDAD", "SUBTOTAL"};
        //ESTO CREA EL FORMATO DE LAS COLUMNAS Y CELDAS Y LO VUELVE NO EDITABLE
        DefaultTableModel formatot = new DefaultTableModel(Columnas, 0) {
            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };
        for (cFactura forma : ArregloFac) {
            if (forma.getCorrelativo().equals(tCorrelativo.getText())) {
                for (cVentaArticulo articven : forma.getVentas()) {
                    Float calcsubtotal = articven.getCantidad() * articven.getPrecioUnit();
                    Object[] filas = {articven.getCodigoArticulo(), articven.getNombreArticulo(), articven.getDescripcionA(), articven.getPrecioUnit(), articven.getCantidad(), calcsubtotal};
                    formatot.addRow(filas);
                }
            }
        }
        tArticulos.setModel(formatot);
    }

    public static void leerbinario() {
        FileInputStream fis = null;
        ObjectInputStream ois = null;

        try {

            fis = new FileInputStream("bFacturas.dat");
            ois = new ObjectInputStream(fis);
            ArregloFac = (ArrayList<cFactura>) ois.readObject(); //es necesario el casting

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

    private void crearbinario() {
        FileOutputStream fos = null;
        ObjectOutputStream ous = null;

        try {
            //Se crea el fichero
            fos = new FileOutputStream("bFacturas.dat");
            ous = new ObjectOutputStream(fos);

            //Se escribe el objeto en el fichero
            ous.writeObject(ArregloFac);

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

    private boolean validarfac() {
        boolean flag = false;
        fact = null;
        for (cFactura f : ArregloFac) {
            if (tCorrelativo.getText().equals(f.getCorrelativo())) {
                if (f.getEstado().equals("Efectuada")) {
                    return true;
                }
            }
        }
        return flag;
    }

    private void cancelarfac() {
        for (cVentaArticulo act : fact.getVentas()) {
            for (cArticulo art : pArticulos.getArregloA()) {
                if (act.getCodigoArticulo().equals(art.getCodigoArticulo())) {
                    Integer newcant = Integer.parseInt(art.getCantidad()) + act.getCantidad();
                    art.setCantidad(newcant.toString());
                    pArticulos.crearBinarioAr();
                    for (cFactura f : ArregloFac) {
                        if (f.getCorrelativo().equals(fact.getCorrelativo())) {
                            f.setEstado("Cancelada");
                        }
                    }
                    crearbinario();
                }
            }
        }
    }

    private void html() {
        
        BufferedWriter ficheroSalida;
        try {
            String rows = "";
            Iterator<cFactura> ITP = ArregloFac.iterator();

            ficheroSalida = new BufferedWriter(new FileWriter(new File("ReporteF.html")));
            while (ITP.hasNext()) {
                cFactura P = ITP.next();
                rows = rows + "            <tr>\n"
                        + "                <td>" + P.getCorrelativo() + "</td>\n"
                        + "                <td>" + P.getCaja()+ "</td>\n"
                        + "                <td>" + P.getEmpleado().getNombreEmpleado() + "</td>\n"
                        + "                <td>" + P.getFecha() + "</td>\n"
                        + "                <td>" + P.getCliente().getNitCliente() + "</td>\n"
                        + "                <td>" + P.getCliente().getNombreCliente() + "</td>\n"
                        + "                <td>" + P.getCliente().getDireccionCliente() + "</td>\n"
                        + "                <td>" + P.getPago()+ "</td>\n"
                        + "                <td>" + P.getCambio()+ "</td>\n"
                        + "                <td>" + P.getTotalIva()+ "</td>\n"
                        + "                <td>" + P.getTotal()+ "</td>\n"
                        + "                <td>" + P.getEstado()+ "</td>\n"
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
                    + "                <th>Correlativo</th>\n"
                    + "                <th>No. Caja</th>\n"
                    + "                <th>Empleado</th>\n"
                    + "                <th>Fecha</th>\n"
                    + "                <th>Nit de Cliente</th>\n"
                    + "                <th>Nombre de Cliente</th>\n"
                    + "                <th>Direccion de Cliente</th>\n"
                    + "                <th>Pago</th>\n"
                    + "                <th>Cambio</th>\n"
                    + "                <th>IVA</th>\n"
                    + "                <th>Total</th>\n"
                    + "                <th>Estado</th>\n"
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

}
