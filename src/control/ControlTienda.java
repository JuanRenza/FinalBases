/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.sql.ResultSet;
import java.util.LinkedList;
import modelo.ClienteVendedor;
import modelo.Tienda;

/**
 *
 * @author W°
 */
public class ControlTienda {

    public LinkedList<Tienda> consultarTiendas() {
        String sql = "SELECT * FROM tiendas;";
        Tienda objclasi = new Tienda();
        LinkedList<Tienda> listac = objclasi.consultarTiendas(sql);
        return listac;
    }
    public LinkedList<Tienda> consultarTiendas2(String id) {
        String sql = "SELECT * FROM tiendas WHERE idTienda = '"+ id +"';";
        Tienda objclasi = new Tienda();
        LinkedList<Tienda> listac = objclasi.consultarTiendas(sql);
        return listac;
    }

    public boolean insertarTiendas(Tienda objT) {
        boolean t = false;
        Tienda objciudad = new Tienda();
        String sql = "";
        sql = "INSERT INTO tiendas (nomTienda,direccionTienda,fotoTienda,descripcionTienda,aprobacionTienda, fechaAprobacionTienda, idAdminTF, identificacionCVF, idFotoPredeterminadaTF) VALUES(?,?,?,?,?,?,?,?,?);";
        t = objciudad.insertarTiendas(objT, sql);
        return t;

    }

    public boolean eliminarTiendas(int listaTiendas) {
        boolean t = false;
        ClienteVendedor getobjeto = new ClienteVendedor();
        String sql = "DELETE FROM tiendas WHERE(idTienda = '" + listaTiendas + "');";
        t = getobjeto.eliminarClientesV(sql);

        return t;
    }
    
    public boolean actualizarTienda(String nombre, String direccion, String descripcion, int aprobacion, String fecha, int idadmin, String idcliente, int idfoto, int idtienda) {

        boolean t = false;
        ClienteVendedor getobjeto = new ClienteVendedor();
        String sql = "UPDATE tiendas SET nomTienda = '"+ nombre +"', direccionTienda = '"+ direccion +"', descripcionTienda = '"+ descripcion +"', aprobacionTienda = '"+ aprobacion +"', fechaAprobacionTienda = '"+ fecha +"', idAdminTF = '"+ idadmin +"', identificacionCVF = '"+ idcliente +"', idFotoPredeterminadaTF = '"+ idfoto +"' WHERE (idTienda = '"+ idtienda +"');";
        t = getobjeto.actualizarTienda(sql);

        return t;
    }
    
    public LinkedList<Tienda> consultarTiendaApro(){
        String sql = "SELECT * FROM tiendas where aprobacionTienda = 0;";
        Tienda objclasi = new Tienda();
        LinkedList<Tienda> listac = objclasi.consultarTiendasApro(sql);
        return listac;
    }

    public LinkedList<Tienda> consultarTiendaNoApro() {
        String sql = "SELECT * FROM tiendas where aprobacionTienda = 1;";
        Tienda objclasi = new Tienda();
        LinkedList<Tienda> listac = objclasi.consultarTiendasApro(sql);
        return listac;
    }

}
