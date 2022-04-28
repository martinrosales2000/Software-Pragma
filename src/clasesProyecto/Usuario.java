/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesProyecto;

import GetSet.GetSetUser;
import claseConexion.conexion;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Augus
 */
public class Usuario {
    
    conexion oCon = new conexion();
    GetSetUser alp = new GetSetUser();
    java.sql.Statement st;
    ResultSet rs;


    public void insertar( int id_usuario, String tipo_usuario, String nombre_usuario, String password) {
        try {
            Connection conexion = oCon.conectar();
            st = conexion.createStatement();
            String sql = "INSERT INTO usuario(id_usuario, tipo_usuario, nombre_usuario, password)"
                    + "VALUES (" + id_usuario + ", '" + tipo_usuario + "', '" + nombre_usuario + "', '" + password + "');";
            st.execute(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "El registro se a guardado correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El registro no se guardo correctamente", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void Editar(int id_usuario, String tipo_usuario, String nombre_usuario, String password) {
        try {
            Connection conexion = oCon.conectar();
            st = conexion.createStatement();
            String sql = "UPDATE usuario SET tipo_usuario='"+ tipo_usuario +"', nombre_usuario='"+nombre_usuario+"', password="+ password+" WHERE id_usuario="+id_usuario+";";
            st.execute(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "El registro se a guardado correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El registro no se guardo correctamente", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void eliminar(int IdUser) {
        try {
            Connection conexion = oCon.conectar();
            st = conexion.createStatement();
            String sql = "Delete from usuario where id_usuario ="+IdUser+";";
            st.execute(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "El registro se a eliminado correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El registro no se guardo correctamente", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }
    
}
