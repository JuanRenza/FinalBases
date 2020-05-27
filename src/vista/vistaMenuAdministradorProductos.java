/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import control.ControlProducto;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.Producto;

/**
 *
 * @author Windows 10
 */
public class vistaMenuAdministradorProductos extends javax.swing.JFrame {

    /**
     * Creates new form vistaMenuAdministradorProductos
     */
    
        LinkedList<Producto> pr;
        public static String idAdmin;
        
    public vistaMenuAdministradorProductos() {
        initComponents();
        pr = new LinkedList<>();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtId = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        Back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(540, 960));
        setMinimumSize(new java.awt.Dimension(540, 960));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(540, 960));
        jPanel1.setMinimumSize(new java.awt.Dimension(540, 960));
        jPanel1.setLayout(null);
        jPanel1.add(txtId);
        txtId.setBounds(40, 320, 360, 30);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Id Producto", "Nombre", "Foto", "Referencia", "Valor", "Descripcion", "Id Tienda", "Id Tipo Producto"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(40, 440, 460, 420);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back-04.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(30, 20, 70, 70);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnAdminTiendaConsultar-03.png"))); // NOI18N
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(420, 310, 90, 50);

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnAdminProductoConsultar-01-02.png"))); // NOI18N
        jButton6.setContentAreaFilled(false);
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(30, 220, 170, 50);

        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bgAdminProductoConsultar-01-01.png"))); // NOI18N
        jPanel1.add(Back);
        Back.setBounds(0, 0, 540, 960);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 540, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 960, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 960, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        vistaMenuAdministrador v = new vistaMenuAdministrador();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                // TODO add your handling code here:
        String criterioBusqueda = txtId.getText();
        ControlProducto objcc = new ControlProducto();
        int ncol;
        Object[] fila;
        if (criterioBusqueda != null) {
            pr = objcc.consultarProductoId(criterioBusqueda);

            DefaultTableModel modelo = new DefaultTableModel();
            this.jTable1.setModel(modelo);

            modelo.addColumn("Id Producto");
            modelo.addColumn("Nombre");
            modelo.addColumn("Foto");
            modelo.addColumn("Referencia");
            modelo.addColumn("Valor");
            modelo.addColumn("Descripcion");
            modelo.addColumn("Id Tienda");
            modelo.addColumn("Id Tipo Producto");

            ncol = modelo.getColumnCount();

            //Object[] fila = new Object[ncol];
            for (int i = 0; i < pr.size(); i++) {
                fila = new Object[ncol];
                fila[0] = pr.get(i).getIdProducto();
                fila[1] = pr.get(i).getNombreProducto();
                fila[2] = pr.get(i).getFotoProducto();
                fila[3] = pr.get(i).getReferenciaProducto();
                fila[4] = pr.get(i).getValorProducto();
                fila[5] = pr.get(i).getDescripcionProducto();
                fila[6] = pr.get(i).getIdTiendaPF();
                fila[7] = pr.get(i).getIdTipoPF();
                modelo.addRow(fila);
            }

        }else if(criterioBusqueda.equals("")){
             pr = objcc.consultarProducto();

            DefaultTableModel modelo = new DefaultTableModel();
            this.jTable1.setModel(modelo);

            modelo.addColumn("Id Producto");
            modelo.addColumn("Nombre");
            modelo.addColumn("Foto");
            modelo.addColumn("Referencia");
            modelo.addColumn("Valor");
            modelo.addColumn("Descripcion");
            modelo.addColumn("Id Tienda");
            modelo.addColumn("Id Tipo Producto");

            ncol = modelo.getColumnCount();

            //Object[] fila = new Object[ncol];
            for (int i = 0; i < pr.size(); i++) {
                fila = new Object[ncol];
                fila[0] = pr.get(i).getIdProducto();
                fila[1] = pr.get(i).getNombreProducto();
                fila[2] = pr.get(i).getFotoProducto();
                fila[3] = pr.get(i).getReferenciaProducto();
                fila[4] = pr.get(i).getValorProducto();
                fila[5] = pr.get(i).getDescripcionProducto();
                fila[6] = pr.get(i).getIdTiendaPF();
                fila[7] = pr.get(i).getIdTipoPF();
                modelo.addRow(fila);
            }
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        ControlProducto objcc = new ControlProducto();
        int ncol;
        Object[] fila;

             pr = objcc.consultarProducto();

            DefaultTableModel modelo = new DefaultTableModel();
            this.jTable1.setModel(modelo);

            modelo.addColumn("Id Producto");
            modelo.addColumn("Nombre");
            modelo.addColumn("Foto");
            modelo.addColumn("Referencia");
            modelo.addColumn("Valor");
            modelo.addColumn("Descripcion");
            modelo.addColumn("Id Tienda");
            modelo.addColumn("Id Tipo Producto");

            ncol = modelo.getColumnCount();

            //Object[] fila = new Object[ncol];
            for (int i = 0; i < pr.size(); i++) {
                fila = new Object[ncol];
                fila[0] = pr.get(i).getIdProducto();
                fila[1] = pr.get(i).getNombreProducto();
                fila[2] = pr.get(i).getFotoProducto();
                fila[3] = pr.get(i).getReferenciaProducto();
                fila[4] = pr.get(i).getValorProducto();
                fila[5] = pr.get(i).getDescripcionProducto();
                fila[6] = pr.get(i).getIdTiendaPF();
                fila[7] = pr.get(i).getIdTipoPF();
                modelo.addRow(fila);
            }
        
    }//GEN-LAST:event_jButton6ActionPerformed

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
            java.util.logging.Logger.getLogger(vistaMenuAdministradorProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaMenuAdministradorProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaMenuAdministradorProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaMenuAdministradorProductos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaMenuAdministradorProductos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables
}
