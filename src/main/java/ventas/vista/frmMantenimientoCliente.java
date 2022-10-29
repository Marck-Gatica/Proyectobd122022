/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventas.vista;


import ventas.modelo.daoCliente;
import ventas.controlador.clsCliente;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import java.io.File;
import seguridad.controlador.clsAplicacion;
import seguridad.modelo.daoAplicacion;



/**
 *
 * @author Marck Gatica
 */
public class frmMantenimientoCliente extends javax.swing.JInternalFrame {

     public void llenadoDeCombos() {
        daoCliente ClienteDAO = new daoCliente();
        List<clsCliente> cliente = ClienteDAO.select();
        cbox_estado.addItem("Seleccione una opción");
        for (int i = 0; i < cliente.size(); i++) {
            cbox_estado.addItem(cliente.get(i).getCliestatus());
        }
    }
     
     public void estados() {    
        cbox_estado.addItem("seleccione: "); 
        cbox_estado.addItem("1");
        cbox_estado.addItem("0");
    } 
 
    public void llenadoDeTablas() {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("Codigo Cliente");
        modelo.addColumn("Nombre");
        modelo.addColumn("Direccion");
       modelo.addColumn("Nit");
        modelo.addColumn("Telefono");
        modelo.addColumn("Estado");

        daoCliente clienteDAO = new daoCliente();
        List<clsCliente> clientes = clienteDAO.select();
        tablaVendedores.setModel(modelo);
        String[] dato = new String[6];
        for (int i = 0; i < clientes.size(); i++) {
            dato[0] = Integer.toString(clientes.get(i).getClicodigo());
            dato[1] = clientes.get(i).getClinombre();
            dato[2] = clientes.get(i).getClidireccion();
            dato[3] = clientes.get(i).getClinit();
            dato[4] = clientes.get(i).getClitelefono();
            dato[5] = clientes.get(i).getCliestatus();
            //System.out.println("vendedor:" + vendedores);
            modelo.addRow(dato);
        }
    }

    public void buscarClientes() {
        clsCliente clienteAConsultar = new clsCliente();
        daoCliente clienteDAO = new daoCliente();
        clienteAConsultar.setClicodigo(Integer.parseInt(txtbuscado.getText()));
        clienteAConsultar = clienteDAO.query(clienteAConsultar);
        txtNombre.setText(clienteAConsultar.getClinombre());
        txtDireccion.setText(clienteAConsultar.getClidireccion());
        txtNit.setText(clienteAConsultar.getClinit());
        txtTelefono.setText(clienteAConsultar.getClitelefono());
        cbox_estado.setSelectedItem(clienteAConsultar.getCliestatus());

    }

    public frmMantenimientoCliente() {
        initComponents();
        llenadoDeTablas();
        llenadoDeCombos();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lb2 = new javax.swing.JLabel();
        lbusu = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        label1 = new javax.swing.JLabel();
        btnModificar = new javax.swing.JButton();
        label3 = new javax.swing.JLabel();
        txtbuscado = new javax.swing.JTextField();
        txtNombre = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        txtDireccion = new javax.swing.JTextField();
        label5 = new javax.swing.JLabel();
        lb = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        txtNit = new javax.swing.JTextField();
        txtTelefono = new javax.swing.JTextField();
        label6 = new javax.swing.JLabel();
        label7 = new javax.swing.JLabel();
        label9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaVendedores = new javax.swing.JTable();
        cbox_estado = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();

        lb2.setForeground(new java.awt.Color(204, 204, 204));
        lb2.setText(".");

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Mantenimiento Clientes");
        setVisible(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnEliminar.setText("Eliminar");
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        getContentPane().add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 273, 95, -1));

