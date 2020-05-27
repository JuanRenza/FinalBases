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
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import modelo.Tienda;

/**
 *
 * @author Windows 10
 */
public class vistaMenuVendedorTiendaCrear extends javax.swing.JFrame {

    /**
     * Creates new form vistaMenuVendedorTiendaCrear
     */
    
    public static String idPersona;
    
    public vistaMenuVendedorTiendaCrear() {
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
        jTextField3 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        Back = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(540, 960));
        setMinimumSize(new java.awt.Dimension(540, 960));
        setPreferredSize(new java.awt.Dimension(540, 960));
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setMaximumSize(new java.awt.Dimension(540, 960));
        jPanel1.setMinimumSize(new java.awt.Dimension(540, 960));
        jPanel1.setLayout(null);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(40, 380, 420, 30);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(40, 310, 420, 30);

        jLabel1.setText("Nombre Tienda");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 220, 250, 20);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(40, 240, 420, 30);

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/btncrear-05.png"))); // NOI18N
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(0, 720, 540, 70);

        jLabel4.setText("Descripcion Tienda");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(40, 360, 270, 14);

        jLabel2.setText("Direccion Tienda");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(40, 290, 78, 14);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back-04.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(30, 20, 70, 70);

        jLabel10.setFont(new java.awt.Font("Montserrat SemiBold", 0, 24)); // NOI18N
        jLabel10.setText("Insertar Tiendas");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(40, 160, 230, 30);

        jButton6.setText("Escoger foto");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton6);
        jButton6.setBounds(40, 470, 180, 30);
        jPanel1.add(jTextField4);
        jTextField4.setBounds(240, 470, 150, 30);

        jLabel5.setFont(new java.awt.Font("Yu Gothic", 0, 14)); // NOI18N
        jLabel5.setText("Ruta Foto");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(40, 440, 64, 24);

        jLabel8.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.add(jLabel8);
        jLabel8.setBounds(410, 450, 50, 50);

        Back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BgVendedor-01.png"))); // NOI18N
        jPanel1.add(Back);
        Back.setBounds(0, 0, 540, 960);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 540, 960);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Tienda fp = new Tienda();
        
        
//        String identificacion = jTextField1.getText();
        String nombre = jTextField1.getText();
        String direccion = jTextField2.getText();
        File ruta = new File(jTextField4.getText());
        String descripcion = jTextField3.getText();
        byte[] foto = null;
        try{
            foto = new byte[(int) ruta.length()];
            InputStream input = new FileInputStream(ruta);
            input.read(foto);
            fp.setFotoTienda(foto);
        }catch(Exception ex){
            fp.setFotoTienda(null);
        }
        String idcvf = idPersona;
        
        Tienda ti = new Tienda(nombre, direccion, foto, descripcion, idcvf);
        ControlTienda objct=new ControlTienda();
         boolean t=objct.insertarTiendasVendedor(ti);
            if(t==true){
                JOptionPane.showMessageDialog(rootPane, "Insertado con exito");
            }  else{
                JOptionPane.showMessageDialog(rootPane, "No insertado");
            }  
    }//GEN-LAST:event_jButton1ActionPerformed

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

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        vistaMenuVendedorTienda.idPersona = idPersona;
        vistaMenuVendedorTienda v = new vistaMenuVendedorTienda();
        v.setVisible(true);
        this.dispose();
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
            java.util.logging.Logger.getLogger(vistaMenuVendedorTiendaCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaMenuVendedorTiendaCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaMenuVendedorTiendaCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaMenuVendedorTiendaCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaMenuVendedorTiendaCrear().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Back;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}