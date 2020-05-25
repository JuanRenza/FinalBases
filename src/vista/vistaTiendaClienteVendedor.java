/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import control.ControlAdministrador;
import control.ControlClienteVendedor;
import control.ControlFotoPredeterminada;
import control.ControlTienda;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.LinkedList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import modelo.Administrador;
import modelo.ClienteVendedor;
import modelo.FotoPredeterminada;
import modelo.Tienda;

/**
 *
 * @author W°
 */
public class vistaTiendaClienteVendedor extends javax.swing.JFrame {

    LinkedList<Tienda> listaTiendas;
    LinkedList<Tienda> listaTiendas2;
    LinkedList<Administrador> listaadmin;
    LinkedList<ClienteVendedor> listacliente;
    LinkedList<FotoPredeterminada> listafoto;
    
    /**
     * Creates new form vistaTienda
     */
    public vistaTiendaClienteVendedor() {
        initComponents();
        listaTiendas = new LinkedList<>();
        jTextField10.setEditable(false);
        jTextField10.setEnabled(false);
        jTextField11.setEditable(false);
        jTextField11.setEnabled(false);
        jTextField4.setEditable(false);
        jTextField4.setEnabled(false);
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
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jComboBox4 = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 1, 18)); // NOI18N
        jLabel1.setText("Tienda");

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel2.setText("Identificacion Tienda");

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel3.setText("Nombre Tienda");

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel4.setText("Direccion Tienda");

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel5.setText("Ruta Foto");

        jLabel6.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel6.setText("Descripcion Tienda");

        jLabel7.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel7.setText("Aprobacion Tienda");

        jLabel9.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel9.setText("Fecha Aprobacion Tienda");

        jTable1.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "idTienda", "nomTienda", "direccionTienda", "fotoTienda", "descripcionTienda", "aprobacionTienda", "fechaAprobacionTienda", "idAdminTF", "identificacionCVF", "idFotoPredeterminadaTF"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Refrescar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Eliminar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Consultar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel10.setText("Identificacion Administrador");

        jLabel11.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel11.setText("Id Cliente Vendedor");

        jLabel12.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel12.setText("Id Foto Predeterminada");

        jButton4.setText("Insertar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Modificar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText("Escoger foto");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        jLabel13.setText("*Los campos de combobox son para insertar y modificar.");

        jLabel14.setFont(new java.awt.Font("Yu Gothic", 0, 11)); // NOI18N
        jLabel14.setText("*Utiliza el id para buscar y eliminar tiendas.");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel10)
                                        .addGap(37, 37, 37)
                                        .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel12))
                                        .addGap(66, 66, 66)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jComboBox1, 0, 123, Short.MAX_VALUE)
                                    .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jComboBox3, javax.swing.GroupLayout.Alignment.TRAILING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addGap(83, 83, 83)
                                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel9)
                                            .addComponent(jLabel3)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel5)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel7))
                                        .addGap(54, 54, 54)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jComboBox4, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(jButton6))
                                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel14)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(19, 19, 19))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(395, 395, 395))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jLabel2)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, 0)
                                .addComponent(jLabel14))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton4)
                            .addComponent(jButton5)
                            .addComponent(jButton2)
                            .addComponent(jButton3))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jTextField9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.LEADING))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(jTextField10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(jTextField11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String criterioBusqueda = jTextField1.getText();
        ControlTienda objcc = new ControlTienda();
        int ncol;
        Object[] fila;
        if (criterioBusqueda != null) {
            listaTiendas = objcc.consultarTiendas();

            DefaultTableModel modelo = new DefaultTableModel();
            this.jTable1.setModel(modelo);

            modelo.addColumn("idTienda");
            modelo.addColumn("nomTienda");
            modelo.addColumn("direccionTienda");
            modelo.addColumn("fotoTienda");
            modelo.addColumn("descripcionTienda");
            modelo.addColumn("aprobacionTienda");
            modelo.addColumn("fechaAprobacionTienda");
            modelo.addColumn("idAdminTF");
            modelo.addColumn("identificacionCVF");
            modelo.addColumn("idFotoPredeterminadaTF");
            ncol = modelo.getColumnCount();

            //Object[] fila = new Object[ncol];
            for (int i = 0; i < listaTiendas.size(); i++) {
                fila = new Object[ncol];
                fila[0] = listaTiendas.get(i).getIdTienda();
                fila[1] = listaTiendas.get(i).getNomTienda();
                fila[2] = listaTiendas.get(i).getDireccionTienda();
                fila[3] = listaTiendas.get(i).getFotoTienda();
                fila[4] = listaTiendas.get(i).getDescripcionTienda();
                fila[5] = listaTiendas.get(i).getAprobacionTienda();
                fila[6] = listaTiendas.get(i).getFechaAprobacionTienda();
                fila[7] = listaTiendas.get(i).getIdAdminTF();
                fila[8] = listaTiendas.get(i).getIdentificacionCVF();
                fila[9] = listaTiendas.get(i).getIdFotoPredeterminadaTF();
                modelo.addRow(fila);
            }

        }else if(criterioBusqueda.equals("")){
            listaTiendas = objcc.consultarTiendas();

            DefaultTableModel modelo = new DefaultTableModel();
            this.jTable1.setModel(modelo);

            modelo.addColumn("idTienda");
            modelo.addColumn("nomTienda");
            modelo.addColumn("direccionTienda");
            modelo.addColumn("fotoTienda");
            modelo.addColumn("descripcionTienda");
            modelo.addColumn("aprobacionTienda");
            modelo.addColumn("fechaAprobacionTienda");
            modelo.addColumn("idAdminTF");
            modelo.addColumn("identificacionCVF");
            modelo.addColumn("idFotoPredeterminadaTF");
            ncol = modelo.getColumnCount();

            //Object[] fila = new Object[ncol];
            for (int i = 0; i < listaTiendas.size(); i++) {
                fila = new Object[ncol];
                fila[0] = listaTiendas.get(i).getIdTienda();
                fila[1] = listaTiendas.get(i).getNomTienda();
                fila[2] = listaTiendas.get(i).getDireccionTienda();
                fila[3] = listaTiendas.get(i).getFotoTienda();
                fila[4] = listaTiendas.get(i).getDescripcionTienda();
                fila[5] = listaTiendas.get(i).getAprobacionTienda();
                fila[6] = listaTiendas.get(i).getFechaAprobacionTienda();
                fila[7] = listaTiendas.get(i).getIdAdminTF();
                fila[8] = listaTiendas.get(i).getIdentificacionCVF();
                fila[9] = listaTiendas.get(i).getIdFotoPredeterminadaTF();
                modelo.addRow(fila);
            }
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        int idtienda=Integer.parseInt(jTextField1.getText());
        ControlTienda objCc=new ControlTienda();
        boolean t=objCc.eliminarTiendas(idtienda);
        
        if(t==true){
            JOptionPane.showMessageDialog(rootPane, "Se elimino la Tienda correctamente");
        }else{
            JOptionPane.showMessageDialog(rootPane, "No se elimino la Tienda");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String criterioBusqueda = jTextField1.getText();
        ControlTienda objcc = new ControlTienda();
        int ncol=10;
        Object[] fila;
        
        if (criterioBusqueda!=null) {
            listaTiendas2= objcc.consultarTiendas2(criterioBusqueda);


            //Object[] fila = new Object[ncol];
            for (int i = 0; i < listaTiendas2.size(); i++) {
                fila = new Object[ncol];
                fila[0] = listaTiendas2.get(i).getIdTienda();
                fila[1] = listaTiendas2.get(i).getNomTienda();
                fila[2] = listaTiendas2.get(i).getDireccionTienda();
                fila[3] = listaTiendas2.get(i).getFotoTienda();
                fila[4] = listaTiendas2.get(i).getDescripcionTienda();
                fila[5] = listaTiendas2.get(i).getAprobacionTienda();
                fila[6] = listaTiendas2.get(i).getFechaAprobacionTienda();
                fila[7] = listaTiendas2.get(i).getIdAdminTF();
                fila[8] = listaTiendas2.get(i).getIdentificacionCVF();
                fila[9] = listaTiendas2.get(i).getIdFotoPredeterminadaTF();

                jTextField2.setText(fila[1].toString());
                jTextField3.setText(fila[2].toString());
                jTextField4.setText(fila[3].toString());
                jTextField5.setText(fila[4].toString());
                jTextField6.setText(fila[5].toString());
                jTextField8.setText(fila[6].toString());
                jTextField9.setText(fila[7].toString());
                jTextField10.setText(fila[8].toString());
                jTextField11.setText(fila[9].toString());
            }

        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Tienda fp = new Tienda();
        
        
//        String identificacion = jTextField1.getText();
        String nombre = jTextField2.getText();
        String direccion = jTextField3.getText();
        File ruta = new File(jTextField4.getText());
        String descripcion = jTextField5.getText();
        String aprobacion1=jComboBox4.getSelectedItem().toString();
        int aprobacion;
        if(aprobacion1.equals("Si")){
            aprobacion=1;
        }else{
            aprobacion=0;
        }
        String fechaaprobacion = jTextField8.getText();
        int idadmin = Integer.parseInt(jTextField9.getText());
        String idcvf = jComboBox2.getSelectedItem().toString();
        int idfotop = Integer.parseInt(jComboBox3.getSelectedItem().toString());
        byte[] foto = null;
        try{
            foto = new byte[(int) ruta.length()];
            InputStream input = new FileInputStream(ruta);
            input.read(foto);
            fp.setFotoTienda(foto);
        }catch(Exception ex){
            fp.setFotoTienda(null);
        }
        
        Tienda objCliente=new Tienda(nombre, direccion, foto, descripcion, aprobacion, fechaaprobacion, idadmin, idcvf, idfotop);
        ControlTienda objcp=new ControlTienda();
         boolean t=objcp.insertarTiendas(objCliente);
            if(t==true){
                JOptionPane.showMessageDialog(rootPane, "Insertado con exito");
            }  else{
                JOptionPane.showMessageDialog(rootPane, "No insertado");
            }  
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Tienda fp = new Tienda();
        int id = Integer.parseInt(jTextField1.getText());
        String nombre = jTextField2.getText();
        String direccion = jTextField3.getText();
        File ruta = new File(jTextField4.getText());
        String descripcion = jTextField5.getText();
        String aprobacion1=jComboBox4.getSelectedItem().toString();
        int aprobacion;
        if(aprobacion1.equals("Si")){
            aprobacion=1;
        }else{
            aprobacion=0;
        }
        String fechaaprobacion = jTextField8.getText();
        int idadmin = Integer.parseInt(jTextField9.getText());
        String idcvf = jComboBox2.getSelectedItem().toString();
        int idfotop = Integer.parseInt(jComboBox3.getSelectedItem().toString());
        
        byte[] foto = null;
        try{
            foto = new byte[(int) ruta.length()];
            InputStream input = new FileInputStream(ruta);
            input.read(foto);
            fp.setFotoTienda(foto);
        }catch(Exception ex){
            fp.setFotoTienda(null);
        }
        
        
        ControlTienda objcp = new ControlTienda();
        boolean t = objcp.actualizarTienda1(nombre, direccion, descripcion, aprobacion, fechaaprobacion, idadmin, idcvf, idfotop, id);
        if (t == true) {
            JOptionPane.showMessageDialog(rootPane, "Modificado con exito");
        } else {
            JOptionPane.showMessageDialog(rootPane, "No se pudo modificar");
        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        JFileChooser j = new JFileChooser();
        FileNameExtensionFilter fil = new FileNameExtensionFilter("JPG, PNG & GIF","jpg","png","gif");
        j.setFileFilter(fil);

        int s = j.showOpenDialog(this);
        if(s == JFileChooser.APPROVE_OPTION){
            String ruta = j.getSelectedFile().getAbsolutePath();
            jTextField4.setText(ruta);
            File file = j.getSelectedFile();
            String getimage=file.getAbsolutePath();
            JOptionPane.showMessageDialog(null, getimage);
            ImageIcon img = new ImageIcon(getimage);
            Image imgfit = img.getImage();
            Image imgfit2 = imgfit.getScaledInstance(300, 300,Image.SCALE_SMOOTH);
            jLabel8.setIcon(new ImageIcon(imgfit2));
        }
  
    }//GEN-LAST:event_jButton6ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
//        ControlAdministrador obja = new ControlAdministrador();
//        
//        listaadmin = obja.consultarAdministrador();
//
//        for (int i = 0; i < listaadmin.size(); i++) {
//            Administrador objetoClasificacion = listaadmin.get(i);
//            jComboBox1.addItem(String.valueOf(objetoClasificacion.getIdAdmin()));
//        }

        ControlClienteVendedor objcpo=new ControlClienteVendedor();
        listacliente=objcpo.consultarClienteVendedor();
        for (int j = 0; j < listacliente.size(); j++) {
            ClienteVendedor objpais = listacliente.get(j);
            
            jComboBox2.addItem(objpais.getIdentificacionC());
        }
        
        ControlFotoPredeterminada obj=new ControlFotoPredeterminada();
        listafoto=obj.consultarFotoPredeterminada();
        
        for (int k = 0; k < listafoto.size(); k++) {
            FotoPredeterminada objpais = listafoto.get(k);
            jComboBox3.addItem(String.valueOf(objpais.getIdfotoPredeterminada()));
        }
        
        
        String[] arreglo = new String[2];
        arreglo[0]="Si";
        arreglo[1]="No";
        
        jComboBox4.addItem(arreglo[0]);
        jComboBox4.addItem(arreglo[1]);
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(vistaTiendaClienteVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaTiendaClienteVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaTiendaClienteVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaTiendaClienteVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaTiendaClienteVendedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    // End of variables declaration//GEN-END:variables
}
