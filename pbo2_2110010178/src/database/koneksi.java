/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.PreparedStatement;
/**
 *
 * @author Rudia
 */
public class koneksi {
    public static Connection connect;
    public static Statement stmt;
    public static PreparedStatement prstmt;
    
public koneksi(){
    try {
           String url="jdbc:mysql://localhost/pbo2_2110010178";
           String user ="root";
           String password ="";
           Class.forName("com.mysql.jdbc.Driver");
           connect=DriverManager.getConnection(url, user, password);
           stmt=connect.createStatement();
           System.out.println("database berhasil terkoneksi");
    } catch (Exception e) {
           JOptionPane.showMessageDialog(null, e.toString());

    }
    
}

    
}
