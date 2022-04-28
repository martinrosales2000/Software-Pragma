/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clasesProyecto;

import java.sql.Connection;
import claseConexion.conexion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import GetSet.GetSetInv;


/**
 *
 * @author Augus
 */
public class Venta {
    
    conexion oCon = new conexion();
    GetSetInv ace = new GetSetInv();
    java.sql.Statement st;
    ResultSet rs;


    public void insertar(int id_venta, double subTotal, int id_usuario) {
        try {
            Connection conexion = oCon.conectar();
            st = conexion.createStatement();
            String sql = "INSERT INTO venta (id_venta, subTotal, id_usuario) "
                    + "VALUES (" + id_venta + ", " + subTotal + ", " + id_usuario + ");";
            st.execute(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "El registro se a guardado correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El registro no se guardo correctamente", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }
    
//    public void Editar(int Id_inventario, int id_loteProducto, int cantidadComprada, int LimiteStock, double costoProducto, double precioVenta, String UbicacionEstanteria, int idUsuario) {
//        try {
//            Connection conexion = oCon.conectar();
//            st = conexion.createStatement();
//            String sql = "UPDATE Inventario SET "+"\"id_loteProducto\"=" + id_loteProducto + ", cantidad_comprada=" + cantidadComprada + ", limite_stock= " + LimiteStock + ", costo_producto=" + costoProducto + ","
//            + " precio_venta=" + precioVenta + ", ubicacion_estanteria = '" + UbicacionEstanteria + "', id_usuario=" + idUsuario + " WHERE id_inventario=" + Id_inventario + ";";
//            st.execute(sql);
//            st.close();
//            conexion.close();
//            JOptionPane.showMessageDialog(null, "El registro se a guardado correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "El registro no se guardo correctamente", "Mensaje", JOptionPane.ERROR_MESSAGE);
//        }
//    }
    
    
    public void eliminar(int id_venta) {
        try {
            Connection conexion = oCon.conectar();
            st = conexion.createStatement();
            String sql = "Delete from venta where id_venta ="+id_venta+";";
            st.execute(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "El registro se a eliminado correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El registro no se guardo correctamente", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }
}
