/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import control.ControlClienteVendedor;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.ClienteVendedor;

/**
 *
 * @author W°
 */
public class vistaClienteVendedor extends javax.swing.JFrame {

    LinkedList<ClienteVendedor> listaClientesV;
    LinkedList<ClienteVendedor> listaCliente;
    /**
     * Creates new form vistaClienteVendedor
     */
    public vistaClienteVendedor() {
        initComponents();
        listaClientesV = new LinkedList<>();
        listaCliente = new LinkedList<>();
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
        jTextField1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        jLabel1.setText("Cliente Vendedor");

        jLabel2.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel2.setText("Primer Nombre");

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel3.setText("Identificacion");

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel4.setText("Segundo Nombre");

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel5.setText("Primer Apellido");

        jLabel6.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel6.setText("Segundo Apellido");

        jLabel7.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel7.setText("Fecha Nacimiento");

        jLabel8.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel8.setText("Direccion");

        jButton1.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jButton1.setText("Consultar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jButton2.setText("Insertar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jButton3.setText("Modificar");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jButton4.setText("Eliminar");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jTable1.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Identificacion", "Primer Nombre", "Segundo Nombre", "Primer Apellido", "Segundo Apellido", "Fecha Nacimiento", "Direccion"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jButton5.setFont(new java.awt.Font("Yu Gothic", 0, 12)); // NOI18N
        jButton5.setText("Refrescar");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(99, 99, 99)
                                .addComponent(jLabel3)
                                .addGap(88, 88, 88)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8))
                                .addGap(72, 72, 72)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 123, Short.MAX_VALUE)
                                    .addComponent(jTextField3)
                                    .addComponent(jTextField4)
                                    .addComponent(jTextField5)
                                    .addComponent(jTextField6)
                                    .addComponent(jTextField7))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 78, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(56, 56, 56))))
            .addComponent(jScrollPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(jTextField5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(jTextField6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(24, 24, 24)
                        .addComponent(jButton4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String criterioBusqueda = jTextField1.getText();
        ControlClienteVendedor objcc = new ControlClienteVendedor();
        int ncol=7;
        Object[] fila;
        if (criterioBusqueda!=null) {
            listaCliente= objcc.consultarClienteVendedor2(criterioBusqueda);


            //Object[] fila = new Object[ncol];
            for (int i = 0; i < listaCliente.size(); i++) {
                fila = new Object[ncol];
                fila[0] = listaCliente.get(i).getIdentificacionC();
                fila[1] = listaCliente.get(i).getNom1Cliente();
                fila[2] = listaCliente.get(i).getNom2Cliente();
                fila[3] = listaCliente.get(i).getApe1Cliente();
                fila[4] = listaCliente.get(i).getApe2Cliente();
                fila[5] = listaCliente.get(i).getFechaNac();
                fila[6] = listaCliente.get(i).getDireccion();

                jTextField2.setText(fila[1].toString());
                jTextField3.setText(fila[2].toString());
                jTextField4.setText(fila[3].toString());
                jTextField5.setText(fila[4].toString());
                jTextField6.setText(fila[5].toString());
                jTextField7.setText(fila[6].toString());
            }

        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String identificacion = jTextField1.getText();
        String nombre1 = jTextField2.getText();
        String nombre2 = jTextField3.getText();
        String apellido1 = jTextField4.getText();
        String apellido2 = jTextField5.getText();
        String fechaNacimiento = jTextField6.getText();
        String direccion = jTextField7.getText();
        
        ClienteVendedor objCliente=new ClienteVendedor(identificacion, nombre1, nombre2, apellido1, apellido2, fechaNacimiento, direccion);
         ControlClienteVendedor objcp=new ControlClienteVendedor();
         boolean t=objcp.insertarClientesV(objCliente);
            if(t==true){
                JOptionPane.showMessageDialog(rootPane, "Insertado con exito");
            }  else{
                JOptionPane.showMessageDialog(rootPane, "No Insertado");
            }  
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String id = jTextField1.getText();
        String nom1 = jTextField2.getText();
        String nom2 = jTextField3.getText();
        String ape1 = jTextField4.getText();
        String ape2 = jTextField5.getText();
        String fecha = jTextField6.getText();
        String direccion = jTextField7.getText();

        ClienteVendedor objCliente = new ClienteVendedor(nom1, nom2, ape1, ape2, fecha, direccion);
        ControlClienteVendedor objcp = new ControlClienteVendedor();
        boolean t = objcp.actualizarClientesV(nom1, nom2, ape1, ape2, fecha, direccion, id);
        if (t == true) {
            JOptionPane.showMessageDialog(rootPane, "Insertado con exito");
        } else {
            JOptionPane.showMessageDialog(rootPane, "No Insertado");
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        String idcliente=jTextField1.getText();
        ControlClienteVendedor objCc=new ControlClienteVendedor();
        boolean t=objCc.eliminarclientesV(idcliente);
        
        if(t==true){
            JOptionPane.showMessageDialog(rootPane, "Se elimino el Cliente");
        }else{
            JOptionPane.showMessageDialog(rootPane, "No se elimino el Cliente");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        String criterioBusqueda = jTextField1.getText();
        ControlClienteVendedor objcc = new ControlClienteVendedor();
        int ncol;
        Object[] fila;
        if (criterioBusqueda != null) {
            listaClientesV = objcc.consultarClienteVendedor();

            DefaultTableModel modelo = new DefaultTableModel();
            this.jTable1.setModel(modelo);

            modelo.addColumn("Identificacion");
            modelo.addColumn("Primer Nombre");
            modelo.addColumn("Segundo Nombre");
            modelo.addColumn("Primer Apellido");
            modelo.addColumn("Segundo Apellido");
            modelo.addColumn("Fecha Nacimiento");
            modelo.addColumn("Direccion");
            ncol = modelo.getColumnCount();

            //Object[] fila = new Object[ncol];
            for (int i = 0; i < listaClientesV.size(); i++) {
                fila = new Object[ncol];
                fila[0] = listaClientesV.get(i).getIdentificacionC();
                fila[1] = listaClientesV.get(i).getNom1Cliente();
                fila[2] = listaClientesV.get(i).getNom2Cliente();
                fila[3] = listaClientesV.get(i).getApe1Cliente();
                fila[4] = listaClientesV.get(i).getApe2Cliente();
                fila[5] = listaClientesV.get(i).getFechaNac();
                fila[6] = listaClientesV.get(i).getDireccion();
                modelo.addRow(fila);
            }

        }else if(criterioBusqueda.equals("")){
            listaClientesV = objcc.consultarClienteVendedor();

            DefaultTableModel modelo = new DefaultTableModel();
            this.jTable1.setModel(modelo);

            modelo.addColumn("Identificacion");
            modelo.addColumn("Primer Nombre");
            modelo.addColumn("Segundo Nombre");
            modelo.addColumn("Primer Apellido");
            modelo.addColumn("Segundo Apellido");
            modelo.addColumn("Fecha Nacimiento");
            modelo.addColumn("Direccion");
            ncol = modelo.getColumnCount();

            //Object[] fila = new Object[ncol];
            for (int i = 0; i < listaClientesV.size(); i++) {
                fila = new Object[ncol];
                fila[0] = listaClientesV.get(i).getIdentificacionC();
                fila[1] = listaClientesV.get(i).getNom1Cliente();
                fila[2] = listaClientesV.get(i).getNom2Cliente();
                fila[3] = listaClientesV.get(i).getApe1Cliente();
                fila[4] = listaClientesV.get(i).getApe2Cliente();
                fila[5] = listaClientesV.get(i).getFechaNac();
                fila[6] = listaClientesV.get(i).getDireccion();
                modelo.addRow(fila);
            }
        }
    }//GEN-LAST:event_jButton5ActionPerformed

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
            java.util.logging.Logger.getLogger(vistaClienteVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaClienteVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaClienteVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaClienteVendedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaClienteVendedor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
