/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import control.ControlClienteVendedor;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import modelo.ClienteVendedor;

/**
 *
 * @author Windows 10
 */
public class vistaLogeoVendedorRegistrarse extends javax.swing.JFrame {

    /**
     * Creates new form vistaLogeoVendedorRegistrarse
     */
    public vistaLogeoVendedorRegistrarse() {
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

        jPanel1 = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField7 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        Back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(540, 960));
        setMinimumSize(new java.awt.Dimension(540, 960));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(540, 960));
        jPanel1.setMinimumSize(new java.awt.Dimension(540, 960));
        jPanel1.setLayout(null);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(70, 310, 390, 30);

        jLabel2.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Primer Nombre");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(70, 290, 170, 18);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back-04.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(30, 20, 70, 70);

        jLabel1.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Identificacion");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(70, 220, 160, 18);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(70, 240, 390, 30);

        jLabel3.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("Segundo Nombre");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(70, 370, 180, 18);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(70, 390, 390, 30);

        jLabel4.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Primer Apellido");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(70, 450, 170, 18);
        jPanel1.add(jTextField4);
        jTextField4.setBounds(70, 470, 390, 30);

        jLabel5.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Segundo Apellido");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(70, 530, 180, 18);

        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField5);
        jTextField5.setBounds(70, 550, 390, 30);

        jLabel6.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Fecha Nacimiento");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(70, 610, 190, 18);

        jLabel7.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Direccion");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(70, 680, 130, 18);

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });
        jPanel1.add(jTextField7);
        jTextField7.setBounds(70, 700, 390, 30);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnRegistro-05.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(0, 770, 540, 60);
        jPanel1.add(jDateChooser1);
        jDateChooser1.setBounds(70, 630, 390, 30);

        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BgVendedor-01.png"))); // NOI18N
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
        vistaLogeoVendedor vl = new vistaLogeoVendedor();
        vl.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        String identificacion = jTextField1.getText();
        String nombre1 = jTextField2.getText();
        String nombre2 = jTextField3.getText();
        String apellido1 = jTextField4.getText();
        String apellido2 = jTextField5.getText();
        String fechaNacimiento = "";
        String direccion = jTextField7.getText();
        
        try {
            //jDateChooser el nombre la variable  del componente jdatecgooser
            Date fecha = jDateChooser1.getDate();
            DateFormat f = new SimpleDateFormat("yyyy-MM-dd");
            String fecha2 = f.format(fecha);

            //textFecha nombre de la variable del componenten jtextfiel
            fechaNacimiento = fecha2;
        } catch (Exception e) {
        }

        ClienteVendedor objCliente=new ClienteVendedor(identificacion, nombre1, nombre2, apellido1, apellido2, fechaNacimiento, direccion);
        ControlClienteVendedor objcp=new ControlClienteVendedor();
        boolean t=objcp.insertarClientesV(objCliente);
        if(t==true){
            JOptionPane.showMessageDialog(rootPane, "Insertado con exito, por favor inicie sesion");
            vistaLogeoVendedor vl = new vistaLogeoVendedor();
            vl.setVisible(true);
            this.dispose();
        }  else{
            JOptionPane.showMessageDialog(rootPane, "No Insertado");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(vistaLogeoVendedorRegistrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaLogeoVendedorRegistrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaLogeoVendedorRegistrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaLogeoVendedorRegistrarse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaLogeoVendedorRegistrarse().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField7;
    // End of variables declaration//GEN-END:variables
}
