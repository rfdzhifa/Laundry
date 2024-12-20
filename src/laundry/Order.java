/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package laundry;

import java.util.HashMap;
import javax.swing.*;
import java.sql.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author LENOVO
 */
public class Order extends javax.swing.JFrame {
    private HashMap<String, Service> serviceMap;

    /**
     * Creates new form Order
     * @throws java.sql.SQLException
     */
    public Order() throws SQLException {
        initComponents();
        loadServices();
        loadTableData();
        addListeners();
        setVisible(true);
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
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCustomer = new javax.swing.JTextField();
        txtQuantityWeight = new javax.swing.JTextField();
        lblQuantityWeight = new javax.swing.JLabel();
        txtDate = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtStatus = new javax.swing.JComboBox<>();
        txtService = new javax.swing.JComboBox<>();
        lblDuration = new javax.swing.JLabel();
        btnHapus = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        btnTambah = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        lblPrice = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblOrder = new javax.swing.JTable();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("Order");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Customer Name");

        txtCustomer.setBackground(new java.awt.Color(204, 204, 204));
        txtCustomer.setForeground(new java.awt.Color(51, 51, 51));
        txtCustomer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCustomerActionPerformed(evt);
            }
        });

        txtQuantityWeight.setBackground(new java.awt.Color(204, 204, 204));
        txtQuantityWeight.setForeground(new java.awt.Color(51, 51, 51));

        lblQuantityWeight.setForeground(new java.awt.Color(51, 51, 51));
        lblQuantityWeight.setText("Quantity");

        txtDate.setBackground(new java.awt.Color(204, 204, 204));
        txtDate.setForeground(new java.awt.Color(51, 51, 51));
        txtDate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDateActionPerformed(evt);
            }
        });

        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("Date (dd/mm/yyyy)");

        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Status");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Duration");

        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Service");

        txtStatus.setBackground(new java.awt.Color(204, 204, 204));
        txtStatus.setForeground(new java.awt.Color(51, 51, 51));
        txtStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dikonfirmasi", "Dalam Proses", "Siap Diambil" }));

        txtService.setBackground(new java.awt.Color(204, 204, 204));
        txtService.setForeground(new java.awt.Color(51, 51, 51));
        txtService.setName(""); // NOI18N
        txtService.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtServiceActionPerformed(evt);
            }
        });

        lblDuration.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblDuration.setForeground(new java.awt.Color(0, 0, 153));
        lblDuration.setText("1 Hari");

        btnHapus.setBackground(new java.awt.Color(204, 204, 204));
        btnHapus.setForeground(new java.awt.Color(51, 51, 51));
        btnHapus.setText("Hapus");

        btnUbah.setBackground(new java.awt.Color(204, 204, 204));
        btnUbah.setForeground(new java.awt.Color(51, 51, 51));
        btnUbah.setText("Ubah");

        btnTambah.setBackground(new java.awt.Color(204, 204, 204));
        btnTambah.setForeground(new java.awt.Color(51, 51, 51));
        btnTambah.setText("Tambah");
        btnTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTambahActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("Price");

        lblPrice.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPrice.setForeground(new java.awt.Color(0, 0, 153));
        lblPrice.setText("Rp 10.000");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(txtDate, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtService, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 446, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(btnTambah)
                                .addGap(26, 26, 26)
                                .addComponent(btnUbah)
                                .addGap(30, 30, 30)
                                .addComponent(btnHapus)))
                        .addGap(32, 32, 32)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(lblQuantityWeight)
                            .addComponent(txtQuantityWeight)
                            .addComponent(txtStatus, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap(21, Short.MAX_VALUE)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(txtCustomer, javax.swing.GroupLayout.PREFERRED_SIZE, 886, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(18, 18, 18)
                .addComponent(lblPrice)
                .addGap(32, 32, 32)
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDuration)
                .addGap(299, 299, 299))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtCustomer, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtDate, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(lblQuantityWeight)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtQuantityWeight, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtService, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(lblPrice)
                    .addComponent(jLabel7)
                    .addComponent(lblDuration))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnTambah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUbah, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnHapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(23, 23, 23))
        );

        tblOrder.setBackground(new java.awt.Color(255, 255, 255));
        tblOrder.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Date", "Quantity", "Service", "Duration", "Status", "Price"
            }
        ));
        jScrollPane1.setViewportView(tblOrder);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addComponent(jScrollPane1)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 293, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtCustomerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCustomerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCustomerActionPerformed

    private void txtDateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDateActionPerformed

    private void txtServiceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtServiceActionPerformed
        String serviceType = (String) txtService.getSelectedItem();
        
        if (serviceType.contains("Kiloan")) {
            txtQuantityWeight.setVisible(true);
            lblQuantityWeight.setText("Weight (kg)");
        } else if (serviceType.contains("Satuan")) {
            txtQuantityWeight.setVisible(true);
            lblQuantityWeight.setText("Quantity");
        } else {
            txtQuantityWeight.setVisible(false);
            lblQuantityWeight.setText("");
        }
    }//GEN-LAST:event_txtServiceActionPerformed

    private void btnTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTambahActionPerformed
    String customerName = txtCustomer.getText().trim();
    String dateInput = txtDate.getText().trim();

    double quantity = 1; // default jika input kosong
    try {
        quantity = Double.parseDouble(txtQuantityWeight.getText().trim());
    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(this, "Quantity berupa angka.");
        return; // jika gagal konversi, keluar dari metode
    }

    // Mengambil durasi dan harga berdasarkan layanan yang dipilih
    String selectedService = (String) txtService.getSelectedItem();
        if (selectedService != null && serviceMap.containsKey(selectedService)) {
            Service s = serviceMap.get(selectedService);

            double price = s.TotalPrice(quantity);
            int duration = s.getDuration();

            // Ambil nilai dari combobox layanan dan status
            String serviceName = (String) txtService.getSelectedItem();
            String status = (String) txtStatus.getSelectedItem();

            // Validasi input kosong
            if (customerName.isEmpty() || dateInput.isEmpty() || serviceName == null || status == null) {
                JOptionPane.showMessageDialog(this, "Semua kolom harus diisi.");
                return;
            }

            // Validasi format tanggal
            if (!validateDate(dateInput)) {
                JOptionPane.showMessageDialog(this, "Format tanggal harus dd/MM/yyyy.");
                return;
            }

            // Konversi tanggal ke format MySQL
            String mysqlDate = convertToMySQLDate(dateInput);
            if (mysqlDate == null) {
                JOptionPane.showMessageDialog(this, "Terjadi kesalahan saat memproses tanggal.");
                return;
            }

            // Simpan ke database
            try (Connection con = ConnectionDatabase.getConnection()) {
                String query = "INSERT INTO orders (customerName, date, service, quantity, duration, status, price) VALUES (?, ?, ?, ?, ?, ?, ?)";
                try (PreparedStatement ps = con.prepareStatement(query)) {
                    ps.setString(1, customerName);
                    ps.setString(2, mysqlDate);
                    ps.setString(3, serviceName);
                    ps.setDouble(4, quantity);
                    ps.setInt(5, duration);
                    ps.setString(6, status);
                    ps.setDouble(7, price);
                    ps.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan!");
                    loadTableData();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, "Gagal menambahkan data! Pesan error: " + ex.getMessage());
            }
            
            System.out.println("Customer Name: " + customerName);
            System.out.println("Date: " + mysqlDate);
            System.out.println("Service: " + serviceName);
            System.out.println("Quantity: " + quantity);
            System.out.println("Duration: " + duration);
            System.out.println("Status: " + status);
            System.out.println("Price: " + price);
        }
    }//GEN-LAST:event_btnTambahActionPerformed

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
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Order.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnTambah;
    private javax.swing.JButton btnUbah;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblDuration;
    private javax.swing.JLabel lblPrice;
    private javax.swing.JLabel lblQuantityWeight;
    private javax.swing.JTable tblOrder;
    private javax.swing.JTextField txtCustomer;
    private javax.swing.JTextField txtDate;
    private javax.swing.JTextField txtQuantityWeight;
    private javax.swing.JComboBox<String> txtService;
    private javax.swing.JComboBox<String> txtStatus;
    // End of variables declaration//GEN-END:variables

    private void loadServices() throws SQLException {
        serviceMap = new HashMap<>();
        Connection con = ConnectionDatabase.getConnection();
        
        if (con != null){
            try {
                String query = "SELECT serviceName, duration, price FROM service";
                try (PreparedStatement ps = con.prepareStatement(query); ResultSet rs = ps.executeQuery()) {
                    
                    while (rs.next()){
                        String serviceName = rs.getString("serviceName");
                        int duration = rs.getInt("duration");
                        double price = rs.getDouble("price");
                        
                        txtService.addItem(serviceName);
                        
                        Service service = null;
                        if(serviceName.toLowerCase().contains("kiloan")){
                            service = new Kilo(serviceName, duration, price);
                        }
                        if(serviceName.toLowerCase().contains("satuan")){
                            service = new Satuan(serviceName, duration, price);
                        }
                        serviceMap.put(serviceName, service);
                    }
                }
                con.close();
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Failed to load services!");
            }
        }
    }
    
    private void loadTableData() {
        DefaultTableModel model = (DefaultTableModel) tblOrder.getModel();
        model.setRowCount(0); // Hapus data lama di tabel

        try (Connection con = ConnectionDatabase.getConnection()) {
            String query = "SELECT customerName, date, service, quantity, duration, status, price FROM orders";
            try (PreparedStatement ps = con.prepareStatement(query); ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    model.addRow(new Object[]{
                        rs.getString("customerName"),
                        rs.getString("date"),
                        rs.getString("service"),
                        rs.getInt("quantity"),
                        rs.getInt("duration"),
                        rs.getString("status"),
                        rs.getDouble("price")
                    });
                }
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Gagal memuat data tabel: " + e.getMessage());
        }
    }

    
    private void addListeners(){
        txtService.addActionListener(e -> updatePriceAndDuration());
        txtQuantityWeight.getDocument().addDocumentListener(new javax.swing.event.DocumentListener() {
            @Override
            public void changedUpdate(javax.swing.event.DocumentEvent e) {
                updatePriceAndDuration();
            }
            
            @Override
            public void removeUpdate(javax.swing.event.DocumentEvent e) {
                updatePriceAndDuration();
            }

            @Override
            public void insertUpdate(javax.swing.event.DocumentEvent e) {
                updatePriceAndDuration();
            }
        });
    }

    private void updatePriceAndDuration() {
        String selectedService = (String) txtService.getSelectedItem();
        if(selectedService != null && serviceMap.containsKey(selectedService)){
            Service s = serviceMap.get(selectedService);
            double quantity = 1;
            
            try {
                quantity = Double.parseDouble(txtQuantityWeight.getText());
            } catch (NumberFormatException e) {
                quantity = 1;
            }
            
            double price = s.TotalPrice(quantity);
            int duration = s.getDuration();
            
            lblPrice.setText("Rp " + price);
            lblDuration.setText(duration + " Hari");
        }
    }
    
    private String convertToMySQLDate(String dateString) {
    SimpleDateFormat inputFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat mysqlFormat = new SimpleDateFormat("yyyy-MM-dd");

        try {
            java.util.Date date = inputFormat.parse(dateString);
            return mysqlFormat.format(date);
        } catch (ParseException e) {
            return null;
        }}
    
    private boolean validateDate(String dateString) {
        return dateString.matches("\\d{2}/\\d{2}/\\d{4}");
    }
}
