/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.EmpleadosDAO;
import controlador.TiendasDAO;
import java.sql.SQLException;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import modelo.Peliculas;
import modelo.Tiendas;
import controlador.PeliculasDAO;
import java.util.logging.Level;
import java.util.logging.Logger;
        

/**
 *
 * @author Santiago Martinez Diaz
 */
public class FrmPeliculas1 extends javax.swing.JInternalFrame {
//Metodo Llenado de Combos consulta los dominios y datos TipoPersonaDAO y TipoPersona para obetner el codigo en el combobox
   public void llenadoDeCombos() throws SQLException  {
       TiendasDAO tipodao = new TiendasDAO();
      List<Tiendas> tipo = tipodao.select();
      Cbox_Tipo.addItem("Seleccione una opción");
      for (int i = 0; i < tipo.size(); i++) {
           Cbox_Tipo.addItem(tipo.get(i).getCodigo_Tienda());
       }
 }
   
   
   public void llenadoDeTablas() throws SQLException {
       DefaultTableModel modelo = new DefaultTableModel();
       modelo.addColumn("Codigo");
       modelo.addColumn("Nombre");
       modelo.addColumn("Autor");
       modelo.addColumn("Genero");
       modelo.addColumn("Clasificacion");
       modelo.addColumn("Duracion");
       modelo.addColumn("Precio");
       modelo.addColumn("Existencias");
       modelo.addColumn("Tienda");

       PeliculasDAO cuentaDao = new PeliculasDAO();
       List<Peliculas> cuenta = cuentaDao.select();
       JTableTransaccion.setModel(modelo);
       String[] dato = new String[9];
       for (int i = 0; i < cuenta.size(); i++) {
           dato[0] = cuenta.get(i).getCodigo_Pelicula();
           dato[1] = cuenta.get(i).getNombre_Pelicula();
           dato[2] = cuenta.get(i).getAutor_Pelicula();
           dato[3] = cuenta.get(i).getGenero_Pelicula();
           dato[4] = cuenta.get(i).getClasificacion_Pelicula();
           dato[5] = cuenta.get(i).getDuracion_Pelicula();
           dato[6] = cuenta.get(i).getPrecio_Pelicula();
           dato[7] = cuenta.get(i).getExistencias();
           dato[8] = cuenta.get(i).getTienda();
    
           modelo.addRow(dato);
       }
    }
    /**
     * Creates new form FrmPeliculas1
     */
    public FrmPeliculas1() throws SQLException {
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

        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        JTableTransaccion = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        label7 = new javax.swing.JLabel();
        TxtCodigo = new javax.swing.JTextField();
        label9 = new javax.swing.JLabel();
        label8 = new javax.swing.JLabel();
        TxtAutor = new javax.swing.JTextField();
        btnEliminar = new javax.swing.JButton();
        txtbuscado = new javax.swing.JTextField();
        btnRegistrar = new javax.swing.JButton();
        label10 = new javax.swing.JLabel();
        TxtGenero = new javax.swing.JTextField();
        Cbox_Tipo = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        TxtCuenta = new javax.swing.JTextField();
        label11 = new javax.swing.JLabel();
        TxtClasificacion = new javax.swing.JTextField();
        label12 = new javax.swing.JLabel();
        TxtDuracion = new javax.swing.JTextField();
        label13 = new javax.swing.JLabel();
        TxtPrecio = new javax.swing.JTextField();
        label14 = new javax.swing.JLabel();
        TxtExistencias = new javax.swing.JTextField();
        label15 = new javax.swing.JLabel();
        TxtNombre3 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        JTableTransaccion1 = new javax.swing.JTable();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("MantenimientoPelicula");
        setVisible(true);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalles"));

        JTableTransaccion.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JTableTransaccion.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        JTableTransaccion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Tienda", "Nombre", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(JTableTransaccion);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 523, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 203, Short.MAX_VALUE))
        );

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos"));
        jPanel1.setToolTipText("");

        label7.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label7.setText("Codigo:");

