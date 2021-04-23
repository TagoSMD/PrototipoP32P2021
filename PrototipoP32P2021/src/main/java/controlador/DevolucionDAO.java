/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Conexion;
import modelo.Devolucion;

/**
 * 
 * @author Santiago Martinez Diaz
 */
public class DevolucionDAO {

      private static final String sql_select = "SELECT Codigo_Devolucion, Codigo_Renta, Fecha_Devolucion FROM Devoluciones";
    private static final String sql_insert = "INSERT INTO Devoluciones VALUES(?,?,?)";
    private static final String SQL_UPDATE = "UPDATE Devoluciones SET Codigo_Devolucion=?, Codigo_Renta=?, Fecha_Devolucion=? WHERE Codigo_Devolucion = ?";
    private static final String sql_delete = "DELETE FROM Devoluciones WHERE Codigo_Tienda=?";
    private static final String sql_query = "SELECT Codigo_Devolucion, Codigo_Renta, Fecha_Devolucion FROM Devoluciones WHERE Codigo_Tienda=?";

    public List<Devolucion> select() throws SQLException {
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        Devolucion cuenta = null;
        List<Devolucion> tipo1 = new ArrayList<Devolucion>();

        try {
            con = Conexion.getConnection();
            stmt = con.prepareStatement(sql_select);
            rs = stmt.executeQuery();

            while (rs.next()) {
                String Codigo_Devolucion = rs.getString("Codigo_Devolucion");
                String Codigo_Renta = rs.getString("Codigo_Renta");
                String Fecha_Devolucion = rs.getString("Fecha_Devolucion");
              
 
                cuenta = new Devolucion();
               cuenta.setCodigo_Devolucion(Codigo_Devolucion);
                cuenta.setCodigo_Renta(Codigo_Renta);
                cuenta.setFecha_Devolucion(Fecha_Devolucion);
             

                tipo1.add(cuenta);
            }
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            Conexion.close(con);
            Conexion.close(stmt);
            Conexion.close(rs);
        }
        return tipo1;
    }

    public int insert(Devolucion cuenta) {
        Connection con = null;
        PreparedStatement stmt = null;
        int rows = 0;
        try {
            con = Conexion.getConnection();
            stmt = con.prepareStatement(sql_insert);
            stmt.setString(1, cuenta.getCodigo_Devolucion());
            stmt.setString(2, cuenta.getCodigo_Renta());
            stmt.setString(3, cuenta.getFecha_Devolucion());
            rows = stmt.executeUpdate();

            JOptionPane.showMessageDialog(null, "Registro exitoso");
        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            Conexion.close(con);
            Conexion.close(stmt);
        }
        return rows;
    }



    public int delete(Devolucion cuenta) {
        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(sql_delete);
             stmt.setString(1, cuenta.getCodigo_Devolucion());
            rows = stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, " Eliminado Con Exito");
        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return rows;
    }

    public Devolucion query(Devolucion cuenta) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Devolucion> tipotr = new ArrayList<Devolucion>();
        int rows = 0;
        try {
            conn = Conexion.getConnection();
            stmt = conn.prepareStatement(sql_query);
            stmt.setString(1, cuenta.getCodigo_Devolucion());
            rs = stmt.executeQuery();
                 while (rs.next()) {
                String Codigo_Devolucion = rs.getString("Codigo_Devolucion");
                String Codigo_Renta = rs.getString("Codigo_Renta");
                String Fecha_Devolucion = rs.getString("Fecha_Devolucion");
              
 
                cuenta = new Devolucion();
               cuenta.setCodigo_Devolucion(Codigo_Devolucion);
                cuenta.setCodigo_Renta(Codigo_Renta);
                cuenta.setFecha_Devolucion(Fecha_Devolucion);
             
                rows++;
            }

        } catch (Exception ex) {
            System.out.println(ex);
        } finally {
            Conexion.close(rs);
            Conexion.close(stmt);
            Conexion.close(conn);
        }
        return cuenta;
    }




}
