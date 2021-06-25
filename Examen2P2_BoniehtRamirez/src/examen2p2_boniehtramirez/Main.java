package examen2p2_boniehtramirez;

import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Main extends javax.swing.JFrame {

    public Main() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jd_crearVehiculo = new javax.swing.JDialog();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cb_tipo = new javax.swing.JComboBox<>();
        tf_marca = new javax.swing.JTextField();
        tf_modelo = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();
        cb_carroceria = new javax.swing.JComboBox<>();
        sp_vin = new javax.swing.JSpinner();
        jd_crearCombustion = new javax.swing.JDialog();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jButton6 = new javax.swing.JButton();
        sp_cilindrada = new javax.swing.JSpinner();
        sp_cilindros = new javax.swing.JSpinner();
        sp_consumo = new javax.swing.JSpinner();
        jd_listarVehiculos = new javax.swing.JDialog();
        jScrollPane2 = new javax.swing.JScrollPane();
        jl_vehiculos = new javax.swing.JList<>();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_vehiculos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();

        jLabel1.setText("Marca:");

        jLabel2.setText("Modelo:");

        jLabel3.setText("Carroceria:");

        jLabel4.setText("VIN:");

        jLabel5.setText("Tipo:");

        cb_tipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Combustion", "Hibirido", "Hibrido Enchufable", "Electrico Puro" }));

        jButton5.setText("Siguiente");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton5MouseClicked(evt);
            }
        });

        cb_carroceria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Familiar", "SUV", "Compacto", "Subcompacto", "Deportivo" }));

        sp_vin.setModel(new javax.swing.SpinnerNumberModel(0L, 0L, null, 1L));

        javax.swing.GroupLayout jd_crearVehiculoLayout = new javax.swing.GroupLayout(jd_crearVehiculo.getContentPane());
        jd_crearVehiculo.getContentPane().setLayout(jd_crearVehiculoLayout);
        jd_crearVehiculoLayout.setHorizontalGroup(
            jd_crearVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearVehiculoLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jd_crearVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel3)
                    .addGroup(jd_crearVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel2)
                        .addComponent(jLabel1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_crearVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tf_marca)
                    .addComponent(tf_modelo)
                    .addComponent(cb_tipo, 0, 193, Short.MAX_VALUE)
                    .addGroup(jd_crearVehiculoLayout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jButton5))
                    .addComponent(cb_carroceria, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(sp_vin))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jd_crearVehiculoLayout.setVerticalGroup(
            jd_crearVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearVehiculoLayout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jd_crearVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(tf_marca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_crearVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(tf_modelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_crearVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cb_carroceria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_crearVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(sp_vin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_crearVehiculoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(cb_tipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton5)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        jLabel6.setText("Cilindrada del Motor:");

        jLabel7.setText("Cilindros en el Motor:");

        jLabel8.setText("Consumo Combustible:");

        jButton6.setText("Crear");
        jButton6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton6MouseClicked(evt);
            }
        });

        sp_cilindrada.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        sp_cilindros.setModel(new javax.swing.SpinnerNumberModel(3, 3, 8, 1));

        sp_consumo.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        javax.swing.GroupLayout jd_crearCombustionLayout = new javax.swing.GroupLayout(jd_crearCombustion.getContentPane());
        jd_crearCombustion.getContentPane().setLayout(jd_crearCombustionLayout);
        jd_crearCombustionLayout.setHorizontalGroup(
            jd_crearCombustionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearCombustionLayout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(jd_crearCombustionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton6)
                    .addComponent(jLabel7)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_crearCombustionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(sp_cilindrada, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
                    .addComponent(sp_cilindros)
                    .addComponent(sp_consumo))
                .addContainerGap(48, Short.MAX_VALUE))
        );
        jd_crearCombustionLayout.setVerticalGroup(
            jd_crearCombustionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearCombustionLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(jd_crearCombustionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(sp_cilindrada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_crearCombustionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(sp_cilindros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_crearCombustionLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(sp_consumo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton6)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jl_vehiculos.setModel(new DefaultListModel());
        jScrollPane2.setViewportView(jl_vehiculos);

        javax.swing.GroupLayout jd_listarVehiculosLayout = new javax.swing.GroupLayout(jd_listarVehiculos.getContentPane());
        jd_listarVehiculos.getContentPane().setLayout(jd_listarVehiculosLayout);
        jd_listarVehiculosLayout.setHorizontalGroup(
            jd_listarVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_listarVehiculosLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        jd_listarVehiculosLayout.setVerticalGroup(
            jd_listarVehiculosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_listarVehiculosLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(43, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jt_vehiculos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Marca", "Modelo", "Carroceria", "VIN"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Long.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jt_vehiculos);

        jButton1.setText("Crear");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jButton2.setText("Listar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jButton3.setText("Modificar");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jButton4.setText("Eliminar");
        jButton4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton4MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 651, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CRUD Vehiculo", jPanel1);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 443, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("CRUD Bateria", jPanel2);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 690, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 443, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Hilo", jPanel3);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseClicked
        if(cb_tipo.getSelectedIndex()==0){
            jd_crearCombustion.pack();
            jd_crearCombustion.setModal(true);
            jd_crearCombustion.setLocationRelativeTo(jd_crearVehiculo);
            jd_crearCombustion.setVisible(true);
        }
    }//GEN-LAST:event_jButton5MouseClicked

    private void jButton6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton6MouseClicked
        String marca, modelo, carroceria;
        long VIN;
        int cilindradaMotor, cilindrosMotor, consumoCombustible;
        
        marca = tf_marca.getText();
        modelo = tf_modelo.getText();
        carroceria = (String) cb_carroceria.getSelectedItem();
        VIN = (long) sp_vin.getValue();
        cilindradaMotor = (int) sp_cilindrada.getValue();
        cilindrosMotor = (int) sp_cilindros.getValue();
        consumoCombustible = (int) sp_consumo.getValue();
        
        vehiculos.add(new Combustion(cilindradaMotor,cilindrosMotor,consumoCombustible,marca,modelo,carroceria,VIN));
        actualizarModelos();
        
        jd_crearCombustion.setVisible(false);
        jd_crearVehiculo.setVisible(false);
        JOptionPane.showMessageDialog(jd_crearCombustion, "¡Vehiculo creado exitosamente!");
       
        
        tf_marca.setText("");
        tf_modelo.setText("");
        cb_carroceria.setSelectedIndex(0);
        sp_vin.setValue((long)0);
        sp_cilindrada.setValue(0);
        sp_cilindros.setValue(3);
        sp_consumo.setValue(0);
    }//GEN-LAST:event_jButton6MouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        jd_crearVehiculo.pack();
        jd_crearVehiculo.setModal(true);
        jd_crearVehiculo.setLocationRelativeTo(this);
        jd_crearVehiculo.setVisible(true);
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        jd_listarVehiculos.pack();
        jd_listarVehiculos.setModal(true);
        jd_listarVehiculos.setLocationRelativeTo(this);
        jd_listarVehiculos.setVisible(true);
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton4MouseClicked
        if(jt_vehiculos.getSelectedRowCount()!=0){
            vehiculos.remove(jt_vehiculos.getSelectedRow());
            actualizarModelos();
            JOptionPane.showMessageDialog(this, "¡Vehiculo/s eliminados!");
        } else {
            JOptionPane.showMessageDialog(this,"No ha seleccionado ningun vehiculo de la tabla.");
        }
    }//GEN-LAST:event_jButton4MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        for (int i = 0; i < jt_vehiculos.getRowCount(); i++) {
            vehiculos.get(i).setMarca((String) jt_vehiculos.getValueAt(i, 0));
            vehiculos.get(i).setModelo((String) jt_vehiculos.getValueAt(i, 1));
            vehiculos.get(i).setCarroceria((String) jt_vehiculos.getValueAt(i, 2));
            vehiculos.get(i).setVIN((long) jt_vehiculos.getValueAt(i, 3));
            
            actualizarModelos();
            JOptionPane.showMessageDialog(this,"¡Vehiculos modificados!");
        }
    }//GEN-LAST:event_jButton3MouseClicked

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cb_carroceria;
    private javax.swing.JComboBox<String> cb_tipo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JDialog jd_crearCombustion;
    private javax.swing.JDialog jd_crearVehiculo;
    private javax.swing.JDialog jd_listarVehiculos;
    private javax.swing.JList<String> jl_vehiculos;
    private javax.swing.JTable jt_vehiculos;
    private javax.swing.JSpinner sp_cilindrada;
    private javax.swing.JSpinner sp_cilindros;
    private javax.swing.JSpinner sp_consumo;
    private javax.swing.JSpinner sp_vin;
    private javax.swing.JTextField tf_marca;
    private javax.swing.JTextField tf_modelo;
    // End of variables declaration//GEN-END:variables
    ArrayList<Vehiculo> vehiculos = new ArrayList();
    
    public void actualizarModelos(){
        //JTable
        DefaultTableModel tableModel = (DefaultTableModel) jt_vehiculos.getModel();
        int n = tableModel.getRowCount();
        for (int i = 0; i < n; i++) {
            tableModel.removeRow(0);
        }
        for (int i = 0; i < vehiculos.size(); i++) {
            tableModel.addRow(new Object[] {vehiculos.get(i).getMarca(),vehiculos.get(i).getModelo(),vehiculos.get(i).getCarroceria(),vehiculos.get(i).getVIN()});
        }
        jt_vehiculos.setModel(tableModel);
        
        //JList
        DefaultListModel listModel = new DefaultListModel();
        for (int i = 0; i < vehiculos.size(); i++) {
            listModel.addElement(vehiculos.get(i));
        }
        jl_vehiculos.setModel(listModel);
    }
}