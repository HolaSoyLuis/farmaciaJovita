package Principal;

import static Principal.Inicio.jDesktopPane1;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JInternalFrame;
import javax.swing.UIManager;

/**
 *
 * @author MP
 */
public class AgregarUsuario1 extends javax.swing.JInternalFrame {

 
    public AgregarUsuario1() {
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
        g.setColor(new Color(0, 163, 136, 150));
        g.fillRoundRect(0, 0, getWidth(), getHeight(), 14, 14);
    }
    
    Usuario u= new Usuario(); //Crea un nuevo objeto de la clase usuario





    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox<String>();
        txtUser = new javax.swing.JTextField();
        jBagregar = new javax.swing.JButton();
        jBmodificar = new javax.swing.JButton();
        txtContrasenia = new javax.swing.JPasswordField();
        jBguardar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBorder(null);
        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jComboBox1.setBackground(new java.awt.Color(240, 240, 245));
        jComboBox1.setEditable(true);
        jComboBox1.setForeground(new java.awt.Color(204, 204, 255));
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "admin", "Vendedor" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 140, 250, 40));

        txtUser.setForeground(new java.awt.Color(204, 204, 255));
        txtUser.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtUser.setText("Nombre de Usuario");
        txtUser.setBorder(null);
        txtUser.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtUserMouseClicked(evt);
            }
        });
        getContentPane().add(txtUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 210, 30));

        jBagregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesMenu/UC/agregar.png"))); // NOI18N
        jBagregar.setAlignmentY(0.0F);
        jBagregar.setBorder(null);
        jBagregar.setBorderPainted(false);
        jBagregar.setContentAreaFilled(false);
        getContentPane().add(jBagregar, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        jBmodificar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesMenu/UC/modificar.png"))); // NOI18N
        jBmodificar.setAlignmentY(0.0F);
        jBmodificar.setAutoscrolls(true);
        jBmodificar.setBorder(null);
        jBmodificar.setBorderPainted(false);
        jBmodificar.setContentAreaFilled(false);
        jBmodificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBmodificarActionPerformed(evt);
            }
        });
        getContentPane().add(jBmodificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 0, -1, -1));

        txtContrasenia.setForeground(new java.awt.Color(204, 204, 255));
        txtContrasenia.setBorder(null);
        getContentPane().add(txtContrasenia, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 200, 250, 30));

        jBguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesMenu/UC/Guardar.png"))); // NOI18N
        jBguardar.setAlignmentY(0.0F);
        jBguardar.setBorder(null);
        jBguardar.setBorderPainted(false);
        jBguardar.setContentAreaFilled(false);
        jBguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarActionPerformed(evt);
            }
        });
        getContentPane().add(jBguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 260, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesMenu/UC/add usuarios.jpg"))); // NOI18N
        jLabel1.setAlignmentY(0.0F);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtUserMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtUserMouseClicked
        // Mouse
        this.txtUser.setText(null);
        txtUser.setForeground(Color.black);
    }//GEN-LAST:event_txtUserMouseClicked

    private void jBmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmodificarActionPerformed
        // Agregar
        ModificarUsuario mu= new ModificarUsuario();
        Inicio.jDesktopPane1.add(mu);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = mu.getSize();
        mu.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        mu.show();
        dispose();
    }//GEN-LAST:event_jBmodificarActionPerformed

    private void jBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarActionPerformed
        u.ingresar_usuario(this.txtUser.getText(), this.txtContrasenia.getText(), this.jComboBox1.getSelectedItem().toString());
        // TODO add your handling code here:
    }//GEN-LAST:event_jBguardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBagregar;
    private javax.swing.JButton jBguardar;
    private javax.swing.JButton jBmodificar;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPasswordField txtContrasenia;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables

}
