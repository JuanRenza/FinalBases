/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import control.BaseDatos;
import java.io.FileInputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Nicolas Alexander
 */
public class Administrador {

    private int idAdmin;
    private String nom1Admin;
    private String nom2Admin;
    private String ape1Admin;
    private String ape2Admin;
    private String correoAdmin;
    private String contraseñaAdmin;
    private String direccionAdmin;
    private byte[] fotoAdmin;

    public Administrador() {
    }
    
    public Administrador(String nom1Admin1, String nom2Admin1, String ape1Admin1, String ape2Admin1, String direccionAdmin1, String contraseñaAdmin1, byte[] fotoAdmin1) {
    }

    public Administrador(int idAdministrador, String nom1Admin, String nom2Admin, String ape1Admin, String ape2Admin, String correoAdmin,
            String contraseñaAdmin, String direccionAdmin, byte[] fotoAdmin) {

        this.idAdmin = idAdministrador;
        this.nom1Admin = nom1Admin;
        this.nom2Admin = nom2Admin;
        this.ape1Admin = ape1Admin;
        this.ape2Admin = ape2Admin;
        this.correoAdmin = correoAdmin;
        this.direccionAdmin = direccionAdmin;
        this.contraseñaAdmin = contraseñaAdmin;
        this.fotoAdmin = fotoAdmin;

    }

    public Administrador(String nom1Admin, String nom2Admin, String ape1Admin, String ape2Admin, String correoAdmin, String contraseñaAdmin, String direccionAdmin, byte[] fotoAdmin) {
        this.nom1Admin = nom1Admin;
        this.nom2Admin = nom2Admin;
        this.ape1Admin = ape1Admin;
        this.ape2Admin = ape2Admin;
        this.correoAdmin = correoAdmin;
        this.contraseñaAdmin = contraseñaAdmin;
        this.direccionAdmin = direccionAdmin;
        this.fotoAdmin = fotoAdmin;
    }

    public int getIdAdmin() {
        return idAdmin;
    }

    public String getNom1Admin() {
        return nom1Admin;
    }

    public String getNom2Admin() {
        return nom2Admin;
    }

    public String getApe1Admin() {
        return ape1Admin;
    }

    public String getApe2Admin() {
        return ape2Admin;
    }

    public String getCorreoAdmin() {
        return correoAdmin;
    }

    public String getContraseñaAdmin() {
        return contraseñaAdmin;
    }

    public String getDireccionAdmin() {
        return direccionAdmin;
    }

    public byte[] getFotoAdmin() {
        return fotoAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public void setNom1Admin(String nom1Admin) {
        this.nom1Admin = nom1Admin;
    }

    public void setNom2Admin(String nom2Admin) {
        this.nom2Admin = nom2Admin;
    }

    public void setApe1Admin(String ape1Admin) {
        this.ape1Admin = ape1Admin;
    }

    public void setApe2Admin(String ape2Admin) {
        this.ape2Admin = ape2Admin;
    }

    public void setCorreoAdmin(String correoAdmin) {
        this.correoAdmin = correoAdmin;
    }

    public void setContraseñaAdmin(String contraseñaAdmin) {
        this.contraseñaAdmin = contraseñaAdmin;
    }

    public void setDireccionAdmin(String direccionAdmin) {
        this.direccionAdmin = direccionAdmin;
    }

    public void setFotoAdmin(byte[] fotoAdmin) {
        this.fotoAdmin = fotoAdmin;
    }

    @Override
    public String toString() {
        return "Administrador{" + "idAdmin=" + idAdmin + ", nom1Admin=" + nom1Admin + ", nom2Admin=" + nom2Admin + ", ape1Admin=" + ape1Admin + ", ape2Admin=" + ape2Admin + ", correoAdmin=" + correoAdmin + ", contraseñaAdmin=" + contraseñaAdmin + ", direccionAdmin=" + direccionAdmin + ", fotoAdmin=" + fotoAdmin + '}';
    }

    public LinkedList<Administrador> consultarAdministrador(String sql) {
        LinkedList<Administrador> lc = new LinkedList<>();
        BaseDatos objb = new BaseDatos();
        
        int idAdmin;
        String nom1Admin = "";
        String nom2Admin = "";
        String ape1Admin = "";
        String ape2Admin = "";
        String correoAdmin = "";
        String direccionAdmin = "";
        String contraseñaAdmin = "";
        byte[] fotoAdmin = null;

        ResultSet rs = null;
          if (objb.crearConexion()) {
            try {
                Statement sentencia = objb.getConexion().createStatement();
                rs = sentencia.executeQuery(sql);
                 while (rs.next()) {
                     idAdmin = rs.getInt("idAdmin");
                     nom1Admin = rs.getString("nom1Admin");
                    fotoAdmin = rs.getBytes("fotoAdmin");
                    try {
                        nom2Admin = rs.getString("nom2Admin");
                    } catch (NullPointerException n) { }
                    if(nom2Admin==null){
                        nom2Admin = "";
                    }
                    
                    ape1Admin = rs.getString("ape1Admin");
                     try {
                        ape2Admin = rs.getString("ape2Admin");
                    } catch (NullPointerException n) { }
                    if(ape2Admin==null){
                        ape2Admin = "";
                    }
                    correoAdmin = rs.getString("correoAdmin");
                    direccionAdmin = rs.getString("direccionAdmin");
                    contraseñaAdmin = rs.getString("contraseñaAdmin");
                    lc.add(new Administrador(idAdmin,nom1Admin, nom2Admin, ape1Admin, ape2Admin, correoAdmin, contraseñaAdmin, direccionAdmin, fotoAdmin));
                }
            } catch (SQLException ex) {
                Logger.getLogger(Administrador.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lc;
    }

    public boolean insertarAdministrador(Administrador objT, String sql) {
        boolean t = false;
        BaseDatos objb = new BaseDatos();
        FileInputStream fis = null;
        PreparedStatement ps = null;
        try {
            if (objb.crearConexion()) {
                objb.getConexion().setAutoCommit(false);
                ps = objb.getConexion().prepareStatement(sql);

                ps.setString(1, objT.getNom1Admin());
                ps.setString(2, objT.getNom2Admin());
                ps.setString(3, objT.getApe1Admin());
                ps.setString(4, objT.getApe2Admin());
                ps.setString(5, objT.getCorreoAdmin());
                ps.setString(6, objT.getDireccionAdmin());
                ps.setString(7, objT.getContraseñaAdmin());
                ps.setBytes(8, objT.getFotoAdmin());
             
                ps.executeUpdate();
                objb.getConexion().commit();
                t = true;
            }
        } catch (Exception ex) {
            Logger.getLogger(BaseDatos.class.getName()).log(Level.SEVERE, null, ex);
            t = false;
        }

        return t;
    }

    public boolean eliminarAdministrador(String sql) {
        boolean t = false;
        BaseDatos objCon = new BaseDatos();

        if (objCon.crearConexion()) {
            try {
                Statement sentencia = objCon.getConexion().createStatement();
                sentencia.executeUpdate(sql);
                t = true;
            } catch (SQLException ex) {
                ex.printStackTrace();
                t = false;
            }
        }

        return t;
    }
}
