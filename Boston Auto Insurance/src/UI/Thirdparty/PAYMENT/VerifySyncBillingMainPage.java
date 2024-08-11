/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Thirdparty.PAYMENT;

import Main.TheBostonInsuranceModel;
import Model.Customer.Payment.PaymentCard;
import Model.Thirdparty.PAYMENT.PaymentCardDirectory;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Linata04
 */
public class VerifySyncBillingMainPage extends javax.swing.JPanel {

    /**
     * Creates new form VerifySyncBillingMainPage
     */
    private TheBostonInsuranceModel BIM;
    private JPanel workPanel;
    private PaymentCardDirectory paymentCardDirectory;

    public VerifySyncBillingMainPage(TheBostonInsuranceModel BIM, JPanel workPanel) {
        initComponents();
        this.BIM = BIM;
        this.workPanel = workPanel;
        this.paymentCardDirectory = BIM.getPaymentCardDirectory();

        populatePaymentCards();
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
        jScrollPane2 = new javax.swing.JScrollPane();
        tblPaymentCards = new javax.swing.JTable();
        btnAdd = new javax.swing.JButton();
        lblStreetAdd = new javax.swing.JLabel();
        txtCardNumber = new javax.swing.JTextField();
        lblZip = new javax.swing.JLabel();
        txtExpMonth = new javax.swing.JTextField();
        lblVin = new javax.swing.JLabel();
        txtExpDate = new javax.swing.JTextField();
        lblYear = new javax.swing.JLabel();
        txtCVV = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btnAdd1 = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        tblPaymentCards.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Card Number", "Expiration Month", "Expiration Year", "CVV"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblPaymentCards);

        btnAdd.setBackground(new java.awt.Color(0, 153, 153));
        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });

        lblStreetAdd.setText("Street Address");

        lblZip.setText("ZIP");

        lblVin.setText("VIN");

        lblYear.setText("Year");

        jLabel1.setFont(new java.awt.Font("Segoe UI Emoji", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 153));
        jLabel1.setText("Please add a new row to the table for the VIN information entry.");

        btnAdd1.setBackground(new java.awt.Color(0, 153, 153));
        btnAdd1.setText("Logout");

        btnDelete.setBackground(new java.awt.Color(0, 153, 153));
        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Stencil", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 102, 51));
        jLabel2.setText("       VerifySyncBilling");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnAdd1, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 234, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblYear, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCVV, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblVin, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtExpDate, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblStreetAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(lblZip, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtExpMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE))
                        .addContainerGap(40, Short.MAX_VALUE))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel2)
                .addGap(12, 12, 12)
                .addComponent(btnAdd1)
                .addGap(57, 57, 57)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnDelete)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblStreetAdd)
                    .addComponent(txtCardNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblZip)
                    .addComponent(txtExpMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblVin)
                    .addComponent(txtExpDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblYear)
                    .addComponent(txtCVV, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addComponent(btnAdd)
                .addGap(90, 90, 90))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblPaymentCards.getSelectedRow();

        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a payment card to delete.", "No Card Selected", JOptionPane.WARNING_MESSAGE);
            return;
        }

        String selectedCardNumber = (String) tblPaymentCards.getValueAt(selectedRow, 0);

        paymentCardDirectory.removePaymentCard(selectedCardNumber);

        populatePaymentCards();
    }//GEN-LAST:event_btnDeleteActionPerformed

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        // TODO add your handling code here:
        long cardNumber = 0;
        try {
            cardNumber = Long.parseLong(txtCardNumber.getText());
            if (cardNumber <= 0 || String.valueOf(cardNumber).length() != 16) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid Card Number. Please enter a valid 16-digit positive integer.");
            return;
        }

        // Validate Expiration Month
        int expMonth = 0;
        try {
            expMonth = Integer.parseInt(txtExpMonth.getText());
            if (expMonth < 1 || expMonth > 12) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid Expiration Month. Please enter a valid integer between 1 and 12.");
            return;
        }

        // Validate Expiration Year
        int expYear = 0;
        try {
            expYear = Integer.parseInt(txtExpDate.getText());
            if (expYear < 1000 || expYear > 9999) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid Expiration Year. Please enter a valid 4-digit integer.");
            return;
        }

        // Validate CVV
        int cvvNumber = 0;
        try {
            cvvNumber = Integer.parseInt(txtCVV.getText());
            if (cvvNumber <= 0 || String.valueOf(cvvNumber).length() != 3) {
                throw new NumberFormatException();
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "Invalid CVV. Please enter a valid 3-digit positive integer.");
            return;
        }

        // Check if the card already exists in the directory
        PaymentCard newCard = new PaymentCard("", String.valueOf(cardNumber), expMonth, expYear, String.valueOf(cvvNumber), "", "", "", "");
        if (paymentCardDirectory.isCardInDirectory(newCard)) {
            JOptionPane.showMessageDialog(this, "Card already exists in the directory.");
        } else {
            // Add the new card to the directory and update the table
            paymentCardDirectory.addPaymentCard(newCard);
            populatePaymentCards();
        }

    }//GEN-LAST:event_btnAddActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnAdd1;
    private javax.swing.JButton btnDelete;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblStreetAdd;
    private javax.swing.JLabel lblVin;
    private javax.swing.JLabel lblYear;
    private javax.swing.JLabel lblZip;
    private javax.swing.JTable tblPaymentCards;
    private javax.swing.JTextField txtCVV;
    private javax.swing.JTextField txtCardNumber;
    private javax.swing.JTextField txtExpDate;
    private javax.swing.JTextField txtExpMonth;
    // End of variables declaration//GEN-END:variables

    private void populatePaymentCards() {
        DefaultTableModel model = (DefaultTableModel) tblPaymentCards.getModel();

        // Clear existing rows
        model.setRowCount(0);

        // Get the list of payment cards from the directory
        ArrayList<PaymentCard> paymentCards = paymentCardDirectory.getAllPaymentCards();

        // Populate the table with payment card data
        for (PaymentCard paymentCard : paymentCards) {
            Object[] row = {
                paymentCard.getCardNumber(),
                paymentCard.getExpirationMonth(),
                paymentCard.getExpirationYear(),
                paymentCard.getCvv()
            };
            model.addRow(row);
        }
    }
}
