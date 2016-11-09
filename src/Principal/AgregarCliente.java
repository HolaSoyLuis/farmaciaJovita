
package Principal;

import static Principal.Inicio.jDesktopPane1;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.UIManager;

/**
 *
 * @author YO
 */
public class AgregarCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form AgregarUsuario
     */
    public AgregarCliente() {
                //Aplicar LookAndFeel nimbus para poner las ventanas transparentes
        try {
            UIManager.setLookAndFeel(new McLaFNimbus());
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
        initComponents();
      
    }
    Usuario u= new Usuario(); //Crea un nuevo objeto de la clase usuario
    Cliente c= new Cliente(); //Crea un nuevo ogjeto de la clase Cliente
      //CAMBIAR EL ASPECTO DEL JINTERNALFRAME "TRANSPARENTE"
    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(new Color(0, 163, 136, 150));
        g.fillRoundRect(0, 0, getWidth(), getHeight(), 14, 14);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtTelefono = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        txtNit = new javax.swing.JTextField();
        jBagregar = new javax.swing.JButton();
        jBmodificar = new javax.swing.JButton();
        jBguardar = new javax.swing.JButton();
        txtNombre = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setBorder(null);
        setClosable(true);
        setAlignmentX(0.0F);
        setAlignmentY(0.0F);
        setFrameIcon(null);
        setMaximumSize(new java.awt.Dimension(358, 326));
        setMinimumSize(new java.awt.Dimension(358, 326));
        setPreferredSize(new java.awt.Dimension(358, 326));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtTelefono.setForeground(new java.awt.Color(204, 204, 255));
        txtTelefono.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtTelefono.setText("Telefono");
        txtTelefono.setBorder(null);
        txtTelefono.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtTelefonoMouseClicked(evt);
            }
        });
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, 210, 30));

        jPanel1.setBackground(new java.awt.Color(240, 240, 245));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 130, 50, 110));

        txtNit.setForeground(new java.awt.Color(204, 204, 255));
        txtNit.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNit.setText("Nit de Cliente");
        txtNit.setBorder(null);
        txtNit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNitMouseClicked(evt);
            }
        });
        getContentPane().add(txtNit, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 210, 30));

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

        txtNombre.setForeground(new java.awt.Color(204, 204, 255));
        txtNombre.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        txtNombre.setText("Nombre Cliente");
        txtNombre.setBorder(null);
        txtNombre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtNombreMouseClicked(evt);
            }
        });
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 140, 210, 30));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesMenu/UC/add usuarios.jpg"))); // NOI18N
        jLabel1.setAlignmentY(0.0F);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 320));

        setBounds(450, 200, 358, 372);
    }// </editor-fold>//GEN-END:initComponents

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

        c.ingresar_cliente(this.txtNit.getText(), this.txtNombre.getText(), this.txtTelefono.getText()); 
//        u.ingresar_usuario(this.txtUser.getText(), this.txtContrasenia.getText(), this.jComboBox1.getSelectedItem().toString());
        // TODO add your handling code here:
    }//GEN-LAST:event_jBguardarActionPerformed

    private void txtNitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNitMouseClicked
        // Mouse
        this.txtNit.setText(null);
        txtNit.setForeground(Color.black);
    }//GEN-LAST:event_txtNitMouseClicked

    private void txtTelefonoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtTelefonoMouseClicked
        // Mouse
        this.txtTelefono.setText(null);
        txtTelefono.setForeground(Color.black);
    }//GEN-LAST:event_txtTelefonoMouseClicked

    private void txtNombreMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtNombreMouseClicked
        this.txtNombre.setText(null);
        txtTelefono.setForeground(Color.black);
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNombreMouseClicked

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBagregar;
    private javax.swing.JButton jBguardar;
    private javax.swing.JButton jBmodificar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtNit;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    // End of variables declaration//GEN-END:variables
}
