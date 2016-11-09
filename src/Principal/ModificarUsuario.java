/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
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

public class ModificarUsuario extends javax.swing.JInternalFrame {
    
        public ModificarUsuario() {
        setTitle("Modificar Usuario");
                       //Aplicar LookAndFeel nimbus para poner las ventanas transparentes
        try {
            UIManager.setLookAndFeel(new McLaFNimbus());
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
        initComponents();
        
    }

    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(new Color(0, 163, 136, 150));
        g.fillRoundRect(0, 0, getWidth(), getHeight(), 14, 14);
    }

    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTrepetirContraseña = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox();
        jTcontraseña = new javax.swing.JTextField();
        jBeliminar = new javax.swing.JButton();
        jBagregar = new javax.swing.JButton();
        jBmodificar = new javax.swing.JButton();
        jBguardar = new javax.swing.JButton();
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

        jTrepetirContraseña.setForeground(new java.awt.Color(204, 204, 255));
        jTrepetirContraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTrepetirContraseña.setText("Repetir Nueva Contraseña");
        jTrepetirContraseña.setBorder(null);
        jTrepetirContraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTrepetirContraseñaMouseClicked(evt);
            }
        });
        jTrepetirContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTrepetirContraseñaActionPerformed(evt);
            }
        });
        getContentPane().add(jTrepetirContraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 200, 210, 30));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Usuario 1", "Usuario 2", "Usuario 3", "Usuario 4", "Usuario 5" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 80, 210, 30));

        jTcontraseña.setForeground(new java.awt.Color(204, 204, 255));
        jTcontraseña.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTcontraseña.setText("Nueva Contraseña");
        jTcontraseña.setBorder(null);
        jTcontraseña.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTcontraseñaMouseClicked(evt);
            }
        });
        getContentPane().add(jTcontraseña, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 140, 210, 30));

        jBeliminar.setText("ELIMINAR US");
        jBeliminar.setAlignmentY(0.0F);
        jBeliminar.setBorder(null);
        getContentPane().add(jBeliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 260, 120, 40));

        jBagregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesMenu/UC/agregar.png"))); // NOI18N
        jBagregar.setAlignmentY(0.0F);
        jBagregar.setBorder(null);
        jBagregar.setBorderPainted(false);
        jBagregar.setContentAreaFilled(false);
        jBagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBagregarActionPerformed(evt);
            }
        });
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
        getContentPane().add(jBguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesMenu/UC/add usuarios.jpg"))); // NOI18N
        jLabel1.setAlignmentY(0.0F);
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 360, 320));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTcontraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTcontraseñaMouseClicked
        // Mouse
        this.jTcontraseña.setText(null);
        jTcontraseña.setForeground(Color.black);
    }//GEN-LAST:event_jTcontraseñaMouseClicked

    private void jTrepetirContraseñaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTrepetirContraseñaMouseClicked
        // Mouse
        this.jTrepetirContraseña.setText(null);
        jTrepetirContraseña.setForeground(Color.black);
    }//GEN-LAST:event_jTrepetirContraseñaMouseClicked

    private void jTrepetirContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTrepetirContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTrepetirContraseñaActionPerformed

    private void jBagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBagregarActionPerformed
        // Agregar
        AgregarUsuario1 au= new AgregarUsuario1();
        Inicio.jDesktopPane1.add(au);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = au.getSize();
        au.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        au.show();
        dispose();
        
    }//GEN-LAST:event_jBagregarActionPerformed

    private void jBmodificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBmodificarActionPerformed
        // Modificar

        
    }//GEN-LAST:event_jBmodificarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBagregar;
    private javax.swing.JButton jBeliminar;
    private javax.swing.JButton jBguardar;
    private javax.swing.JButton jBmodificar;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JTextField jTcontraseña;
    private javax.swing.JTextField jTrepetirContraseña;
    // End of variables declaration//GEN-END:variables
}
