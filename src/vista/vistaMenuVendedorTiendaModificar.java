/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

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
import modelo.Tienda;

/**
 *
 * @author Windows 10
 */
public class vistaMenuVendedorTiendaModificar extends javax.swing.JFrame {

    /**
     * Creates new form vistaMenuVendedorTiendaModificar
     */
    
        LinkedList<Tienda> listaTiendas;
    LinkedList<Tienda> listaTiendas2;
    public vistaMenuVendedorTiendaModificar() {
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
        jLabel12 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox<>();
        jTextField11 = new javax.swing.JTextField();
        jComboBox2 = new javax.swing.JComboBox<>();
        jTextField10 = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        Back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(540, 960));
        jPanel1.setMinimumSize(new java.awt.Dimension(540, 960));
        jPanel1.setLayout(null);

        jLabel12.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel12.setText("Id Foto Predeterminada");
        jPanel1.add(jLabel12);
        jLabel12.setBounds(40, 700, 154, 24);

        jPanel1.add(jComboBox3);
        jComboBox3.setBounds(320, 720, 180, 30);
        jPanel1.add(jTextField11);
        jTextField11.setBounds(40, 720, 240, 30);

        jPanel1.add(jComboBox2);
        jComboBox2.setBounds(320, 660, 180, 30);
        jPanel1.add(jTextField10);
        jTextField10.setBounds(40, 660, 240, 30);

        jLabel11.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel11.setText("Id Cliente Vendedor");
        jPanel1.add(jLabel11);
        jLabel11.setBounds(40, 640, 129, 24);

        jLabel10.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel10.setText("Identificacion Administrador");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(40, 580, 183, 24);
        jPanel1.add(jTextField9);
        jTextField9.setBounds(40, 600, 240, 30);

        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(320, 600, 180, 30);

        jLabel6.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel6.setText("Descripcion Tienda");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(40, 520, 125, 24);
        jPanel1.add(jTextField5);
        jTextField5.setBounds(40, 540, 240, 30);

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel5.setText("Ruta Foto");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 430, 64, 24);
        jPanel1.add(jTextField4);
        jTextField4.setBounds(40, 450, 240, 30);

        jButton6.setText("Escoger foto");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(40, 490, 93, 23);
        jPanel1.add(jLabel8);
        jLabel8.setBounds(320, 390, 170, 100);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(40, 390, 240, 30);

        jLabel4.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel4.setText("Direccion Tienda");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 370, 110, 24);

        jLabel3.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel3.setText("Nombre Tienda");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(40, 310, 100, 24);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(40, 330, 240, 30);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Cambios");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 250, 170, 50);
        jPanel1.add(txtId);
        txtId.setBounds(40, 180, 360, 30);

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btnAdminTiendaConsultarR-02.png"))); // NOI18N
        jButton4.setContentAreaFilled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton4);
        jButton4.setBounds(180, 810, 170, 50);

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
        jButton3.setBounds(420, 170, 90, 50);

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel7.setText("Id Tienda");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(40, 120, 170, 50);

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

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        Tienda fp = new Tienda();
        int id = Integer.parseInt(txtId.getText());
        String nombre = jTextField2.getText();
        String direccion = jTextField3.getText();
        File ruta = new File(jTextField4.getText());
        String descripcion = jTextField5.getText();

        int idadmin = Integer.parseInt(jComboBox1.getSelectedItem().toString());
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
        boolean t = objcp.actualizarTienda4(nombre, direccion, descripcion, idadmin, idcvf, idfotop, id);
        if (t == true) {
            JOptionPane.showMessageDialog(rootPane, "Modificado con exito");
        } else {
            JOptionPane.showMessageDialog(rootPane, "No se pudo modificar");
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

        vistaMenuVendedor v = new vistaMenuVendedor();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
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
            //    fila[3] = listaTiendas2.get(i).getFotoTienda();
                fila[4] = listaTiendas2.get(i).getDescripcionTienda();
                fila[5] = listaTiendas2.get(i).getAprobacionTienda();
                fila[6] = listaTiendas2.get(i).getFechaAprobacionTienda();
                fila[7] = listaTiendas2.get(i).getIdAdminTF();
                fila[8] = listaTiendas2.get(i).getIdentificacionCVF();
                fila[9] = listaTiendas2.get(i).getIdFotoPredeterminadaTF();

                jTextField2.setText(fila[1].toString());
                jTextField3.setText(fila[2].toString());
//                jTextField4.setText(fila[3].toString());
                jTextField5.setText(fila[4].toString());
                jTextField9.setText(fila[7].toString());
                jTextField10.setText(fila[8].toString());
                jTextField11.setText(fila[9].toString());
            }

        }
    }//GEN-LAST:event_jButton3ActionPerformed

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
            java.util.logging.Logger.getLogger(vistaMenuVendedorTiendaModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaMenuVendedorTiendaModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaMenuVendedorTiendaModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaMenuVendedorTiendaModificar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaMenuVendedorTiendaModificar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JTextField txtId;
    // End of variables declaration//GEN-END:variables
}