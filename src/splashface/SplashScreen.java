/*
 * Presentacion splash del programa
 * Figura un cargo del sistema
 */
package splashface;

import Principal.Inicio;
import com.sun.awt.AWTUtilities;
import java.awt.image.ImageObserver;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author YO
 */
public class SplashScreen extends javax.swing.JFrame{
    public SplashScreen() {
        initComponents();
        AWTUtilities.setWindowOpaque(this, false);
        
        new Thread(){
            
            public void run(){
                for (int i = 0; i < 101; i++) {
                   try{
                      sleep(40);
                      jProgressBar1.setValue(i);
                      
                       if (jProgressBar1.getValue()<=40) {
                           Cargando.setText("Cargando Base de Datos");
                                                    
                       }else if (jProgressBar1.getValue()<=70) {
                           Cargando.setText("Cargando Sistema");
                       }else{
                           Cargando.setText("Iniciando Sistema");
                       }
                      
                   }catch(InterruptedException ex){
                       Logger.getLogger(SplashScreen.class.getName()).log(Level.SEVERE, null, ex);
                   } 
                }
            }     
        }.start();
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        CorazonSplash = new javax.swing.JLabel();
        Cargando = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(null);

        jProgressBar1.setFont(new java.awt.Font("Tahoma", 2, 10)); // NOI18N
        jProgressBar1.setBorderPainted(false);
        jProgressBar1.setFocusable(false);
        jProgressBar1.setName("jProgressBar"); // NOI18N
        getContentPane().add(jProgressBar1);
        jProgressBar1.setBounds(90, 280, 10, 0);

        CorazonSplash.setIcon(new javax.swing.ImageIcon(getClass().getResource("/splashface/Images/SplashFace.gif"))); // NOI18N
        getContentPane().add(CorazonSplash);
        CorazonSplash.setBounds(0, 0, 510, 490);

        Cargando.setFont(new java.awt.Font("Acid", 3, 24)); // NOI18N
        Cargando.setForeground(new java.awt.Color(255, 255, 255));
        Cargando.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Cargando.setAlignmentY(0.0F);
        Cargando.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        getContentPane().add(Cargando);
        Cargando.setBounds(170, 354, 190, 20);

        setSize(new java.awt.Dimension(517, 495));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents


    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SplashScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SplashScreen().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Cargando;
    private javax.swing.JLabel CorazonSplash;
    private javax.swing.JProgressBar jProgressBar1;
    // End of variables declaration//GEN-END:variables
}