        TxtCodigo.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        TxtCodigo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        TxtCodigo.setOpaque(false);
        TxtCodigo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCodigoActionPerformed(evt);
            }
        });

        label9.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label9.setText("Tienda:");

        label8.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label8.setText("Autor:");

        TxtAutor.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        TxtAutor.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        TxtAutor.setOpaque(false);

        btnEliminar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        txtbuscado.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        btnRegistrar.setFont(new java.awt.Font("Dialog", 1, 12)); // NOI18N
        btnRegistrar.setText("Registrar");
        btnRegistrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        label10.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label10.setText("Genero:");

        TxtGenero.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        TxtGenero.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        TxtGenero.setOpaque(false);

        jButton3.setText("?");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        TxtCuenta.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        label11.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label11.setText("Clasificacion:");

        TxtClasificacion.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        TxtClasificacion.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        TxtClasificacion.setOpaque(false);

        label12.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label12.setText("Duracion:");

        TxtDuracion.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        TxtDuracion.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        TxtDuracion.setOpaque(false);

        label13.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label13.setText("Precio:");

        TxtPrecio.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        TxtPrecio.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        TxtPrecio.setOpaque(false);

        label14.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label14.setText("Existencias:");

        TxtExistencias.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        TxtExistencias.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        TxtExistencias.setOpaque(false);

        label15.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        label15.setText("Nombre:");

        TxtNombre3.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        TxtNombre3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 1, 0, new java.awt.Color(204, 204, 204)));
        TxtNombre3.setOpaque(false);

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder("Detalles"));

        JTableTransaccion1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        JTableTransaccion1.setFont(new java.awt.Font("Century Gothic", 0, 12)); // NOI18N
        JTableTransaccion1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Codigo", "Nombre", "Autor", "Genero", "Clasificacion", "Duracion", "Precio", "Existencias", "Tiendas"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true, true, true, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(JTableTransaccion1);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 704, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(txtbuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(1087, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(label9)
                        .addGap(40, 40, 40)
                        .addComponent(Cbox_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TxtCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(label15)
                            .addGap(56, 56, 56)
                            .addComponent(TxtNombre3, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(label8)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(71, 71, 71)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(TxtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TxtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TxtClasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TxtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TxtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(TxtExistencias, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addComponent(label11)
                            .addComponent(label12)
                            .addComponent(label13)
                            .addComponent(label14)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(label7)
                                .addGap(60, 60, 60)
                                .addComponent(TxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(label10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label7, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label15, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtNombre3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label8, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label10, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtGenero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label11, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtClasificacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label12, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label13, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(label14, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TxtExistencias, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(label9, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(66, 66, 66))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TxtCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jButton3)
                                    .addComponent(Cbox_Tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(58, 58, 58))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)))
                .addComponent(txtbuscado, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void TxtCodigoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCodigoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCodigoActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        PeliculasDAO tipodAO = new PeliculasDAO();
        Peliculas tipoEliminar = new Peliculas();
        //Metodo Eliminar utilizando el codigo de tipo transaccion para eliminarlo de la bd
        tipoEliminar.setCodigo_Pelicula((txtbuscado.getText()));
        tipodAO.delete(tipoEliminar);
   
       try {
           llenadoDeTablas();
       } catch (SQLException ex) {
           Logger.getLogger(FrmPeliculas1.class.getName()).log(Level.SEVERE, null, ex);
       }
      
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        PeliculasDAO tipodao = new PeliculasDAO();
        Peliculas insertartipo = new Peliculas();
        insertartipo.setCodigo_Pelicula(TxtCodigo.getText());
        insertartipo.setNombre_Pelicula(TxtNombre3.getText());
        insertartipo.setAutor_Pelicula(TxtAutor.getText());
        insertartipo.setGenero_Pelicula(TxtGenero.getText());
        insertartipo.setClasificacion_Pelicula(TxtClasificacion.getText());
        insertartipo.setDuracion_Pelicula(TxtDuracion.getText());
        insertartipo.setPrecio_Pelicula(TxtPrecio.getText());
        insertartipo.setExistencias(TxtExistencias.getText());
 
        insertartipo.setTienda(Cbox_Tipo.getSelectedItem().toString());
        tipodao.insert(insertartipo);
        try {
            llenadoDeTablas();
        } catch (SQLException ex) {
            Logger.getLogger(FrmEmpleado.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        String val =Cbox_Tipo.getSelectedItem().toString();
        TiendasDAO perfilDAO = new TiendasDAO();
        Tiendas consultar = new Tiendas();
        consultar.setCodigo_Tienda(val);
        consultar=perfilDAO.query(consultar);

        TxtCuenta.setText(consultar.getNombre_Tienda());
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Cbox_Tipo;
    private javax.swing.JTable JTableTransaccion;
    private javax.swing.JTable JTableTransaccion1;
    private javax.swing.JTextField TxtAutor;
    private javax.swing.JTextField TxtClasificacion;
    private javax.swing.JTextField TxtCodigo;
    private javax.swing.JTextField TxtCuenta;
    private javax.swing.JTextField TxtDuracion;
    private javax.swing.JTextField TxtExistencias;
    private javax.swing.JTextField TxtGenero;
    private javax.swing.JTextField TxtNombre3;
    private javax.swing.JTextField TxtPrecio;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel label10;
    private javax.swing.JLabel label11;
    private javax.swing.JLabel label12;
    private javax.swing.JLabel label13;
    private javax.swing.JLabel label14;
    private javax.swing.JLabel label15;
    private javax.swing.JLabel label7;
    private javax.swing.JLabel label8;
    private javax.swing.JLabel label9;
    private javax.swing.JTextField txtbuscado;
    // End of variables declaration//GEN-END:variables
}
