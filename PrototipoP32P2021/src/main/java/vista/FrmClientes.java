
package vista;
import modelo.Clientes;
import controlador.ClientesDAO;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import java.io.File;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Santiago Martinez Diaz
 */
public class FrmClientes extends javax.swing.JInternalFrame {
 public void llenadoDeTablas() {
      try {
          DefaultTableModel modelo = new DefaultTableModel();
          modelo.addColumn("Tarjeta");
          modelo.addColumn("Nombre");
          modelo.addColumn("Dpi");
          modelo.addColumn("Telefono"); 
          modelo.addColumn("Dirrecion"); 
          modelo.addColumn("Correo"); 
          
          ClientesDAO TipoTDAO = new ClientesDAO();
          List<Clientes> tipot = TipoTDAO.select();
          TablaClientes.setModel(modelo);
          String[] dato = new String[6];
          for (int i = 0; i < tipot.size(); i++) {
              dato[0] = tipot.get(i).getNumero_Tarjeta();
              dato[1] = tipot.get(i).getNombre_Cliente();
              dato[2] = tipot.get(i).getDpi_Cliente();
              dato[3] = tipot.get(i).getTelefono_Cliente();
              dato[4] = tipot.get(i).getDirreccion_Cliente();
              dato[5] = tipot.get(i).getCorreo_Cliente();
              modelo.addRow(dato);
          }
      } catch (SQLException ex) {
          Logger.getLogger(FrmClientes.class.getName()).log(Level.SEVERE, null, ex);
      }
    }


    public void buscarcliente() {
        Clientes clienteconsultar = new Clientes();
        ClientesDAO clientedao = new ClientesDAO();
        clienteconsultar.setNumero_Tarjeta(txtbuscado.getText());
        clienteconsultar = clientedao.query(clienteconsultar);
        TxtTarjeta.setText(clienteconsultar.getNumero_Tarjeta());
        TxtNombre.setText(clienteconsultar.getNombre_Cliente());
        TxtDpi.setText(clienteconsultar.getDpi_Cliente());
        TxtTelefono.setText(clienteconsultar.getTelefono_Cliente());
        TxtDirrecion.setText(clienteconsultar.getDirreccion_Cliente());
        TxtCorreo.setText(clienteconsultar.getCorreo_Cliente());
       
    }

