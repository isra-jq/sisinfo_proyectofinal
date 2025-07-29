
package sistemasinformacion;

/**
 *
 * @author Eliot Rodrigo Heredia Villanueva
 */
import ConexionBD.ConexionBD; 
import java.sql.Connection;
import java.io.IOException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class InicioSesion extends javax.swing.JFrame {

    
    public InicioSesion() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textUsuario = new javax.swing.JTextField();
        usuarioLabel = new javax.swing.JLabel();
        contraseñaLabel = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        validarBoton = new javax.swing.JButton();
        botonDeRegistro = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        TXTcontrasena = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        textUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textUsuarioActionPerformed(evt);
            }
        });

        usuarioLabel.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        usuarioLabel.setText("Usuario: ");

        contraseñaLabel.setFont(new java.awt.Font("Unispace", 0, 12)); // NOI18N
        contraseñaLabel.setText("contraseña:");

        jLabel1.setFont(new java.awt.Font("Arial Black", 3, 12)); // NOI18N
        jLabel1.setText("    Sistema de inicio de secion de MiTiendita");

        validarBoton.setText("validar");
        validarBoton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validarBotonActionPerformed(evt);
            }
        });

        botonDeRegistro.setText("registrarse");
        botonDeRegistro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDeRegistroActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        jLabel2.setText("eres nuevo aqui? =>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(147, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(contraseñaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(usuarioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(23, 23, 23)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(textUsuario)
                                    .addComponent(TXTcontrasena, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addComponent(validarBoton))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(botonDeRegistro, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(14, 14, 14))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(124, 124, 124)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(usuarioLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(contraseñaLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(validarBoton)
                    .addComponent(TXTcontrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonDeRegistro)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void textUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textUsuarioActionPerformed
        
    }//GEN-LAST:event_textUsuarioActionPerformed

    private void validarBotonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validarBotonActionPerformed
        String correo = textUsuario.getText().trim();
        String password = TXTcontrasena.getText().trim();
    
        String tipoUsuario = validarLogin(correo, password);
    
        if (tipoUsuario != null) {
            javax.swing.JOptionPane.showMessageDialog(this, "Login exitoso como " + tipoUsuario, "Éxito", javax.swing.JOptionPane.INFORMATION_MESSAGE);
        
       
            switch (tipoUsuario.toLowerCase()) {
                case "admin" -> {
                    AdministradorFrame administrador = new AdministradorFrame();
                    administrador.setVisible(true);
                    this.dispose();
                }
                case "vendedor" -> {
                    try {
                        try (Connection conn = (Connection) ConexionBD.getConexion()) {
                            String sql1 = "SELECT id_usuario FROM usuarios WHERE correo = ? AND password = ?";
                            PreparedStatement ps1 = conn.prepareStatement(sql1);
                            ps1.setString(1, correo);
                            ps1.setString(2, password);
                            ResultSet rs1 = ps1.executeQuery();
                            
                            if (rs1.next()) {
                                String idUsuario = rs1.getString("id_usuario");
                                
                                String sql2 = "SELECT id_vendedor FROM vendedorespuente WHERE id_usuario = ?";
                                PreparedStatement ps2 = conn.prepareStatement(sql2);
                                ps2.setString(1, idUsuario);
                                ResultSet rs2 = ps2.executeQuery();
                                
                                if (rs2.next()) {
                                    String idVendedor = rs2.getString("id_vendedor");
                                    System.out.println(idVendedor);
                                    
                                    // 3. Pasar a VendedorFrame
                                    VendedorFrame vendedor = new VendedorFrame(idVendedor);
                                    vendedor.setVisible(true);
                                    this.dispose();
                                } else {
                                    JOptionPane.showMessageDialog(null, "No se encontró al vendedor asociado.");
                                }
                                
                            } else {
                                JOptionPane.showMessageDialog(null, "Correo o contraseña incorrectos.");
                            }       }

            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al obtener datos del vendedor: " + e.getMessage());
                e.printStackTrace();
            }
                        }
                case "cliente" -> {
                    try {
                try (Connection conn = ConexionBD.getConexion()) {
                    String sql1 = "SELECT id_usuario FROM usuarios WHERE correo = ? AND password = ?";
                    PreparedStatement ps1 = conn.prepareStatement(sql1);
                    ps1.setString(1, correo);
                    ps1.setString(2, password);
                    ResultSet rs1 = ps1.executeQuery();

                    if (rs1.next()) {
                        String idUsuario = rs1.getString("id_usuario");
                        String sql2 = "SELECT id_comprador FROM clientepuente WHERE id_usuario = ?";
                        PreparedStatement ps2 = conn.prepareStatement(sql2);
                        ps2.setString(1, idUsuario);
                        ResultSet rs2 = ps2.executeQuery();

                        if (rs2.next()) {
                            String idCliente = rs2.getString("id_comprador");
                            System.out.println(idCliente);
                    
                            ClienteFrame cliente = new ClienteFrame(idCliente);
                            cliente.setVisible(true);
                            this.dispose();
                        } else {
                            JOptionPane.showMessageDialog(null, "No se encontró al cliente asociado.");
                        }

                    } else {
                        JOptionPane.showMessageDialog(null, "Correo o contraseña incorrectos.");
                    }
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(null, "Error al iniciar sesión como cliente: " + e.getMessage());
            }
                }
                default -> javax.swing.JOptionPane.showMessageDialog(this, "Tipo de usuario desconocido", "Advertencia", javax.swing.JOptionPane.WARNING_MESSAGE); 
            }

        } else {
            javax.swing.JOptionPane.showMessageDialog(this, "Correo o contraseña incorrectos", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_validarBotonActionPerformed

    private void botonDeRegistroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDeRegistroActionPerformed
        RegistroFrame registro = new RegistroFrame(); 
        registro.setVisible(true); 
        this.dispose(); 
    }//GEN-LAST:event_botonDeRegistroActionPerformed
    
    public String validarLogin(String correo, String password) {
        String sql = "SELECT tipo_usuario FROM usuarios WHERE correo = ? AND password = ?";
        try (java.sql.Connection conn = ConexionBD.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            ps.setString(1, correo);
            ps.setString(2, password); 
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                return rs.getString("tipo_usuario"); 
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null; 
}

    
   
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(() -> {
            new InicioSesion().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField TXTcontrasena;
    private javax.swing.JButton botonDeRegistro;
    private javax.swing.JLabel contraseñaLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField textUsuario;
    private javax.swing.JLabel usuarioLabel;
    private javax.swing.JButton validarBoton;
    // End of variables declaration//GEN-END:variables
}
