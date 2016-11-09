/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Login.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author Luis-PC
 */
public class articulo{
    public static void insertarBase(Connection conn, String nombre, String cantidadMinima, Integer categoria, String lote, String fecha, Double precioCompra, Double precioVenta, String descripcion, String codigoBarras, String cantidad){ 
        ResultSet rs = null;
        PreparedStatement pst=null;
        String sentence = "insert into farmacia.articulo(NombreArticulo, Cantidad_Minima, Categoria_idCategoria, Lote, Fecha_Vencimiento, PrecioCompra, PrecioVenta, Descripcion, CodigoBarras, Cantidad) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try {
            pst = conn.prepareStatement(sentence);
            pst.setString(1, nombre);
            pst.setString(2, String.valueOf(cantidadMinima));
            
            pst.setString(3, String.valueOf(categoria));
            
            pst.setString(4, lote);
            pst.setString(5, fecha);
            pst.setString(6, String.valueOf(precioCompra));
            pst.setString(7, String.valueOf(precioVenta));
            pst.setString(8, descripcion);
            pst.setString(9, codigoBarras);
            pst.setString(10, cantidad);
            pst.execute();
            pst.close();
            JOptionPane.showMessageDialog(null, "Your product is added\n");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Your product isn't added\n" + e.getMessage());
        }
    }
}
