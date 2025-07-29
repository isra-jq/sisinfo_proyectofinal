
package sistemasinformacion;

/**
 *
 * @author Eliot Rodrigo Heredia Villanueva
 */
import ConexionBD.ConexionBD; 
import java.sql.Connection; 
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
public class AnadirProducto extends javax.swing.JFrame {
 
    private final String idVendedor;
    public AnadirProducto(String idVendedor) {
        this.idVendedor = idVendedor;  
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        nombreTxField = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        descripcionTxtField = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        precioTxtField = new javax.swing.JTextField();
        cantidadTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        comboBoxTipo = new javax.swing.JComboBox<>();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel1.setText("                          registra tu producto");

        jButton1.setText("volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        nombreTxField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTxFieldActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel2.setText("nombre: ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel3.setText("descripcion: ");

        descripcionTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descripcionTxtFieldActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel4.setText("precio:");

        precioTxtField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                precioTxtFieldActionPerformed(evt);
            }
        });

        cantidadTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cantidadTextFieldActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel5.setText("cantidad:");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel6.setText("tipo:");

        comboBoxTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "electrónico", "alimento ", "mueble", "material escolar u oficina", "bebida", "material de construcción" }));
        comboBoxTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                comboBoxTipoActionPerformed(evt);
            }
        });

        jButton2.setText("registrar producto");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel2)
                                .addComponent(jLabel3))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(descripcionTxtField, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                .addComponent(nombreTxField)))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cantidadTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                                .addComponent(precioTxtField)
                                .addComponent(comboBoxTipo, 0, 1, Short.MAX_VALUE)))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nombreTxField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(descripcionTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(precioTxtField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cantidadTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(comboBoxTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 33, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        VendedorFrame vendedor = new VendedorFrame(idVendedor); 
        vendedor.setVisible(true); 
        this.dispose(); 
    }//GEN-LAST:event_jButton1ActionPerformed

    private void nombreTxFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTxFieldActionPerformed
        
    }//GEN-LAST:event_nombreTxFieldActionPerformed

    private void descripcionTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descripcionTxtFieldActionPerformed
       
    }//GEN-LAST:event_descripcionTxtFieldActionPerformed

    private void precioTxtFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_precioTxtFieldActionPerformed

    }//GEN-LAST:event_precioTxtFieldActionPerformed

    private void cantidadTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cantidadTextFieldActionPerformed
        
    }//GEN-LAST:event_cantidadTextFieldActionPerformed

    private void comboBoxTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_comboBoxTipoActionPerformed
        
    }//GEN-LAST:event_comboBoxTipoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        agregarProducto(); 
    }//GEN-LAST:event_jButton2ActionPerformed
    
    private int obtenerSiguienteIdProducto() {
        int siguienteId = 1; 
        Connection conn = (Connection) ConexionBD.getConexion();
        String sql = "SELECT MAX(CAST(id_producto AS UNSIGNED)) AS max_id FROM productos";
        try {
            try (PreparedStatement ps = conn.prepareStatement(sql); ResultSet rs = ps.executeQuery()) {
                
                    if (rs.next()) {
                        siguienteId = rs.getInt("max_id") + 1;
                    }  
                }
        conn.close();

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al obtener ID de producto: " + e.getMessage());
        }
        return siguienteId;
    }
   
   private void agregarProducto() {
    String nombre = nombreTxField.getText().trim();
    String descripcion = descripcionTxtField.getText().trim();
    String precioStr = precioTxtField.getText().trim();
    String stockStr = cantidadTextField.getText().trim();
    String tipo = (String) comboBoxTipo.getSelectedItem();

    if (nombre.isEmpty() || descripcion.isEmpty() || precioStr.isEmpty() || stockStr.isEmpty() || tipo == null) {
        JOptionPane.showMessageDialog(this, "Por favor completa todos los campos.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    double precio;
    int stock;

    try {
        precio = Double.parseDouble(precioStr);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "El precio debe ser un número válido.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    try {
        stock = Integer.parseInt(stockStr);
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "El stock debe ser un número entero.", "Error", JOptionPane.ERROR_MESSAGE);
        return;
    }

    int idProducto = obtenerSiguienteIdProducto();

    try (Connection conn = ConexionBD.getConexion()) {
        String sqlInsert = "INSERT INTO productos (id_producto, nombre, descripcion, precio, stock, tipo, id_vendedor) VALUES (?, ?, ?, ?, ?, ?, ?)";
        PreparedStatement ps = conn.prepareStatement(sqlInsert);
        ps.setInt(1, idProducto); // Ya no es string, sino int
        ps.setString(2, nombre);
        ps.setString(3, descripcion);
        ps.setDouble(4, precio);
        ps.setInt(5, stock);
        ps.setString(6, tipo);
        ps.setString(7, idVendedor); // variable global

        int filasInsertadas = ps.executeUpdate();
        if (filasInsertadas > 0) {
            JOptionPane.showMessageDialog(this, "Producto agregado correctamente.");
        } else {
            JOptionPane.showMessageDialog(this, "No se pudo agregar el producto.", "Error", JOptionPane.ERROR_MESSAGE);
        }

    } catch (SQLException ex) {
        ex.printStackTrace();
        JOptionPane.showMessageDialog(this, "Error al agregar producto: " + ex.getMessage(), "Error", JOptionPane.ERROR_MESSAGE);
    }
}


    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cantidadTextField;
    private javax.swing.JComboBox<String> comboBoxTipo;
    private javax.swing.JTextField descripcionTxtField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField nombreTxField;
    private javax.swing.JTextField precioTxtField;
    // End of variables declaration//GEN-END:variables
}
