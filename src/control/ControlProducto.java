/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import modelo.Producto;

/**
 *
 * @author Windows 10
 */
public class ControlProducto {
    
    public LinkedList<Producto> consultarProducto() {
        String sql="Select * from productos;";
        Producto objp = new Producto();
        LinkedList<Producto> listp = objp.buscarProducto(sql);
        return listp;
    }
    
    public LinkedList<Producto> consultarProductosVendedor(String id) {
        String sql = "SELECT idProducto,nombreProducto,fotoProducto,referenciaProducto,valorProducto,descripcionProducto,idTiendaPF,idTipoPF FROM (productos\n" +
        "JOIN tiendas ON (productos.idTiendaPF = tiendas.idTienda)\n" +
        "JOIN clientesvendedor ON(clientesvendedor.identificacionC = tiendas.identificacionCVF))\n" +
        "WHERE identificacionC = '"+ id +"';";
        Producto p = new Producto();
        LinkedList<Producto> listap = p.buscarProducto(sql);
        return listap;
    }
        
    public boolean insertarProducto(Producto objp) {
        boolean t=false;
        Producto objp2 = new Producto();
        String sql="";
        sql="INSERT INTO productos (nombreProducto,fotoProducto,referenciaProducto,valorProducto,descripcionProducto,idTiendaPF,idTipoPF) VALUES(?,?,?,?,?,?,?)";
        t = objp2.insertProducto(objp, sql);
        return t;
    }

    public boolean eliminarTipoProducto(int idProducto) {
        boolean t = false;
        Producto p = new Producto();
        String sql = "DELETE FROM productos WHERE(idProducto = '" + idProducto + "');";
        t = p.eliminarProducto(sql);
        return t;
    }

    public boolean actualizarProducto(String nombre, String referencia, double valorproducto, String descripcion, int idTienda, int idTipo, int id) {
        boolean t = false;
        Producto getobjeto = new Producto();
        String sql = "UPDATE productos SET nombreProducto = '"+ nombre +"', referenciaProducto = '"+ referencia +"', valorProducto = '"+ valorproducto +"', descripcionProducto = '"+ descripcion +"', idTiendaPF = '"+ idTienda +"', idTipoPF = '"+ idTipo +"' WHERE (idProducto = '"+ id +"');";
        t = getobjeto.actualizarProducto(sql);

        return t;
    }

    
}
