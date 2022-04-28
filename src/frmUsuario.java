
import GetSet.GetSetUser;
import claseConexion.conexion;
import javax.swing.JOptionPane;
import clasesProyecto.Usuario;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Augus
 */
public class frmUsuario extends javax.swing.JFrame {

    /**
     * Creates new form frmMain
     */
    conexion oCon = new conexion();
    Usuario oUser = new Usuario();
    GetSetUser aceU = new GetSetUser();
    DefaultTableModel miTabla;
    String[] DataInv = new String[4];
    java.sql.Statement st;
    ResultSet rs;

    public frmUsuario() {
        initComponents();
        this.miTabla = (DefaultTableModel) this.jvTabla1.getModel();
        this.setLocationRelativeTo(this);
        this.cargarTabla();
    }

    private void cargarTabla() {
        this.miTabla.setRowCount(0);
        try {
            Connection conexion = oCon.conectar();
            st = conexion.createStatement();
            String sql = "SELECT id_usuario, tipo_usuario, nombre_usuario, password FROM usuario ORDER BY id_usuario ASC;";
            rs = st.executeQuery(sql);
            while (rs.next()) {
                DataInv[0] = Integer.toString(rs.getInt("id_usuario"));
                DataInv[1] = rs.getString("tipo_usuario");
                DataInv[2] = rs.getString("nombre_usuario");
                DataInv[3] = rs.getString("password");
                this.miTabla.addRow(DataInv);
                this.jvTabla1.setModel(miTabla);
            }
            st.close();
            conexion.close();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "La consulta ha fallado" + e.getMessage(), "Mensaje", JOptionPane.INFORMATION_MESSAGE);
        }

    }

    public void IntertfazIngresarDatos() {
        frmIngresarUser ingDat = new frmIngresarUser();
        ingDat.setVisible(true);
    }
    
    public void InterfazEditar(){
        frmEditarUser edDat = new frmEditarUser();
        edDat.setVisible(true);
    }
    
    public void InterfazEliminar(){
        frmEliminarUser edDat = new frmEliminarUser();
        edDat.setVisible(true);
    }
    
    public void InterfazInv(){
        frmMain edDat = new frmMain();
        edDat.setVisible(true);
    }
    
     public void InterfazLoteP(){
        frmLoteProducto edDat = new frmLoteProducto();
        edDat.setVisible(true);
    }
    
    public void InterfazUsuario(){
        frmUsuario edDat = new frmUsuario();
        edDat.setVisible(true);
    }
    
    public void InterfazVenta(){
        frmVenta edDat = new frmVenta();
        edDat.setVisible(true);
    }
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnIngresarVenta = new javax.swing.JButton();
        btnInventario = new javax.swing.JButton();
        btnLote = new javax.swing.JButton();
        btnUsuario = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        lblTitulo = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        btnIngresarNuevoReg = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jvTabla1 = new javax.swing.JTable();
        btnEliminar = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Software Pragma");
        setExtendedState(6);

        jPanel1.setBackground(new java.awt.Color(227, 240, 216));

        jPanel2.setBackground(new java.awt.Color(168, 209, 143));
        jPanel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(80, 127, 49), 6, true));

        jLabel1.setText("jLabel1");

        btnIngresarVenta.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnIngresarVenta.setIcon(new javax.swing.ImageIcon(getClass().getResource("/5443022_bag_christmas_gift_present_shopping_icon.png"))); // NOI18N
        btnIngresarVenta.setText("Ingresar venta");
        btnIngresarVenta.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(80, 127, 49), 3, true));
        btnIngresarVenta.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnIngresarVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarVentaActionPerformed(evt);
            }
        });

        btnInventario.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnInventario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-en-inventario-64.png"))); // NOI18N
        btnInventario.setText("Inventario");
        btnInventario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(80, 127, 49), 3, true));
        btnInventario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnInventario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInventarioActionPerformed(evt);
            }
        });

        btnLote.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnLote.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons8-caja-64.png"))); // NOI18N
        btnLote.setText("Lote");
        btnLote.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(80, 127, 49), 3, true));
        btnLote.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnLote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoteActionPerformed(evt);
            }
        });

        btnUsuario.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/3289576_user_icon.png"))); // NOI18N
        btnUsuario.setText("Usuarios");
        btnUsuario.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(80, 127, 49), 3, true));
        btnUsuario.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioActionPerformed(evt);
            }
        });

        btnCerrar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/1564506_close_exit_logout_power_icon.png"))); // NOI18N
        btnCerrar.setText("Cerrar sesión");
        btnCerrar.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(80, 127, 49), 3, true));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnLote, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnIngresarVenta, javax.swing.GroupLayout.DEFAULT_SIZE, 265, Short.MAX_VALUE)
                    .addComponent(btnInventario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(82, 82, 82)
                .addComponent(btnInventario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnIngresarVenta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnLote)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel3.setBackground(new java.awt.Color(168, 209, 143));
        jPanel3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(80, 127, 49), 6, true));

        lblTitulo.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        lblTitulo.setText("Usuarios");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/pragma logo small.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBackground(new java.awt.Color(168, 209, 143));
        jPanel4.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(80, 127, 49), 6, true));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel3.setText("© 2022 Sistema de inventario y ventas Pragma");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 898, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnIngresarNuevoReg.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnIngresarNuevoReg.setText("Ingresar nuevo usuario");
        btnIngresarNuevoReg.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIngresarNuevoRegActionPerformed(evt);
            }
        });

        jScrollPane1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jvTabla1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jvTabla1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "id usuario", "tipo usuario", "nombre usuario", "password"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jvTabla1.setRowHeight(20);
        jScrollPane1.setViewportView(jvTabla1);

        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnEliminar.setText("Eliminar usuario");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        btnEditar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnEditar.setText("Editar usuario");
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnIngresarNuevoReg)
                                .addGap(18, 18, 18)
                                .addComponent(btnEditar)
                                .addGap(18, 18, 18)
                                .addComponent(btnEliminar))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1588, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIngresarNuevoReg, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 442, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnIngresarVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarVentaActionPerformed
        this.lblTitulo.setText("Ingresar venta");
        InterfazVenta();
        this.dispose();
    }//GEN-LAST:event_btnIngresarVentaActionPerformed

    private void btnInventarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInventarioActionPerformed
        this.lblTitulo.setText("Inventario");
        InterfazInv();
        this.dispose();
    }//GEN-LAST:event_btnInventarioActionPerformed

    private void btnLoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoteActionPerformed
        this.lblTitulo.setText("Lote");
        InterfazLoteP();
        this.dispose();
    }//GEN-LAST:event_btnLoteActionPerformed

    private void btnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioActionPerformed
        this.lblTitulo.setText("Usuario");
        this.cargarTabla();
    }//GEN-LAST:event_btnUsuarioActionPerformed

    private void btnIngresarNuevoRegActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIngresarNuevoRegActionPerformed
        IntertfazIngresarDatos();
        this.dispose();
    }//GEN-LAST:event_btnIngresarNuevoRegActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed

        if (jvTabla1.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila para poder eliminar datos");
        } else {
//            String id = (String) miTabla.getValueAt(jvTabla1.getSelectedRow(), 0);
//            oInv.eliminar(Integer.parseInt(id));
            String idU = (String) miTabla.getValueAt(jvTabla1.getSelectedRow(), 0);
            String TPU = (String) miTabla.getValueAt(jvTabla1.getSelectedRow(), 1);
            String NUS = (String) miTabla.getValueAt(jvTabla1.getSelectedRow(), 2);
            String PAS = (String) miTabla.getValueAt(jvTabla1.getSelectedRow(), 3);
            aceU.setIdUsuario(Integer.parseInt(idU));
            aceU.setTipo_usuario(TPU);
            aceU.setNombre_usuario(NUS);
            aceU.setPassword(PAS);
            InterfazEliminar();
            this.dispose();
        }
        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
        if (jvTabla1.getSelectedRow() == -1) {
            JOptionPane.showMessageDialog(null, "Debe seleccionar una fila para poder editar datos");
        } else {
            String idU = (String) miTabla.getValueAt(jvTabla1.getSelectedRow(), 0);
            String TPU = (String) miTabla.getValueAt(jvTabla1.getSelectedRow(), 1);
            String NUS = (String) miTabla.getValueAt(jvTabla1.getSelectedRow(), 2);
            String PAS = (String) miTabla.getValueAt(jvTabla1.getSelectedRow(), 3);
            aceU.setIdUsuario(Integer.parseInt(idU));
            aceU.setTipo_usuario(TPU);
            aceU.setNombre_usuario(NUS);
            aceU.setPassword(PAS);
//            JOptionPane.showMessageDialog(null, idI+"--"+Ubic+"--"+idU);
            InterfazEditar();
            this.dispose();
        }
    }//GEN-LAST:event_btnEditarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new frmMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnIngresarNuevoReg;
    private javax.swing.JButton btnIngresarVenta;
    private javax.swing.JButton btnInventario;
    private javax.swing.JButton btnLote;
    private javax.swing.JButton btnUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jvTabla1;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables

    private static class oCon {

        public oCon() {
        }
    }
}