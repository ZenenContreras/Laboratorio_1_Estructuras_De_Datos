/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.SettingsController;
import static Controlador.comisiones.buscarCedula;
import java.io.BufferedWriter;
//import static Main.Main.getArray;
//import static Main.Main.getText;
//import static Main.Main.imprimirMatriz;
//import static Main.Main.write;
//import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;
import javax.swing.JOptionPane;


/**
 *
 * @author User
 */
public class System_Vista extends javax.swing.JFrame {
    
    
//    //función para verificar codigo del carro en registros
//    public static boolean codigoCarroExiste(String codigo, String[][] arrayVentas) {
//        for (int i = 0; i < arrayVentas.length; i++) {
//            if (arrayVentas[i][3].equals(codigo)) { // Suponiendo que el código es la cuarta columna
//                return true;
//            }
//        }
//        return false;
//    }
    
       //Funcion para crear Archivo de ventas y validaciones de usuario
    public void registrarVentaV() {
    
//        
        String nombreVendedor = jTextFieldVentasNombre.getText();
        String cedula = jTextFieldVentasCedula.getText();
        String marca = jTextFieldVentasTipoDeAuto.getText();
        String codigo = jTextFieldVentasCodigoDelAuto.getText();
        String montoVenta = jTextFieldVentasMontoDeLaVenta.getText();
//      
        if (nombreVendedor.isEmpty() || cedula.isEmpty() || marca.isEmpty() || codigo.isEmpty() || montoVenta.isEmpty()) {
            JOptionPane.showMessageDialog(this, "Todos los campos son obligatorios.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (Double.parseDouble(montoVenta) < 0) {
            JOptionPane.showMessageDialog(this, "El monto de la venta debe ser positivo.", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
//
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("test/ventas.txt", true))) {
 
            String registro = nombreVendedor + ";" + cedula + ";" + marca + ";" + codigo + ";" + montoVenta;
//
            writer.write(registro);
            writer.flush();
            JOptionPane.showMessageDialog(this, "Venta registrada con éxito.", "Registro exitoso", JOptionPane.INFORMATION_MESSAGE);
        } catch (IOException ex) {
            JOptionPane.showMessageDialog(this, "Error al registrar la venta.", "Error", JOptionPane.ERROR_MESSAGE);
            ex.printStackTrace();
        }
    }
            
    
    
    //Funcion para saber si el codigo está repetido
//    private boolean CodigoRepetido(String nombre) {
//    try (Scanner scanner = new Scanner("test/ventas.txt")) {
//        while (scanner.hasNextLine()) {
//            String linea = scanner.nextLine();
//            if (linea.contains(nombre + ";")) {
//                return true;
//            }
//        }
//    }
//    return false;
//    }
    
    
    public System_Vista() {
        initComponents();
        
        setSize(930,590);
        setResizable(false); 
        setTitle("Panel de administración");
        setLocationRelativeTo(null); 
        
        //Controlador del settings
        SettingsController setting = new SettingsController (this);
        this.repaint(); 
        
        //Ventas
        
       
        
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
        jPanelEmpleados = new javax.swing.JPanel();
        jLabelEmpleados = new javax.swing.JLabel();
        jLabelIconoEmpleados = new javax.swing.JLabel();
        jPanelVentas = new javax.swing.JPanel();
        jLabelVentas = new javax.swing.JLabel();
        jLabelIconoVentas = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        IconoEmpresa = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabelEmpresa = new javax.swing.JLabel();
        btnSalir = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanelEmpleadosPane = new javax.swing.JPanel();
        jPanelEmpleadosRegistrar = new javax.swing.JPanel();
        jLabelEmpleadosNombre = new javax.swing.JLabel();
        jLabelEmpleadosCedula = new javax.swing.JLabel();
        jLabelEmpleadosCargo = new javax.swing.JLabel();
        jTextFieldEmpleadosNombre = new javax.swing.JTextField();
        jTextFieldEmpleadosCedula = new javax.swing.JTextField();
        jTextFieldEmpleadosCargo = new javax.swing.JTextField();
        jLabelEmpleadosTelefono = new javax.swing.JLabel();
        jTextFieldEmpleadosTelefono = new javax.swing.JTextField();
        jLabelEmpleadosFechaIngreso = new javax.swing.JLabel();
        jTextFieldEmpleadosFechaIngreso = new javax.swing.JTextField();
        jLabelEmpleadosSalarioFijo = new javax.swing.JLabel();
        jTextFieldEmpleadosSalarioFijo = new javax.swing.JTextField();
        btnEmpleadosRegistrar = new javax.swing.JButton();
        btnEmpleadosEliminar = new javax.swing.JButton();
        jLabelEmpleadosSalarioComisiones = new javax.swing.JLabel();
        jTextFieldEmpleadosSalarioComisiones = new javax.swing.JTextField();
        jLabelEmpleadosBuscar = new javax.swing.JLabel();
        jTextFieldEmpleadosBuscar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Empleados_table = new javax.swing.JTable();
        jButtonEnterEmpleados = new javax.swing.JButton();
        jButtonNombre = new javax.swing.JButton();
        jButtonSalario = new javax.swing.JButton();
        jPanelVentasPane = new javax.swing.JPanel();
        jPanelEmpleadosRegistrar1 = new javax.swing.JPanel();
        jLabelVentasNombre = new javax.swing.JLabel();
        jLabelVentasCedula = new javax.swing.JLabel();
        jLabelVentasTipoDeAuto = new javax.swing.JLabel();
        jTextFieldVentasNombre = new javax.swing.JTextField();
        jTextFieldVentasCedula = new javax.swing.JTextField();
        jLabelVentasCodigoDelAuto = new javax.swing.JLabel();
        jTextFieldVentasCodigoDelAuto = new javax.swing.JTextField();
        jLabelVentasMontoDeLaVenta = new javax.swing.JLabel();
        jTextFieldVentasMontoDeLaVenta = new javax.swing.JTextField();
        btnVentasRegistrar = new javax.swing.JButton();
        btnVentasEliminar = new javax.swing.JButton();
        jTextFieldVentasTipoDeAuto = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        Ventas_table = new javax.swing.JTable();
        jButtonEnterVentas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(18, 45, 61));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelEmpleados.setBackground(new java.awt.Color(18, 45, 61));
        jPanelEmpleados.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelEmpleados.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelEmpleados.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmpleados.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelEmpleados.setText("Empleados");
        jPanelEmpleados.add(jLabelEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 75, 23));

