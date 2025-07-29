
package ConexionBD;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConexionBD {
    private static final String URL = "jdbc:mysql://localhost:3306/proyectosis"; 
    private static final String USER = "root"; 
    private static final String PASSWORD = ""; 

    
    public static Connection getConexion() {
        Connection conn = null;
        try {
          
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("conectado correctamente");
        } catch (SQLException ex) {
            System.out.println("no fue posible");
        }
        return conn;
    }
    
      
   /** public static void main(String[] args) {
        Connection conn = getConexion();
        if (conn != null) {
        System.out.println("Conexión establecida exitosamente!");
        try {
            conn.close();  
        } catch (SQLException e) {
            e.printStackTrace();
        }
        } else {
            System.out.println("Error al conectar");
        }
    }*/
}