    /**
     * Creates new form FrmClientes
     */
    public FrmClientes() {
        initComponents();
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        label1 = new javax.swing.JLabel();
        btnEliminar = new javax.swing.JButton();
        label7 = new javax.swing.JLabel();
        TxtDpi = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        lb = new javax.swing.JLabel();
        btnRegistrar = new javax.swing.JButton();
        label8 = new javax.swing.JLabel();
        label9 = new javax.swing.JLabel();
        TxtTelefono = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        TablaClientes = new javax.swing.JTable();
        label4 = new javax.swing.JLabel();
        TxtCorreo = new javax.swing.JTextField();
        txtbuscado = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        label10 = new javax.swing.JLabel();
        label5 = new javax.swing.JLabel();
        TxtTarjeta = new javax.swing.JTextField();
        TxtNombre = new javax.swing.JTextField();
        btnLimpiar = new javax.swing.JButton();
        label6 = new javax.swing.JLabel();
        TxtDirrecion = new javax.swing.JTextField();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setTitle("Mantenimiento Clientes");
        setVisible(true);

        label1.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        label1.setText("Clientes:");

        btnEliminar.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        label7.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        label7.setText("Tarjeta:");

        TxtDpi.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        TxtDpi.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        TxtDpi.setOpaque(false);
        TxtDpi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtDpiActionPerformed(evt);
            }
        });

        btnModificar.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        lb.setForeground(new java.awt.Color(204, 204, 204));
        lb.setText(".");

        btnRegistrar.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        label8.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        label8.setText("Telefono:");

        label9.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        label9.setText("Dpi:");

        TxtTelefono.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        TxtTelefono.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        TxtTelefono.setOpaque(false);

        TablaClientes.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        TablaClientes.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Tarjeta", "Nombre", "Dpi", "Telefono", "Dirrecion", "Correo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaClientes);

        label4.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        label4.setText("Clientes:");

        TxtCorreo.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        TxtCorreo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        TxtCorreo.setOpaque(false);

        txtbuscado.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        txtbuscado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtbuscadoActionPerformed(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        label10.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        label10.setText("Dirrecion:");

        label5.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        label5.setText("Correo:");

        TxtTarjeta.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        TxtTarjeta.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        TxtTarjeta.setOpaque(false);

        TxtNombre.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        TxtNombre.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        TxtNombre.setOpaque(false);

        btnLimpiar.setFont(new java.awt.Font("Dialog", 2, 12)); // NOI18N
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 1, 1, 1, new java.awt.Color(255, 255, 255)));
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        label6.setFont(new java.awt.Font("Dialog", 2, 14)); // NOI18N
        label6.setText("Nombre:");

        TxtDirrecion.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        TxtDirrecion.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        TxtDirrecion.setOpaque(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(label7)
                                .addGap(331, 331, 331))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(54, 54, 54)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtbuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(btnLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(11, 11, 11)
                                                .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(label8)
                                                    .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(label6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(label9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                                .addGap(21, 21, 21))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(label5)
                                                .addGap(44, 44, 44)))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TxtDpi, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TxtDirrecion, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TxtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TxtTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lb, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(354, 354, 354)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 619, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(label4)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(14, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label7)
                            .addComponent(label4)
                            .addComponent(TxtTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(label1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label6))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label9)
                            .addComponent(TxtDpi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label8)
                            .addComponent(TxtTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtDirrecion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label10))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TxtCorreo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(label5))
                        .addGap(83, 83, 83)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnEliminar)
                            .addComponent(btnModificar)
                            .addComponent(btnRegistrar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnBuscar)
                            .addComponent(txtbuscado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimpiar)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(48, 48, 48)
                        .addComponent(lb)))
                .addContainerGap(52, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        ClientesDAO clienitedao = new ClientesDAO();
        Clientes clienteelminar = new Clientes();
        clienteelminar.setNumero_Tarjeta((txtbuscado.getText()));
        clienitedao.delete(clienteelminar);
        llenadoDeTablas();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void TxtDpiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtDpiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtDpiActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        ClientesDAO clienitedao = new ClientesDAO();
        Clientes clienitemodificar = new Clientes();

        clienitemodificar.setNumero_Tarjeta(txtbuscado.getText());

        clienitemodificar.setNumero_Tarjeta(TxtTarjeta.getText());
        clienitemodificar.setNombre_Cliente(TxtNombre.getText());
        clienitemodificar.setDpi_Cliente(TxtDpi.getText());
        clienitemodificar.setTelefono_Cliente(TxtTelefono.getText());
        clienitemodificar.setDirreccion_Cliente(TxtDirrecion.getText());
        clienitemodificar.setCorreo_Cliente(TxtCorreo.getText());
        clienitedao.update(clienitemodificar);
        llenadoDeTablas();
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        ClientesDAO clientedao = new ClientesDAO();
        Clientes clienteinsertar = new Clientes();
        clienteinsertar.setNumero_Tarjeta(TxtTarjeta.getText());
        clienteinsertar.setNombre_Cliente(TxtNombre.getText());

        clienteinsertar.setDpi_Cliente(TxtDpi.getText());
        clienteinsertar.setTelefono_Cliente(TxtTelefono.getText());
        clienteinsertar.setDirreccion_Cliente(TxtDirrecion.getText());
        clienteinsertar.setCorreo_Cliente(TxtCorreo.getText());
        clientedao.insert(clienteinsertar);
        llenadoDeTablas();
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void txtbuscadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbuscadoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbuscadoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscarcliente();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed

        TxtTarjeta.setText("");
        TxtNombre.setText("");
        TxtDirrecion.setText("");
        TxtDpi.setText("");
        TxtTelefono.setText("");
        TxtCorreo.setText("");
        txtbuscado.setText("");
        btnRegistrar.setEnabled(true);
        btnModificar.setEnabled(true);
        btnEliminar.setEnabled(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimpiarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaClientes;
    private javax.swing.JTextField TxtCorreo;
    private javax.swing.JTextField TxtDirrecion;
    private javax.swing.JTextField TxtDpi;
    private javax.swing.JTextField TxtNombre;
    private javax.swing.JTextField TxtTarjeta;
    private javax.swing.JTextField TxtTelefono;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel label1;
    private javax.swing.JLabel label10;
    private javax.swing.JLabel label4;
    private javax.swing.JLabel label5;
    private javax.swing.JLabel label6;
    private javax.swing.JLabel label7;
    private javax.swing.JLabel label8;
    private javax.swing.JLabel label9;
    private javax.swing.JLabel lb;
    private javax.swing.JTextField txtbuscado;
    // End of variables declaration//GEN-END:variables
}
