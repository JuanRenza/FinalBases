/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import control.BaseDatos;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.LinkedList;

/**
 *
 * @author joseb
 */
public class Pedido {
    private int idPedido; 					
    private String valorTotalPedido;
    private String fechaPedido;
    private String estadoVenta;
    private String nombrePersonaPedido;
    private int idUsuarioP;

    public Pedido() {
    }

    public Pedido(int idPedido, String valorTotalPedido, String fechaPedido, String estadoVenta, String nombrePersonaPedido, int idUsuarioP) {
        this.idPedido = idPedido;
        this.valorTotalPedido = valorTotalPedido;
        this.fechaPedido = fechaPedido;
        this.estadoVenta = estadoVenta;
        this.nombrePersonaPedido = nombrePersonaPedido;
        this.idUsuarioP = idUsuarioP;
    }

    public int getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(int idPedido) {
        this.idPedido = idPedido;
    }

    public String getValorTotalPedido() {
        return valorTotalPedido;
    }

    public void setValorTotalPedido(String valorTotalPedido) {
        this.valorTotalPedido = valorTotalPedido;
    }

    public String getFechaPedido() {
        return fechaPedido;
    }

    public void setFechaPedido(String fechaPedido) {
        this.fechaPedido = fechaPedido;
    }

    public String getEstadoVenta() {
        return estadoVenta;
    }

    public void setEstadoVenta(String estadoVenta) {
        this.estadoVenta = estadoVenta;
    }

    public String getNombrePersonaPedido() {
        return nombrePersonaPedido;
    }

    public void setNombrePersonaPedido(String nombrePersonaPedido) {
        this.nombrePersonaPedido = nombrePersonaPedido;
    }

    public int getIdUsuarioP() {
        return idUsuarioP;
    }

    public void setIdUsuarioP(int idUsuarioP) {
        this.idUsuarioP = idUsuarioP;
    }

    @Override
    public String toString() {
        return "Pedido{" + "idPedido=" + idPedido + ", valorTotalPedido=" + valorTotalPedido + ", fechaPedido=" + fechaPedido + ", estadoVenta=" + estadoVenta + ", nombrePersonaPedido=" + nombrePersonaPedido + ", idUsuarioP=" + idUsuarioP + '}';
    }
    
    public boolean eliminarPedido(String sql) {
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
    
    public LinkedList<Pedido> consultarPedido(String sql) {
        
        LinkedList<Pedido> lp = new LinkedList<>();
        BaseDatos objb = new BaseDatos();
        int idPedido = 0;
        String valorTotalPedido = "";
        String fechaPedido = "";
        String estadoVenta = "";
        String nombrePersonaPedido = "";
        int idUsuarioP = 0;
        ResultSet rs = null;
        
        if (objb.crearConexion()) {
            try {
                Statement sentencia = objb.getConexion().createStatement();
                rs = sentencia.executeQuery(sql);
                 while (rs.next()) {
                     idPedido = rs.getInt(idPedido);
                    valorTotalPedido = rs.getString("valorTotalPedido");
                    fechaPedido = rs.getString("fechaPedido");
                    estadoVenta = rs.getString("estadoVenta");
                    nombrePersonaPedido = rs.getString("nombrePersonaPedido");   
                    idUsuarioP = rs.getInt(idUsuarioP);
                               
                    lp.add(new Pedido(idPedido, valorTotalPedido, fechaPedido, estadoVenta, nombrePersonaPedido, idUsuarioP));
                }
            } catch (SQLException ex) {
                ex.printStackTrace();

            }
        }
        return lp;
        }
    
}
