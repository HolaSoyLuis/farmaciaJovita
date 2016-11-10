/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import javax.swing.JOptionPane;

/**
 *
 * @author werner
 */
public class User extends Usuario {
    
   public Integer conteo=0;

    public Integer getConteo() {
                return conteo;
           }
    
    
    //OBTIENE EL RESULTADO DE LA CANTIDAD DE USUARIOS EXISTENTES EN LA BASE DE DATOS
    public void obteneridUsuario(String sql){
       
           try{
                pst= conn.prepareStatement(sql);
                rs=pst.executeQuery();
//              JOptionPane.showMessageDialog(null, tmp);
                    while(rs.next()){
                     this.conteo=rs.getInt("conteo");
//                          System.out.println("Resultado = "+this.conteo); //Muestra el numero de usuarios registrados en la base de datos
              //   System.out.println(s.idCategoria);
    }//Termina el while
        }catch(Exception e){
        System.out.println("Error "+e);
        }
    }//Finaliza Obtener 
    
    
    //INGRESAR USUARIO CON PROCEDIMIENTO ALMACENADO
    public void IngresarUsuario(String sql,String user, String pass,String tipo){
        this.Usuario=user;
        this.Contrasenia=pass;
        this.Tipo=tipo;
        
        try{
            pst = conn.prepareStatement(sql);
            pst.setString(1, user);
            pst.setString(2, pass);
            pst.setString(3, tipo);
            rs = pst.executeQuery();
            JOptionPane.showMessageDialog(null, "Saved");
        pst.close();
        rs.close();
        }catch(Exception e){
            System.out.println("Error "+e);
        }
       
    }//Finaliza ingresar usuario
    
}
