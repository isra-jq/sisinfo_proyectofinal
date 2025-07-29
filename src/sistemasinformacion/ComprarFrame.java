
package sistemasinformacion;

import ConexionBD.ConexionBD;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPopupMenu;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.PreparedStatement;
import java.time.LocalDateTime;
import javax.swing.JMenuItem;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;
import java.sql.Connection;



public class ComprarFrame extends javax.swing.JFrame {

    private final String idCliente;
    private final JPopupMenu popupSugerencias = new JPopupMenu();
    private final List<String> nombresProductos = new ArrayList<>();

    public ComprarFrame(String idCliente) {
        this.idCliente = idCliente; 
        initComponents();
        cargarNombresProductos(); 
        this.setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        botonVolver = new javax.swing.JButton();
        buscarTxtField = new javax.swing.JTextField();
        botonBuscar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        botonLimpiarTabla = new javax.swing.JButton();
        tipoPagoComboBox = new javax.swing.JComboBox<>();
        botonPagar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "id vendedor", "id producto", "nombre producto", "cantidad", "precio"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        botonVolver.setText("volver");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        buscarTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buscarTxtFieldActionPerformed(evt);
            }
        });

        botonBuscar.setText("buscar");
        botonBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonBuscarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel1.setText("                                         comprar Productos");

        botonLimpiarTabla.setText("cancelar");
        botonLimpiarTabla.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonLimpiarTablaActionPerformed(evt);
            }
        });

        tipoPagoComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "tarjeta", "QR", " ", " " }));
        tipoPagoComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tipoPagoComboBoxActionPerformed(evt);
            }
        });

        botonPagar.setText("pagar");
        botonPagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonPagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonVolver)
                .addGap(24, 24, 24))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonLimpiarTabla)
                                .addGap(130, 130, 130)
                                .addComponent(botonPagar))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(buscarTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(botonBuscar)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(tipoPagoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 507, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(60, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buscarTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonBuscar)
                    .addComponent(tipoPagoComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(57, 57, 57)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonVolver)
                    .addComponent(botonLimpiarTabla)
                    .addComponent(botonPagar))
                .addGap(36, 36, 36))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
        ClienteFrame cliente = new ClienteFrame(idCliente);    
        cliente.setVisible(true); 
        this.dispose(); 
    }//GEN-LAST:event_botonVolverActionPerformed

    private void buscarTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buscarTxtFieldActionPerformed
     
    }//GEN-LAST:event_buscarTxtFieldActionPerformed

    private void botonBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonBuscarActionPerformed
        String nombreBuscado = buscarTxtField.getText().trim();

        if (nombreBuscado.isEmpty()) {
             JOptionPane.showMessageDialog(this, "Por favor ingrese el nombre del producto.");
            return;
        }

        String sql = "SELECT id_producto, nombre, precio, id_vendedor FROM productos WHERE nombre = ?";
        try (java.sql.Connection conn = ConexionBD.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, nombreBuscado);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                String idProducto = rs.getString("id_producto");
                String nombre = rs.getString("nombre");
                double precio = rs.getDouble("precio");
                String idVendedor = rs.getString("id_vendedor"); 
                int cantidadInicial = 1;

                DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
                model.addRow(new Object[]{idVendedor, idProducto, nombre, cantidadInicial, precio});

           } else {
                JOptionPane.showMessageDialog(this, "Producto no encontrado.");
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al buscar producto: " + e.getMessage());
        }
    }//GEN-LAST:event_botonBuscarActionPerformed

    private void botonLimpiarTablaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonLimpiarTablaActionPerformed
        DefaultTableModel modelo = (DefaultTableModel) jTable1.getModel();
        modelo.setRowCount(0);
    }//GEN-LAST:event_botonLimpiarTablaActionPerformed

    private void botonPagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonPagarActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        String tipoPago = (String) tipoPagoComboBox.getSelectedItem(); 

        if (model.getRowCount() == 0) {
            JOptionPane.showMessageDialog(this, "No hay productos en la tabla para registrar la compra.");
            return;
        }

        try (Connection conn = (Connection) ConexionBD.getConexion()) {
            String sql = "INSERT INTO ventas_compras (id, id_vendedor, id_comprador, id_producto, nombre_producto, cantidad, precio, tipo_pago) VALUES (?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = conn.prepareStatement(sql);

            for (int i = 0; i < model.getRowCount(); i++) {
                LocalDateTime now = LocalDateTime.now();
                String idVenta = String.format("%04d%02d%02d%02d%02d%02d",
                    now.getYear(), now.getMonthValue(), now.getDayOfMonth(),
                    now.getHour(), now.getMinute(), now.getSecond());

                String idVendedor = model.getValueAt(i, 0).toString();
                String idProducto = model.getValueAt(i, 1).toString();
                String nombreProducto = model.getValueAt(i, 2).toString();
                int cantidad = Integer.parseInt(model.getValueAt(i, 3).toString());
                double precio = Double.parseDouble(model.getValueAt(i, 4).toString());

                    ps.setString(1, idVenta);
                    ps.setString(2, idVendedor);
                    ps.setString(3, idCliente); 
                    ps.setString(4, idProducto);
                    ps.setString(5, nombreProducto);
                ps.setInt(6, cantidad);
                ps.setDouble(7, precio);
                ps.setString(8, tipoPago);

                ps.executeUpdate();
            }

            JOptionPane.showMessageDialog(this, "Compra registrada correctamente.");
            ((DefaultTableModel) jTable1.getModel()).setRowCount(0); // limpiar tabla
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Error al registrar la compra: " + e.getMessage());
        }
    }//GEN-LAST:event_botonPagarActionPerformed

    private void tipoPagoComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tipoPagoComboBoxActionPerformed
        
    }//GEN-LAST:event_tipoPagoComboBoxActionPerformed
    
    private void cargarNombresProductos() {
        nombresProductos.clear();
        String sql = "SELECT nombre FROM productos";
        try (java.sql.Connection conn = ConexionBD.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                nombresProductos.add(rs.getString("nombre"));
            }

         } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al cargar nombres: " + e.getMessage());
        }
    }
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonBuscar;
    private javax.swing.JButton botonLimpiarTabla;
    private javax.swing.JButton botonPagar;
    private javax.swing.JButton botonVolver;
    private javax.swing.JTextField buscarTxtField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> tipoPagoComboBox;
    // End of variables declaration//GEN-END:variables
}