        btnRegistrar.setText("Registrar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });
        getContentPane().add(btnRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 273, 95, -1));

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });
        getContentPane().add(btnBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(238, 305, 95, -1));

        label1.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label1.setText("Clientes");
        getContentPane().add(label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(644, 0, -1, -1));

        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });
        getContentPane().add(btnModificar, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 305, 95, -1));

        label3.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label3.setText("Nombre");
        getContentPane().add(label3, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 34, -1, -1));
        getContentPane().add(txtbuscado, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 306, 95, -1));

        txtNombre.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtNombre.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        txtNombre.setOpaque(false);
        getContentPane().add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 34, 250, 18));

        btnLimpiar.setText("Limpiar");
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });
        getContentPane().add(btnLimpiar, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 273, 95, -1));

        txtDireccion.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtDireccion.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        txtDireccion.setOpaque(false);
        getContentPane().add(txtDireccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 72, 250, 18));

        label5.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label5.setText("Direccion");
        getContentPane().add(label5, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 72, -1, -1));

        lb.setForeground(new java.awt.Color(204, 204, 204));
        lb.setText(".");
        getContentPane().add(lb, new org.netbeans.lib.awtextra.AbsoluteConstraints(337, 0, 13, -1));

        jButton2.setText("Ayuda");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 343, 95, -1));

        txtNit.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtNit.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        txtNit.setOpaque(false);
        getContentPane().add(txtNit, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 110, 250, 18));

        txtTelefono.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        txtTelefono.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        txtTelefono.setOpaque(false);
        txtTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtTelefonoActionPerformed(evt);
            }
        });
        getContentPane().add(txtTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 147, 250, -1));

        label6.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label6.setText("Telefono");
        getContentPane().add(label6, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 147, -1, -1));

        label7.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label7.setText("Nit");
        getContentPane().add(label7, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 110, -1, -1));

        label9.setFont(new java.awt.Font("Century Gothic", 1, 12)); // NOI18N
        label9.setText("Estado");
        getContentPane().add(label9, new org.netbeans.lib.awtextra.AbsoluteConstraints(24, 185, -1, -1));

        tablaVendedores.setBackground(new java.awt.Color(153, 255, 153));
        tablaVendedores.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        tablaVendedores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID Vendedor", "ID Empleado", "Correo", "Telefono", "Direccion", "Porcentaje", "Comision"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tablaVendedores);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(368, 20, 587, 303));

        cbox_estado.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        cbox_estado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbox_estadoActionPerformed(evt);
            }
        });
        getContentPane().add(cbox_estado, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 183, 250, 20));

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 3, 12)); // NOI18N
        jLabel1.setText("1 = Habilitado y 0 = Inhabilitado");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        daoCliente clienteDAO = new daoCliente();
        clsCliente clienteAEliminar = new clsCliente();
        clienteAEliminar.setClicodigo(Integer.parseInt(txtbuscado.getText()));
        clienteDAO.delete(clienteAEliminar);
        llenadoDeTablas();        
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        daoCliente clienteDAO = new daoCliente();
        clsCliente clienteAInsertar = new clsCliente();
        clienteAInsertar.setClinombre(txtNombre.getText());
        clienteAInsertar.setClidireccion(txtDireccion.getText());
        clienteAInsertar.setClinit(txtNit.getText());
        clienteAInsertar.setClitelefono(txtTelefono.getText());
        clienteAInsertar.setCliestatus(cbox_estado.getSelectedItem().toString());
        clienteDAO.insert(clienteAInsertar);
        llenadoDeTablas();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        buscarClientes();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        // TODO add your handling code here:
        daoCliente clienteDAO = new daoCliente();
        clsCliente clienteAActualizar = new clsCliente();
        clienteAActualizar.setClicodigo(Integer.parseInt(txtbuscado.getText()));
        clienteAActualizar.setClinombre(txtNombre.getText());
        clienteAActualizar.setClidireccion(txtDireccion.getText());
        clienteAActualizar.setClinit(txtNit.getText());
        clienteAActualizar.setClitelefono(txtTelefono.getText());
        clienteAActualizar.setCliestatus(cbox_estado.getSelectedItem().toString());
        clienteDAO.update(clienteAActualizar);
        llenadoDeTablas();        
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        txtNombre.setText("");
        txtDireccion.setText("");
        txtNit.setText("");
        txtTelefono.setText("");
        cbox_estado.setSelectedIndex(0);
        txtbuscado.setText("");
        btnRegistrar.setEnabled(true);
        btnModificar.setEnabled(true);
        btnEliminar.setEnabled(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        try {
            if ((new File("src\\main\\java\\ayudas\\ProcesoMayor.chm")).exists()) {
                Process p = Runtime
                        .getRuntime()
                        .exec("rundll32 url.dll,FileProtocolHandler src\\main\\java\\ayudas\\ProcesoMayor.chm");
                p.waitFor();
            } else {
                System.out.println("La ayuda no Fue encontrada");
            }
            System.out.println("Correcto");
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtTelefonoActionPerformed

    private void cbox_estadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbox_estadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbox_estadoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JComboBox<String> cbox_estado;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label3;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel label6;
    private javax.swing.JLabel label7;
    private javax.swing.JLabel label9;
    private javax.swing.JLabel lb;
    private javax.swing.JLabel lb2;
    private javax.swing.JLabel lbusu;
    private javax.swing.JTable tablaVendedores;
    private javax.swing.JTextField txtDireccion;
    private javax.swing.JTextField txtNit;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTelefono;
    private javax.swing.JTextField txtbuscado;
    // End of variables declaration//GEN-END:variables
}
