/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import control.ControlProducto;
import control.ControlTienda;
import control.ControlTipoProducto;
import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.LinkedList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import modelo.Producto;
import modelo.Tienda;
import modelo.TipoProducto;
import static vista.vistaMenuVendedorTiendaModificar.idPersona;

/**
 *
 * @author Windows 10
 */
public class vistaMenuVendedorProductosCrear extends javax.swing.JFrame {

    /**
     * Creates new form vistaMenuVendedorProductos
     */
    
    public static String idPersona;
    LinkedList<TipoProducto> cblTipoProducto;
    public vistaMenuVendedorProductosCrear() {
        initComponents();
        cblTipoProducto = new LinkedList<>();
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
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        cbTipoP = new javax.swing.JComboBox<>();
        jTextField3 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(540, 960));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel2.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        jLabel2.setText("Nombre Producto");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(50, 310, 180, 18);

        jButton1.setText("Escoger foto");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1);
        jButton1.setBounds(50, 430, 93, 23);

        jLabel3.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        jLabel3.setText("Referencia");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(50, 470, 140, 18);
        jPanel1.add(jLabel9);
        jLabel9.setBounds(440, 370, 50, 50);

        jLabel4.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        jLabel4.setText("Foto Producto");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(50, 370, 160, 18);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BTN-log-VENDEDOR-02.png"))); // NOI18N
        jButton2.setContentAreaFilled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2);
        jButton2.setBounds(160, 790, 230, 70);

        jLabel5.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        jLabel5.setText("Valor");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(50, 530, 100, 18);

        jLabel6.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        jLabel6.setText("Descripcion");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(50, 590, 380, 18);

        jLabel10.setFont(new java.awt.Font("Montserrat SemiBold", 1, 24)); // NOI18N
        jLabel10.setText("Crear nuevo producto");
        jPanel1.add(jLabel10);
        jLabel10.setBounds(110, 140, 310, 40);
        jPanel1.add(jTextField2);
        jTextField2.setBounds(50, 390, 370, 30);

        jLabel8.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        jLabel8.setText("Id Tipo");
        jPanel1.add(jLabel8);
        jLabel8.setBounds(50, 680, 110, 18);
        jPanel1.add(jTextField1);
        jTextField1.setBounds(50, 330, 370, 30);

        jPanel1.add(cbTipoP);
        cbTipoP.setBounds(50, 700, 160, 40);
        jPanel1.add(jTextField3);
        jTextField3.setBounds(50, 490, 370, 30);

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/back-04.png"))); // NOI18N
        jButton3.setContentAreaFilled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton3);
        jButton3.setBounds(30, 20, 70, 70);
        jPanel1.add(jTextField4);
        jTextField4.setBounds(50, 550, 370, 30);
        jPanel1.add(jTextField5);
        jTextField5.setBounds(50, 610, 370, 44);

        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });
        jPanel1.add(jComboBox1);
        jComboBox1.setBounds(50, 260, 310, 40);

        jLabel7.setFont(new java.awt.Font("Montserrat SemiBold", 0, 14)); // NOI18N
        jLabel7.setText("Nombre de la tienda");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(50, 220, 420, 50);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/BgVendedor-01.png"))); // NOI18N
        jLabel1.setToolTipText("");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 540, 960);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 540, 960);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        JFileChooser j = new JFileChooser();
        FileNameExtensionFilter fil = new FileNameExtensionFilter("JPG, PNG & GIF","jpg","png","gif");
        j.setFileFilter(fil);

        int s = j.showOpenDialog(this);
        if(s == JFileChooser.APPROVE_OPTION){
            String ruta = j.getSelectedFile().getAbsolutePath();
            jTextField2.setText(ruta);
            File file = j.getSelectedFile();
            String getimage=file.getAbsolutePath();
            JOptionPane.showMessageDialog(null, getimage);
            ImageIcon img = new ImageIcon(getimage);
            Image imgfit = img.getImage();
            Image imgfit2 = imgfit.getScaledInstance(181, 191,Image.SCALE_SMOOTH);
            jLabel9.setIcon(new ImageIcon(imgfit2));
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        int idTienda = 0;
        String criterioBusqueda = jComboBox1.getSelectedItem().toString();
        ControlTienda objcc = new ControlTienda();
        LinkedList<Tienda> tienda = objcc.consultarTiendasVendedorModificar(idPersona,criterioBusqueda);
            for (int i = 0; i < tienda.size(); i++) {
            idTienda = tienda.get(i).getIdTienda();
            }   
        // TODO add your handling code here:
        Producto fp = new Producto();

        String nombre = jTextField1.getText();
        File ruta = new File(jTextField2.getText());
        String referencia = jTextField3.getText();
        double valorproducto = Double.parseDouble(jTextField4.getText());
        String descripcion = jTextField5.getText();
        
        int idTipo = 0;
        for (int i = 0; i < cblTipoProducto.size(); i++) {
            TipoProducto get = cblTipoProducto.get(i);
            String tipoProducto = String.valueOf(cbTipoP.getSelectedItem());
            if(tipoProducto.equals(get.getTipoProducto())){
                idTipo = get.getIdTipo();
            }
        }
        
        
        byte[] foto = null;
        try{
            foto = new byte[(int) ruta.length()];
            InputStream input = new FileInputStream(ruta);
            input.read(foto);
            fp.setFotoProducto(foto);
        }catch(Exception ex){
            fp.setFotoProducto(null);
        }

        Producto objCliente=new Producto(nombre, foto, referencia, valorproducto, descripcion, idTienda, idTipo);
        ControlProducto objcp=new ControlProducto();
        boolean t=objcp.insertarProducto(objCliente);
        if(t==true){
            JOptionPane.showMessageDialog(rootPane, "Insertado con exito");
        }  else{
            JOptionPane.showMessageDialog(rootPane, "No insertado");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

        vistaMenuVendedor v = new vistaMenuVendedor();
        v.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged

    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ControlTienda ct = new ControlTienda();
        LinkedList<Tienda> listaTiendasOpen = ct.consultarTiendasVendedor(idPersona);

        for (int i = 0; i < listaTiendasOpen.size(); i++) {
            Tienda objetoClasificacion = listaTiendasOpen.get(i);
            jComboBox1.addItem(String.valueOf(objetoClasificacion.getNomTienda()));
        }
        
        ControlTipoProducto objCtp = new ControlTipoProducto();
        cblTipoProducto = objCtp.consultarTipoProducto();

        for (int i = 0; i < cblTipoProducto.size(); i++) {
            TipoProducto objetoClasificacion = cblTipoProducto.get(i);
            cbTipoP.addItem(objetoClasificacion.getTipoProducto());
        }
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
            java.util.logging.Logger.getLogger(vistaMenuVendedorProductosCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vistaMenuVendedorProductosCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vistaMenuVendedorProductosCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vistaMenuVendedorProductosCrear.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vistaMenuVendedorProductosCrear().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbTipoP;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables
}
