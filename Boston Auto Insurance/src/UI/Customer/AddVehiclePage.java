/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Customer;

import Main.TheBostonInsuranceModel;
import Model.Account.Account;
import Model.Customer.Quote.CustomerQuote;
import Model.Customer.Vehicle.Vehicle;
import Model.Thirdparty.POLK.VehicleListWithAddress;
import Model.Thirdparty.POLK.VehicleListWithAddressDirectory;
import Model.Thirdparty.VIN.VINDirectory;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author prane
 */
public class AddVehiclePage extends javax.swing.JPanel {

    /**
     * Creates new form AddVehiclePage
     */
    private TheBostonInsuranceModel BIM;
    private JPanel workPanel;
    private Account account;
    private CustomerQuote custQuote;
    private VehicleListWithAddressDirectory vehicleListWithAddressDirectory;
    private VINDirectory vinDirectory;

    public AddVehiclePage(TheBostonInsuranceModel BIM, JPanel workPanel, CustomerQuote custQuote, Account account) {
        initComponents();
        this.BIM = BIM;
        this.workPanel = workPanel;
        this.account = account;
        this.custQuote = custQuote;
        this.workPanel = workPanel;
        this.vehicleListWithAddressDirectory = BIM.getVehicleListWithAddressDirectory();
        this.vinDirectory = BIM.getvINDirectory();

        populateComboBoxes();
        populatePrepopulatedVehList();
        populateAddedVehList();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lblFName = new javax.swing.JLabel();
        lblStreetAdd = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAddedVehList = new javax.swing.JTable();
        btnAddVehPrepo = new javax.swing.JButton();
        lblFName1 = new javax.swing.JLabel();
        ComboBoxVehType = new javax.swing.JComboBox<>();
        lblStreetAdd1 = new javax.swing.JLabel();
        lblVIN = new javax.swing.JLabel();
        txtVIN = new javax.swing.JTextField();
        lblCity = new javax.swing.JLabel();
        ComboBoxYear = new javax.swing.JComboBox<>();
        lblZip = new javax.swing.JLabel();
        ComboBoxMake = new javax.swing.JComboBox<>();
        lblDob = new javax.swing.JLabel();
        ComboBoxModel = new javax.swing.JComboBox<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblPrepopulatedVehList = new javax.swing.JTable();
        lblStreetAdd3 = new javax.swing.JLabel();
        btnRemoveVeh = new javax.swing.JButton();
        btnAddVehManu = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setText("                                Choose the vehicles to safeguard in your insurance policy");

        lblFName.setText("Maximum of 4 vehicles can be added to a policy");

        lblStreetAdd.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblStreetAdd.setForeground(new java.awt.Color(0, 51, 102));
        lblStreetAdd.setText("Browse the Table of Vehicles for Your Effortless Journey");

        btnBack.setBackground(new java.awt.Color(204, 204, 204));
        btnBack.setText("Back: About You Page");
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/topLogo.png"))); // NOI18N
        jLabel13.setText("jLabel13");

        tblAddedVehList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "VIN", "Year", "Make", "Model"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblAddedVehList);

