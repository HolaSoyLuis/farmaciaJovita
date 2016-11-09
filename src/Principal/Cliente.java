/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Login.ConexionJava;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author werner
 */

public class Cliente {
        Connection conn = null;
        ResultSet rs = null;
        PreparedStatement pst=null;
        
        String nombre;
        String nit;
        String telefono;

    public Cliente() {
        conn= ConexionJava.Conectar();
    }//Constructor
        
    public void ingresar_cliente(String nit, String nombre,String telefono ){
        this.nit=nit;
        this.nombre=nombre;
        this.telefono=telefono;
        
        String sql="insert into cliente(Nit,Nombre,telefono) values (?, ?, ?)";
         try{
    pst =conn.prepareStatement(sql);
    //pst.setInt(1, Integer.parseInt(this.txt_id.getText()));
    pst.setString(1, this.nit);
    pst.setString(2, this.nombre);
    pst.setString(3, this.telefono);
       
       // rs=pst.executeQuery()txt_dob;
    pst.execute();
    pst.close();
    
    JOptionPane.showMessageDialog(null, "Saved");
    //administrator_windows_JForm s = new administrator_windows_JForm();
    //s.setVisible(true);
                      
    }catch(Exception e)
    {
           JOptionPane.showMessageDialog(null, e);

    }

      // insert(ConexionJava.Conectar(), this.txt_id.getText(),this.txt_Nombre.getText());
    }
    
}//Finaliza la clase
