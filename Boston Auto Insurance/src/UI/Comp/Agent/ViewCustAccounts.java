/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UI.Comp.Agent;

import Main.TheBostonInsuranceModel;
import Model.Customer.Customer;
import Model.Customer.Policy.CustomerPolicy;
import Model.Customer.Policy.CustomerPolicyDirectory;
import Model.Customer.Quote.CustomerQuote;
import Model.Customer.Quote.CustomerQuoteDirectory;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Linata04
 */
public class ViewCustAccounts extends javax.swing.JPanel {

    /**
     * Creates new form ViewCustAccounts
     */
    private TheBostonInsuranceModel BIM;
    private JPanel workPanel;
    private CustomerQuoteDirectory customerQuoteDirectory;
    private CustomerPolicyDirectory customerPolicyDirectory;

    public ViewCustAccounts(TheBostonInsuranceModel BIM, JPanel workPanel) {
        initComponents();
        this.BIM = BIM;
        this.workPanel = workPanel;
        customerQuoteDirectory = BIM.getCustomerQuoteDirectory();
        customerPolicyDirectory = BIM.getCustomerPolicyDirectory();

        populateTable();
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
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCustAccList = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        jLabel = new javax.swing.JLabel();
        btnView = new javax.swing.JButton();

        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/res/topLogo.png"))); // NOI18N

        tblCustAccList.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Customer ID", "User Name", "Customer Name", "Quote Number", "Policy Number", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblCustAccList);

        btnBack.setBackground(new java.awt.Color(204, 204, 204));
        btnBack.setForeground(new java.awt.Color(153, 0, 0));
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        jLabel.setFont(new java.awt.Font("Segoe UI Emoji", 1, 14)); // NOI18N
        jLabel.setForeground(new java.awt.Color(0, 51, 153));
        jLabel.setText("                                                  View Customer Accounts");

        btnView.setBackground(new java.awt.Color(204, 204, 204));
        btnView.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        btnView.setForeground(new java.awt.Color(153, 0, 0));
        btnView.setText("View the Quote/Policy");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBack)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 30, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 584, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnView))
                        .addContainerGap(30, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnBack)
                .addGap(20, 20, 20)
                .addComponent(jLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnView)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 637, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 491, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        workPanel.remove(this);
        CardLayout layout = (CardLayout) workPanel.getLayout();
        layout.previous(workPanel);
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        int selectedRow = tblCustAccList.getSelectedRow();
        if (selectedRow < 0) {
            JOptionPane.showMessageDialog(this, "Please select a Customer First");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblCustAccList.getModel();
        Customer customer = (Customer) model.getValueAt(selectedRow, 0);

        CustomerQuote customerQuote = customerQuoteDirectory.findCustomerQuote(customer);
        CustomerPolicy customerPolicy = customerPolicyDirectory.findCustomerPolicy(customer);

        if (customerQuote != null && customerPolicy != null) {
            // If the customer has both a quote and a policy, ask the user which page to go
            int choice = JOptionPane.showOptionDialog(this,
                    "Customer has both a Quote and a Policy. Choose the page to view.",
                    "Choose Page",
                    JOptionPane.YES_NO_OPTION,
                    JOptionPane.QUESTION_MESSAGE,
                    null,
                    new Object[]{"Quote Worksheet", "Policy Worksheet"},
                    "Quote Worksheet");

            if (choice == JOptionPane.YES_OPTION) {
                // User chose Quote Worksheet
                // Navigate to the Quote Worksheet page
                // You should replace QuoteWorksheetPage with the actual class for the Quote Worksheet page
                QuoteWorksheet quoteWorksheetPage = new QuoteWorksheet(BIM, workPanel, customerQuote);
                workPanel.add(quoteWorksheetPage, "QuoteWorksheetPage");
                CardLayout layout = (CardLayout) workPanel.getLayout();
                layout.show(workPanel, "QuoteWorksheetPage");
            } else {
                // User chose Policy Worksheet
                // Navigate to the Policy Worksheet page
                // You should replace PolicyWorksheetPage with the actual class for the Policy Worksheet page
                PolicyWorksheet policyWorksheetPage = new PolicyWorksheet(BIM, workPanel, customerPolicy);
                workPanel.add(policyWorksheetPage, "PolicyWorksheetPage");
                CardLayout layout = (CardLayout) workPanel.getLayout();
                layout.show(workPanel, "PolicyWorksheetPage");
            }
        } else if (customerQuote != null) {
            // If the customer has a quote but no policy
            // Navigate to the Quote Worksheet page
            // You should replace QuoteWorksheetPage with the actual class for the Quote Worksheet page
            QuoteWorksheet quoteWorksheetPage = new QuoteWorksheet(BIM, workPanel, customerQuote);
            workPanel.add(quoteWorksheetPage, "QuoteWorksheetPage");
            CardLayout layout = (CardLayout) workPanel.getLayout();
            layout.show(workPanel, "QuoteWorksheetPage");
        } else if (customerPolicy != null) {
            // If the customer has a policy but no quote
            // Navigate to the Policy Worksheet page
            // You should replace PolicyWorksheetPage with the actual class for the Policy Worksheet page
            PolicyWorksheet policyWorksheetPage = new PolicyWorksheet(BIM, workPanel, customerPolicy);
            workPanel.add(policyWorksheetPage, "PolicyWorksheetPage");
            CardLayout layout = (CardLayout) workPanel.getLayout();
            layout.show(workPanel, "PolicyWorksheetPage");
        } else {
            // If the customer has neither a quote nor a policy
            JOptionPane.showMessageDialog(this, "Customer does not have a Quote or Policy.");
        }
    }//GEN-LAST:event_btnViewActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnView;
    private javax.swing.JLabel jLabel;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblCustAccList;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        DefaultTableModel model = (DefaultTableModel) tblCustAccList.getModel();
        model.setRowCount(0);

        for (Customer customer : BIM.getCustomerDirectory().getCustomers()) {
            CustomerQuote customerQuote = BIM.getCustomerQuoteDirectory().findCustomerQuote(customer);
            CustomerPolicy customerPolicy = BIM.getCustomerPolicyDirectory().findCustomerPolicy(customer);

            Object[] row = new Object[6];
            row[0] = customer;
            row[1] = customer.getAccountCredentials().getUserID();
            row[2] = customer.getFullName();

            if (customerQuote != null) {
                row[3] = customerQuote.getQuote().getQuoteId();
            } else {
                row[3] = "N/A";
            }

            if (customerPolicy != null) {
                row[4] = customerPolicy.getPolicy().getPolicyId();
            } else {
                row[4] = "N/A";
            }
            if (customerQuote != null) {
                row[5] = customerQuote.getQuote().getStatus();
            } else {
                // If the customer is not found in customerQuoteDirectory, check customerPolicyDirectory
                if (customerPolicy != null) {
                    // If the customer is found in customerPolicyDirectory, set the status accordingly
                    row[5] = customerPolicy.getPolicy().getStatus();
                } else {
                    row[5] = "N/A";
                }
            }

            model.addRow(row);
        }
    }

}
