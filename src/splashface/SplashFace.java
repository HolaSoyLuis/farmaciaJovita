
package splashface;

import Login.Login;
import Principal.Inicio;
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
        l.setLocationRelativeTo(null);
        l.setVisible(true);
    }
    
}
