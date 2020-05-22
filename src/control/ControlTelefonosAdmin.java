/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.util.LinkedList;
import modelo.TelefonosAdmin;

/**
 *
 * @author Nicolas Alexander
 */
public class ControlTelefonosAdmin {
    
    
    
    public boolean insertarTelefonosAdmin(LinkedList<TelefonosAdmin> listaTelefonos) {
        boolean t=false;
        TelefonosAdmin objc=new TelefonosAdmin();
        for (int i = 0; i < listaTelefonos.size(); i++) {
            TelefonosAdmin get = listaTelefonos.get(i);
            String sql="insert into telefonosadmin(numTelefono) value('"+get.getNumTelefono()+"');";
            
            t=objc.insertarTelefonosAdmin(sql);
        }
        
        return t;
                       
    }
    
     public boolean eliminarTelefonosA(String listaTA) {

        boolean t = false;
        TelefonosAdmin getobjeto = new TelefonosAdmin();
        String sql = "DELETE FROM telefonosadmin WHERE(numTelefono = '" + listaTA+ "');";
        t = getobjeto.eliminarTelefonosAdmin(sql);

        return t;
    }
     
      public LinkedList<TelefonosAdmin> consultarTelefonosAdmin(String id) {

        String sql = "SELECT * FROM telefonosadmin WHERE idTelefonosA = '"+ id +"';";
        TelefonosAdmin objclasi = new TelefonosAdmin();
        LinkedList<TelefonosAdmin> listac = objclasi.consultarTelefonosAdmin(sql);
        return listac;
    }
}