        btnAddVehPrepo.setBackground(new java.awt.Color(204, 204, 204));
        btnAddVehPrepo.setText("Add Vehicle");
        btnAddVehPrepo.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAddVehPrepo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddVehPrepoActionPerformed(evt);
            }
        });

        lblFName1.setText("Which type of vehicle would you like to include in your coverage?");

        ComboBoxVehType.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Car/Van", "Travel Vehicle" }));

        lblStreetAdd1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lblStreetAdd1.setForeground(new java.awt.Color(0, 51, 102));
        lblStreetAdd1.setText("Enter vehicle details manually if not available in the table.");

        lblVIN.setText("Enter the VIN number");

        txtVIN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtVINActionPerformed(evt);
            }
        });

        lblCity.setText("Year");

        ComboBoxYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select", "2015", "2016", "2017", "2018", "2019", "2020" }));
        ComboBoxYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboBoxYearActionPerformed(evt);
            }
        });

        lblZip.setText("Make");

        ComboBoxMake.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select", "Toyota", "Ford", "Nissan", "Rolls Royce" }));

        lblDob.setText("Model");

        ComboBoxModel.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select", "Toyota Camry", "Toyota Corolla", "Toyota Prius", "Ford Expedition", "Ford Bronco", "Ford Ranger", "Nissan NV200", "Nissan NV Cargo and NV Passenger", "Rolls-Royce Phantom", "Rolls-Royce Ghost", "Rolls-Royce Wraith" }));

        tblPrepopulatedVehList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "VIN", "Year", "Make", "Model"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane3.setViewportView(tblPrepopulatedVehList);

        lblStreetAdd3.setFont(new java.awt.Font("Candara", 0, 12)); // NOI18N
        lblStreetAdd3.setText("Please note: Each insurer is limited to adding a maximum of four vehicles per policy");

        btnRemoveVeh.setBackground(new java.awt.Color(204, 204, 204));
        btnRemoveVeh.setText("Remove Vehicles");
        btnRemoveVeh.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRemoveVeh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveVehActionPerformed(evt);
            }
        });

        btnAddVehManu.setBackground(new java.awt.Color(204, 204, 204));
        btnAddVehManu.setText("Add Vehicle");
        btnAddVehManu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnAddVehManu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddVehManuActionPerformed(evt);
            }
        });

        btnNext.setBackground(new java.awt.Color(204, 204, 204));
        btnNext.setText("Next: Add Vehicle Details");
        btnNext.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNextActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(111, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnNext))
                    .addComponent(lblStreetAdd3)
                    .addComponent(lblFName)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(lblCity)
                                .addGap(419, 419, 419))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(ComboBoxYear, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblZip)
                                    .addComponent(ComboBoxMake, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(29, 29, 29)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDob)
                            .addComponent(ComboBoxModel, 0, 1, Short.MAX_VALUE)))
                    .addComponent(lblVIN)
                    .addComponent(txtVIN, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxVehType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFName1)
                    .addComponent(lblStreetAdd)
                    .addComponent(lblStreetAdd1)
                    .addComponent(jScrollPane2)
                    .addComponent(btnRemoveVeh, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)
                    .addComponent(btnAddVehManu, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(0, 112, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(548, 548, 548)
                .addComponent(btnAddVehPrepo)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25)
                .addComponent(lblFName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblStreetAdd)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnAddVehPrepo)
                .addGap(18, 18, 18)
                .addComponent(lblStreetAdd1)
                .addGap(18, 18, 18)
                .addComponent(lblFName1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ComboBoxVehType, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblVIN)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtVIN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCity)
                    .addComponent(lblZip)
                    .addComponent(lblDob))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ComboBoxYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxMake, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ComboBoxModel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnAddVehManu)
                .addGap(10, 10, 10)
                .addComponent(lblStreetAdd3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnRemoveVeh)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack)
                    .addComponent(btnNext))
                .addContainerGap(180, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 836, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1054, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        workPanel.remove(this);
        CardLayout layout = (CardLayout) workPanel.getLayout();
        layout.previous(workPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnAddVehPrepoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddVehPrepoActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblPrepopulatedVehList.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "No Vehicles selected from pre-populated vehicle table");
            return;
        }
        DefaultTableModel modelPrepo = (DefaultTableModel) tblPrepopulatedVehList.getModel();
        Vehicle selectedVehicle = (Vehicle) modelPrepo.getValueAt(selectedRow, 0);

        // Check if the VIN already exists in tblAddedVehList
        String vin = selectedVehicle.getVin();
        if (isVinAlreadyExists(vin)) {
            JOptionPane.showMessageDialog(this, "Vehicle with the same VIN already exists in your vehicle list");
            return;
        }

        // Add the new vehicle to your data model or collection
        Vehicle vehicle = custQuote.getQuote().addVehicle(selectedVehicle);
        if (vehicle != null) {
            JOptionPane.showMessageDialog(this, "Vehicle added to your vehicle list");
        } else {
            JOptionPane.showMessageDialog(this, "Maximum of 4 vehicles can be added, not more");
            return;
        }

        // Update the table with the added vehicles
        populateAddedVehList();

    }//GEN-LAST:event_btnAddVehPrepoActionPerformed

    private void ComboBoxYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboBoxYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ComboBoxYearActionPerformed

    private void btnRemoveVehActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveVehActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblAddedVehList.getSelectedRow();
        if (selectedRow >= 0) {
            int dialogButton = JOptionPane.YES_NO_OPTION;
            int dialogResult = JOptionPane.showConfirmDialog(this, "Would you like to remove the selected Vehicle from this quote", "Warning", dialogButton);
            if (dialogResult == JOptionPane.YES_OPTION) {
                Vehicle veh = (Vehicle) tblAddedVehList.getValueAt(selectedRow, 0);

                // Remove the vehicle with the specified VIN from the custQuote
                String vin = veh.getVin();
                custQuote.getQuote().removeVehicle(vin);

                // Update the displayed table
                populateAddedVehList();
            }

        } else {
            JOptionPane.showMessageDialog(this, "Please select a vehicle from the list to remove");
        }
    }//GEN-LAST:event_btnRemoveVehActionPerformed

    private void btnAddVehManuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddVehManuActionPerformed
        // TODO add your handling code here:
        String vehType = (String) ComboBoxVehType.getSelectedItem();
        String vin = txtVIN.getText().trim();
        String year = (String) ComboBoxYear.getSelectedItem();
        String make = (String) ComboBoxMake.getSelectedItem();
        String model = (String) ComboBoxModel.getSelectedItem();

        // Validate the selected values
        if ("Select".equals(vehType) || "Select".equals(year) || "Select".equals(make) || "Select".equals(model)) {
            // Show an error message or handle invalid selection
            // You may want to display a message to the user
            JOptionPane.showMessageDialog(this, "Please select valid values for all fields.");
            return;
        }

        if (vin.length() != 17 || !vin.matches("[A-Z0-9]+")) {
            // Show an error message or handle invalid VIN
            // You may want to display a message to the user
            JOptionPane.showMessageDialog(this, "VIN must be 17 characters (digits and capital letters).");
            return;
        }

        // Check if the VIN already exists in tblPrepopulatedVehList
        if (isVinAlreadyExists(vin)) {
            JOptionPane.showMessageDialog(this, "VIN number already exists in the pre-populated list. Please enter a different VIN.");
            return;
        }

        if (!vinDirectory.isVinExists(vin)) {
            JOptionPane.showMessageDialog(this, "Invalid VIN. Please enter a valid VIN.");
            return;
        }

        // If all conditions are met, create a Vehicle object
        Vehicle newVehicle = new Vehicle(vehType, vin, Integer.parseInt(year), make, model);

        // Add the new vehicle to your data model or collection
        Vehicle vehicle = custQuote.getQuote().addVehicle(newVehicle);
        if (vehicle != null) {
            JOptionPane.showMessageDialog(this, "Vehicle added to your vehicle list");
        } else {
            JOptionPane.showMessageDialog(this, "Maximum of 4 vehicles can be added, not more");
            return;
        }

        // Update the table with the added vehicles
        populateAddedVehList();

        // Optionally, you can clear the input fields after adding the vehicle
        clearInputFields();
    }

    private boolean isVinAlreadyExists(String vin) {
        DefaultTableModel model = (DefaultTableModel) tblAddedVehList.getModel();

        // Check if the table is empty
        if (model.getRowCount() == 0) {
            return false; // Table is empty, VIN does not exist
        }

        for (int i = 0; i < model.getRowCount(); i++) {
            Vehicle vehicle = (Vehicle) model.getValueAt(i, 0);
            if (vin.equals(vehicle.getVin())) {
                return true; // VIN already exists
            }
        }
        return false; // VIN does not exist
    }//GEN-LAST:event_btnAddVehManuActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        CardLayout layout = (CardLayout) workPanel.getLayout();
        AddVehicleDetails addVehicleDetails = new AddVehicleDetails(BIM, workPanel, account, custQuote);
        workPanel.add("AddVehicleDetails", addVehicleDetails);
        layout.next(workPanel);
    }//GEN-LAST:event_btnNextActionPerformed

    private void txtVINActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtVINActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtVINActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> ComboBoxMake;
    private javax.swing.JComboBox<String> ComboBoxModel;
    private javax.swing.JComboBox<String> ComboBoxVehType;
    private javax.swing.JComboBox<String> ComboBoxYear;
    private javax.swing.JButton btnAddVehManu;
    private javax.swing.JButton btnAddVehPrepo;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnRemoveVeh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblCity;
    private javax.swing.JLabel lblDob;
    private javax.swing.JLabel lblFName;
    private javax.swing.JLabel lblFName1;
    private javax.swing.JLabel lblStreetAdd;
    private javax.swing.JLabel lblStreetAdd1;
    private javax.swing.JLabel lblStreetAdd3;
    private javax.swing.JLabel lblVIN;
    private javax.swing.JLabel lblZip;
    private javax.swing.JTable tblAddedVehList;
    private javax.swing.JTable tblPrepopulatedVehList;
    private javax.swing.JTextField txtVIN;
    // End of variables declaration//GEN-END:variables
