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
public class Usuario {
    Connection conn = null;
ResultSet rs = null;
PreparedStatement pst=null;

String Usuario;
String Contrasenia;
String Tipo;
    public Usuario() {
         conn= ConexionJava.Conectar();
    }//Finaliza el constructor
    
    
    
public void ingresar_usuario(String u, String c,String t){
    this.Usuario=u;
    this.Contrasenia=c;
    this.Tipo=t;
    
    String sql="insert into usuario(NombreUsuario,Contrasenia,Tipo) values(?,md5(?),?)";
         try{
    pst =conn.prepareStatement(sql);
    //pst.setInt(1, Integer.parseInt(this.txt_id.getText()));
    pst.setString(1, this.Usuario);
    pst.setString(2, this.Contrasenia);
    pst.setString(3, this.Tipo);
       
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
    }//Finaliza ingresar usuario
    
    
    

}//Finaliza la clase usuario
