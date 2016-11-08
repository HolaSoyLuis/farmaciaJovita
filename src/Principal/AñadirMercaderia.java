
package Principal;

import Login.ConexionJava;
import static Principal.Inicio.jDesktopPane1;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.UIManager;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;


/**
 *
 * @author yovelasquez
 */
public class AñadirMercaderia extends javax.swing.JInternalFrame {

    /**
     * Creates new form AñadirMercaderia
     */
    Stock s= new Stock();
    private TableRowSorter trsFiltro;
    public AñadirMercaderia() {
                
        initComponents();
        //Aplicar LookAndFeel nimbus para poner las ventanas transparentes
        try {
            UIManager.setLookAndFeel(new McLaFNimbus());
        } catch (Exception ex) {
            System.out.println(ex);
        }
        this.mostrarArticulos();

    }
    
//MUESTRA ARTICULOS LA TABA
    public void mostrarArticulos(){
        
    String sql="SELECT NombreArticulo,Cantidad_Minima,Lote,Nombre as Categoria,Fecha_Vencimiento FROM articulo inner join categoria\n" + //Envia la cadena al metodo al metodo mostrar tabla de la clase Stock
    "on articulo.Categoria_idCategoria= categoria.idCategoria";
    
      s.Mostrar(sql); //LLama al metodo  Mostrar de la clase Articulo
     this.jTable1.setModel(s.modelo); //Establece el modelo en la taba
                    
//        PreparedStatement pst = null;
//        ResultSet rs = null;
//        String sql = "select idArticulo as ID, CodigoBarras as 'Codigo de Barras', nombreArticulo as Nombre, Lote, Fecha_Vencimiento as Vencimiento, PrecioVenta as Precio, Cantidad, Descripcion from articulo";
//        try {
//            pst = ConexionJava.Conectar().prepareStatement(sql);
//            rs = pst.executeQuery();
//            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "Fatal Error D:");
//        }
//        codigoBarras.requestFocus();
//        codigoBarras.requestFocusInWindow();
    }//FINALIZA MOSTRAR ARTICULOS
    

//CAMBIAR EL ASPECTO DEL JINTERNALFRAME "TRANSPARENTE"
    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(new Color(0, 163, 136, 150));
        g.fillRoundRect(0, 0, getWidth(), getHeight(), 14, 14);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        codigoBarras = new javax.swing.JTextField();
        comboFiltro = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();

        setClosable(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        codigoBarras.setFont(new java.awt.Font("Cantarell", 0, 12)); // NOI18N
        codigoBarras.setForeground(new java.awt.Color(1, 1, 1));
        codigoBarras.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        codigoBarras.setBorder(null);
        codigoBarras.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                codigoBarrasMouseClicked(evt);
            }
        });
        codigoBarras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                codigoBarrasActionPerformed(evt);
            }
        });
        codigoBarras.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                codigoBarrasKeyTyped(evt);
            }
        });
        getContentPane().add(codigoBarras, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 280, 190, 40));

        comboFiltro.setFont(new java.awt.Font("Cantarell", 0, 12)); // NOI18N
        comboFiltro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CODIGO", "NOMBRE" }));
        comboFiltro.setAlignmentX(0.0F);
        comboFiltro.setAlignmentY(0.0F);
        comboFiltro.setBorder(null);
        comboFiltro.setOpaque(false);
        comboFiltro.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                comboFiltroItemStateChanged(evt);
            }
        });
        comboFiltro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboFiltroMouseClicked(evt);
            }
        });
        getContentPane().add(comboFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 280, 100, 40));

        jButton1.setText("NUEVO PRODUCTO");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 280, -1, 40));

        jButton2.setText("EDITAR PRODUCTO");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 280, 140, 40));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 840, 240));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // FORMULARIO MERCADERIA NUEVA
        IngresarStock is = new IngresarStock();
        Inicio.jDesktopPane1.add(is);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = is.getSize();
        is.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        is.show();
          dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void codigoBarrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_codigoBarrasMouseClicked
        // MOUSE

    }//GEN-LAST:event_codigoBarrasMouseClicked

    private void codigoBarrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoBarrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoBarrasActionPerformed

     public void filtro() {
        int columnaABuscar = 1;
        if (comboFiltro.getSelectedItem() == "CODIGO") {
            columnaABuscar = 1;
            codigoBarras.requestFocus();
            codigoBarras.requestFocusInWindow();
        }
        if (comboFiltro.getSelectedItem().toString() == "NOMBRE") {
            columnaABuscar = 2;
            codigoBarras.requestFocus();
            codigoBarras.requestFocusInWindow();
        }
       
        trsFiltro.setRowFilter(RowFilter.regexFilter(codigoBarras.getText(), columnaABuscar));
    }
    
    
    private void codigoBarrasKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_codigoBarrasKeyTyped
        // TEXTFIELD BUSCAR DENTRO DE JTABLE
        codigoBarras.addKeyListener(new KeyAdapter() {
            public void keyReleased(final KeyEvent e) {
                String cadena = (codigoBarras.getText());
                codigoBarras.setText(cadena);
                repaint();
                filtro();
            }
        });
        trsFiltro = new TableRowSorter(jTable1.getModel());
        jTable1.setRowSorter(trsFiltro);

    }//GEN-LAST:event_codigoBarrasKeyTyped

    private void comboFiltroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboFiltroItemStateChanged
        // FOCUS LOL
        codigoBarras.requestFocus();
        codigoBarras.requestFocusInWindow();
    }//GEN-LAST:event_comboFiltroItemStateChanged

    private void comboFiltroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboFiltroMouseClicked
        //        // Focus para el combo box
        //      comboFiltro.getSelectedItem();
        //            codigoBarras.requestFocus();
        //            codigoBarras.requestFocusInWindow();

    }//GEN-LAST:event_comboFiltroMouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // nueva cantidad
        
    }//GEN-LAST:event_jButton2ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTextField codigoBarras;
    private javax.swing.JComboBox comboFiltro;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
