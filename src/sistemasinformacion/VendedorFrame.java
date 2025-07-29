
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
public class VendedorFrame extends javax.swing.JFrame {

    private final String idVendedor;

    public VendedorFrame(String idVendedor) {
        initComponents();
        this.setLocationRelativeTo(null);
         this.idVendedor = idVendedor;
    }

    private VendedorFrame() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        botonAnadirProducto = new javax.swing.JButton();
        botonQuitarProducto = new javax.swing.JButton();
        botonVerProducto = new javax.swing.JButton();
        botonEditarProducto = new javax.swing.JButton();
        botonCerrarSesion = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        jLabel1.setText("              Vendedor interfaz");

        botonAnadirProducto.setText("añadir producto");
        botonAnadirProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonAnadirProductoActionPerformed(evt);
            }
        });

        botonQuitarProducto.setText("quitar producto");
        botonQuitarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonQuitarProductoActionPerformed(evt);
            }
        });

        botonVerProducto.setText("ver producto");
        botonVerProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonVerProductoActionPerformed(evt);
            }
        });

        botonEditarProducto.setText("editar producto");
        botonEditarProducto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonEditarProductoActionPerformed(evt);
            }
        });

        botonCerrarSesion.setText("cerrar sesion");
        botonCerrarSesion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCerrarSesionActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 168, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(157, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(botonEditarProducto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonVerProducto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonQuitarProducto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botonAnadirProducto, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(botonCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(17, 17, 17))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(botonAnadirProducto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonQuitarProducto)
                        .addGap(18, 18, 18)
                        .addComponent(botonVerProducto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(botonEditarProducto))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(botonCerrarSesion)
                .addContainerGap(42, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonAnadirProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonAnadirProductoActionPerformed
        AnadirProducto anadir = new AnadirProducto(idVendedor);
        anadir.setVisible(true); 
        this.dispose(); 
    }//GEN-LAST:event_botonAnadirProductoActionPerformed

    private void botonVerProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonVerProductoActionPerformed
        VerProducto ver = new VerProducto(idVendedor); 
        ver.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_botonVerProductoActionPerformed

    private void botonEditarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonEditarProductoActionPerformed
        EditarProductoFrame editar = new EditarProductoFrame(idVendedor); 
        editar.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_botonEditarProductoActionPerformed

    private void botonCerrarSesionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCerrarSesionActionPerformed
        InicioSesion sesion = new InicioSesion(); 
        sesion.setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_botonCerrarSesionActionPerformed

    private void botonQuitarProductoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonQuitarProductoActionPerformed
        QuitarProductoFrameVendedor quitar = new QuitarProductoFrameVendedor(idVendedor); 
        quitar.setVisible(true); 
        this.dispose(); 
    }//GEN-LAST:event_botonQuitarProductoActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VendedorFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonAnadirProducto;
    private javax.swing.JButton botonCerrarSesion;
    private javax.swing.JButton botonEditarProducto;
    private javax.swing.JButton botonQuitarProducto;
    private javax.swing.JButton botonVerProducto;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
