/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Login.ConexionJava;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author werner
 */
public class Stock extends Usuario {
 
     String Categoria="";
     Integer idCategoria=0;
     String sql="";
     DefaultTableModel modelo = new DefaultTableModel();
      public Integer conteo=0;

    
    public Stock() {
    }
    
   
    
    public Integer getConteo() {
                return conteo;
           }
    
    public void ingresar_Categoria(String c){
       this.Categoria=c;
        String sql="insert into categoria(Nombre) values(?)";
         try{
    pst =conn.prepareStatement(sql);
    //pst.setInt(1, Integer.parseInt(this.txt_id.getText()));
    pst.setString(1, this.Categoria);
        
       // rs=pst.executeQuery()txt_dob;
    pst.execute();
    pst.close();
    
    JOptionPane.showMessageDialog(null, "Saved");
    //administrator_windows_JForm s = new administrator_windows_JForm();
    //s.setVisible(true);
                      
    }catch(Exception e)
    {
           JOptionPane.showMessageDialog(null, e);
    }      // insert(ConexionJava.Conectar(), this.txt_id.getText(),this.txt_Nombre.getText());
    }//Finaliza ingresar categoria
    
   
//Muestra los articulos 
   public void Mostrar(String sql){
       this.sql=sql;
         pst = null;
         rs = null;
               try {
            pst = ConexionJava.Conectar().prepareStatement(sql);
            rs = pst.executeQuery();
            modelo = (DefaultTableModel) DbUtils.resultSetToTableModel(rs);
                  
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Fatal Error D:");
        }
   }//Finaliza Mostrar Articulo 
    
    
     //OBTIENE EL RESULTADO DE LA CANTIDAD DE ARTICULOS QUE ESTAN PROXIMOS A VENCER
    public void obteneridArticulosPorVencer(String sql){
       
           try{
                pst= conn.prepareStatement(sql);
                rs=pst.executeQuery();
//              JOptionPane.showMessageDialog(null, tmp);
                    while(rs.next()){
                     this.conteo=rs.getInt("conteo");
//                          System.out.println("Resultado = "+this.conteo); //Muestra el numero de productos registados en  la base de datos
         
    }//Termina el while
        }catch(Exception e){
        
        }
    }//Finaliza Obtener Usuario
   
   
}//Finaliza Stock

