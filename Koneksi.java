/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


/**
 *
 * @author Kajay PC
 */
public class Koneksi {
      private Connection conn;

    public Connection getKoneksi() {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");

            conn = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/db_rumahsakit",
                    "root",
                    "");

            System.out.println("Koneksi Berhasil");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null,
                    "Koneksi Gagal : " + e.getMessage());

        }

        return conn;
    }
  }
