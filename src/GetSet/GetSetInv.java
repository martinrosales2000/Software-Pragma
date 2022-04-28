package GetSet;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.util.ArrayList;

public class GetSetInv {
    
    private static int IdInventario;
    private static int IdLoteProducto;
    private static String nombreProducto;
    private static int CantidadComprada;
    private static int LimiteStock;
    private static double CostoProducto;
    private static double PrecioVenta;
    private static String UbicacionEstanteria;
    private static int IdUsuario;    
    private static String usuario;


    java.sql.Statement st;
    ResultSet rs;
    
    public int getIdInventario() {
        return IdInventario;
    }
    
    public void setIdInventario(int IdInventario) {
        this.IdInventario = IdInventario;
    }
    
    public int getIdLoteProducto() {
        return IdLoteProducto;
    }
    
    public void setIdLoteProducto(int IdLoteProducto) {
        this.IdLoteProducto = IdLoteProducto;
    }
    
    public String getNombreProducto() {
        return nombreProducto;
    }
    
    public void setNombreProducto(String nombreProducto) {
        this.nombreProducto = nombreProducto;
    }
    
    public int getCantidadComprada() {
        return CantidadComprada;
    }
    
    public void setCantidadComprada(int CantidadComprada) {
        this.CantidadComprada = CantidadComprada;
    }
    
    public int getLimiteStock() {
        return LimiteStock;
    }
    
    public void setLimiteStock(int LimiteStock) {
        this.LimiteStock = LimiteStock;
    }
    
    public double getCostoProducto() {
        return CostoProducto;
    }
    
    public void setCostoProducto(double CostoProducto) {
        this.CostoProducto = CostoProducto;
    }
    
    public double getPrecioVenta() {
        return PrecioVenta;
    }
    
    public void setPrecioVenta(double PrecioVenta) {
        this.PrecioVenta = PrecioVenta;
    }
    
    public String getUbicacionEstanteria() {
        return UbicacionEstanteria;
    }
    
    public void setUbicacionEstanteria(String UbicacionEstanteria) {
        this.UbicacionEstanteria = UbicacionEstanteria;
    }
    
    public int getIdUsuario() {
        return IdUsuario;
    }
    
    public void setIdUsuario(int IdUsuario) {
        this.IdUsuario = IdUsuario;
    }
    
    public String getUsuario() {
        return usuario;
    }
    
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }
    
}
