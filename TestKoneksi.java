/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package koneksi;
import java.sql.Connection;
/**
 *
 * @author Kajay PC
 */
public class TestKoneksi {
    
     public static void main(String[] args) {

        Koneksi koneksi = new Koneksi();
        Connection conn = koneksi.getKoneksi();

        if (conn != null) {
            System.out.println("Database berhasil terhubung.");
        } else {
            System.out.println("Database gagal terhubung.");
        }

    }
    
}
