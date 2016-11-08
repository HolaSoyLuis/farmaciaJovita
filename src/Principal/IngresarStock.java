/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

import Login.Conexion;
import static Principal.Inicio.jDesktopPane1;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import static java.util.Calendar.DAY_OF_MONTH;
import static java.util.Calendar.MONTH;
import static java.util.Calendar.YEAR;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author YO
 */
public class IngresarStock extends javax.swing.JInternalFrame implements Conexion {

Stock s = new Stock();

    public IngresarStock() {
                    //Aplicar LookAndFeel nimbus para poner las ventanas transparentes
        try {
            UIManager.setLookAndFeel(new McLaFNimbus());
        } catch (Exception ex) {
            System.out.println(ex);
        }
     
        initComponents();
  this.Fillcombo();
    }

//CAMBIAR EL ASPECTO DEL JINTERNALFRAME "TRANSPARENTE"
    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(new Color(0, 163, 136, 150));
        g.fillRoundRect(0, 0, getWidth(), getHeight(), 14, 14);
    }
    
    
    //Muestra las categorias en El formulario de ingresar Stock
    public void Fillcombo(){
              try{
            String sql="select * from categoria";
            s.pst= s.conn.prepareStatement(sql);
            s.rs=s.pst.executeQuery();
             while(s.rs.next()){
                 String nombre = s.rs.getString("Nombre");
             this.jCcategoria.addItem(nombre);
                            }
            
                    }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
        
           
        }//Finaliza FillCombo
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        Descripcion = new javax.swing.JTextArea();
        precioVenta = new javax.swing.JTextField();
        precioCompra = new javax.swing.JTextField();
        cantidadMinima = new javax.swing.JTextField();
        cantidadNueva = new javax.swing.JTextField();
        jCcategoria = new javax.swing.JComboBox();
        jTmarcaArticulo = new javax.swing.JTextField();
        nombreArticulo = new javax.swing.JTextField();
        fechadeLote = new com.toedter.calendar.JDateChooser();
        CodigoLote = new javax.swing.JTextField();
        CodigoBarras = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jBguardar = new javax.swing.JButton();
        Fondo = new javax.swing.JLabel();

        setBorder(null);
        setClosable(true);
        setTitle("Ingresar Stock");
        setAlignmentX(0.0F);
        setAlignmentY(0.0F);
        setFrameIcon(null);
        setMaximumSize(new java.awt.Dimension(538, 534));
        setMinimumSize(new java.awt.Dimension(538, 534));
        setPreferredSize(new java.awt.Dimension(538, 534));
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

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 380, 390, 40));

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
        getContentPane().add(precioVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 330, 80, 20));

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
        getContentPane().add(precioCompra, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 340, 80, 20));

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
        getContentPane().add(cantidadMinima, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, 140, 20));

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
        getContentPane().add(cantidadNueva, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 290, 140, 20));

        jCcategoria.setBackground(new java.awt.Color(225, 225, 225));
        jCcategoria.setBorder(null);
        jCcategoria.setOpaque(false);
        jCcategoria.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jCcategoriaMouseMoved(evt);
            }
        });
        jCcategoria.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
                jCcategoriaPopupMenuWillBecomeInvisible(evt);
            }
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
            }
        });
        jCcategoria.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jCcategoriaMouseClicked(evt);
            }
        });
        getContentPane().add(jCcategoria, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 190, 140, 30));

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
        getContentPane().add(jTmarcaArticulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 150, 140, 20));

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
        getContentPane().add(nombreArticulo, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 90, 140, 20));

        fechadeLote.setAlignmentX(0.0F);
        fechadeLote.setAlignmentY(0.0F);
        fechadeLote.setDateFormatString("yyyy-MM-dd");
        getContentPane().add(fechadeLote, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 200, 140, 20));

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
        getContentPane().add(CodigoLote, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 150, 140, 20));

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
        getContentPane().add(CodigoBarras, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 100, 140, 20));

        jButton1.setText("Agregar Categoria");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, 130, -1));

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
        getContentPane().add(jBguardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 450, 170, -1));

        Fondo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagenesPaneles/AddStock1.jpg"))); // NOI18N
        Fondo.setAlignmentY(0.0F);
        Fondo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                FondoMouseClicked(evt);
            }
        });
        getContentPane().add(Fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setBounds(440, 20, 552, 566);
    }// </editor-fold>//GEN-END:initComponents

    private void precioCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioCompraActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precioCompraActionPerformed

    private void precioVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_precioVentaActionPerformed

    private void CodigoBarrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CodigoBarrasMouseClicked
        // Mouse
        CodigoBarras.setText(null);
        CodigoBarras.setForeground(Color.black);
    }//GEN-LAST:event_CodigoBarrasMouseClicked

    private void CodigoBarrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodigoBarrasActionPerformed
       
      
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
        try{
            
        String fecha = String.valueOf(fechadeLote.getCalendar().get(YEAR)) + "-" + fechadeLote.getCalendar().get(MONTH) + "-" + fechadeLote.getCalendar().get(DAY_OF_MONTH);
        articulo.insertarBase(conn.getConn(), nombreArticulo.getText(),  cantidadMinima.getText(), s.idCategoria , CodigoLote.getText(), fecha, Double.parseDouble(precioCompra.getText()), Double.parseDouble(this.precioVenta.getText()), Descripcion.getText(), CodigoBarras.getText(), cantidadNueva.getText());
        AñadirMercaderia mu= new AñadirMercaderia();
        Inicio.jDesktopPane1.add(mu);                
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = mu.getSize();
        mu.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        mu.show();
        dispose();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error Rectifique los datos");
        }
            
        
        
        
    }//GEN-LAST:event_jBguardarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
 Categoria is = new Categoria();
        Inicio.jDesktopPane1.add(is);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = is.getSize();
        is.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        is.show();
