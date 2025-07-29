
package sistemasinformacion;

/**
 *
 * @author Eliot Rodrigo Heredia Villanueva
 */
import ConexionBD.ConexionBD; 
import com.sun.jdi.connect.spi.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public final class VerUsuariosFrame extends javax.swing.JFrame {

   
    public VerUsuariosFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
        cargarUsuarios(); 
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tablaUsuarios = new javax.swing.JTable();
        botonVolver = new javax.swing.JButton();
        botonDeBorrar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tablaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "nombre", "apellido", "ci ", "fecha nacimiento", "correo", "telefono", "direccion", "tipo usuario", "fecha de registro"
            }
        ));
        jScrollPane1.setViewportView(tablaUsuarios);

        botonVolver.setText("volver");
        botonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVolverActionPerformed(evt);
            }
        });

        botonDeBorrar.setText("borrar de usuarios");
        botonDeBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDeBorrarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel1.setText("                                                                   Ver tabla de Usuarios ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(botonDeBorrar)
                .addGap(306, 306, 306)
                .addComponent(botonVolver)
                .addGap(22, 22, 22))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 704, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(105, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 305, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonVolver)
                    .addComponent(botonDeBorrar))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVolverActionPerformed
       AdministradorFrame admin = new AdministradorFrame();
       admin.setVisible(true);
       this.dispose(); 
    }//GEN-LAST:event_botonVolverActionPerformed

    private void botonDeBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDeBorrarActionPerformed
        int filaSeleccionada = tablaUsuarios.getSelectedRow();

        if (filaSeleccionada != -1) {
            DefaultTableModel modelo = (DefaultTableModel) tablaUsuarios.getModel();
            modelo.removeRow(filaSeleccionada);

            JOptionPane.showMessageDialog(this, "El usuario ha sido eliminado correctamente.");
        } else {
            JOptionPane.showMessageDialog(this, "Por favor, seleccione una fila para eliminar.");
        }
    }//GEN-LAST:event_botonDeBorrarActionPerformed
    
    public void cargarUsuarios() {
        DefaultTableModel modelo = (DefaultTableModel) tablaUsuarios.getModel();
        modelo.setRowCount(0); 

        String sql = "SELECT nombre, apellido, ci, fecha_nacimiento, correo, telefono, direccion, tipo_usuario, fecha_registro FROM usuarios WHERE tipo_usuario != 'admin'";

        try (java.sql.Connection conn = ConexionBD.getConexion();
             java.sql.Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {

            while (rs.next()) {
                Object[] fila = {
                    rs.getString("nombre"),
                    rs.getString("apellido"),
                    rs.getString("ci"),
                    rs.getString("fecha_nacimiento"),
                    rs.getString("correo"),
                    rs.getString("telefono"),
                    rs.getString("direccion"),
                    rs.getString("tipo_usuario"),
                    rs.getString("fecha_registro")
                };
                modelo.addRow(fila);
            }

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error al cargar usuarios: " + e.getMessage());
        }
    }

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(() -> {
            new VerUsuariosFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonDeBorrar;
    private javax.swing.JButton botonVolver;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaUsuarios;
    // End of variables declaration//GEN-END:variables
}
