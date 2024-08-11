/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Comp.Agent;

import Main.TheBostonInsuranceModel;
import Model.Account.Account;
import Model.Customer.Quote.CustomerQuote;
import Model.Customer.Vehicle.Vehicle;
import java.awt.CardLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Linata04
 */
public class AddVehicleDetailsPage extends javax.swing.JPanel {

    /**
     * Creates new form NewVehiclePage
     */
    private TheBostonInsuranceModel BIM;
    private JPanel workPanel;
    private CustomerQuote custQuote;
    private Account account;

    public AddVehicleDetailsPage(TheBostonInsuranceModel BIM, JPanel workPanel, CustomerQuote custQuote, Account account) {
        initComponents();
        this.BIM = BIM;
        this.workPanel = workPanel;
        this.custQuote = custQuote;
        this.account = account;

        populateComboBoxes();
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
        btnUpdate = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAddedVehList = new javax.swing.JTable();
        lblOwnershipStat = new javax.swing.JLabel();
        lblPrimaryUse = new javax.swing.JLabel();
        CBPrimaryUse = new javax.swing.JComboBox<>();
        lblPrimaryUse1 = new javax.swing.JLabel();
        btnBack = new javax.swing.JButton();
        ComboOwnStatus = new javax.swing.JComboBox<>();
        ComboRegistered = new javax.swing.JComboBox<>();
        btnSave = new javax.swing.JButton();
        btnNext = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setText("             Select, update, and enter additional details for all added vehicles to proceed.");

        btnUpdate.setBackground(new java.awt.Color(204, 204, 204));
        btnUpdate.setText("Update");
        btnUpdate.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/topLogo.png"))); // NOI18N
        jLabel13.setText("jLabel13");

        tblAddedVehList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "VIN", "Year", "Make", "Model", "Ownership", "Use", "Registration"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblAddedVehList);

        lblOwnershipStat.setText("Select the appropriate ownership status for your vehicle :");

        lblPrimaryUse.setText("Is this vehicle currently registered at your primary address, or will it be registered there within the next 30 days?");

        CBPrimaryUse.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select", "Commute (to work/school)", "Business (delivery services", "taxi service)" }));
        CBPrimaryUse.setEnabled(false);

        lblPrimaryUse1.setText("Describe the primary use of your vehicle.");

        btnBack.setBackground(new java.awt.Color(204, 204, 204));
        btnBack.setText("Back");
        btnBack.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        ComboOwnStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select", "Paid for", "Financed", "Leased" }));
        ComboOwnStatus.setEnabled(false);

