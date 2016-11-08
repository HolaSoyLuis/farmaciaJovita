
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Login;

import Principal.Inicio;
import com.sun.awt.AWTUtilities;
import static java.lang.Thread.sleep;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import splashface.SplashScreen;

/**
 *
 * @author YO
 */
public class Login extends javax.swing.JFrame implements Conexion{

    /**
     * Creates new form Login
     */
ResultSet rs = null;
PreparedStatement pst=null;
 String Pass="";

    public Login() {
        this.setUndecorated(true);
        initComponents();
        this.setLocationRelativeTo(this);
        AWTUtilities.setWindowOpaque(this, false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUsuario = new javax.swing.JTextField();
        txtPasswor = new javax.swing.JPasswordField();
        jBEntrar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(359, 242));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUsuario.setFont(new java.awt.Font("Aaargh", 1, 14)); // NOI18N
        txtUsuario.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUsuario.setAlignmentX(0.0F);
        txtUsuario.setAlignmentY(0.0F);
        txtUsuario.setBorder(null);
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 50, 230, 30));

        txtPasswor.setFont(new java.awt.Font("Aaargh", 1, 14)); // NOI18N
        txtPasswor.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtPasswor.setAlignmentX(0.0F);
        txtPasswor.setAlignmentY(0.0F);
        txtPasswor.setBorder(null);
        txtPasswor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPassworActionPerformed(evt);
            }
        });
        getContentPane().add(txtPasswor, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 110, 230, 30));

        jBEntrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/ENTRAR.png"))); // NOI18N
        jBEntrar.setBorder(null);
        jBEntrar.setContentAreaFilled(false);
        jBEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEntrarActionPerformed(evt);
            }
        });
        getContentPane().add(jBEntrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 170, 140, 40));

        jBSalir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/SALIR.png"))); // NOI18N
        jBSalir.setBorder(null);
        jBSalir.setContentAreaFilled(false);
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });
        getContentPane().add(jBSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 170, 140, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Login/Login2.png"))); // NOI18N
        jLabel1.setAlignmentY(0.0F);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 250));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_jBSalirActionPerformed

    private void jBEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEntrarActionPerformed
        // TODO add your handling code here:
        //ESTE ES EL BOTON PARA INGRESAR EL LOGIIN\
        
        //un rapidin
        //Otro Rapidin
        get_md5(this.txtPasswor.getText()); // LLama al metodo para encriptar
        this.validar();
    }//GEN-LAST:event_jBEntrarActionPerformed

    private void txtPassworActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPassworActionPerformed
        // TODO add your handling code here:
        get_md5(this.txtPasswor.getText()); // LLama al metodo para encriptar
        validar();
    }//GEN-LAST:event_txtPassworActionPerformed

     public void validar ()
    {
         String sql="select * from farmacia.usuario where NombreUsuario =? and Contrasenia =?  ";
    try{
        int count=0;
    pst =conn.getConn().prepareStatement(sql);
    pst.setString(1, this.txtUsuario.getText());
    pst.setString(2, this.Pass);
   
    rs=pst.executeQuery();
    
    while(rs.next()){
    count=count+1;
    }
               if(count==1){
    JOptionPane.showMessageDialog(null, "BIENVENIDO");
//    Principal p = new Principal();
//    p.setVisible(true);
        cu.setName(txtUsuario.getText());
        cu.setPass(this.Pass);
        Inicio ini = new Inicio();
        ini.setVisible(true);
        this.dispose();
               }
               else {
                   JOptionPane.showMessageDialog(null, "Usuario y contraseña incorrecto");
               }
                   
            pst.close();
    }catch(Exception e){
         JOptionPane.showMessageDialog(null, "error");
    }
    }//Finaliza funcion validar
     
     
     
      public String get_md5(String CadenaOriginal){
 
       
        try {
            if (!CadenaOriginal.equalsIgnoreCase("")) {
 
                MessageDigest md = MessageDigest.getInstance("MD5");
                md.reset();
                md.update(CadenaOriginal.getBytes());
                byte bytes[] = md.digest();
                StringBuilder sb = new StringBuilder();
                for (int i = 0; i < bytes.length; i++) {
                    String hex = Integer.toHexString(0xff & bytes[i]);
                    if (hex.length() == 1) {
                        sb.append('0');
                    }
                    sb.append(hex);
                }
 
                this.Pass = sb.toString();
            }
        } catch (NoSuchAlgorithmException e) {
            this.Pass = "Error inesperado";
 
        }
        return this.Pass;
 
    }//Finaliza metodo para obtener md5+
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEntrar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField txtPasswor;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
