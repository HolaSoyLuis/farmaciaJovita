/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;
/**
 *
 * @author Luis-PC
 */
public interface Conexion {
    Connect conn = new Connect(ConexionJava.Conectar());
    CurrentUser cu = new CurrentUser("","");
}