        ComboRegistered.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "select", "Yes", "No" }));
        ComboRegistered.setEnabled(false);

        btnSave.setBackground(new java.awt.Color(204, 204, 204));
        btnSave.setText("Save");
        btnSave.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveActionPerformed(evt);
            }
        });

        btnNext.setBackground(new java.awt.Color(204, 204, 204));
        btnNext.setText("Next");
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
                .addContainerGap()
                .addComponent(btnBack)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPrimaryUse1)
                    .addComponent(ComboRegistered, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnUpdate)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jScrollPane2)
                            .addComponent(CBPrimaryUse, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblPrimaryUse, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(lblOwnershipStat)
                            .addComponent(ComboOwnStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnNext, javax.swing.GroupLayout.PREFERRED_SIZE, 179, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBack)
                .addGap(20, 20, 20)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUpdate)
                .addGap(32, 32, 32)
                .addComponent(lblOwnershipStat)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ComboOwnStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPrimaryUse1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CBPrimaryUse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPrimaryUse)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ComboRegistered, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnSave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnNext)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 613, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 656, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblAddedVehList.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "No Vehicles selected from pre-populated vehicle table");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblAddedVehList.getModel();
        Vehicle selectedVehicle = (Vehicle) model.getValueAt(selectedRow, 0);

        // Enable the ComboBoxes
        ComboOwnStatus.setEnabled(true);
        CBPrimaryUse.setEnabled(true);
        ComboRegistered.setEnabled(true);

        // Check if the selectedVehicle's values match any of the prepopulated data
        // If yes, select the corresponding index; otherwise, select the "Select" index
        ComboOwnStatus.setSelectedIndex(getIndex(ComboOwnStatus, selectedVehicle.getOwnership()));
        CBPrimaryUse.setSelectedIndex(getIndex(CBPrimaryUse, selectedVehicle.getUse()));
        ComboRegistered.setSelectedIndex(getIndex(ComboRegistered, selectedVehicle.getRegisteration()));
    }

    private int getIndex(javax.swing.JComboBox<String> comboBox, String value) {
        for (int i = 0; i < comboBox.getItemCount(); i++) {
            if (comboBox.getItemAt(i).equals(value)) {
                return i;
            }
        }
        return 0; // Default to the "Select" index if no match is found

    }//GEN-LAST:event_btnUpdateActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        workPanel.remove(this);
        CardLayout layout = (CardLayout) workPanel.getLayout();
        layout.previous(workPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnSaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblAddedVehList.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "No Vehicles selected from pre-populated vehicle table");
            return;
        }

        DefaultTableModel model = (DefaultTableModel) tblAddedVehList.getModel();
        Vehicle selectedVehicle = (Vehicle) model.getValueAt(selectedRow, 0);

        // Get selected values from ComboBoxes
        String selectedOwnStatus = ComboOwnStatus.getSelectedItem().toString();
        String selectedPrimaryUse = CBPrimaryUse.getSelectedItem().toString();
        String selectedRegistered = ComboRegistered.getSelectedItem().toString();

        // Check if any ComboBox is still in the "Select" index
        if ("Select".equals(selectedOwnStatus) || "Select".equals(selectedPrimaryUse) || "Select".equals(selectedRegistered)) {
            JOptionPane.showMessageDialog(this, "Please select a value for all ComboBoxes");
            return;
        }

        // Update the values of the selected vehicle
        selectedVehicle.setOwnership(selectedOwnStatus);
        selectedVehicle.setUse(selectedPrimaryUse);
        selectedVehicle.setRegisteration(selectedRegistered);

        // Display success message
        JOptionPane.showMessageDialog(this, "Vehicle details updated successfully");

        // Disable ComboBoxes and set indices back to 0
        ComboOwnStatus.setEnabled(false);
        CBPrimaryUse.setEnabled(false);
        ComboRegistered.setEnabled(false);

        ComboOwnStatus.setSelectedIndex(0);
        CBPrimaryUse.setSelectedIndex(0);
        ComboRegistered.setSelectedIndex(0);
        // You may also want to update the table to reflect the changes
        populateAddedVehList();
    }//GEN-LAST:event_btnSaveActionPerformed

    private void btnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNextActionPerformed
        // TODO add your handling code here:
        DefaultTableModel model = (DefaultTableModel) tblAddedVehList.getModel();
        int rowCount = model.getRowCount();
        boolean hasRollsRoyce = false;
        boolean hasPendingStatus = false;
        
        custQuote.getQuote().setStatus("pending"); //temp fix

        // Check if any vehicle has 'N/A' values
        for (int i = 0; i < rowCount; i++) {
            Vehicle vehicle = (Vehicle) model.getValueAt(i, 0);
            if ("N/A".equals(vehicle.getOwnership()) || "N/A".equals(vehicle.getUse()) || "N/A".equals(vehicle.getRegisteration())) {
                JOptionPane.showMessageDialog(this, "Please fill in all values for all vehicles");
                return;
            }

            // Check if Make is "Rolls Royce"
            if ("Rolls Royce".equalsIgnoreCase(vehicle.getMake())) {
                hasRollsRoyce = true;
                // Check the status of the vehicle
                if ("accepted".equals(custQuote.getQuote().getStatus())) {
                    // If the status is Accepted, proceed to the next page
                    CardLayout layout = (CardLayout) workPanel.getLayout();
                    PackageSelection packageSelection = new PackageSelection(BIM, workPanel, custQuote, account);
                    workPanel.add("PackageSelection", packageSelection);
                    layout.next(workPanel);
                    return;
                } else if ("pending".equals(custQuote.getQuote().getStatus())) {
                    // If the status is Pending, change it to Unauthorized and proceed to the next page
                    custQuote.getQuote().setStatus("unauthorized");
                    JOptionPane.showMessageDialog(this, "Underwriter must review the quote.");

//                    CardLayout layout = (CardLayout) workPanel.getLayout();
//                    PackageSelection packageSelection = new PackageSelection(BIM, workPanel, custQuote, account);
//                    workPanel.add("PackageSelection", packageSelection);
//                    layout.next(workPanel);
                    return;
                }
            } else if ("pending".equals(custQuote.getQuote().getStatus())) {
                // If no vehicle has Make as "Rolls Royce" and the status is Pending, set hasPendingStatus to true
                hasPendingStatus = true;
            }
        }

        // If no vehicle has Make as "Rolls Royce" and hasPendingStatus is true, proceed to the next page
        if (hasPendingStatus) {
            CardLayout layout = (CardLayout) workPanel.getLayout();
            PackageSelection packageSelection = new PackageSelection(BIM, workPanel, custQuote, account);
            workPanel.add("PackageSelection", packageSelection);
            layout.next(workPanel);
        }
    }//GEN-LAST:event_btnNextActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CBPrimaryUse;
    private javax.swing.JComboBox<String> ComboOwnStatus;
    private javax.swing.JComboBox<String> ComboRegistered;
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnNext;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblOwnershipStat;
    private javax.swing.JLabel lblPrimaryUse;
    private javax.swing.JLabel lblPrimaryUse1;
    private javax.swing.JTable tblAddedVehList;
    // End of variables declaration//GEN-END:variables

    private void populateAddedVehList() {
        DefaultTableModel model = (DefaultTableModel) tblAddedVehList.getModel();
        model.setRowCount(0); // Clear existing rows

        ArrayList<Vehicle> addedVehList = custQuote.getQuote().getVehicles();

        for (Vehicle vehicle : addedVehList) {
            Object[] row = new Object[7];
            row[0] = vehicle;
            row[1] = vehicle.getYear();
            row[2] = vehicle.getMake();
            row[3] = vehicle.getModel();
            row[4] = vehicle.getOwnership();
            row[5] = vehicle.getUse();
            row[6] = vehicle.getRegisteration();

            model.addRow(row);
        }
    }

    private void populateComboBoxes() {
        populateComboOwnStatus();
        populateCBPrimaryUse();
        populateCBRegistered();
    }

    private void populateComboOwnStatus() {
        ComboOwnStatus.removeAllItems();

        // Add the options
        ComboOwnStatus.addItem("Select");
        ComboOwnStatus.addItem("Paid for");
        ComboOwnStatus.addItem("Financed");
        ComboOwnStatus.addItem("Leased");
    }

    private void populateCBPrimaryUse() {
        CBPrimaryUse.removeAllItems();

        // Add the options
        CBPrimaryUse.addItem("Select");
        CBPrimaryUse.addItem("Commuting (to work/school)");
        CBPrimaryUse.addItem("Business (delivery services, taxi service)");
    }

    private void populateCBRegistered() {
        ComboRegistered.removeAllItems();

        // Add the options
        ComboRegistered.addItem("Select");
        ComboRegistered.addItem("Yes");
        ComboRegistered.addItem("No");
    }

}
