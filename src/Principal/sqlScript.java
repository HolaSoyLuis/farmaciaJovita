/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Login.Conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis-PC
 */
public class sqlScript implements Conexion{
    public static void EnterClient(String nit, String nombre){
        String sql = "insert into farmacia.cliente(Nit, Nombre) values(?, ?)";
        ResultSet rs = null;
        PreparedStatement pst=null;
        try {
            pst =conn.getConn().prepareStatement(sql);
            pst.setString(1, nit);
            pst.setString(2, nombre);
            rs=pst.executeQuery();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al ingresar el cliente\n" + e.getMessage());
        }
    }
}
