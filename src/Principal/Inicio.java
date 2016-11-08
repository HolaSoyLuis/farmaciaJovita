/*
 * Inicio Punto de Venta conntendra un jdesktop + jinternalframe
 */
package Principal;
import Login.Conexion;
import java.awt.Dimension;
import java.awt.Image;
import java.awt.Toolkit;
import java.io.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.UIManager;


/**
 * @MegaProgramacion XD
 */
public class Inicio extends javax.swing.JFrame implements Conexion{


    public Inicio() {

        
        initComponents();
        this.setTitle("Menú Principal");
        Image icon = Toolkit.getDefaultToolkit().getImage(getClass().getResource("/ImagesMenu/icono.png"));
        setIconImage(icon);
        this.setExtendedState(MAXIMIZED_BOTH);
        this.mostrarHora();
        this.mostrarFecha();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        logoFondo = new javax.swing.JLabel();
        JMenuBar1 = new javax.swing.JMenuBar();
        jMarchivo = new javax.swing.JMenu();
        jMArticulos = new javax.swing.JMenuItem();
        jMClientes = new javax.swing.JMenuItem();
        jMCartera = new javax.swing.JMenuItem();
        jMgestion = new javax.swing.JMenu();
        jMenuItem9 = new javax.swing.JMenuItem();
        jMenuItem10 = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMstrock = new javax.swing.JMenu();
        jMVentas = new javax.swing.JMenuItem();
        jMenuItem12 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem14 = new javax.swing.JMenuItem();
        jMenuItem15 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem17 = new javax.swing.JMenuItem();
        jMenuItem18 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        Hora_txt = new javax.swing.JMenu();
        Fecha_txt = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoFondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/splashface/Images/fondo.png"))); // NOI18N

        jDesktopPane1.setLayer(logoFondo, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jDesktopPane1Layout = new javax.swing.GroupLayout(jDesktopPane1);
        jDesktopPane1.setLayout(jDesktopPane1Layout);
        jDesktopPane1Layout.setHorizontalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDesktopPane1Layout.createSequentialGroup()
                .addGap(325, 325, 325)
                .addComponent(logoFondo)
                .addContainerGap(395, Short.MAX_VALUE))
        );
        jDesktopPane1Layout.setVerticalGroup(
            jDesktopPane1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDesktopPane1Layout.createSequentialGroup()
                .addContainerGap(131, Short.MAX_VALUE)
                .addComponent(logoFondo, javax.swing.GroupLayout.PREFERRED_SIZE, 524, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(75, 75, 75))
        );

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, 730));

        JMenuBar1.setBackground(new java.awt.Color(0, 163, 136));
        JMenuBar1.setBorder(null);
        JMenuBar1.setForeground(new java.awt.Color(0, 163, 136));
        JMenuBar1.setAlignmentX(0.0F);
        JMenuBar1.setBorderPainted(false);

        jMarchivo.setBackground(new java.awt.Color(0, 169, 149));
        jMarchivo.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jMarchivo.setForeground(new java.awt.Color(0, 169, 149));
        jMarchivo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesMenu/archivo.jpg"))); // NOI18N
        jMarchivo.setAlignmentX(0.0F);
        jMarchivo.setAlignmentY(0.0F);
        jMarchivo.setContentAreaFilled(false);
        jMarchivo.setFocusable(false);
        jMarchivo.setRequestFocusEnabled(false);

        jMArticulos.setBackground(new java.awt.Color(0, 169, 150));
        jMArticulos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesMenu/articulos.jpg"))); // NOI18N
        jMArticulos.setAlignmentX(0.0F);
        jMArticulos.setAlignmentY(0.0F);
        jMArticulos.setBorder(null);
        jMArticulos.setContentAreaFilled(false);
        jMarchivo.add(jMArticulos);

        jMClientes.setBackground(new java.awt.Color(0, 169, 150));
        jMClientes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesMenu/clientes.jpg"))); // NOI18N
        jMClientes.setAlignmentX(0.0F);
        jMClientes.setAlignmentY(0.0F);
        jMClientes.setBorder(null);
        jMClientes.setContentAreaFilled(false);
        jMarchivo.add(jMClientes);

        jMCartera.setBackground(new java.awt.Color(0, 169, 150));
        jMCartera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesMenu/CarpetaReportes.jpg"))); // NOI18N
        jMCartera.setAlignmentX(0.0F);
        jMCartera.setAlignmentY(0.0F);
        jMCartera.setBorder(null);
        jMCartera.setContentAreaFilled(false);
        jMarchivo.add(jMCartera);

        JMenuBar1.add(jMarchivo);

        jMgestion.setBackground(new java.awt.Color(0, 169, 149));
        jMgestion.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jMgestion.setForeground(new java.awt.Color(0, 169, 149));
        jMgestion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesMenu/gestion.jpg"))); // NOI18N
        jMgestion.setAlignmentX(0.0F);
        jMgestion.setAlignmentY(0.0F);
        jMgestion.setContentAreaFilled(false);
        jMgestion.setFocusable(false);

        jMenuItem9.setBackground(new java.awt.Color(0, 169, 150));
        jMenuItem9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesMenu/IngresaUsuario.jpg"))); // NOI18N
        jMenuItem9.setAlignmentX(0.0F);
        jMenuItem9.setAlignmentY(0.0F);
        jMenuItem9.setBorder(null);
        jMenuItem9.setContentAreaFilled(false);
        jMenuItem9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem9ActionPerformed(evt);
            }
        });
        jMgestion.add(jMenuItem9);

        jMenuItem10.setBackground(new java.awt.Color(0, 169, 150));
        jMenuItem10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesMenu/IngresarCliente.jpg"))); // NOI18N
        jMenuItem10.setAlignmentX(0.0F);
        jMenuItem10.setAlignmentY(0.0F);
        jMenuItem10.setBorder(null);
        jMenuItem10.setContentAreaFilled(false);
        jMenuItem10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem10ActionPerformed(evt);
            }
        });
        jMgestion.add(jMenuItem10);

        jMenuItem1.setBackground(new java.awt.Color(0, 169, 150));
        jMenuItem1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesMenu/IngresarProveedor.jpg"))); // NOI18N
        jMenuItem1.setAlignmentX(0.0F);
        jMenuItem1.setAlignmentY(0.0F);
        jMenuItem1.setBorder(null);
        jMenuItem1.setContentAreaFilled(false);
        jMgestion.add(jMenuItem1);

        JMenuBar1.add(jMgestion);

        jMstrock.setBackground(new java.awt.Color(0, 169, 149));
        jMstrock.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jMstrock.setForeground(new java.awt.Color(0, 169, 149));
        jMstrock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesMenu/Strock.jpg"))); // NOI18N
        jMstrock.setAlignmentX(0.0F);
        jMstrock.setAlignmentY(0.0F);
        jMstrock.setContentAreaFilled(false);
        jMstrock.setFocusable(false);

        jMVentas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_F5, 0));
        jMVentas.setBackground(new java.awt.Color(0, 169, 150));
        jMVentas.setForeground(new java.awt.Color(254, 254, 254));
        jMVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesMenu/RealizarVenta.jpg"))); // NOI18N
        jMVentas.setAlignmentX(0.0F);
        jMVentas.setAlignmentY(0.0F);
        jMVentas.setBorder(null);
        jMVentas.setContentAreaFilled(false);
        jMVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMVentasActionPerformed(evt);
            }
        });
        jMstrock.add(jMVentas);

        jMenuItem12.setBackground(new java.awt.Color(0, 169, 150));
        jMenuItem12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesMenu/Promociones.jpg"))); // NOI18N
        jMenuItem12.setAlignmentX(0.0F);
        jMenuItem12.setAlignmentY(0.0F);
        jMenuItem12.setBorder(null);
        jMenuItem12.setContentAreaFilled(false);
        jMstrock.add(jMenuItem12);

        jMenuItem8.setBackground(new java.awt.Color(0, 169, 150));
        jMenuItem8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesMenu/IngresaStock.jpg"))); // NOI18N
        jMenuItem8.setAlignmentX(0.0F);
        jMenuItem8.setAlignmentY(0.0F);
        jMenuItem8.setBorder(null);
        jMenuItem8.setContentAreaFilled(false);
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jMstrock.add(jMenuItem8);

        JMenuBar1.add(jMstrock);

        jMenu1.setBackground(new java.awt.Color(0, 169, 149));
        jMenu1.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jMenu1.setForeground(new java.awt.Color(0, 169, 149));
        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesMenu/Registros.jpg"))); // NOI18N
        jMenu1.setAlignmentX(0.0F);
        jMenu1.setAlignmentY(0.0F);
        jMenu1.setContentAreaFilled(false);
        jMenu1.setFocusable(false);

        jMenuItem14.setBackground(new java.awt.Color(0, 169, 150));
        jMenuItem14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesMenu/ReporteVentas.jpg"))); // NOI18N
        jMenuItem14.setAlignmentX(0.0F);
        jMenuItem14.setAlignmentY(0.0F);
        jMenuItem14.setBorder(null);
        jMenuItem14.setContentAreaFilled(false);
        jMenu1.add(jMenuItem14);

        jMenuItem15.setBackground(new java.awt.Color(0, 169, 150));
        jMenuItem15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesMenu/ArticulosaVencer.jpg"))); // NOI18N
        jMenuItem15.setAlignmentX(0.0F);
        jMenuItem15.setAlignmentY(0.0F);
        jMenuItem15.setBorder(null);
        jMenuItem15.setContentAreaFilled(false);
        jMenuItem15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem15ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem15);

        JMenuBar1.add(jMenu1);

        jMenu2.setBackground(new java.awt.Color(0, 169, 149));
        jMenu2.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jMenu2.setForeground(new java.awt.Color(0, 169, 149));
        jMenu2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesMenu/herramientas.jpg"))); // NOI18N
        jMenu2.setAlignmentX(0.0F);
        jMenu2.setAlignmentY(0.0F);
        jMenu2.setContentAreaFilled(false);

        jMenuItem17.setBackground(new java.awt.Color(0, 169, 150));
        jMenuItem17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesMenu/CopiadeSeguridad.jpg"))); // NOI18N
        jMenuItem17.setAlignmentX(0.0F);
        jMenuItem17.setAlignmentY(0.0F);
        jMenuItem17.setBorder(null);
        jMenuItem17.setContentAreaFilled(false);
        jMenu2.add(jMenuItem17);

        jMenuItem18.setBackground(new java.awt.Color(0, 169, 150));
        jMenuItem18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesMenu/ReiniciarSistema.jpg"))); // NOI18N
        jMenuItem18.setAlignmentX(0.0F);
        jMenuItem18.setAlignmentY(0.0F);
        jMenuItem18.setBorder(null);
        jMenuItem18.setContentAreaFilled(false);
        jMenuItem18.setIconTextGap(2);
        jMenu2.add(jMenuItem18);

        JMenuBar1.add(jMenu2);

        jMenu3.setBackground(new java.awt.Color(0, 169, 149));
        jMenu3.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 0, 0, 0));
        jMenu3.setForeground(new java.awt.Color(0, 169, 149));
        jMenu3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesMenu/ayuda.jpg"))); // NOI18N
        jMenu3.setAlignmentX(0.0F);
        jMenu3.setAlignmentY(0.0F);
        jMenu3.setContentAreaFilled(false);

        jMenuItem5.setBackground(new java.awt.Color(0, 169, 150));
        jMenuItem5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesMenu/Manual de Usuario.jpg"))); // NOI18N
        jMenuItem5.setAlignmentX(0.0F);
        jMenuItem5.setAlignmentY(0.0F);
        jMenuItem5.setBorder(null);
        jMenuItem5.setContentAreaFilled(false);
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem5);

        jMenuItem6.setBackground(new java.awt.Color(0, 169, 150));
        jMenuItem6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesMenu/Contacto.jpg"))); // NOI18N
        jMenuItem6.setAlignmentX(0.0F);
        jMenuItem6.setAlignmentY(0.0F);
        jMenuItem6.setBorder(null);
        jMenuItem6.setContentAreaFilled(false);
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem6);

        jMenuItem7.setBackground(new java.awt.Color(0, 169, 150));
        jMenuItem7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesMenu/acerca de..._1.jpg"))); // NOI18N
        jMenuItem7.setAlignmentX(0.0F);
        jMenuItem7.setAlignmentY(0.0F);
        jMenuItem7.setBorder(null);
        jMenuItem7.setContentAreaFilled(false);
        jMenuItem7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenuItem7MouseClicked(evt);
            }
        });
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem7);

        JMenuBar1.add(jMenu3);

        jMenu4.setText("                                                                                             ");
        JMenuBar1.add(jMenu4);

        Hora_txt.setBackground(new java.awt.Color(0, 169, 149));
        Hora_txt.setForeground(new java.awt.Color(255, 255, 255));
        Hora_txt.setText("HoraInicio");
        Hora_txt.setFont(new java.awt.Font("Acid", 0, 18)); // NOI18N
        JMenuBar1.add(Hora_txt);

        Fecha_txt.setBackground(new java.awt.Color(0, 169, 149));
        Fecha_txt.setForeground(new java.awt.Color(255, 255, 255));
        Fecha_txt.setText("Fecha");
        Fecha_txt.setFont(new java.awt.Font("Acid", 0, 18)); // NOI18N
        JMenuBar1.add(Fecha_txt);

        setJMenuBar(JMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

        
    //Metodo para mostrar la fecha de hoy en menu inicio
    public void mostrarFecha(){
        Calendar c = new GregorianCalendar();
        int month = c.get(Calendar.MONTH);
         int year = c.get(Calendar.YEAR);
          int day = c.get(Calendar.DAY_OF_MONTH);
          
         this.Fecha_txt.setText(day+"/"+month+"/"+year);
         
         
    }// Finaliza Mostrar fecha
    
    
    //Muestra la hora actual del sistema en el menu inicio
    public void mostrarHora(){
        Calendar c = new GregorianCalendar();
       int Hora = c.get(Calendar.HOUR);
       int Minutos = c.get(Calendar.MINUTE);
       int Segundos = c.get(Calendar.SECOND);
       int Formato = c.get(Calendar.AM_PM);
               
      
       this.Hora_txt.setText(Hora+":"+Minutos+":"+Segundos);
    }//
    
    private void jMenuItem7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenuItem7MouseClicked
        // Llamar a jpanel acerca de...
        Acercade acd= new Acercade ();
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = acd.getSize();
        acd.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        jDesktopPane1.add(acd);
        acd.show();
    }//GEN-LAST:event_jMenuItem7MouseClicked

    private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed
                // BOTON VER MANUAL
            try {
            Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler "+"C:\\Users\\yomak\\Documents\\FarmaciaJovita23\\src\\Principal\\Ayuda.pdf");
            System.out.println("Final");
            } catch (IOException e) {
            JOptionPane.showMessageDialog(null, "No se puede abrir el archivo de ayuda,"
                    + "probablemente fue borrado","ERROR",JOptionPane.ERROR_MESSAGE);
            e.printStackTrace();
            }

    }//GEN-LAST:event_jMenuItem5ActionPerformed

    private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed
        // acerca de lol
        Acercade acd = new Acercade();
        this.jDesktopPane1.add(acd);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = acd.getSize();
        acd.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        acd.show();
    }//GEN-LAST:event_jMenuItem7ActionPerformed

    private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed
        Runtime aplicacion = Runtime.getRuntime();
        try {
            aplicacion.exec("C:/Windows/System32/cmd.exe /K start http://autofarm.pe.hu");
        } catch (Exception e) {
        }
        
    }//GEN-LAST:event_jMenuItem6ActionPerformed

    private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed
        // Ingresar Stock
         AñadirMercaderia is = new AñadirMercaderia();
         Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = is.getSize();
        is.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        this.jDesktopPane1.add(is);
        is.show();
    }//GEN-LAST:event_jMenuItem8ActionPerformed

    private void jMenuItem10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem10ActionPerformed
        // TODO add your handling code here:
        AgregarCliente au = new AgregarCliente();
        this.jDesktopPane1.add(au);    
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = au.getSize();
        au.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        au.show();
    }//GEN-LAST:event_jMenuItem10ActionPerformed

    private void jMenuItem9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem9ActionPerformed
        // Ingresar Usuario
         AgregarUsuario1 au = new AgregarUsuario1();
        this.jDesktopPane1.add(au);    
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = au.getSize();
        au.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        au.show();
        
    }//GEN-LAST:event_jMenuItem9ActionPerformed

    private void jMVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMVentasActionPerformed
        // Boton realizar ventas
         MenuVentas rv = new MenuVentas();
        this.jDesktopPane1.add(rv);
        rv.show();
    }//GEN-LAST:event_jMVentasActionPerformed

    private void jMenuItem15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem15ActionPerformed
      // ARTICULOS A VENCER
        ArticulosaVencer av = new ArticulosaVencer();
        this.jDesktopPane1.add(av);    
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = av.getSize();
        av.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        av.show();
    }//GEN-LAST:event_jMenuItem15ActionPerformed

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Fecha_txt;
    private javax.swing.JMenu Hora_txt;
    private javax.swing.JMenuBar JMenuBar1;
    public static javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JMenuItem jMArticulos;
    private javax.swing.JMenuItem jMCartera;
    private javax.swing.JMenuItem jMClientes;
    private javax.swing.JMenuItem jMVentas;
    private javax.swing.JMenu jMarchivo;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem10;
    private javax.swing.JMenuItem jMenuItem12;
    private javax.swing.JMenuItem jMenuItem14;
    private javax.swing.JMenuItem jMenuItem15;
    private javax.swing.JMenuItem jMenuItem17;
    private javax.swing.JMenuItem jMenuItem18;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JMenuItem jMenuItem9;
    private javax.swing.JMenu jMgestion;
    private javax.swing.JMenu jMstrock;
    private javax.swing.JLabel logoFondo;
    // End of variables declaration//GEN-END:variables
}
