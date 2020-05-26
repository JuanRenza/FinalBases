/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import modelo.Administrador;

/**
 *
 * @author Nicolas Alexander
 */
public class ControlAdministrador {
    
    public LinkedList<Administrador> consultarAdministrador() {
        LinkedList<Administrador> listaA = new LinkedList<>();
        Administrador objclasi = new Administrador();
        String sql = "select * from administradores;";
        listaA = objclasi.consultarAdministrador(sql);
        return listaA;
    }
    
    public boolean consultarAdministradorCorreo(String corr) {
        boolean existe = false;
        String sql = "SELECT * FROM administradores WHERE correoAdmin = '"+ corr +"';";
        Administrador objAdmin = new Administrador();
        LinkedList<Administrador> consultarAdmin = objAdmin.consultarAdministrador(sql);
        
        if(consultarAdmin.size() > 0){
        existe = true;
        }
        
        return existe;
    }
    
    public boolean cconsultarAdministradorContraseña(String contra) {
        boolean existe = false;
        String sql = "SELECT * FROM administradores WHERE contraseñaAdmin = '"+ contra +"';";
        Administrador objAdmin = new Administrador();
        LinkedList<Administrador> consultarAdmin = objAdmin.consultarAdministrador(sql);
        
        if(consultarAdmin.size() > 0){
        existe = true;
        }
        
        return existe;
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

     public boolean insertarAdministrador(Administrador objC) {
        boolean t = false;
        Administrador objC2 = new Administrador();
        String sql = "";
        sql = "insert into administradores( nom1Admin, nom2Admin, ape1Admin, ape2Admin, correoAdmin, contraseñaAdmin, direccionAdmin,fotoAdmin) values(?,?,?,?,?,?,?,?);";
        t = objC2.insertarAdministrador(objC,sql);

        return t;

    }
      public boolean eliminarAdministrador(String listaA) {

        boolean t = false;
        Administrador getobjeto = new Administrador();
        String sql = "DELETE FROM administradores WHERE(correoAdmin = '" + listaA + "');";
        t = getobjeto.eliminarAdministrador(sql);

        return t;
    }
    
    
}