//        dispose();
      
     
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void FondoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FondoMouseClicked

        // TODO add your handling code here:
    }//GEN-LAST:event_FondoMouseClicked

    private void jCcategoriaPopupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jCcategoriaPopupMenuWillBecomeInvisible
//   String tmp= (String)this.jCcategoria.getSelectedItem();
//        String sql= "select * from categoria where Nombre=?";
//        try{
//            s.pst=s.conn.prepareStatement(sql);
//            s.pst.setString(1, tmp);
//            s.rs=s.pst.executeQuery();
////            JOptionPane.showMessageDialog(null, tmp);
//             while(s.rs.next()){
//                String add1=s.rs.getString("idCategoria");
////                this.jTextField1.setText(add1);
//                s.idCategoria=Integer.parseInt(add1);
////                 System.out.println(s.idCategoria);
//                
//                                                           }
//        }catch(Exception e){
//            JOptionPane.showMessageDialog(null, e);        
//        }
        // TODO add your handling code here:
    }//GEN-LAST:event_jCcategoriaPopupMenuWillBecomeInvisible

    private void jCcategoriaMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCcategoriaMouseMoved
 
        
//        int itemCount = this.jCcategoria.getItemCount(); //Limpia el fillcombo
//
//    for(int i=0;i<itemCount;i++){
//        this.jCcategoria.removeItemAt(0);
//     }
//    
//        this.Fillcombo();
         
    }//GEN-LAST:event_jCcategoriaMouseMoved

    private void jCcategoriaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jCcategoriaMouseClicked
 int itemCount = this.jCcategoria.getItemCount(); //Limpia el fillcombo

    for(int i=0;i<itemCount;i++){
        this.jCcategoria.removeItemAt(0);
     }
    
        this.Fillcombo();
        // TODO add your handling code here:
    }//GEN-LAST:event_jCcategoriaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField CodigoBarras;
    private javax.swing.JTextField CodigoLote;
    private javax.swing.JTextArea Descripcion;
    private javax.swing.JLabel Fondo;
    private javax.swing.JTextField cantidadMinima;
    private javax.swing.JTextField cantidadNueva;
    private com.toedter.calendar.JDateChooser fechadeLote;
    private javax.swing.JButton jBguardar;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jCcategoria;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTmarcaArticulo;
    public javax.swing.JTextField nombreArticulo;
    private javax.swing.JTextField precioCompra;
    private javax.swing.JTextField precioVenta;
    // End of variables declaration//GEN-END:variables
}
