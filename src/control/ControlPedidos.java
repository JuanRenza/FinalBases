/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import modelo.Pedido;

/**
 *
 * @author joseb
 */
public class ControlPedidos {
     public boolean eliminarPedido(String idPedido) {
        boolean t = false;
         Pedido p = new Pedido();
        String sql = "DELETE FROM pedidos WHERE(idPedido = '" + idPedido + "');";
        t = p.eliminarPedido(sql);
        return t;
    }
     
      public LinkedList<Pedido> consultarFechas(String fecha1, String fecha2){
        String sql = "SELECT * FROM pedidos WHERE fechaNac BETWEEN '"+ fecha1 +"' AND '"+ fecha2 +"';";
        Pedido objclasi = new Pedido();
        LinkedList<Pedido> listap = objclasi.consultarPedido(sql);
        return listap;
    }
}
