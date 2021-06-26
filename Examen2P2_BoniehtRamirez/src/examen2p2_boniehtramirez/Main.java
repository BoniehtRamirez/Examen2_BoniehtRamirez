package examen2p2_boniehtramirez;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
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
        jd_crearBateria = new javax.swing.JDialog();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        tf_marcaBateria = new javax.swing.JTextField();
        cb_vehiculo = new javax.swing.JComboBox<>();
        sp_capacidad = new javax.swing.JSpinner();
        sp_autonomia = new javax.swing.JSpinner();
        sp_ensamblaje = new javax.swing.JSpinner();
        sp_modulos = new javax.swing.JSpinner();
        sp_carga = new javax.swing.JSpinner();
        jButton11 = new javax.swing.JButton();
        jd_crearHibrido = new javax.swing.JDialog();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        sp_kilometros = new javax.swing.JSpinner();
        sp_precio = new javax.swing.JSpinner();
        sp_pasajeros = new javax.swing.JSpinner();
        jButton12 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jt_vehiculos = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton13 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jt_baterias = new javax.swing.JTable();
        jButton7 = new javax.swing.JButton();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        cb_ensamblajeVehiculo = new javax.swing.JComboBox<>();
        cb_ensamblajeBateria = new javax.swing.JComboBox<>();
        jButton8 = new javax.swing.JButton();
        pb_barra = new javax.swing.JProgressBar();

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

        jLabel9.setText("Marca:");

        jLabel10.setText("Tipo Vehiculo:");

        jLabel11.setText("Capacidad:");

        jLabel12.setText("Autonomia:");

        jLabel13.setText("Modulos:");

        jLabel14.setText("Carga:");

        jLabel15.setText("Tiempo Ensamblaje:");

        cb_vehiculo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Hibrido", "Hibrido Enchufable", "Electrico Puro" }));

        sp_capacidad.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        sp_autonomia.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        sp_ensamblaje.setModel(new javax.swing.SpinnerNumberModel(5, 5, null, 1));

        sp_modulos.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        sp_carga.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jButton11.setText("Crear");
        jButton11.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton11MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_crearBateriaLayout = new javax.swing.GroupLayout(jd_crearBateria.getContentPane());
        jd_crearBateria.getContentPane().setLayout(jd_crearBateriaLayout);
        jd_crearBateriaLayout.setHorizontalGroup(
            jd_crearBateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearBateriaLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jd_crearBateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_crearBateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton11)
                    .addGroup(jd_crearBateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(tf_marcaBateria)
                        .addComponent(sp_capacidad, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                        .addComponent(cb_vehiculo, 0, 1, Short.MAX_VALUE)
                        .addComponent(sp_ensamblaje)
                        .addComponent(sp_modulos)
                        .addComponent(sp_carga)
                        .addComponent(sp_autonomia)))
                .addContainerGap(50, Short.MAX_VALUE))
        );
        jd_crearBateriaLayout.setVerticalGroup(
            jd_crearBateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearBateriaLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jd_crearBateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(tf_marcaBateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_crearBateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(cb_vehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_crearBateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(sp_capacidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_crearBateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(sp_autonomia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jd_crearBateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(sp_modulos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_crearBateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(sp_carga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_crearBateriaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(sp_ensamblaje, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addComponent(jButton11)
                .addGap(22, 22, 22))
        );

        jLabel18.setText("Kilometros:");

        jLabel19.setText("Pasajeros:");

        jLabel20.setText("Precio:");

        sp_kilometros.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        sp_precio.setModel(new javax.swing.SpinnerNumberModel(0.0d, 0.0d, null, 1.0d));

        sp_pasajeros.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));

        jButton12.setText("Crear");
        jButton12.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton12MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jd_crearHibridoLayout = new javax.swing.GroupLayout(jd_crearHibrido.getContentPane());
        jd_crearHibrido.getContentPane().setLayout(jd_crearHibridoLayout);
        jd_crearHibridoLayout.setHorizontalGroup(
            jd_crearHibridoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearHibridoLayout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(jd_crearHibridoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel20)
                    .addComponent(jLabel19)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jd_crearHibridoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(sp_kilometros, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sp_precio, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(sp_pasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(55, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jd_crearHibridoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton12)
                .addGap(99, 99, 99))
        );
        jd_crearHibridoLayout.setVerticalGroup(
            jd_crearHibridoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jd_crearHibridoLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jd_crearHibridoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(sp_kilometros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_crearHibridoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19)
                    .addComponent(sp_pasajeros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jd_crearHibridoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20)
                    .addComponent(sp_precio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jButton12)
                .addContainerGap(22, Short.MAX_VALUE))
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

        jButton2.setText("Listar en JList");
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

        jButton13.setText("Crear Archivo Binario");
        jButton13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton13MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton3)
                        .addGap(18, 18, 18)
                        .addComponent(jButton4)
                        .addGap(18, 18, 18)
                        .addComponent(jButton13))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 657, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(18, Short.MAX_VALUE))
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
                    .addComponent(jButton4)
                    .addComponent(jButton13))
                .addContainerGap(81, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CRUD Vehiculo", jPanel1);

        jt_baterias.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Marca", "Capacidad", "Autonomia", "Cant. Modulos", "Tipo Vehiculo", "Ensamblaje"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Integer.class, java.lang.Object.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane3.setViewportView(jt_baterias);

        jButton7.setText("Crear");
        jButton7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton7MouseClicked(evt);
            }
        });

        jButton9.setText("Modificar");
        jButton9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton9MouseClicked(evt);
            }
        });

        jButton10.setText("Eliminar");
        jButton10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton10MouseClicked(evt);
            }
        });

        jButton14.setText("Crear Archivo Binario");
        jButton14.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton14MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 656, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jButton7)
                        .addGap(18, 18, 18)
                        .addComponent(jButton9)
                        .addGap(18, 18, 18)
                        .addComponent(jButton10)
                        .addGap(18, 18, 18)
                        .addComponent(jButton14)))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7)
                    .addComponent(jButton9)
                    .addComponent(jButton10)
                    .addComponent(jButton14))
                .addContainerGap(71, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("CRUD Bateria", jPanel2);

        jLabel16.setText("Seleccione Bateria:");

        jLabel17.setText("Seleccione Vehiculo:");

        jButton8.setText("Ensamblar");
        jButton8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton8MouseClicked(evt);
            }
        });

        pb_barra.setMaximum(10);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                            .addGap(127, 127, 127)
                            .addComponent(jLabel16)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(cb_ensamblajeBateria, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(jLabel17)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(cb_ensamblajeVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                                    .addComponent(jButton8)
                                    .addGap(85, 85, 85)))))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addComponent(pb_barra, javax.swing.GroupLayout.PREFERRED_SIZE, 588, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_ensamblajeBateria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(24, 24, 24)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cb_ensamblajeVehiculo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addGap(41, 41, 41)
                .addComponent(jButton8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addComponent(pb_barra, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(144, 144, 144))
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
        } else if(cb_tipo.getSelectedIndex()==1){
            jd_crearHibrido.pack();
            jd_crearHibrido.setModal(true);
            jd_crearHibrido.setLocationRelativeTo(jd_crearVehiculo);
            jd_crearHibrido.setVisible(true);
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
            JOptionPane.showMessageDialog(this, "¡Vehiculo eliminado!");
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
        }
        actualizarModelos();
        JOptionPane.showMessageDialog(this,"¡Vehiculos modificados!");
    }//GEN-LAST:event_jButton3MouseClicked

    private void jButton11MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton11MouseClicked
        String marca, tipoVehiculo;
        int capacidad, autonomia, modulos, carga, tiempoEnsamblaje;
        
        marca = tf_marcaBateria.getText();
        tipoVehiculo = (String) cb_vehiculo.getSelectedItem();
        capacidad = (int) sp_capacidad.getValue();
        autonomia = (int) sp_autonomia.getValue();
        modulos = (int) sp_modulos.getValue();
        carga = (int) sp_carga.getValue();
        tiempoEnsamblaje = (int)sp_ensamblaje.getValue();
        
        baterias.add(new Bateria(marca,tipoVehiculo,capacidad,autonomia,modulos,carga,tiempoEnsamblaje));
        actualizarModelos();
        jd_crearBateria.setVisible(false);
        
        JOptionPane.showMessageDialog(jd_crearBateria, "¡Batería creada exitosamente!");
        
        tf_marcaBateria.setText("");
        cb_vehiculo.setSelectedIndex(0);
        sp_capacidad.setValue(0);
        sp_autonomia.setValue(0);
        sp_modulos.setValue(0);
        sp_carga.setValue(0);
        sp_ensamblaje.setValue(5);
    }//GEN-LAST:event_jButton11MouseClicked

    private void jButton7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton7MouseClicked
        jd_crearBateria.pack();
        jd_crearBateria.setModal(true);
        jd_crearBateria.setLocationRelativeTo(this);
        jd_crearBateria.setVisible(true);
    }//GEN-LAST:event_jButton7MouseClicked

    private void jButton10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton10MouseClicked
        if(jt_baterias.getSelectedRowCount()!=0){
            baterias.remove(jt_baterias.getSelectedRow());
            actualizarModelos();
            JOptionPane.showMessageDialog(this, "¡Batería eliminada!");
        } else {
            JOptionPane.showMessageDialog(this,"No ha seleccionado ninguna batería de la tabla.");
        }
    }//GEN-LAST:event_jButton10MouseClicked

    private void jButton9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton9MouseClicked
        for (int i = 0; i < jt_baterias.getRowCount(); i++) {
            baterias.get(i).setMarca((String) jt_baterias.getValueAt(i, 0));
            baterias.get(i).setCapacidad((int) jt_baterias.getValueAt(i, 1));
            baterias.get(i).setAutonomia((int) jt_baterias.getValueAt(i, 2));
            baterias.get(i).setModulos((int) jt_baterias.getValueAt(i, 3));
            baterias.get(i).setTipoVehiculo((String) jt_baterias.getValueAt(i, 4));
            baterias.get(i).setTiempoEnsamblaje((int) jt_baterias.getValueAt(i, 5));
        }
        actualizarModelos();
        JOptionPane.showMessageDialog(this,"¡Baterías modificadas!");
    }//GEN-LAST:event_jButton9MouseClicked

    private void jButton8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton8MouseClicked
        if(vehiculos.size()!=0 || baterias.size()!= 0){
            ensamblaje = new Hilo(pb_barra,(Vehiculo)cb_ensamblajeVehiculo.getSelectedItem(),(Bateria)cb_ensamblajeBateria.getSelectedItem());
            ensamblaje.start();
        } else {
            JOptionPane.showMessageDialog(this, "No hay material suficiente para ensamblar...");
        }
        
    }//GEN-LAST:event_jButton8MouseClicked

    private void jButton12MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton12MouseClicked
        String marca, modelo, carroceria;
        long VIN;
        int kilometros, pasajeros;
        double precio;
        
        marca = tf_marca.getText();
        modelo = tf_modelo.getText();
        carroceria = (String) cb_carroceria.getSelectedItem();
        VIN = (long) sp_vin.getValue();
        kilometros = (int) sp_kilometros.getValue();
        pasajeros = (int) sp_pasajeros.getValue();
        precio = (double) sp_precio.getValue();
        
        vehiculos.add(new Hibrido(kilometros,pasajeros,precio,marca,modelo,carroceria,VIN));
        actualizarModelos();
        
        jd_crearHibrido.setVisible(false);
        jd_crearVehiculo.setVisible(false);
        JOptionPane.showMessageDialog(jd_crearHibrido, "¡Vehiculo creado exitosamente!");
       
        
        tf_marca.setText("");
        tf_modelo.setText("");
        cb_carroceria.setSelectedIndex(0);
        sp_vin.setValue((long)0);
        sp_kilometros.setValue(0);
        sp_pasajeros.setValue(0);
        sp_precio.setValue((double)0);
    }//GEN-LAST:event_jButton12MouseClicked

    private void jButton13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton13MouseClicked
        ObjectOutputStream bs = null;
        FileOutputStream fs = null;
        try {
            File file = new File("./Vehiculos.bin");
            fs = new FileOutputStream(file);
            bs = new ObjectOutputStream(fs);
            
            for (Vehiculo vehiculo : vehiculos) {
                bs.writeObject(vehiculo);
                bs.flush();
                fs.flush();
            }
            
            bs.close();
            fs.close();
            
            JOptionPane.showMessageDialog(this, "¡Archivo creado exitosamente!");
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                bs.close();
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        
    }//GEN-LAST:event_jButton13MouseClicked

    private void jButton14MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton14MouseClicked
        ObjectOutputStream bs = null;
        FileOutputStream fs = null;
        try {
            File file = new File("./Vehiculos.bin");
            fs = new FileOutputStream(file);
            bs = new ObjectOutputStream(fs);
            
            for (Bateria bateria : baterias) {
                bs.writeObject(bateria);
                bs.flush();
                fs.flush();
            }
            
            bs.close();
            fs.close();
            
            JOptionPane.showMessageDialog(this, "¡Archivo creado exitosamente!");
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            try {
                bs.close();
            } catch (IOException ex) {
                Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_jButton14MouseClicked

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
    private javax.swing.JComboBox<String> cb_ensamblajeBateria;
    private javax.swing.JComboBox<String> cb_ensamblajeVehiculo;
    private javax.swing.JComboBox<String> cb_tipo;
    private javax.swing.JComboBox<String> cb_vehiculo;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton13;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JDialog jd_crearBateria;
    private javax.swing.JDialog jd_crearCombustion;
    private javax.swing.JDialog jd_crearHibrido;
    private javax.swing.JDialog jd_crearVehiculo;
    private javax.swing.JDialog jd_listarVehiculos;
    private javax.swing.JList<String> jl_vehiculos;
    private javax.swing.JTable jt_baterias;
    private javax.swing.JTable jt_vehiculos;
    private javax.swing.JProgressBar pb_barra;
    private javax.swing.JSpinner sp_autonomia;
    private javax.swing.JSpinner sp_capacidad;
    private javax.swing.JSpinner sp_carga;
    private javax.swing.JSpinner sp_cilindrada;
    private javax.swing.JSpinner sp_cilindros;
    private javax.swing.JSpinner sp_consumo;
    private javax.swing.JSpinner sp_ensamblaje;
    private javax.swing.JSpinner sp_kilometros;
    private javax.swing.JSpinner sp_modulos;
    private javax.swing.JSpinner sp_pasajeros;
    private javax.swing.JSpinner sp_precio;
    private javax.swing.JSpinner sp_vin;
    private javax.swing.JTextField tf_marca;
    private javax.swing.JTextField tf_marcaBateria;
    private javax.swing.JTextField tf_modelo;
    // End of variables declaration//GEN-END:variables
    ArrayList<Vehiculo> vehiculos = new ArrayList();
    ArrayList<Bateria> baterias = new ArrayList();
    Hilo ensamblaje;
    
    public void actualizarModelos(){
        //JTable
        DefaultTableModel tableModel = (DefaultTableModel) jt_vehiculos.getModel();
        int n = tableModel.getRowCount();
        for (int i = 0; i < n; i++)
            tableModel.removeRow(0);
        for (int i = 0; i < vehiculos.size(); i++)
            tableModel.addRow(new Object[] {vehiculos.get(i).getMarca(),vehiculos.get(i).getModelo(),vehiculos.get(i).getCarroceria(),vehiculos.get(i).getVIN()});
        jt_vehiculos.setModel(tableModel);
        
        //JList
        DefaultListModel listModel = new DefaultListModel();
        for (int i = 0; i < vehiculos.size(); i++) {
            listModel.addElement(vehiculos.get(i));
        }
        jl_vehiculos.setModel(listModel);
        
        //JTable Bateria
        tableModel = (DefaultTableModel) jt_baterias.getModel();
        n = tableModel.getRowCount();
        for (int i = 0; i < n; i++)
            tableModel.removeRow(0);
        for (int i = 0; i < baterias.size(); i++)
            tableModel.addRow(new Object[] {baterias.get(i).getMarca(),baterias.get(i).getCapacidad(),baterias.get(i).getAutonomia(),baterias.get(i).getModulos(),baterias.get(i).getTipoVehiculo(),baterias.get(i).getTiempoEnsamblaje()});
        jt_baterias.setModel(tableModel);
        
        //JComboBox
        DefaultComboBoxModel comboModel = (DefaultComboBoxModel) cb_ensamblajeBateria.getModel();
        comboModel.removeAllElements();
        for (int i = 0; i < baterias.size(); i++)
            comboModel.addElement(baterias.get(i));
        cb_ensamblajeBateria.setModel(comboModel);
        
        comboModel = (DefaultComboBoxModel) cb_ensamblajeVehiculo.getModel();
        comboModel.removeAllElements();
        for (int i = 0; i < vehiculos.size(); i++)
            comboModel.addElement(vehiculos.get(i));
        cb_ensamblajeVehiculo.setModel(comboModel);
        
    }
}