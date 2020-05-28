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
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import modelo.Administrador;
import modelo.ClienteVendedor;
import modelo.FotoPredeterminada;
import modelo.Tienda;

/**
 *
 * @author Windows 10
 */

    
public class vistaMenuAdministradorTiendaModificar extends javax.swing.JFrame {

    /**
     * Creates new form vistaMenuAdministradorTiendaModificar
     */
    
    LinkedList<Tienda> listaTiendas;
    LinkedList<Tienda> listaTiendas2;
    public static String idAdmin;
    
    public vistaMenuAdministradorTiendaModificar() {
        initComponents();
        listaTiendas = new LinkedList<>();
        listaTiendas2 = new LinkedList<>();
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
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField11 = new javax.swing.JTextField();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        txtId = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        Back = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(540, 960));
        setMinimumSize(new java.awt.Dimension(540, 960));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(540, 960));
        jPanel1.setMinimumSize(new java.awt.Dimension(540, 960));
        jPanel1.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 204, 0));
        jLabel1.setText("Actual");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 340, 130, 50);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 204, 0));
        jLabel2.setText("Cambio");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(340, 360, 130, 50);

        jLabel7.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Aprobacion Tienda");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(40, 400, 122, 23);

        jLabel9.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Fecha Aprobacion Tienda");
        jPanel1.add(jLabel9);
        jLabel9.setBounds(40, 470, 166, 23);

        jLabel10.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Identificacion Administrador");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(40, 540, 183, 23);

        jLabel11.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setText("Id Cliente Vendedor");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(40, 610, 129, 23);

        jLabel12.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 255, 255));
        jLabel12.setText("Id Foto Predeterminada");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(40, 680, 154, 23);
        jPanel1.add(jTextField6);
        jTextField6.setBounds(40, 420, 220, 30);
        jPanel1.add(jTextField9);
        jTextField9.setBounds(40, 560, 220, 30);
        jPanel1.add(jTextField10);
        jTextField10.setBounds(40, 630, 220, 30);
        jPanel1.add(jTextField11);
        jTextField11.setBounds(40, 700, 220, 30);

        jComboBox4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox4ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox4);
        jComboBox4.setBounds(340, 420, 160, 30);

        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(340, 560, 160, 30);

        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(340, 630, 160, 30);

        jComboBox3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox3ActionPerformed(evt);
            }
        });
        jPanel1.add(jComboBox3);
        jComboBox3.setBounds(340, 700, 160, 30);
        jPanel1.add(txtId);
        txtId.setBounds(40, 250, 360, 30);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnAdminTiendaConsultarR-02.png"))); // NOI18N
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(190, 820, 170, 50);

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
        jButton3.setBounds(420, 240, 90, 50);
        jPanel1.add(jDateChooser1);
        jDateChooser1.setBounds(40, 500, 460, 30);

        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bgAdminTiendamModificar-01-01.png"))); // NOI18N
        jPanel1.add(Back);
        Back.setBounds(0, 0, 540, 960);

        jLabel8.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Aprobacion Tienda");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(40, 400, 122, 23);

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

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
            // TODO add your handling code here:
        Tienda fp = new Tienda();
        int id = Integer.parseInt(txtId.getText());
//        String aprobacion1=jComboBox4.getSelectedItem().toString();
//        int aprobacion;
//        if(aprobacion1.equals("Si")){
//            aprobacion=1;
//        }else{
//            aprobacion=0;
//        }
        String fechaaprobacion = "";
        
        try {
            //jDateChooser el nombre la variable  del componente jdatecgooser
            Date fecha = jDateChooser1.getDate();
            DateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            String fecha2 = f.format(fecha);

            //textFecha nombre de la variable del componenten jtextfiel
            fechaaprobacion = fecha2;
        } catch (Exception e) {
        }

        int idadmin = Integer.parseInt(jComboBox1.getSelectedItem().toString());
        String idcvf = jComboBox2.getSelectedItem().toString();
        int idfotop = Integer.parseInt(jComboBox3.getSelectedItem().toString());
 
        ControlTienda objcp = new ControlTienda();
        boolean t = objcp.actualizarTienda3(fechaaprobacion, idadmin, idcvf, idfotop, id);
        if (t == true) {
            JOptionPane.showMessageDialog(rootPane, "Modificado con exito");
        } else {
            JOptionPane.showMessageDialog(rootPane, "No se pudo modificar");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        vistaMenuAdministrador v = new vistaMenuAdministrador();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        String criterioBusqueda = txtId.getText();
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
                
                jTextField6.setText(fila[5].toString());
                jTextField9.setText(fila[7].toString());
                jTextField10.setText(fila[8].toString());
                jTextField11.setText(fila[9].toString());
            }

        }   // TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox4ActionPerformed

    private void jComboBox3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox3ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
            // TODO add your handling code here:
        ControlAdministrador obja = new ControlAdministrador();
        
        LinkedList<Administrador> listaadmin = obja.consultarAdministrador();

        for (int i = 0; i < listaadmin.size(); i++) {
            Administrador objetoClasificacion = listaadmin.get(i);
            jComboBox1.addItem(String.valueOf(objetoClasificacion.getIdAdmin()));
        }

        ControlClienteVendedor objcpo=new ControlClienteVendedor();
        LinkedList<ClienteVendedor> listacliente = objcpo.consultarClienteVendedor();
        for (int j = 0; j < listacliente.size(); j++) {
            ClienteVendedor objpais = listacliente.get(j);
            
            jComboBox2.addItem(objpais.getIdentificacionC());
        }
        
        ControlFotoPredeterminada obj=new ControlFotoPredeterminada();
        LinkedList<FotoPredeterminada> listafoto = obj.consultarFotoPredeterminada();
        
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
            java.util.logging.Logger.getLogger(vistaMenuAdministradorTiendaModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaMenuAdministradorTiendaModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaMenuAdministradorTiendaModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaMenuAdministradorTiendaModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaMenuAdministradorTiendaModificar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables
}
