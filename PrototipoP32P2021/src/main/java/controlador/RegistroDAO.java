/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import modelo.Conexion;
import modelo.Registro1;



/**
 *
 * @author TagoKG
 */
public class RegistroDAO {
    
      private static final String SQL_INSERT = "INSERT INTO usuario(username, password) VALUES(?, ?)";
    
         public int insert(Registro1 usuario) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);
            stmt.setString(1, usuario.getUsername());
            stmt.setString(2, usuario.getPassword());

            JOptionPane.showMessageDialog(null, "Registro De Usuario exitoso");
            rows = stmt.executeUpdate();
            
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        

        return rows;
    }
         


}
