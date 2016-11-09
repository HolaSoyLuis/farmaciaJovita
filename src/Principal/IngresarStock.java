/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Login.Conexion;
import java.awt.Color;
import java.awt.Graphics;
import static java.util.Calendar.DAY_OF_MONTH;
import static java.util.Calendar.MONTH;
import static java.util.Calendar.YEAR;
import javax.swing.UIManager;

/**
 *
 * @author YO
 */
public class IngresarStock extends javax.swing.JInternalFrame implements Conexion {

    /**
     * Creates new form IngresarStock
     */
    public IngresarStock() {
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
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Descripcion = new javax.swing.JTextArea();
        precioVenta = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jTXcentajeVenta = new javax.swing.JTextField();
        precioCompra = new javax.swing.JTextField();
        cantidadMinima = new javax.swing.JTextField();
        cantidadNueva = new javax.swing.JTextField();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jCcategoria = new javax.swing.JComboBox();
        jCsubCategoria = new javax.swing.JComboBox();
        jTmarcaArticulo = new javax.swing.JTextField();
        nombreArticulo = new javax.swing.JTextField();
        fechadeLote = new com.toedter.calendar.JDateChooser();
        CodigoLote = new javax.swing.JTextField();
        CodigoBarras = new javax.swing.JTextField();
        jBaddImagen = new javax.swing.JButton();
        jBguardar = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setBorder(null);
        setClosable(true);
        setTitle("Ingresar Stock");
        setAlignmentX(0.0F);
        setAlignmentY(0.0F);
        setFrameIcon(null);
        setMaximumSize(new java.awt.Dimension(575, 600));
        setMinimumSize(new java.awt.Dimension(575, 600));
        setPreferredSize(new java.awt.Dimension(575, 600));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        Descripcion.setColumns(20);
        Descripcion.setForeground(new java.awt.Color(204, 204, 255));
        Descripcion.setRows(5);
        Descripcion.setText("Descripcion del producto aqui...");
        Descripcion.setAlignmentX(0.0F);
        Descripcion.setAlignmentY(0.0F);
        Descripcion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white, java.awt.Color.white));
        Descripcion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                DescripcionMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Descripcion);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 440, 400, 40));

        precioVenta.setForeground(new java.awt.Color(204, 204, 255));
        precioVenta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        precioVenta.setText("Precio Venta");
        precioVenta.setAlignmentX(0.0F);
        precioVenta.setAlignmentY(0.0F);
        precioVenta.setBorder(null);
        precioVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                precioVentaMouseClicked(evt);
            }
        });
        precioVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioVentaActionPerformed(evt);
            }
        });
        getContentPane().add(precioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 390, 90, 20));

        jPanel2.setBackground(new java.awt.Color(240, 240, 245));
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 380, 150, 40));

        jTXcentajeVenta.setForeground(new java.awt.Color(204, 204, 255));
        jTXcentajeVenta.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTXcentajeVenta.setText("Xcentaje Ganancia");
        jTXcentajeVenta.setAlignmentX(0.0F);
        jTXcentajeVenta.setAlignmentY(0.0F);
        jTXcentajeVenta.setBorder(null);
        jTXcentajeVenta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTXcentajeVentaMouseClicked(evt);
            }
        });
        jTXcentajeVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTXcentajeVentaActionPerformed(evt);
            }
        });
        getContentPane().add(jTXcentajeVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 90, 20));

        precioCompra.setForeground(new java.awt.Color(204, 204, 255));
        precioCompra.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        precioCompra.setText("Precio Compra");
        precioCompra.setAlignmentX(0.0F);
        precioCompra.setAlignmentY(0.0F);
        precioCompra.setBorder(null);
        precioCompra.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                precioCompraMouseClicked(evt);
            }
        });
        precioCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioCompraActionPerformed(evt);
            }
        });
        getContentPane().add(precioCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 80, 20));

        cantidadMinima.setForeground(new java.awt.Color(204, 204, 255));
        cantidadMinima.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cantidadMinima.setText("Minima Cantidad");
        cantidadMinima.setAlignmentX(0.0F);
        cantidadMinima.setAlignmentY(0.0F);
        cantidadMinima.setBorder(null);
        cantidadMinima.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cantidadMinimaMouseClicked(evt);
            }
        });
        cantidadMinima.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadMinimaActionPerformed(evt);
            }
        });
        getContentPane().add(cantidadMinima, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 340, 140, 20));

        cantidadNueva.setForeground(new java.awt.Color(204, 204, 255));
        cantidadNueva.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        cantidadNueva.setText("Cantidad Nueva");
        cantidadNueva.setAlignmentX(0.0F);
        cantidadNueva.setAlignmentY(0.0F);
        cantidadNueva.setBorder(null);
        cantidadNueva.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cantidadNuevaMouseClicked(evt);
            }
        });
        getContentPane().add(cantidadNueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 340, 140, 20));

        jPanel1.setBackground(new java.awt.Color(240, 240, 245));
        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 0, 290, 320));

        jPanel3.setBackground(new java.awt.Color(240, 240, 245));
        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 220, 40));

        jCcategoria.setBackground(new java.awt.Color(225, 225, 225));
        jCcategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Categoria 1", "Categoria 2", "Categoria 3", "Agregar Categorias" }));
        jCcategoria.setBorder(null);
        jCcategoria.setOpaque(false);
        getContentPane().add(jCcategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 290, 140, 20));

        jCsubCategoria.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "SubCategoria 1", "SubCategoria 2", "SubCategoria 3", "Add SubCategoria" }));
        jCsubCategoria.setBorder(null);
        getContentPane().add(jCsubCategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 290, 130, 20));

        jTmarcaArticulo.setForeground(new java.awt.Color(204, 204, 255));
        jTmarcaArticulo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTmarcaArticulo.setText("Marca del articulo");
        jTmarcaArticulo.setAlignmentX(0.0F);
        jTmarcaArticulo.setAlignmentY(0.0F);
        jTmarcaArticulo.setBorder(null);
        jTmarcaArticulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTmarcaArticuloMouseClicked(evt);
            }
        });
        getContentPane().add(jTmarcaArticulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 200, 140, 30));

        nombreArticulo.setForeground(new java.awt.Color(204, 204, 255));
        nombreArticulo.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        nombreArticulo.setText("Nombre del Articulo");
        nombreArticulo.setAlignmentX(0.0F);
        nombreArticulo.setAlignmentY(0.0F);
        nombreArticulo.setBorder(null);
        nombreArticulo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                nombreArticuloMouseClicked(evt);
            }
        });
        getContentPane().add(nombreArticulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 200, 140, 30));

        fechadeLote.setAlignmentX(0.0F);
        fechadeLote.setAlignmentY(0.0F);
        fechadeLote.setDateFormatString("yyyy-MM-dd");
        getContentPane().add(fechadeLote, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 160, 130, 30));

        CodigoLote.setForeground(new java.awt.Color(204, 204, 255));
        CodigoLote.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CodigoLote.setText("Codigo del Lote");
        CodigoLote.setAlignmentX(0.0F);
        CodigoLote.setAlignmentY(0.0F);
        CodigoLote.setBorder(null);
        CodigoLote.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CodigoLoteMouseClicked(evt);
            }
        });
        getContentPane().add(CodigoLote, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 120, 140, 30));

        CodigoBarras.setForeground(new java.awt.Color(204, 204, 255));
        CodigoBarras.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        CodigoBarras.setText("Codigo de Barras");
        CodigoBarras.setAlignmentX(0.0F);
        CodigoBarras.setAlignmentY(0.0F);
        CodigoBarras.setBorder(null);
        CodigoBarras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CodigoBarrasMouseClicked(evt);
            }
        });
        CodigoBarras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodigoBarrasActionPerformed(evt);
            }
        });
        getContentPane().add(CodigoBarras, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 80, 140, 20));

        jBaddImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPaneles/AddImagen.png"))); // NOI18N
        jBaddImagen.setAlignmentY(0.0F);
        jBaddImagen.setBorder(null);
        jBaddImagen.setBorderPainted(false);
        jBaddImagen.setContentAreaFilled(false);
        getContentPane().add(jBaddImagen, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 75, 50, -1));

        jBguardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPaneles/Guardarg.png"))); // NOI18N
        jBguardar.setAlignmentY(0.0F);
        jBguardar.setBorder(null);
        jBguardar.setBorderPainted(false);
        jBguardar.setContentAreaFilled(false);
        jBguardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarActionPerformed(evt);
            }
        });
        getContentPane().add(jBguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 520, 170, -1));

        Fondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPaneles/AddStock.jpg"))); // NOI18N
        Fondo.setAlignmentY(0.0F);
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 580));

        setBounds(440, 20, 575, 600);
    }// </editor-fold>//GEN-END:initComponents

    private void precioCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precioCompraActionPerformed

    private void jTXcentajeVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTXcentajeVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTXcentajeVentaActionPerformed

    private void precioVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precioVentaActionPerformed

    private void CodigoBarrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CodigoBarrasMouseClicked
        // Mouse
        CodigoBarras.setText(null);
        CodigoBarras.setForeground(Color.black);
    }//GEN-LAST:event_CodigoBarrasMouseClicked

    private void CodigoBarrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodigoBarrasActionPerformed
        // 
    }//GEN-LAST:event_CodigoBarrasActionPerformed

    private void CodigoLoteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CodigoLoteMouseClicked
        // Mouse
        this.CodigoLote.setText(null);
        CodigoLote.setForeground(Color.black);
    }//GEN-LAST:event_CodigoLoteMouseClicked

    private void nombreArticuloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nombreArticuloMouseClicked
        // mouse
        this.nombreArticulo.setText(null);
        nombreArticulo.setForeground(Color.black);
    }//GEN-LAST:event_nombreArticuloMouseClicked

    private void jTmarcaArticuloMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTmarcaArticuloMouseClicked
        // Mouse
        this.jTmarcaArticulo.setText(null);
        jTmarcaArticulo.setForeground(Color.black);
    }//GEN-LAST:event_jTmarcaArticuloMouseClicked

    private void cantidadMinimaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadMinimaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cantidadMinimaActionPerformed

    private void cantidadNuevaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cantidadNuevaMouseClicked
        // Mouse
        this.cantidadNueva.setText(null);
        cantidadNueva.setForeground(Color.black);
    }//GEN-LAST:event_cantidadNuevaMouseClicked

    private void cantidadMinimaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cantidadMinimaMouseClicked
        // mouse
        this.cantidadMinima.setText(null);
        cantidadMinima.setForeground(Color.black);
    }//GEN-LAST:event_cantidadMinimaMouseClicked

    private void precioCompraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_precioCompraMouseClicked
        // mouse
        this.precioCompra.setText(null);
        precioCompra.setForeground(Color.black);
    }//GEN-LAST:event_precioCompraMouseClicked

    private void jTXcentajeVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTXcentajeVentaMouseClicked
        // Mouse
        this.jTXcentajeVenta.setText(null);
        jTXcentajeVenta.setForeground(Color.black);
    }//GEN-LAST:event_jTXcentajeVentaMouseClicked

    private void precioVentaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_precioVentaMouseClicked
        // Mouse
        this.precioVenta.setText(null);
        precioVenta.setForeground(Color.black);
    }//GEN-LAST:event_precioVentaMouseClicked

    private void DescripcionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_DescripcionMouseClicked
        // Mouse
        this.Descripcion.setText(null);
        Descripcion.setForeground(Color.black);
    }//GEN-LAST:event_DescripcionMouseClicked

    private void jBguardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarActionPerformed
        // TODO add your handling code here:
        String fecha = String.valueOf(fechadeLote.getCalendar().get(YEAR)) + "-" + fechadeLote.getCalendar().get(MONTH) + "-" + fechadeLote.getCalendar().get(DAY_OF_MONTH);
        articulo.insertarBase(conn.getConn(), nombreArticulo.getText(),  cantidadMinima.getText(), 1 , CodigoLote.getText(), fecha, Double.parseDouble(precioCompra.getText()), Double.parseDouble(this.precioVenta.getText()), Descripcion.getText(), CodigoBarras.getText(), cantidadNueva.getText());
    }//GEN-LAST:event_jBguardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CodigoBarras;
    private javax.swing.JTextField CodigoLote;
    private javax.swing.JTextArea Descripcion;
    private javax.swing.JLabel Fondo;
    private javax.swing.JTextField cantidadMinima;
    private javax.swing.JTextField cantidadNueva;
    private com.toedter.calendar.JDateChooser fechadeLote;
    private javax.swing.JButton jBaddImagen;
    private javax.swing.JButton jBguardar;
    private javax.swing.JComboBox jCcategoria;
    private javax.swing.JComboBox jCsubCategoria;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTXcentajeVenta;
    private javax.swing.JTextField jTmarcaArticulo;
    private javax.swing.JTextField nombreArticulo;
    private javax.swing.JTextField precioCompra;
    private javax.swing.JTextField precioVenta;
    // End of variables declaration//GEN-END:variables
}
