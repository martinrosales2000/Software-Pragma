/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesProyecto;

import GetSet.GetSetLP;
import claseConexion.conexion;
import java.sql.Connection;
import java.util.Date;
import java.sql.ResultSet;
import java.time.LocalDate;
import javax.swing.JOptionPane;

/**
 *
 * @author Augus
 */
public class Lote {
    
    conexion oCon = new conexion();
    GetSetLP alp = new GetSetLP();
    java.sql.Statement st;
    ResultSet rs;


    public void insertar( int id_loteProducto, String nombre_producto, LocalDate fecha_caducidad, int stock) {
        try {
            Connection conexion = oCon.conectar();
            st = conexion.createStatement();
            String sql = "INSERT INTO "+"\"loteProducto\""+"("+"\"id_loteProducto\""+", "+"\"nombre_producto\""+", "+"\"fecha_caducidad\""+", "+"\"stock\""+")"
                    + "VALUES (" +id_loteProducto + ", '" + nombre_producto + "', '" + fecha_caducidad + "', " + stock + ");";
            st.execute(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "El registro se a guardado correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El registro no se guardo correctamente 1" + e.getMessage(), "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        }
    }
    
    public void Editar(int id_loteProducto, String nombre_producto, LocalDate fecha_caducidad, int stock) {
        try {
            Connection conexion = oCon.conectar();
            st = conexion.createStatement();
            String sql = "UPDATE "+"\"loteProducto\""+" SET "+"\"nombre_producto\""+"='"+nombre_producto+"', "+"\"fecha_caducidad\""+"='"+fecha_caducidad+"', "+"\"stock\""+"="+ stock+" WHERE "+"\"id_loteProducto\""+"="+id_loteProducto+";";
            st.execute(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "El registro se a guardado correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El registro no se guardo correctamente 2 "+ e.getMessage(), "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    public void eliminar(int IdLProduc) {
        try {
            Connection conexion = oCon.conectar();
            st = conexion.createStatement();
            String sql = "Delete from "+"\"loteProducto\""+" where "+"\"id_loteProducto\""+" ="+IdLProduc+";";
            st.execute(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "El registro se a eliminado correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El registro no se guardo correctamente", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }
}
