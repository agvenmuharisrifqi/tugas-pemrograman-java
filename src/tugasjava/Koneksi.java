/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tugasjava;
import java.sql.*;
import javax.swing.*;
/**
 *
 * @author Rifqi
 */
public class Koneksi {
    private static Connection KoneksiDatabase;
    public static Connection KoneksiDB() throws SQLException {
        try {
            String DB = "jdbc:mysql://localhost:3306/penjualan";
            String user = "root";
            String pass = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            KoneksiDatabase = (Connection) DriverManager.getConnection(DB, user, pass);
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "Tidak Ada Koneksi", "Error", JOptionPane.ERROR_MESSAGE);
            System.err.println(e.getMessage());
            System.exit(0);
        }
        return KoneksiDatabase;
    }
}
