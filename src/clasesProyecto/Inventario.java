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
import java.util.ArrayList;
import javax.swing.JOptionPane;
import GetSet.GetSetInv;
import java.util.List;

/**
 *
 * @author Augus
 */
public class Inventario {

    conexion oCon = new conexion();
    GetSetInv ace = new GetSetInv();
    java.sql.Statement st;
    ResultSet rs;


    public void insertar(int Id_inventario, int id_loteProducto, int cantidadComprada, int LimiteStock, double costoProducto, double precioVenta, String UbicacionEstanteria, int idUsuario) {
        try {
            Connection conexion = oCon.conectar();
            st = conexion.createStatement();
            String sql = "INSERT INTO Inventario(id_inventario," + "\"id_loteProducto\"" + ", cantidad_comprada,limite_stock, "
                    + "costo_producto, precio_venta, ubicacion_estanteria, id_usuario) "
                    + "VALUES (" + Id_inventario + ", " + id_loteProducto + ", " + cantidadComprada + ", " + LimiteStock + ", "
                    + "" + costoProducto + ", " + precioVenta + ", '" + UbicacionEstanteria + "', " + idUsuario + ");";
            st.execute(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "El registro se a guardado correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El registro no se guardo correctamente", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    public void Editar(int Id_inventario, int id_loteProducto, int cantidadComprada, int LimiteStock, double costoProducto, double precioVenta, String UbicacionEstanteria, int idUsuario) {
        try {
            Connection conexion = oCon.conectar();
            st = conexion.createStatement();
            String sql = "UPDATE Inventario SET "+"\"id_loteProducto\"=" + id_loteProducto + ", cantidad_comprada=" + cantidadComprada + ", limite_stock= " + LimiteStock + ", costo_producto=" + costoProducto + ","
            + " precio_venta=" + precioVenta + ", ubicacion_estanteria = '" + UbicacionEstanteria + "', id_usuario=" + idUsuario + " WHERE id_inventario=" + Id_inventario + ";";
            st.execute(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "El registro se a guardado correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El registro no se guardo correctamente", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    
    public void eliminar(int IdInv) {
        try {
            Connection conexion = oCon.conectar();
            st = conexion.createStatement();
            String sql = "Delete from inventario where id_inventario ="+IdInv+";";
            st.execute(sql);
            st.close();
            conexion.close();
            JOptionPane.showMessageDialog(null, "El registro se a eliminado correctamente", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El registro no se guardo correctamente", "Mensaje", JOptionPane.ERROR_MESSAGE);
        }
    }

//    public void cargar() {
//        try {
//            JOptionPane.showMessageDialog(null, "Entro al try", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
//            Connection conexion = oCon.conectar();
//            st = conexion.createStatement();
//            JOptionPane.showMessageDialog(null, "Paso al statement", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
//            String sql = "SELECT id_inventario,inventario." + "\"id_loteProducto\"" + ", nombre_producto, cantidad_comprada, limite_stock,"
//                    + "costo_producto, precio_venta, ubicacion_estanteria,inventario.id_usuario, nombre_usuario "
//                    + "FROM inventario JOIN " + "\"loteProducto\"" + " ON " + "inventario." + "\"id_loteProducto\"" + " =" + "\"loteProducto\"" + "." + "\"id_loteProducto\" JOIN " + "\"usuario\"" + " ON inventario.id_usuario = usuario.id_usuario;";
//            rs = st.executeQuery(sql);
//            JOptionPane.showMessageDialog(null, "Ejecutó la sentencia", "Mensaje", JOptionPane.INFORMATION_MESSAGE);
//            while (rs.next()) {
////                JOptionPane.showMessageDialog(null, rs.getInt("id_inventario"));
//                ace.setIdInventario(rs.getInt("id_inventario"));
////                JOptionPane.showMessageDialog(null, ace.getIdInventario()+"hola");
//                ace.setIdLoteProducto(rs.getInt("id_loteProducto"));
//                ace.setNombreProducto(rs.getString("nombre_producto"));
//                ace.setCantidadComprada(rs.getInt("cantidad_comprada"));
//                ace.setLimiteStock(rs.getInt("limite_stock"));
//                ace.setCostoProducto(rs.getDouble("costo_producto"));
//                ace.setPrecioVenta(rs.getDouble("precio_venta"));
//                ace.setUbicacionEstanteria(rs.getString("ubicacion_estanteria"));
//                ace.setIdUsuario(rs.getInt("id_usuario"));
//                ace.setUsuario(rs.getString("nombre_usuario"));
////                JOptionPane.showMessageDialog(null, rs.getInt("id_inventario")+"--hola");
//                this.getLista().add(ace);
//                //solo muestra los ultimos datos que itera,, hay que cambiar el tipo de dato para el retorno
//            }
//            
//            this.getListaI().add(lista);
//            st.close();
//            conexion.close();
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(null, "La consulta ha fallado" + e.getMessage(), "Mensaje", JOptionPane.INFORMATION_MESSAGE);
//        }
//
//    }
    
    
}
