/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Objeto;
import  java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class conexion {
    Connection conectar=null;
    public Connection conectar(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/fashions","root","");
            JOptionPane.showMessageDialog(null, "Conexion exitosa", "Conexion", JOptionPane.INFORMATION_MESSAGE);
        }catch(ClassNotFoundException | SQLException e){
          JOptionPane.showMessageDialog(null, "Conexion Fallida" +e, "Conexion", JOptionPane.ERROR_MESSAGE);  
        }
        return conectar;
    }

    
}

