/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ebank_client;

import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.lang.Exception;
import java.util.List;

/**
 *
 * @author USER
 */
public class CustomersListUI extends javax.swing.JFrame {

    /**
     * Creates new form LoginUI
     */
    public CustomersListUI() throws Exception {

        initComponents();

        // read the header image as a BufferedImage
        BufferedImage img1 = null;
        try {
            img1 = ImageIO.read(new File("images/LongHeader.jpg"));
        } catch (IOException e) {
            // error message
            JOptionPane.showMessageDialog(new JFrame(), "Loading image for Reel 1 failed", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }
        // resize the BufferedImage
        //Image dimg1 = img1.getScaledInstance(510, 90, BufferedImage.SCALE_SMOOTH);
        Image dimg1 = img1.getScaledInstance(lblHeader.getWidth(), lblHeader.getHeight() + 10, BufferedImage.SCALE_SMOOTH);

        // assign to reel label
        ImageIcon imageIcon1 = new ImageIcon(dimg1);
        lblHeader.setIcon(imageIcon1);

        // stored customer records as elements of arraylist
        List<String> arrL = displayCustomer();

        // create a new array to store details
        String[] arr = new String[arrL.size()];

        // convert arraylist to array
        int ind = 0;
        for (String s : arrL) {
            arr[ind++] = s;
        }

        lstCustomerAccounts.setModel(new javax.swing.AbstractListModel<String>() {
            //String[] strings = { "Item X", "Item 2", "Item 3", "Item 4", "Item 5" };

            String[] strings = arr;

            public int getSize() {
                return strings.length;
            }

            public String getElementAt(int i) {
                return strings[i];
            }
        });
        jScrollPane1.setViewportView(lstCustomerAccounts);

    }

    public void setAccountNumber(String accountNo) {
        this.txtAccountNumber.setText(accountNo);
    }

    public String getAccountNumber() {
        return this.txtAccountNumber.getText();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        btnSelect = new javax.swing.JButton();
        txtAccountNumber = new javax.swing.JTextField();
        btnCreate = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstCustomerAccounts = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        lblHeader = new javax.swing.JLabel();

        setLocation(new java.awt.Point(500, 200));
        setResizable(false);

        jLabel2.setText("Account Number :");

        btnSelect.setText("Select");
        btnSelect.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelectActionPerformed(evt);
            }
        });

        btnCreate.setText("Create");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(185, 6, 65));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("Customer Accounts");

        lstCustomerAccounts.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        lstCustomerAccounts.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        lstCustomerAccounts.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        lstCustomerAccounts.setFixedCellHeight(30);
        lstCustomerAccounts.setOpaque(false);
        lstCustomerAccounts.setSelectionBackground(new java.awt.Color(51, 51, 51));
        lstCustomerAccounts.setSelectionForeground(new java.awt.Color(204, 204, 204));
        lstCustomerAccounts.addPropertyChangeListener(new java.beans.PropertyChangeListener() {
            public void propertyChange(java.beans.PropertyChangeEvent evt) {
                lstCustomerAccountsPropertyChange(evt);
            }
        });
        lstCustomerAccounts.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                lstCustomerAccountsValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(lstCustomerAccounts);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Name           |           Account Number");

        lblHeader.setBackground(new java.awt.Color(0, 102, 102));
        lblHeader.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 618, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(172, 172, 172)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(txtAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(291, 291, 291)
                        .addComponent(btnSelect, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnCreate)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblHeader, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtAccountNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate)
                    .addComponent(btnSelect))
                .addGap(29, 29, 29)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSelectActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelectActionPerformed
        try {
            // get details from GUI
            String accountNumber = getAccountNumber();

            // check whether account number is specified
            if (!accountNumber.isEmpty()) {

                // account number is given
                // redirect to view specific customer details
                // data, that should be loaded on text fields of customer account UI, when creating
                List<String> cDetails = null;
                cDetails = selectCustomer(accountNumber);

                // convert arraylist to an array
                String[] createDetails = new String[cDetails.size()];

                int i = 0;
                for (String cD : cDetails) {
                    createDetails[i] = cD;
                    i++;
                }

                if (Session.isLoggedIn) {

                    if (cDetails.size() == 0) {

                        throw new Exception("No matching record found for selection");

                    } else {

                        // user logged in
                        // relevant customer account data found
                        // go to customer account page
                        CustomerAccountPageUI customerAccountPageUI = new CustomerAccountPageUI(createDetails[0], createDetails[1], createDetails[2], createDetails[3], createDetails[4], createDetails[5], createDetails[6], createDetails[7], createDetails[8], createDetails[9]);
                        customerAccountPageUI.setVisible(true);
                        this.setVisible(false);

                    }

                } else {

                    // user not logged in
                    throw new Exception("You are not logged in. Please login to continue");
                }

            } else {

                // account number not specified
                throw new Exception("Please specify the account number and select");

            }

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(new JFrame(), ex.getLocalizedMessage(), "Error",
                    JOptionPane.ERROR_MESSAGE);

        }


    }//GEN-LAST:event_btnSelectActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
        try {
            // get details from GUI
            String accountNumber = getAccountNumber();

            if (accountNumber.isEmpty()) {
                // accountNumber not specified
                throw new Exception("Please specify the account number for the account to create");
            } else // accountNumber is specified
            {
                if (Session.isLoggedIn) {

                    // user logged in
                    // both fields are filled
                    // redirect to view specific customer details
                    // data, that should be loaded on text fields of customer account UI, when creating
                    List<String> cDetails = null;
                    cDetails = selectCustomer(accountNumber);

                    // convert arraylist to an array
                    String[] createDetails = new String[cDetails.size()];

                    int i = 0;
                    for (String cD : cDetails) {
                        createDetails[i++] = cD;
                    }

                    // check for existing record in the given email & account number combination
                    if (cDetails.size() == 0) {
                        // no record available
                        // can create a customer with that email & account number
                        CustomerAccountPageUI customerAccountPageUI = new CustomerAccountPageUI("", "", "", "", "", "", accountNumber, "", "", "");
                        customerAccountPageUI.setVisible(true);

                        this.setVisible(false);
                    } else {

                        // record available
                        throw new Exception("There is already a record available with this Account number");

                    }

                } else {

                    // user not logged in
                    throw new Exception("You are not logged in. Please login to continue");
                }
            }

        } catch (Exception ex) {

            JOptionPane.showMessageDialog(new JFrame(), ex.getLocalizedMessage(), "Error",
                    JOptionPane.ERROR_MESSAGE);

        }
    }//GEN-LAST:event_btnCreateActionPerformed

    private void lstCustomerAccountsPropertyChange(java.beans.PropertyChangeEvent evt) {//GEN-FIRST:event_lstCustomerAccountsPropertyChange
        // TODO add your handling code here:
    }//GEN-LAST:event_lstCustomerAccountsPropertyChange

    private void lstCustomerAccountsValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_lstCustomerAccountsValueChanged

        // get the selected string
        String selection = lstCustomerAccounts.getSelectedValue();

        // split the string to get email and account number
        String[] selectionSplit = selection.split("           ");

        // assign account number in GUI
        setAccountNumber(selectionSplit[1]);


    }//GEN-LAST:event_lstCustomerAccountsValueChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnSelect;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHeader;
    private javax.swing.JList<String> lstCustomerAccounts;
    private javax.swing.JTextField txtAccountNumber;
    // End of variables declaration//GEN-END:variables

    private static java.util.ArrayList<java.lang.String> displayCustomer() throws Exception {
        EBank_Client_Customer.EBankCustomerWS_Service service = new EBank_Client_Customer.EBankCustomerWS_Service();
        EBank_Client_Customer.EBankCustomerWS port = service.getEBankCustomerWSPort();
        return port.displayCustomer();
    }

    private static java.util.ArrayList<java.lang.String> selectCustomer(java.lang.String accountNumber) throws Exception {
        EBank_Client_Customer.EBankCustomerWS_Service service = new EBank_Client_Customer.EBankCustomerWS_Service();
        EBank_Client_Customer.EBankCustomerWS port = service.getEBankCustomerWSPort();
        return port.selectCustomer(accountNumber);
    }
}
