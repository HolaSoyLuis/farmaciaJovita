
package splashface;

import Login.AgregarUsuarioInicio;
import Login.Login;
import Principal.AgregarUsuario1;
import Principal.Inicio;
import Principal.User;
import static java.lang.Thread.sleep;

/**
 *
 * @author YO
 */
public class SplashFace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws InterruptedException {
        
        SplashScreen ss= new SplashScreen();
        ss.setLocationRelativeTo(null);
        ss.setVisible(true);
        
        sleep (5000);
        ss.dispose();
        
        
        Login l = new Login();
       
        
              
        User u = new User();
        AgregarUsuarioInicio us= new AgregarUsuarioInicio();
        String sql= "select Count(idUsuario) as conteo from usuario";
        u.obteneridUsuario(sql);
        
        
        //SI LA CANTIDAD DE USUARIOS ES MENOR A UNO LLAMA A REGISTRAR USUARIO SI NO A LOGIN
        if(u.getConteo()<1){
        
        us.setVisible(true);
            System.out.println("conteoo ="+u.getConteo());
        
        }else{
             l.setLocationRelativeTo(null);
             l.setVisible(true);
        }
        
    }
    
}