        jLabelIconoEmpleados.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoEmpleados70x70.png"))); // NOI18N
        jPanelEmpleados.add(jLabelIconoEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, 70, 70));

        jPanel1.add(jPanelEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 225));

        jPanelVentas.setBackground(new java.awt.Color(18, 45, 61));
        jPanelVentas.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelVentas.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelVentas.setForeground(new java.awt.Color(255, 255, 255));
        jLabelVentas.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelVentas.setText("Ventas");
        jPanelVentas.add(jLabelVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 100, 60, 23));

        jLabelIconoVentas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoVentas70x70.jpg"))); // NOI18N
        jPanelVentas.add(jLabelIconoVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 70, 70));

        jPanel1.add(jPanelVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, 200, 225));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 200, 450));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        IconoEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/IconoEmpresa100x100.jpg"))); // NOI18N
        jPanel2.add(IconoEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 0, 100, 100));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 200, 100));

        jPanel3.setBackground(new java.awt.Color(18, 45, 61));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelEmpresa.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabelEmpresa.setForeground(new java.awt.Color(255, 255, 255));
        jLabelEmpresa.setText("Automóviles del Caribe S. A");
        jPanel3.add(jLabelEmpresa, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 350, 40));

        btnSalir.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnSalir.setText("Salir");
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
        });
        jPanel3.add(btnSalir, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 40, -1, -1));

        getContentPane().add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 0, 730, 100));

        jTabbedPane1.setBackground(new java.awt.Color(40, 147, 153));

        jPanelEmpleadosPane.setBackground(new java.awt.Color(40, 147, 153));
        jPanelEmpleadosPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelEmpleadosRegistrar.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Empleados", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanelEmpleadosRegistrar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelEmpleadosNombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelEmpleadosNombre.setText("Nombre :");
        jPanelEmpleadosRegistrar.add(jLabelEmpleadosNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, -1));

        jLabelEmpleadosCedula.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelEmpleadosCedula.setText("Cédula : ");
        jPanelEmpleadosRegistrar.add(jLabelEmpleadosCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        jLabelEmpleadosCargo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelEmpleadosCargo.setText("Cargo: ");
        jPanelEmpleadosRegistrar.add(jLabelEmpleadosCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        jTextFieldEmpleadosNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmpleadosNombreActionPerformed(evt);
            }
        });
        jPanelEmpleadosRegistrar.add(jTextFieldEmpleadosNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 100, -1));
        jPanelEmpleadosRegistrar.add(jTextFieldEmpleadosCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 70, 100, -1));
        jPanelEmpleadosRegistrar.add(jTextFieldEmpleadosCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 100, -1));

        jLabelEmpleadosTelefono.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelEmpleadosTelefono.setText("Teléfono :");
        jPanelEmpleadosRegistrar.add(jLabelEmpleadosTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 30, -1, -1));

        jTextFieldEmpleadosTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmpleadosTelefonoActionPerformed(evt);
            }
        });
        jPanelEmpleadosRegistrar.add(jTextFieldEmpleadosTelefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 30, 100, -1));

        jLabelEmpleadosFechaIngreso.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelEmpleadosFechaIngreso.setText("Fecha Ingreso:");
        jPanelEmpleadosRegistrar.add(jLabelEmpleadosFechaIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 70, -1, -1));
        jPanelEmpleadosRegistrar.add(jTextFieldEmpleadosFechaIngreso, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 70, 100, -1));

        jLabelEmpleadosSalarioFijo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelEmpleadosSalarioFijo.setText("Salario fijo : ");
        jPanelEmpleadosRegistrar.add(jLabelEmpleadosSalarioFijo, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 110, -1, -1));

        jTextFieldEmpleadosSalarioFijo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmpleadosSalarioFijoActionPerformed(evt);
            }
        });
        jPanelEmpleadosRegistrar.add(jTextFieldEmpleadosSalarioFijo, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 110, 100, -1));

        btnEmpleadosRegistrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEmpleadosRegistrar.setText("Registrar");
        jPanelEmpleadosRegistrar.add(btnEmpleadosRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 160, -1, -1));

        btnEmpleadosEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnEmpleadosEliminar.setText("Eliminar");
        jPanelEmpleadosRegistrar.add(btnEmpleadosEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 160, -1, -1));

        jLabelEmpleadosSalarioComisiones.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelEmpleadosSalarioComisiones.setText("Salario más comisiones :");
        jPanelEmpleadosRegistrar.add(jLabelEmpleadosSalarioComisiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 30, -1, 20));

        jTextFieldEmpleadosSalarioComisiones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldEmpleadosSalarioComisionesActionPerformed(evt);
            }
        });
        jPanelEmpleadosRegistrar.add(jTextFieldEmpleadosSalarioComisiones, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 70, 100, -1));

        jPanelEmpleadosPane.add(jPanelEmpleadosRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 690, 200));

        jLabelEmpleadosBuscar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelEmpleadosBuscar.setText("Buscar: ");
        jPanelEmpleadosPane.add(jLabelEmpleadosBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 230, -1, -1));
        jPanelEmpleadosPane.add(jTextFieldEmpleadosBuscar, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 100, -1));

        Empleados_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Cédula", "Cargo", "Teléfono", "Fecha Ingreso", "Salario Fijo", "Salario más comisiones"
            }
        ));
        jScrollPane1.setViewportView(Empleados_table);
        if (Empleados_table.getColumnModel().getColumnCount() > 0) {
            Empleados_table.getColumnModel().getColumn(5).setHeaderValue("Salario Fijo");
            Empleados_table.getColumnModel().getColumn(6).setHeaderValue("Salario más comisiones");
        }

        jPanelEmpleadosPane.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 690, 140));

        jButtonEnterEmpleados.setText("Enter");
        jPanelEmpleadosPane.add(jButtonEnterEmpleados, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 230, -1, -1));

        jButtonNombre.setText("Ordenar Por Nombre");
        jPanelEmpleadosPane.add(jButtonNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 230, -1, -1));

        jButtonSalario.setText("Ordenar Por Salario");
        jPanelEmpleadosPane.add(jButtonSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 230, -1, -1));

        jTabbedPane1.addTab("Empleados", jPanelEmpleadosPane);

        jPanelVentasPane.setBackground(new java.awt.Color(40, 147, 153));
        jPanelVentasPane.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanelEmpleadosRegistrar1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Ventas", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N
        jPanelEmpleadosRegistrar1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabelVentasNombre.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelVentasNombre.setText("Nombre :");
        jPanelEmpleadosRegistrar1.add(jLabelVentasNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, -1, -1));

        jLabelVentasCedula.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelVentasCedula.setText("Cédula : ");
        jPanelEmpleadosRegistrar1.add(jLabelVentasCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, 20));

        jLabelVentasTipoDeAuto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelVentasTipoDeAuto.setText("Tipo De auto:");
        jPanelEmpleadosRegistrar1.add(jLabelVentasTipoDeAuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 60, -1, -1));

        jTextFieldVentasNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldVentasNombreActionPerformed(evt);
            }
        });
        jPanelEmpleadosRegistrar1.add(jTextFieldVentasNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 80, 100, -1));

        jTextFieldVentasCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldVentasCedulaActionPerformed(evt);
            }
        });
        jPanelEmpleadosRegistrar1.add(jTextFieldVentasCedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 100, -1));

        jLabelVentasCodigoDelAuto.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelVentasCodigoDelAuto.setText("Código del auto :");
        jPanelEmpleadosRegistrar1.add(jLabelVentasCodigoDelAuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 40, -1, -1));

        jTextFieldVentasCodigoDelAuto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldVentasCodigoDelAutoActionPerformed(evt);
            }
        });
        jPanelEmpleadosRegistrar1.add(jTextFieldVentasCodigoDelAuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 40, 100, -1));

        jLabelVentasMontoDeLaVenta.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabelVentasMontoDeLaVenta.setText("Monto de la venta:");
        jPanelEmpleadosRegistrar1.add(jLabelVentasMontoDeLaVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 120, -1, -1));

        jTextFieldVentasMontoDeLaVenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextFieldVentasMontoDeLaVentaActionPerformed(evt);
            }
        });
        jPanelEmpleadosRegistrar1.add(jTextFieldVentasMontoDeLaVenta, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 120, 100, -1));

        btnVentasRegistrar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnVentasRegistrar.setText("Registrar");
        btnVentasRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVentasRegistrarActionPerformed(evt);
            }
        });
        jPanelEmpleadosRegistrar1.add(btnVentasRegistrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 60, -1, -1));

        btnVentasEliminar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        btnVentasEliminar.setText("Eliminar");
        jPanelEmpleadosRegistrar1.add(btnVentasEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 120, 90, -1));
        jPanelEmpleadosRegistrar1.add(jTextFieldVentasTipoDeAuto, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 60, 100, -1));

        jPanelVentasPane.add(jPanelEmpleadosRegistrar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, 690, 180));

        Ventas_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nombre", "Cédula", "Tipo De auto", "Código del auto", "Monto de la venta"
            }
        ));
        jScrollPane2.setViewportView(Ventas_table);

        jPanelVentasPane.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 690, 140));

        jButtonEnterVentas.setText("Mostrar Ventas");
        jButtonEnterVentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonEnterVentasActionPerformed(evt);
            }
        });
        jPanelVentasPane.add(jButtonEnterVentas, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 220, -1, -1));

        jTabbedPane1.addTab("Ventas", jPanelVentasPane);

        getContentPane().add(jTabbedPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 100, 730, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextFieldEmpleadosTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmpleadosTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmpleadosTelefonoActionPerformed

    private void jTextFieldEmpleadosNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmpleadosNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmpleadosNombreActionPerformed

    private void jTextFieldEmpleadosSalarioComisionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmpleadosSalarioComisionesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmpleadosSalarioComisionesActionPerformed

    private void jTextFieldEmpleadosSalarioFijoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldEmpleadosSalarioFijoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldEmpleadosSalarioFijoActionPerformed

    private void jTextFieldVentasNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldVentasNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldVentasNombreActionPerformed

    private void jTextFieldVentasCodigoDelAutoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldVentasCodigoDelAutoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldVentasCodigoDelAutoActionPerformed

    private void jTextFieldVentasCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldVentasCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldVentasCedulaActionPerformed

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_btnSalirMouseClicked

    private void jButtonEnterVentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonEnterVentasActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jButtonEnterVentasActionPerformed

    private void btnVentasRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVentasRegistrarActionPerformed
        // TODO add your handling code here:
        
        registrarVentaV();
        // Limpiar los campos después de guardar los datos
        jTextFieldVentasCodigoDelAuto.setText("");
        jTextFieldVentasNombre.setText("");
        jTextFieldVentasCedula.setText("");
        jTextFieldVentasTipoDeAuto.setText("");
        jTextFieldVentasMontoDeLaVenta.setText("");
        
    }//GEN-LAST:event_btnVentasRegistrarActionPerformed

    private void jTextFieldVentasMontoDeLaVentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextFieldVentasMontoDeLaVentaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextFieldVentasMontoDeLaVentaActionPerformed

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
            java.util.logging.Logger.getLogger(System_Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(System_Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(System_Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(System_Vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new System_Vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JTable Empleados_table;
    private javax.swing.JLabel IconoEmpresa;
    public javax.swing.JTable Ventas_table;
    private javax.swing.JButton btnEmpleadosEliminar;
    private javax.swing.JButton btnEmpleadosRegistrar;
    private javax.swing.JButton btnSalir;
    private javax.swing.JButton btnVentasEliminar;
    private javax.swing.JButton btnVentasRegistrar;
    private javax.swing.JButton jButtonEnterEmpleados;
    private javax.swing.JButton jButtonEnterVentas;
    private javax.swing.JButton jButtonNombre;
    private javax.swing.JButton jButtonSalario;
    public javax.swing.JLabel jLabelEmpleados;
    private javax.swing.JLabel jLabelEmpleadosBuscar;
    private javax.swing.JLabel jLabelEmpleadosCargo;
    private javax.swing.JLabel jLabelEmpleadosCedula;
    private javax.swing.JLabel jLabelEmpleadosFechaIngreso;
    private javax.swing.JLabel jLabelEmpleadosNombre;
    private javax.swing.JLabel jLabelEmpleadosSalarioComisiones;
    private javax.swing.JLabel jLabelEmpleadosSalarioFijo;
    private javax.swing.JLabel jLabelEmpleadosTelefono;
    private javax.swing.JLabel jLabelEmpresa;
    public javax.swing.JLabel jLabelIconoEmpleados;
    public javax.swing.JLabel jLabelIconoVentas;
    public javax.swing.JLabel jLabelVentas;
    private javax.swing.JLabel jLabelVentasCedula;
    private javax.swing.JLabel jLabelVentasCodigoDelAuto;
    private javax.swing.JLabel jLabelVentasMontoDeLaVenta;
    private javax.swing.JLabel jLabelVentasNombre;
    private javax.swing.JLabel jLabelVentasTipoDeAuto;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    public javax.swing.JPanel jPanelEmpleados;
    private javax.swing.JPanel jPanelEmpleadosPane;
    private javax.swing.JPanel jPanelEmpleadosRegistrar;
    private javax.swing.JPanel jPanelEmpleadosRegistrar1;
    public javax.swing.JPanel jPanelVentas;
    private javax.swing.JPanel jPanelVentasPane;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    public javax.swing.JTextField jTextFieldEmpleadosBuscar;
    public javax.swing.JTextField jTextFieldEmpleadosCargo;
    public javax.swing.JTextField jTextFieldEmpleadosCedula;
    public javax.swing.JTextField jTextFieldEmpleadosFechaIngreso;
    public javax.swing.JTextField jTextFieldEmpleadosNombre;
    public javax.swing.JTextField jTextFieldEmpleadosSalarioComisiones;
    public javax.swing.JTextField jTextFieldEmpleadosSalarioFijo;
    public javax.swing.JTextField jTextFieldEmpleadosTelefono;
    public javax.swing.JTextField jTextFieldVentasCedula;
    public javax.swing.JTextField jTextFieldVentasCodigoDelAuto;
    public javax.swing.JTextField jTextFieldVentasMontoDeLaVenta;
    public javax.swing.JTextField jTextFieldVentasNombre;
    private javax.swing.JTextField jTextFieldVentasTipoDeAuto;
    // End of variables declaration//GEN-END:variables
}
