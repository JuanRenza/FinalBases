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
    public LinkedList<Tienda> consultarTiendasVendedor(String id) {
        String sql = "SELECT * FROM tiendas WHERE identificacionCVF = '"+ id +"';";
        Tienda objclasi = new Tienda();
        LinkedList<Tienda> listac = objclasi.consultarTiendas(sql);
        return listac;
    }
    public LinkedList<Tienda> consultarTiendasVendedorModificar(String id,String nom) {
        String sql = "SELECT * FROM tiendas WHERE identificacionCVF = '"+ id +"' and nomTienda = '"+nom+"';";
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
    
    public boolean insertarTiendasVendedor(Tienda objT) {
        boolean t = false;
        Tienda objciudad = new Tienda();
        String sql = "";
        sql = "INSERT INTO tiendas (nomTienda,direccionTienda,fotoTienda,descripcionTienda,identificacionCVF) VALUES(?,?,?,?,?);";
        t = objciudad.insertTiendaVendedor(objT, sql);
        return t;

    }

    public boolean eliminarTiendas(int listaTiendas) {
        boolean t = false;
        ClienteVendedor getobjeto = new ClienteVendedor();
        String sql = "DELETE FROM tiendas WHERE(idTienda = '" + listaTiendas + "');";
        t = getobjeto.eliminarClientesV(sql);

        return t;
    }
    
    public boolean actualizarTienda1(String nombre, String direccion, String descripcion, int aprobacion, String fecha, int idadmin, String idcliente, int idfoto, int idtienda) {

        boolean t = false;
        Tienda getobjeto = new Tienda();
        String sql = "UPDATE tiendas SET nomTienda = '"+ nombre +"', direccionTienda = '"+ direccion +"', descripcionTienda = '"+ descripcion +"', aprobacionTienda = '"+ aprobacion +"', fechaAprobacionTienda = '"+ fecha +"', idAdminTF = '"+ idadmin +"', identificacionCVF = '"+ idcliente +"', idFotoPredeterminadaTF = '"+ idfoto +"' WHERE (idTienda = '"+ idtienda +"');";
        t = getobjeto.actualizarTienda(sql);

        return t;
    }

    public boolean actualizarTienda2(int aprobacion, String fechaaprobacion, int idadmin, String idcvf, int idfotop, int id) {
        boolean t = false;
        Tienda getobjeto = new Tienda();
        String sql = "UPDATE tiendas SET aprobacionTienda = '"+ aprobacion +"', fechaAprobacionTienda = '"+ fechaaprobacion +"', idAdminTF = '"+ idadmin +"', identificacionCVF = '"+ idcvf +"', idFotoPredeterminadaTF = '"+ idfotop +"' WHERE (idTienda = '"+ id +"');";
        t = getobjeto.actualizarTienda(sql);

        return t;
    }

    public LinkedList<Tienda> consultarTiendaApro() {
        String sql = "select * from tiendas where aprobacionTienda = 1;";
        Tienda objclasi = new Tienda();
        LinkedList<Tienda> listac = objclasi.consultarTiendas(sql);
        return listac;
    }

    public LinkedList<Tienda> consultarTiendaNoApro() {
        String sql = "select * from tiendas where aprobacionTienda = 0;";
        Tienda objclasi = new Tienda();
        LinkedList<Tienda> listac = objclasi.consultarTiendas(sql);
        return listac;
    }

    public boolean aprobarTienda(int aprobacion, String id) {
        boolean t = false;
        Tienda getobjeto = new Tienda();
        String sql = "UPDATE tiendas SET aprobacionTienda = '"+ aprobacion +"' WHERE (idTienda = '"+ id +"');";
        t = getobjeto.actualizarTienda(sql);

        return t;
    }

    public boolean actualizarTienda3(String fechaaprobacion, int idadmin, String idcvf, int idfotop, int id) {
        boolean t = false;
        Tienda getobjeto = new Tienda();
        String sql = "UPDATE tiendas SET fechaAprobacionTienda = '"+ fechaaprobacion +"', idAdminTF = '"+ idadmin +"', identificacionCVF = '"+ idcvf +"', idFotoPredeterminadaTF = '"+ idfotop +"' WHERE (idTienda = '"+ id +"');";
        t = getobjeto.actualizarTienda(sql);

        return t;
    }

    public boolean actualizarTienda4(String nombre, String direccion, String descripcion, int id) {
        boolean t = false;
        Tienda getobjeto = new Tienda();
        String sql = "UPDATE tiendas SET nomTienda = '"+ nombre +"', direccionTienda = '"+ direccion +"', descripcionTienda = '"+ descripcion + "'WHERE idTienda = '"+ id +"';";
        t = getobjeto.actualizarTienda(sql);

        return t;
    }


}