private void populateComboBoxes() {
        populateComboBoxVehType();
        populateComboBocYear();
        populateComboBoxMake();
        populateComboBoxModel();
    }

    private void populateComboBoxVehType() {
        ComboBoxVehType.removeAllItems(); // Clear the existing items

        ComboBoxVehType.addItem("Select");

        // Add other vehicle types
        ComboBoxVehType.addItem("Car/Van");
        ComboBoxVehType.addItem("Travel Vehicle");

    }

    private void populateComboBocYear() {
        ComboBoxYear.removeAllItems(); // Clear the existing items

        // Add 'Select' option first
        ComboBoxYear.addItem("Select");

        // Add years from 2015 to 2020
        for (int year = 2015; year <= 2020; year++) {
            ComboBoxYear.addItem(String.valueOf(year));
        }
    }

    private void populateComboBoxMake() {
        ComboBoxMake.removeAllItems(); // Clear the existing items

        // Add 'Select' option first
        ComboBoxMake.addItem("Select");

        // Add car makes
        ComboBoxMake.addItem("Toyota");
        ComboBoxMake.addItem("Ford");
        ComboBoxMake.addItem("Nissan");
        ComboBoxMake.addItem("Rolls Royce");
    }

    private void populateComboBoxModel() {
        ComboBoxModel.removeAllItems(); // Clear the existing items

        ComboBoxModel.addItem("Select");

        // Add specific car models
        ComboBoxModel.addItem("Toyota Camry");
        ComboBoxModel.addItem("Toyota Corolla");
        ComboBoxModel.addItem("Toyota Prius");
        ComboBoxModel.addItem("Ford Expedition");
        ComboBoxModel.addItem("Ford Bronco");
        ComboBoxModel.addItem("Ford Ranger");
        ComboBoxModel.addItem("Nissan NV200");
        ComboBoxModel.addItem("Nissan NV Cargo and NV Passenger");
        ComboBoxModel.addItem("Rolls-Royce Phantom");
        ComboBoxModel.addItem("Rolls-Royce Ghost");
        ComboBoxModel.addItem("Rolls-Royce Wraith");
    }

    private void populateAddedVehList() {
        DefaultTableModel model = (DefaultTableModel) tblAddedVehList.getModel();
        model.setRowCount(0); // Clear existing rows

        ArrayList<Vehicle> addedVehList = custQuote.getQuote().getVehicles();

        for (Vehicle vehicle : addedVehList) {
            Object[] row = {vehicle, vehicle.getYear(), vehicle.getMake(), vehicle.getModel()};
            model.addRow(row);
        }
    }

    private void clearInputFields() {
        txtVIN.setText("");
        ComboBoxYear.setSelectedIndex(0);
        ComboBoxMake.setSelectedIndex(0);
        ComboBoxModel.setSelectedIndex(0);
        ComboBoxVehType.setSelectedIndex(0);
    }

    private void populatePrepopulatedVehList() {

        String streetAdd = custQuote.getCustomerAccount().getStreetAddress();
        String city = custQuote.getCustomerAccount().getCity();
        String state = custQuote.getCustomerAccount().getState();
        String zip = custQuote.getCustomerAccount().getZip();

        // Iterate through vehicleListWithAddressDirectory
        for (VehicleListWithAddress directoryEntry : vehicleListWithAddressDirectory.getDirectory()) {
            // Check if the address matches
            if (directoryEntry.getStreetAddress().equals(streetAdd)
                    && directoryEntry.getCity().equals(city)
                    && directoryEntry.getState().equals(state)
                    && directoryEntry.getZip().equals(zip)) {

                // Populate tblPrepopulatedVehList with vehicles from the matching entry
                DefaultTableModel model = (DefaultTableModel) tblPrepopulatedVehList.getModel();
                model.setRowCount(0); // Clear existing rows

                ArrayList<Vehicle> vehicles = directoryEntry.getVehicles();
                for (Vehicle vehicle : vehicles) {
                    Object[] row = {vehicle, vehicle.getYear(), vehicle.getMake(), vehicle.getModel()};
                    model.addRow(row);
                }

                // Break out of the loop once the matching entry is found
                break;
            }
        }
    }
}
