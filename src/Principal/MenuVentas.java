package Principal;

import Login.ConexionJava;
import static Principal.Inicio.jDesktopPane1;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import static java.awt.event.MouseEvent.MOUSE_CLICKED;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import net.proteanit.sql.DbUtils;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JInternalFrame;
import javax.swing.table.TableModel;

public class MenuVentas extends javax.swing.JInternalFrame{

    private TableRowSorter trsFiltro;

    public MenuVentas() {
       //Inicio del metodo para establecer el estilo nimbus
        try {
            UIManager.setLookAndFeel(new McLaFNimbus());
        } catch (Exception ex) {
            System.out.println(ex);
        }
        
        initComponents();
        //Conexion con DB para mostrar los articulos
        refreshProductsTable();
       // this.addFocusListener(null);
        codigoBarras.requestFocus();
        this.codigoBarras.requestFocusInWindow();
    }
    
    int countProducts = 0;
    Double TotalAll = 0.0;
//CAMBIAR EL ASPECTO DEL JINTERNALFRAME en base al metodo establecido sobre nimbus
    @Override
    protected void paintComponent(Graphics g) {
        g.setColor(new Color(0, 163, 136, 150));
        g.fillRoundRect(0, 0, getWidth(), getHeight(), 14, 14);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        DetalleVenta = new javax.swing.JPanel();
        TotalDelCarrito = new javax.swing.JLabel();
        total1 = new javax.swing.JLabel();
        cantidadProductos = new javax.swing.JLabel();
        productos1 = new javax.swing.JLabel();
        OpcionesBusqueda = new javax.swing.JPanel();
        codigoBarras = new javax.swing.JTextField();
        comboFiltro = new javax.swing.JComboBox();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableProductos = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        TableVentas = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        add = new javax.swing.JButton();

        setBorder(null);
        setClosable(true);
        setTitle("Realizar Ventas");
        setFrameIcon(null);
        setPreferredSize(new java.awt.Dimension(1355, 675));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        DetalleVenta.setBackground(new java.awt.Color(0, 163, 136));
        DetalleVenta.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        TotalDelCarrito.setFont(new java.awt.Font("Acid", 1, 24)); // NOI18N
        TotalDelCarrito.setForeground(new java.awt.Color(255, 255, 255));
        DetalleVenta.add(TotalDelCarrito, new org.netbeans.lib.awtextra.AbsoluteConstraints(1160, 10, 110, 30));

        total1.setFont(new java.awt.Font("Acid", 1, 24)); // NOI18N
        total1.setForeground(new java.awt.Color(255, 255, 255));
        total1.setText("TOTAL");
        DetalleVenta.add(total1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 10, -1, 30));

        cantidadProductos.setFont(new java.awt.Font("Acid", 0, 24)); // NOI18N
        cantidadProductos.setForeground(new java.awt.Color(255, 255, 255));
        DetalleVenta.add(cantidadProductos, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 10, 100, 30));

        productos1.setFont(new java.awt.Font("Acid", 0, 24)); // NOI18N
        productos1.setForeground(new java.awt.Color(255, 255, 255));
        productos1.setText("SELECCIONADOS");
        DetalleVenta.add(productos1, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 10, -1, 30));

        getContentPane().add(DetalleVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 600, 1360, 50));

        OpcionesBusqueda.setBackground(new java.awt.Color(0, 163, 136));
        OpcionesBusqueda.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        OpcionesBusqueda.add(codigoBarras, new org.netbeans.lib.awtextra.AbsoluteConstraints(930, 10, 190, 30));

        comboFiltro.setBackground(new java.awt.Color(225, 225, 225));
        comboFiltro.setFont(new java.awt.Font("Cantarell", 0, 12)); // NOI18N
        comboFiltro.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "CODIGO", "NOMBRE", "DESCRIPCION" }));
        comboFiltro.setAlignmentX(0.0F);
        comboFiltro.setAlignmentY(0.0F);
        comboFiltro.setBorder(null);
        comboFiltro.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        comboFiltro.setFocusable(false);
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
        OpcionesBusqueda.add(comboFiltro, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 10, 100, 30));

        getContentPane().add(OpcionesBusqueda, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1430, 50));

        TableProductos.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(TableProductos);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 1190, 240));

        TableVentas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo de Barras", "Nombre", "Precio"
            }
        ));
        jScrollPane2.setViewportView(TableVentas);

        getContentPane().add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, 1070, 260));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesMenu/UC/VENDER.png"))); // NOI18N
        jButton1.setAlignmentY(0.0F);
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 510, 100, 70));

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesMenu/UC/AÑADIR STOCK.png"))); // NOI18N
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 320, 100, 70));

        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesMenu/UC/ADD CLIENTE.png"))); // NOI18N
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1110, 410, 100, 70));

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesMenu/UC/DEVOLVER.png"))); // NOI18N
        jButton4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 410, 100, 70));

        jButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesMenu/UC/PROMOCIONES.png"))); // NOI18N
        jButton5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 320, 100, 70));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ImagesMenu/UC/ELIMINAR.png"))); // NOI18N
        jButton6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 510, 100, 70));

        add.setText("ADD");
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        getContentPane().add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(1250, 140, -1, -1));

        getAccessibleContext().setAccessibleName("");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void codigoBarrasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_codigoBarrasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_codigoBarrasActionPerformed

    private void codigoBarrasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_codigoBarrasMouseClicked
        // MOUSE
    
    }//GEN-LAST:event_codigoBarrasMouseClicked

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
        trsFiltro = new TableRowSorter(TableProductos.getModel());
        TableProductos.setRowSorter(trsFiltro);
          
    }//GEN-LAST:event_codigoBarrasKeyTyped

    private void comboFiltroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboFiltroMouseClicked
//        // Focus para el combo box 
//      comboFiltro.getSelectedItem();
//            codigoBarras.requestFocus();
//            codigoBarras.requestFocusInWindow();
        
    }//GEN-LAST:event_comboFiltroMouseClicked

    private void comboFiltroItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_comboFiltroItemStateChanged
        // FOCUS LOL
        codigoBarras.requestFocus();
        codigoBarras.requestFocusInWindow();
    }//GEN-LAST:event_comboFiltroItemStateChanged

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        //ingresar stock
        AñadirMercaderia am=new AñadirMercaderia();
        Inicio.jDesktopPane1.add(am);
        Dimension desktopSize = jDesktopPane1.getSize();
        Dimension FrameSize = am.getSize();
        am.setLocation((desktopSize.width - FrameSize.width)/2, (desktopSize.height- FrameSize.height)/2);
        am.setVisible(true);
        codigoBarras.requestFocus();
        am.codigoBarras.requestFocus();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        //ingresar cliente
}//GEN-LAST:event_jButton3ActionPerformed

    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        // TODO add your handling code here:
        //Obtenemos los articulos a vender
        countProducts = 0;
        TotalAll = 0.0;
        int fila = 0;
        fila = TableProductos.getSelectedRow();
        Object[] obj = new Object[3];
        obj[0] = TableProductos.getValueAt(fila, 1);
        obj[1] = TableProductos.getValueAt(fila, 2);
        obj[2] = TableProductos.getValueAt(fila, 5);
        
        DefaultTableModel dtm = (DefaultTableModel) TableVentas.getModel();
        dtm.addRow(obj);
        TableVentas.setModel(dtm);
//        
//        TableVentas.setValueAt(obj[0], position, 0);
//        TableVentas.setValueAt(obj[1], position, 1);
//        TableVentas.setValueAt(obj[2], position, 2);
//        
        //TotalAll += Double.parseDouble(TableVentas.getValueAt(position, 2).toString());
        totalRefresh();
    }//GEN-LAST:event_addActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        countProducts = 0;
        TotalAll = 0.0;
        //Remover un producto del carrito
        int indexRow = TableVentas.getSelectedRow();
        
        //Object valuePrice = TableVentas.getValueAt(indexRow, 2);
        //TotalAll -= Double.valueOf(valuePrice.toString());
        //TotalDelCarrito.setText(String.valueOf(TotalAll));

        DefaultTableModel temp = (DefaultTableModel) TableVentas.getModel();
        temp.removeRow(indexRow);
        
        TableVentas.setModel(temp);
        totalRefresh();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        //LIMPIAR VENTAS
        countProducts = 0;
        TotalAll = 0.0;

//        DefaultTableModel modelo = new DefaultTableModel(0,2);
//        Object[]  identifiers = new Object[2];
//        identifiers[0] = "Codigo de Barras";
//        identifiers[1] = "Nombre";
//        identifiers[2] = "Precio";
//        modelo.setColumnIdentifiers(identifiers);
//        TableVentas.setModel(modelo);


        int lenght = TableVentas.getRowCount();
        DefaultTableModel table = (DefaultTableModel) TableVentas.getModel();
        for (int i = 0; i < lenght; i++) {
            table.removeRow(0);
        }
        TableVentas.setModel(table);
        totalRefresh();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        //Venta de productos
        String nit = JOptionPane.showInputDialog("Ingrese el nit del cliente\n");
        String nombre = JOptionPane.showInputDialog("Ingrese el nombre del cliente:\n");
        
        sqlScript.EnterClient(nit, nombre);
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    
 public void filtro() {
     //Filtro de busqueda con autocomplementacion dentro del Jtable  
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
        if (comboFiltro.getSelectedItem() == "DESCRIPCION") {
            columnaABuscar = 7;
            codigoBarras.requestFocus();
            codigoBarras.requestFocusInWindow();
        }
       
        trsFiltro.setRowFilter(RowFilter.regexFilter(codigoBarras.getText(), columnaABuscar));
    }
 
 public void totalRefresh(){
     int totalFilas = TableVentas.getRowCount();
     for (int i = 0; i < totalFilas; i++) {
         TotalAll += Double.parseDouble(TableVentas.getValueAt(i, 2).toString());
     }
     countProducts = totalFilas;
     cantidadProductos.setText(String.valueOf(countProducts));
     TotalDelCarrito.setText(String.valueOf(TotalAll));
 }
    
 public void refreshProductsTable(){
     PreparedStatement pst = null;
        ResultSet rs = null;
        String sql = "select idArticulo as ID, CodigoBarras as 'Codigo de Barras', nombreArticulo as Nombre, Lote, Fecha_Vencimiento as Vencimiento, PrecioVenta as Precio, Cantidad, Descripcion from articulo";
        try {
            pst = ConexionJava.Conectar().prepareStatement(sql);
            rs = pst.executeQuery();
            TableProductos.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "ERROR CONEXION DB");
        }
 }
    private void txtFiltroKeyTyped(java.awt.event.KeyEvent evt) {                                   
        
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel DetalleVenta;
    private javax.swing.JPanel OpcionesBusqueda;
    private javax.swing.JTable TableProductos;
    private javax.swing.JTable TableVentas;
    private javax.swing.JLabel TotalDelCarrito;
    private javax.swing.JButton add;
    private javax.swing.JLabel cantidadProductos;
    private javax.swing.JTextField codigoBarras;
    private javax.swing.JComboBox comboFiltro;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel productos1;
    private javax.swing.JLabel total1;
    // End of variables declaration//GEN-END:variables
}
