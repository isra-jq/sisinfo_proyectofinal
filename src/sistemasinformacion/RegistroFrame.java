
package sistemasinformacion;
import ConexionBD.ConexionBD; 
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Date;
import javax.swing.JOptionPane;
import com.sun.jdi.connect.spi.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
public class RegistroFrame extends javax.swing.JFrame {

       public RegistroFrame() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        nombreTextField = new javax.swing.JTextField();
        apellidoTextField = new javax.swing.JTextField();
        ciTextField = new javax.swing.JTextField();
        nacimientoTextField = new javax.swing.JTextField();
        correoTextField = new javax.swing.JTextField();
        direccionTextField = new javax.swing.JTextField();
        jComboBox1 = new javax.swing.JComboBox<>();
        botonDeRegistrar = new javax.swing.JButton();
        jPasswordNuevo = new javax.swing.JPasswordField();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        botonDeInicionSesion = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        telefonoTexField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setAlwaysOnTop(true);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel1.setText("nombre: ");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel2.setText("apellido:");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel3.setText("ci:");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel4.setText("fecha nac: ");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel5.setText("correo: ");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel6.setText("direccion:");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel7.setText("contraseña:");

        jLabel8.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel8.setText("tipo de usuario:");

        nombreTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nombreTextFieldActionPerformed(evt);
            }
        });

        apellidoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                apellidoTextFieldActionPerformed(evt);
            }
        });

        ciTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ciTextFieldActionPerformed(evt);
            }
        });

        nacimientoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nacimientoTextFieldActionPerformed(evt);
            }
        });

        correoTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                correoTextFieldActionPerformed(evt);
            }
        });

        direccionTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionTextFieldActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "vendedor", "cliente" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        botonDeRegistrar.setText("registrar");
        botonDeRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDeRegistrarActionPerformed(evt);
            }
        });

        jPasswordNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jPasswordNuevoActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel9.setText("año/mes/dia");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel10.setText("          sistema de resgistro de MiTiendita");

        botonDeInicionSesion.setText("inicio de sesion");
        botonDeInicionSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonDeInicionSesionActionPerformed(evt);
            }
        });

        jLabel11.setText("telefono: ");

        telefonoTexField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                telefonoTexFieldActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(228, 228, 228)
                        .addComponent(botonDeRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 351, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(telefonoTexField))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombreTextField)
                            .addComponent(apellidoTextField)
                            .addComponent(ciTextField)
                            .addComponent(direccionTextField)
                            .addComponent(correoTextField)
                            .addComponent(nacimientoTextField)
                            .addComponent(jComboBox1, 0, 138, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPasswordNuevo)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(247, 247, 247)
                        .addComponent(botonDeInicionSesion)))
                .addGap(18, 18, 18))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel10)
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nombreTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(botonDeInicionSesion))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(apellidoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ciTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(nacimientoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(correoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(direccionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jPasswordNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(telefonoTexField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 92, Short.MAX_VALUE)
                .addComponent(botonDeRegistrar)
                .addGap(35, 35, 35))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void apellidoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_apellidoTextFieldActionPerformed
       
    }//GEN-LAST:event_apellidoTextFieldActionPerformed

    private void correoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_correoTextFieldActionPerformed
       
    }//GEN-LAST:event_correoTextFieldActionPerformed

    private void direccionTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionTextFieldActionPerformed
      
    }//GEN-LAST:event_direccionTextFieldActionPerformed

    public String generarNuevoIDUsuario() {
        String nuevoID = "usu-001";
        String sql = "SELECT id_usuario FROM usuarios ORDER BY id_usuario DESC LIMIT 1";

        try (java.sql.Connection conn = ConexionBD.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            if (rs.next()) {
                String ultimoID = rs.getString("id_usuario");  
                String numeroStr = ultimoID.substring(4);      
                int numero = Integer.parseInt(numeroStr);      
                numero++;                                      
               nuevoID = String.format("usu-%03d", numero);   
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }

        return nuevoID;
    }
    
    private void botonDeRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDeRegistrarActionPerformed
         String nombre = nombreTextField.getText().trim();
         String id = generarNuevoIDUsuario(); 
         String apellido = apellidoTextField.getText().trim();
         String ci = ciTextField.getText().trim();
         String fechaNacimiento = nacimientoTextField.getText().trim();
         String correo = correoTextField.getText().trim();
         String direccion = direccionTextField.getText().trim(); 
         String tipoUsuario = jComboBox1.getSelectedItem().toString();
         String contrasena = new String(jPasswordNuevo.getPassword()).trim();
         String telefono = telefonoTexField.getText().trim(); 

         if (nombre.isEmpty() || apellido.isEmpty() || ci.isEmpty() || 
             fechaNacimiento.isEmpty() || correo.isEmpty() || contrasena.isEmpty()) {
             JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios", "Advertencia", JOptionPane.WARNING_MESSAGE);
             return;
         }

         if (!fechaNacimiento.matches("\\d{4}[-/]\\d{2}[-/]\\d{2}")) {
             JOptionPane.showMessageDialog(this, "La fecha debe tener el formato AAAA-MM-DD o AAAA/MM/DD", "Error de formato", JOptionPane.ERROR_MESSAGE);
             nacimientoTextField.requestFocus();
             return;
         }

         try {
             fechaNacimiento = fechaNacimiento.replace('/', '-');
             LocalDate.parse(fechaNacimiento, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
          } catch (DateTimeParseException e) {
             JOptionPane.showMessageDialog(this, "La fecha ingresada no es válida. Asegúrate que sea real (ej: 2025-07-26)", "Error de fecha", JOptionPane.ERROR_MESSAGE);
             nacimientoTextField.requestFocus();
             return;
        }
         
         String sql = "INSERT INTO usuarios (id_usuario, nombre, apellido, ci, fecha_nacimiento, correo, telefono, direccion, tipo_usuario, password) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try (java.sql.Connection conn = ConexionBD.getConexion();
             PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, id);
            ps.setString(2, nombre);
            ps.setString(3, apellido);
            ps.setString(4, ci);
            ps.setString(5, fechaNacimiento); 
            ps.setString(6, correo);
            ps.setString(7, telefono);
            ps.setString(8, direccion);
            ps.setString(9, tipoUsuario);
            ps.setString(10, contrasena);

            int filasAfectadas = ps.executeUpdate();
            if (filasAfectadas > 0) {
                JOptionPane.showMessageDialog(this, "Usuario registrado exitosamente", "Éxito", JOptionPane.INFORMATION_MESSAGE);
                InicioSesion inicio = new InicioSesion(); 
                inicio.setVisible(true); 
                this.dispose(); 
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo registrar el usuario", "Error", JOptionPane.ERROR_MESSAGE);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(this, "Error al registrar: " + e.getMessage(), "Error SQL", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_botonDeRegistrarActionPerformed

    private void nombreTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nombreTextFieldActionPerformed
        
    }//GEN-LAST:event_nombreTextFieldActionPerformed

    private void ciTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ciTextFieldActionPerformed
        
    }//GEN-LAST:event_ciTextFieldActionPerformed
        public boolean esFechaValida(String fechaStr) {
        try {
       
            LocalDate.parse(fechaStr, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            return true;
        } catch (DateTimeParseException e) {
            return false;
        }
       }

    private void nacimientoTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nacimientoTextFieldActionPerformed
        String fecha = nacimientoTextField.getText().trim();

        if (!esFechaValida(fecha)) {
            JOptionPane.showMessageDialog(this, 
                "Formato de fecha inválido. Usa el formato AAAA-MM-DD", 
                "Error de formato", 
                JOptionPane.ERROR_MESSAGE);
            nacimientoTextField.requestFocus(); 
        }
    }//GEN-LAST:event_nacimientoTextFieldActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
       
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jPasswordNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jPasswordNuevoActionPerformed

    }//GEN-LAST:event_jPasswordNuevoActionPerformed

    private void botonDeInicionSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonDeInicionSesionActionPerformed
        InicioSesion inicio = new InicioSesion(); 
        inicio.setVisible(true); 
        this.dispose(); 
    }//GEN-LAST:event_botonDeInicionSesionActionPerformed

    private void telefonoTexFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_telefonoTexFieldActionPerformed
       
    }//GEN-LAST:event_telefonoTexFieldActionPerformed
    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistroFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField apellidoTextField;
    private javax.swing.JButton botonDeInicionSesion;
    private javax.swing.JButton botonDeRegistrar;
    private javax.swing.JTextField ciTextField;
    private javax.swing.JTextField correoTextField;
    private javax.swing.JTextField direccionTextField;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPasswordField jPasswordNuevo;
    private javax.swing.JTextField nacimientoTextField;
    private javax.swing.JTextField nombreTextField;
    private javax.swing.JTextField telefonoTexField;
    // End of variables declaration//GEN-END:variables
}
