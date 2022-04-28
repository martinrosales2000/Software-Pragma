/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package claseConexion;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Augus
 */
public class conexion {
    
    Connection conexion = null;
    
    public Connection conectar()
    {
       try
        {
            Class.forName("org.postgresql.Driver");
            conexion = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/PragmaDB","postgres","1234");
//            JOptionPane.showMessageDialog(null,"Conexion establecida");
        }
        catch(Exception e) {
//            this.conexion=null; 
        JOptionPane.showMessageDialog(null,"Conexion fallida");
        }
       return conexion;
    }
    
}
