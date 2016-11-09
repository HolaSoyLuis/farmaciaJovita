
package Principal;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.UIManager;

/**
 *
 * @author YO
 */
public class Acercade extends javax.swing.JInternalFrame {

   // Creates new form Acercade
   
    public Acercade() {
                //Aplicar LookAndFeel nimbus para poner las ventanas transparentes
        try {
            UIManager.setLookAndFeel(new McLaFNimbus());
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
        initComponents();
    }

  //CAMBIAR EL ASPECTO DEL JINTERNALFRAME "TRANSPARENTE"
    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(new Color(75, 100, 200, 150));
        g.fillRoundRect(0, 0, getWidth(), getHeight(), 14, 14);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();

        setBorder(null);
        setClosable(true);
        setAlignmentX(0.0F);
        setAlignmentY(0.0F);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setFrameIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesMenu/Menu.jpg"))); // NOI18N
        setMaximumSize(new java.awt.Dimension(489, 279));
        setMinimumSize(new java.awt.Dimension(489, 279));
        setName("Acerca de..."); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesMenu/Acerca de.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -2, 450, 280));
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
