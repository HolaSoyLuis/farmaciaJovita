/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author werner
 */
public class ConexionJava {
public static Connection conn=null;
             
    public static Connection Conectar(){
        
        try{
             Class.forName("com.mysql.jdbc.Driver").newInstance(); 
                
             //conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/farmacia?"+"user=root&password=01234");
             //conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/farmacia?"+"user=root&password=root");
             conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/farmacia?"+"user=root&password=Gloria.");
       //  JOptionPane.showMessageDialog(null, "Conexion exitosa");
             
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error en la conexion");
            
        }
            
        return conn;
    }
    
    
    
}//Finaliza la clase conexion


