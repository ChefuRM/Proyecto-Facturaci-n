/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Interfaces;

import Clases.cArticulo;
import Clases.cCliente;
import Clases.cEmpleado;
import Clases.cVentaArticulo;
import java.awt.BorderLayout;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author Chefu
 */
public class pFacturas extends javax.swing.JPanel {

    /**
     * Creates new form pFacturas
     */
    ArrayList<cVentaArticulo> ArregloVA = new ArrayList<cVentaArticulo>();
    cCliente ClienteSel = null;
    cEmpleado EmpleadoSel = null;

    public pFacturas() {
        pClientes.leerBinario();
        pEmpleados.leerbinario();
        pArticulos.leerBinarioAr();
        initComponents();
        setearCB();
        setearCBE();
        setearCBCA();
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
        PanelClientes = new javax.swing.JPanel();
        bAgregarCl = new javax.swing.JButton();
        cbClientes = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        cbEmpleados = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        tPuestoE = new javax.swing.JTextField();
        cbCajas = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        lCodigoA = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        lDescripcionA = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        lPrecioUnitA = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        lCantidadA = new javax.swing.JList<>();
        cbCArticulos = new javax.swing.JComboBox<>();
        bAgregarArt = new javax.swing.JButton();
        cbCantArticulos = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        lSubtotalA = new javax.swing.JList<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Factura");

        PanelClientes.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout PanelClientesLayout = new javax.swing.GroupLayout(PanelClientes);
        PanelClientes.setLayout(PanelClientesLayout);
        PanelClientesLayout.setHorizontalGroup(
            PanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        PanelClientesLayout.setVerticalGroup(
            PanelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 150, Short.MAX_VALUE)
        );

        bAgregarCl.setText("Agregar Cliente");
        bAgregarCl.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAgregarClActionPerformed(evt);
            }
        });

        cbClientes.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbClientesItemStateChanged(evt);
            }
        });

        jLabel2.setText("Empleado:");

        cbEmpleados.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbEmpleadosItemStateChanged(evt);
            }
        });

        jLabel3.setText("No. Caja:");

        jLabel4.setText("Puesto:");

        tPuestoE.setEditable(false);

        cbCajas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Caja 1", "Caja 2", "Caja 3", "Caja 4", "Caja 5" }));

        jScrollPane1.setViewportView(lCodigoA);

        jScrollPane2.setViewportView(lDescripcionA);

        jScrollPane3.setViewportView(lPrecioUnitA);

        jScrollPane4.setViewportView(lCantidadA);

        cbCArticulos.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbCArticulosItemStateChanged(evt);
            }
        });

        bAgregarArt.setText("Agregar Articulo");
        bAgregarArt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAgregarArtActionPerformed(evt);
            }
        });

        jButton2.setText("Eliminar Articulo");

        jScrollPane5.setViewportView(lSubtotalA);

        jLabel5.setText("Cod.");

        jLabel6.setText("Descripcion.");

        jLabel7.setText("Precio U.");

        jLabel8.setText("Cantidad.");

        jLabel9.setText("Subtotal.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(bAgregarCl)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(PanelClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(6, 6, 6))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cbCArticulos, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbCantArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(47, 47, 47)
                                .addComponent(bAgregarArt)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addGap(65, 65, 65))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8)
                                        .addGap(66, 66, 66)
                                        .addComponent(jLabel9)))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbCajas, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tPuestoE, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAgregarCl)
                    .addComponent(cbClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PanelClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel4)
                    .addComponent(tPuestoE, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbCajas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(cbEmpleados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(cbCArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bAgregarArt)
                    .addComponent(cbCantArticulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4)
                    .addComponent(jScrollPane5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2)
                    .addComponent(jScrollPane3))
                .addGap(79, 79, 79))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void bAgregarClActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAgregarClActionPerformed
        // TODO add your handling code here:
        addpanel(new pClientes());
    }//GEN-LAST:event_bAgregarClActionPerformed

    private void cbClientesItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbClientesItemStateChanged
        // TODO add your handling code here:
        if (BuscarCliente(cbClientes.getSelectedItem().toString())) {
            addpanel(new pViewClientes(ClienteSel));
        } else {
            PanelClientes.removeAll();
            PanelClientes.revalidate();
            PanelClientes.repaint();
        }
    }//GEN-LAST:event_cbClientesItemStateChanged

    private void cbEmpleadosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbEmpleadosItemStateChanged
        // TODO add your handling code here:
        if (BuscarEmpleado(cbEmpleados.getSelectedItem().toString())) {
            tPuestoE.setText(EmpleadoSel.getPuestoEmpleado());
        } else {
            tPuestoE.setText("");
        }
    }//GEN-LAST:event_cbEmpleadosItemStateChanged

    private void cbCArticulosItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbCArticulosItemStateChanged
        // TODO add your handling code here:
        setearCantBCA(cbCArticulos.getSelectedItem().toString());
    }//GEN-LAST:event_cbCArticulosItemStateChanged

    private void bAgregarArtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAgregarArtActionPerformed
        // TODO add your handling code here:
        AgregarArticulos();
    }//GEN-LAST:event_bAgregarArtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelClientes;
    private javax.swing.JButton bAgregarArt;
    private javax.swing.JButton bAgregarCl;
    private javax.swing.JComboBox<String> cbCArticulos;
    private javax.swing.JComboBox<String> cbCajas;
    private javax.swing.JComboBox<String> cbCantArticulos;
    private static javax.swing.JComboBox<String> cbClientes;
    private javax.swing.JComboBox<String> cbEmpleados;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JList<String> lCantidadA;
    private javax.swing.JList<String> lCodigoA;
    private javax.swing.JList<String> lDescripcionA;
    private javax.swing.JList<String> lPrecioUnitA;
    private javax.swing.JList<String> lSubtotalA;
    private javax.swing.JTextField tPuestoE;
    // End of variables declaration//GEN-END:variables
    private void addpanel(JPanel p) {
        p.setLocation(0, 0);
        p.setSize(PanelClientes.getWidth(), 170);
        PanelClientes.removeAll();
        PanelClientes.add(p, BorderLayout.CENTER);
        PanelClientes.revalidate();
        PanelClientes.repaint();
    }

    public static void setearCB() {
        Iterator<cCliente> ITH = pClientes.getArregloC().iterator();
        cbClientes.removeAllItems();
        cbClientes.addItem("Seleccione Cliente");
        while (ITH.hasNext()) {
            cCliente gCliente = ITH.next();
            cbClientes.addItem(gCliente.getNitCliente() + "-" + gCliente.getNombreCliente());
        }
    }

    private void setearCBE() {
        Iterator<cEmpleado> ITH = pEmpleados.getArregloE().iterator();
        cbEmpleados.addItem("Seleccione Empleado");
        while (ITH.hasNext()) {
            cEmpleado gEmpleado = ITH.next();
            cbEmpleados.addItem(gEmpleado.getNombreEmpleado());
        }
    }

    private void setearCBCA() { //COMBO BOX CODIGO DE ARTICULOS
        Iterator<cArticulo> ITH = pArticulos.getArregloA().iterator();
        cbCArticulos.addItem("Seleccione Codigo De Articulo");
        while (ITH.hasNext()) {
            cArticulo gCodArticulo = ITH.next();
            cbCArticulos.addItem(gCodArticulo.getCodigoArticulo());
        }
    }

    private void setearCantBCA(String CodigoArt) { //COMBO BOX CANTIDAD DE ARTICULOS
        Iterator<cArticulo> ITH = pArticulos.getArregloA().iterator();
        cbCantArticulos.removeAllItems();
        cbCantArticulos.addItem("Seleccione Cantidad De Articulo");
        while (ITH.hasNext()) {
            cArticulo gCodArticulo = ITH.next();
            if (gCodArticulo.getCodigoArticulo().equals(CodigoArt)) {
                for (Integer i = 1; i <= Integer.parseInt(gCodArticulo.getCantidad()); i++) {
                    cbCantArticulos.addItem(i.toString());
                }
            }

        }
    }

    private boolean BuscarCliente(String Cliente) {
        boolean flag = false;
        ClienteSel = null;
        Iterator<cCliente> ITH = pClientes.getArregloC().iterator();
        while (ITH.hasNext()) {
            cCliente gCliente = ITH.next();
            String fBusqueda = gCliente.getNitCliente() + "-" + gCliente.getNombreCliente();
            if (fBusqueda.equals(Cliente)) {
                ClienteSel = gCliente;
                flag = true;
            }
        }
        return flag;
    }

    private boolean BuscarEmpleado(String Empleado) {
        boolean flag = false;
        EmpleadoSel = null;
        Iterator<cEmpleado> ITH = pEmpleados.getArregloE().iterator();
        while (ITH.hasNext()) {
            cEmpleado gEmpleado = ITH.next();
            String fBusqueda = gEmpleado.getNombreEmpleado();
            if (fBusqueda.equals(Empleado)) {
                EmpleadoSel = gEmpleado;
                flag = true;
            }
        }
        return flag;
    }

    private cArticulo BuscarArticulo(String Articulo) {
        cArticulo variable = null;
        Iterator<cArticulo> ITH = pArticulos.getArregloA().iterator();
        while (ITH.hasNext()) {
            cArticulo gArticulo = ITH.next();
            String fBusqueda = gArticulo.getCodigoArticulo();
            if (fBusqueda.equals(Articulo)) {
                variable = gArticulo;
            }
        }
        return variable;
    }

    private void AgregarArticulos() {
        cArticulo InsertarArt = BuscarArticulo(cbCArticulos.getSelectedItem().toString());
        if (InsertarArt != null) {
            AgregarLista(InsertarArt);
            settearLista();
        } else {
            JOptionPane.showMessageDialog(null, "ALGO SALIO MAL :(", "MENSAJE", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void AgregarLista(cArticulo Artic) {
        Iterator<cVentaArticulo> ITH = ArregloVA.iterator();
        Integer INDEX = null;
        if (!ArregloVA.isEmpty()) {
            while (ITH.hasNext()) {
                cVentaArticulo gVentaArticulo = ITH.next();
                if (gVentaArticulo.getCodigoArticulo().equals(Artic.getCodigoArticulo())) {
                    INDEX = ArregloVA.indexOf(gVentaArticulo); //EL INDEX ES LA POSICION DEL OBJETO QUE SE VA A ACTUALIZAR
                }
            }
            if (INDEX != null) {
                for (cVentaArticulo contA : ArregloVA) {//FORMA DIFERENTE DE NO USAR UN ITERADOR
                    if (INDEX == ArregloVA.indexOf(contA)) {
                        contA.setCantidad(contA.getCantidad() + Integer.parseInt(cbCantArticulos.getSelectedItem().toString()));
                    }
                }
            } else {
                cVentaArticulo vArt = new cVentaArticulo();
                vArt.setCodigoArticulo(Artic.getCodigoArticulo());
                vArt.setDescripcionA(Artic.getDescripcionA());
                vArt.setPrecioUnit(Float.parseFloat(Artic.getPrecioUnit()));
                vArt.setCantidad(Integer.parseInt(cbCantArticulos.getSelectedItem().toString()));
                ArregloVA.add(vArt);
            }
        } else {
            cVentaArticulo vArt = new cVentaArticulo();
            vArt.setCodigoArticulo(Artic.getCodigoArticulo());
            vArt.setDescripcionA(Artic.getDescripcionA());
            vArt.setPrecioUnit(Float.parseFloat(Artic.getPrecioUnit()));
            vArt.setCantidad(Integer.parseInt(cbCantArticulos.getSelectedItem().toString()));
            ArregloVA.add(vArt);
        }
    }

    private void settearLista() {
        DefaultListModel<String> ModeloLista1 = new DefaultListModel<>();
        DefaultListModel<String> ModeloLista2 = new DefaultListModel<>();
        DefaultListModel<String> ModeloLista3 = new DefaultListModel<>();
        DefaultListModel<String> ModeloLista4 = new DefaultListModel<>();
        DefaultListModel<String> ModeloLista5 = new DefaultListModel<>();

        for (cVentaArticulo contA : ArregloVA) {//FORMA DIFERENTE DE NO USAR UN ITERADOR
            Float SubTotal = 1f;//No se puede inicializar un float con un valor
            ModeloLista1.addElement(contA.getCodigoArticulo());
            ModeloLista2.addElement(contA.getDescripcionA());
            ModeloLista3.addElement(contA.getPrecioUnit().toString());
            ModeloLista4.addElement(contA.getCantidad().toString());
            SubTotal=contA.getPrecioUnit()*contA.getCantidad();
            ModeloLista5.addElement(SubTotal.toString());
        }
        lCodigoA.setModel(ModeloLista1);
        lDescripcionA.setModel(ModeloLista2);
        lPrecioUnitA.setModel(ModeloLista3);
        lCantidadA.setModel(ModeloLista4);
        lSubtotalA.setModel(ModeloLista5);
    }
}
