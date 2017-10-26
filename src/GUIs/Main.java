package GUIs;

import FileIO.MyFileIO;
import java.text.DateFormat;
import java.util.ArrayList;
import java.util.GregorianCalendar;
import java.util.Locale;
import java.util.ResourceBundle;
import Model.Package;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

public class Main extends javax.swing.JFrame {
    static Locale locale;
    ResourceBundle rb = ResourceBundle.getBundle("RBs/MyResourceBundle", locale);
    ArrayList <Package> packages = new ArrayList();
    String date;
    int packageID = 0;
    int currentPackageIndex = -1;
    
    public Main() {
        initComponents();
        
        //Reading Saved Packages
        packages = MyFileIO.readAndReturn();
            
        //Retrieving Last Used ID and Adding One
        if(packages.size() > 0) {
            packageID = packages.get(packages.size()-1).getPackageID() + 1;
        }
            
        //Translations
        updateLabels();
        
        //Disable Inputs
        inputsOn(false);
        
        //Auto Set Buttons
        enableAndDisableButtons();
        
        //Set Locale For JOptionPane
        JOptionPane.setDefaultLocale(locale);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        prepaidButtonGroup = new javax.swing.ButtonGroup();
        basePanel = new javax.swing.JPanel();
        informationPanel = new javax.swing.JPanel();
        packageIDLabel = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        addressLabel = new javax.swing.JLabel();
        cityLabel = new javax.swing.JLabel();
        descriptionLabel = new javax.swing.JLabel();
        priceLabel = new javax.swing.JLabel();
        packageIDTextField = new javax.swing.JTextField();
        nameTextField = new javax.swing.JTextField();
        addressTextField = new javax.swing.JTextField();
        cityTextField = new javax.swing.JTextField();
        descriptionTextField = new javax.swing.JTextField();
        priceTextField = new javax.swing.JTextField();
        countyLabel = new javax.swing.JLabel();
        countyComboBox = new javax.swing.JComboBox<>();
        contactNoLabel = new javax.swing.JLabel();
        contactNoTextField = new javax.swing.JTextField();
        prepaidLabel = new javax.swing.JLabel();
        radioButtonYes = new javax.swing.JRadioButton();
        radioButtonNo = new javax.swing.JRadioButton();
        arrivedAtLabel = new javax.swing.JLabel();
        arrivedAtTextField = new javax.swing.JTextField();
        packagesByCountyPanel = new javax.swing.JPanel();
        displayPackagesComboBox = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        IDByCountyList = new javax.swing.JList<>();
        scanButton = new javax.swing.JButton();
        addButton = new javax.swing.JButton();
        removeButton = new javax.swing.JButton();
        editButton = new javax.swing.JButton();
        updateButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        displayAllButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        informationPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Package Information"));
        informationPanel.setName(""); // NOI18N

        packageIDLabel.setText("Package ID:");

        nameLabel.setText("Name:");

        addressLabel.setText("Address:");

        cityLabel.setText("City:");

        descriptionLabel.setText("Description:");

        priceLabel.setText("Price:");

        packageIDTextField.setEditable(false);
        packageIDTextField.setEnabled(false);

        nameTextField.setEditable(false);

        addressTextField.setEditable(false);

        cityTextField.setEditable(false);

        descriptionTextField.setEditable(false);

        priceTextField.setEditable(false);

        countyLabel.setText("County:");

        countyComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Antrim", "Armagh", "Carlow", "Cavan", "Clare", "Cork", "Derry", "Donegal", "Down", "Dublin", "Fermanagh", "Galway", "Kerry", "Kildare", "Kilkenny", "Laois", "Leitrim", "Limerick", "Longford", "Louth", "Mayo", "Meath", "Monaghan", "Offaly", "Roscommon", "Sligo", "Tipperary", "Tyrone", "Waterford", "Westmeath", "Wexford", "Wicklow" }));

        contactNoLabel.setText("Contact Num:");

        contactNoTextField.setEditable(false);

        prepaidLabel.setText("Prepaid:");

        prepaidButtonGroup.add(radioButtonYes);
        radioButtonYes.setText("Yes");

        prepaidButtonGroup.add(radioButtonNo);
        radioButtonNo.setText("No");

        javax.swing.GroupLayout informationPanelLayout = new javax.swing.GroupLayout(informationPanel);
        informationPanel.setLayout(informationPanelLayout);
        informationPanelLayout.setHorizontalGroup(
            informationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(informationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(informationPanelLayout.createSequentialGroup()
                        .addGroup(informationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(informationPanelLayout.createSequentialGroup()
                                .addComponent(packageIDLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(packageIDTextField))
                            .addGroup(informationPanelLayout.createSequentialGroup()
                                .addComponent(addressLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(addressTextField)))
                        .addGap(6, 6, 6))
                    .addGroup(informationPanelLayout.createSequentialGroup()
                        .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nameTextField)
                        .addContainerGap())
                    .addGroup(informationPanelLayout.createSequentialGroup()
                        .addComponent(descriptionLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(descriptionTextField)
                        .addContainerGap())
                    .addGroup(informationPanelLayout.createSequentialGroup()
                        .addGroup(informationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(informationPanelLayout.createSequentialGroup()
                                .addComponent(priceLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(priceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(prepaidLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioButtonYes)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(radioButtonNo)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(informationPanelLayout.createSequentialGroup()
                                .addComponent(cityLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(countyLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(countyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(contactNoLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(contactNoTextField)))
                        .addContainerGap())))
        );

        informationPanelLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {addressLabel, cityLabel, descriptionLabel, nameLabel, packageIDLabel, priceLabel});

        informationPanelLayout.setVerticalGroup(
            informationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(informationPanelLayout.createSequentialGroup()
                .addGroup(informationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(packageIDLabel)
                    .addComponent(packageIDTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(informationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nameLabel))
                .addGap(18, 18, 18)
                .addGroup(informationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addressLabel)
                    .addComponent(addressTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(informationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cityLabel)
                    .addComponent(cityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(countyLabel)
                    .addComponent(countyComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(contactNoLabel)
                    .addComponent(contactNoTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(informationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descriptionLabel)
                    .addComponent(descriptionTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(informationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(priceLabel)
                    .addComponent(priceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(prepaidLabel)
                    .addComponent(radioButtonYes)
                    .addComponent(radioButtonNo))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        informationPanelLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {addressLabel, cityLabel, descriptionLabel, nameLabel, packageIDLabel, priceLabel});

        arrivedAtLabel.setText("Arrived At:");

        arrivedAtTextField.setEditable(false);
        arrivedAtTextField.setEnabled(false);

        packagesByCountyPanel.setBorder(javax.swing.BorderFactory.createTitledBorder("Packages By County"));

        displayPackagesComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Antrim", "Armagh", "Carlow", "Cavan", "Clare", "Cork", "Derry", "Donegal", "Down", "Dublin", "Fermanagh", "Galway", "Kerry", "Kildare", "Kilkenny", "Laois", "Leitrim", "Limerick", "Longford", "Louth", "Mayo", "Meath", "Monaghan", "Offaly", "Roscommon", "Sligo", "Tipperary", "Tyrone", "Waterford", "Westmeath", "Wexford", "Wicklow" }));
        displayPackagesComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayPackagesComboBoxActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(IDByCountyList);

        javax.swing.GroupLayout packagesByCountyPanelLayout = new javax.swing.GroupLayout(packagesByCountyPanel);
        packagesByCountyPanel.setLayout(packagesByCountyPanelLayout);
        packagesByCountyPanelLayout.setHorizontalGroup(
            packagesByCountyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(packagesByCountyPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(packagesByCountyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(displayPackagesComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 555, Short.MAX_VALUE))
                .addContainerGap())
        );
        packagesByCountyPanelLayout.setVerticalGroup(
            packagesByCountyPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(packagesByCountyPanelLayout.createSequentialGroup()
                .addComponent(displayPackagesComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1)
                .addContainerGap())
        );

        scanButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/scanButton.gif"))); // NOI18N
        scanButton.setText("Scan Now");
        scanButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                scanButtonActionPerformed(evt);
            }
        });

        addButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/addButton.gif"))); // NOI18N
        addButton.setText("Add");
        addButton.setEnabled(false);
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        removeButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/removeButton.gif"))); // NOI18N
        removeButton.setText("Remove");
        removeButton.setEnabled(false);
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        editButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/editButton.gif"))); // NOI18N
        editButton.setText("Edit");
        editButton.setEnabled(false);
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        updateButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/updateButton.gif"))); // NOI18N
        updateButton.setText("Update");
        updateButton.setEnabled(false);
        updateButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateButtonActionPerformed(evt);
            }
        });

        backButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/backButton.gif"))); // NOI18N
        backButton.setText("Back");
        backButton.setEnabled(false);
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        nextButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/nextButton.gif"))); // NOI18N
        nextButton.setText("Next");
        nextButton.setEnabled(false);
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        displayAllButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/displayButton.gif"))); // NOI18N
        displayAllButton.setText("Display All");
        displayAllButton.setEnabled(false);
        displayAllButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                displayAllButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout basePanelLayout = new javax.swing.GroupLayout(basePanel);
        basePanel.setLayout(basePanelLayout);
        basePanelLayout.setHorizontalGroup(
            basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, basePanelLayout.createSequentialGroup()
                        .addComponent(informationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(packagesByCountyPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(basePanelLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(arrivedAtLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(arrivedAtTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(basePanelLayout.createSequentialGroup()
                        .addComponent(scanButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(removeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(editButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(updateButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(displayAllButton, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        basePanelLayout.setVerticalGroup(
            basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(basePanelLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(arrivedAtLabel)
                    .addComponent(arrivedAtTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(packagesByCountyPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(informationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(basePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(scanButton)
                    .addComponent(addButton)
                    .addComponent(removeButton)
                    .addComponent(editButton)
                    .addComponent(updateButton)
                    .addComponent(backButton)
                    .addComponent(nextButton)
                    .addComponent(displayAllButton))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(basePanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void scanButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_scanButtonActionPerformed
        //Removing Text From TextFields
        clearInputs();
        
        //Generate Date
        GregorianCalendar cal = new GregorianCalendar();
        DateFormat formatter = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.MEDIUM, locale);
        date = formatter.format(cal.getTime());
        arrivedAtTextField.setText(date);    
        
        //Set ID TextField
        packageIDTextField.setText("" + packageID);
        
        //Inputs On
        inputsOn(true);
        
        //Buttons Off (Except Add)
        addButton.setEnabled(true);
        scanButton.setEnabled(false);
        editButton.setEnabled(false);
        updateButton.setEnabled(false);
        backButton.setEnabled(false); 
        nextButton.setEnabled(false);
        removeButton.setEnabled(false);
    }//GEN-LAST:event_scanButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        //Ensures Everything Is Entered
        if(inputsEntered()) {
            try { 
                double price = Double.parseDouble(priceTextField.getText());

                packages.add(
                    new Package(
                        packageID, date, nameTextField.getText(), addressTextField.getText(), 
                        cityTextField.getText(), countyComboBox.getSelectedItem().toString(), 
                        contactNoTextField.getText(), descriptionTextField.getText(), 
                        price, radioButtonYes.isSelected()
                    )
                );

                packageID++;
                
                currentPackageIndex = packages.size() - 1;              

                //Auto Set Buttons
                enableAndDisableButtons();

                //Disable Inputs
                inputsOn(false);

                //Save
                MyFileIO.writeToFile(packages);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(rootPane, rb.getString("priceError"));
            }
        }
    }//GEN-LAST:event_addButtonActionPerformed

    private void displayAllButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayAllButtonActionPerformed
        String output = "";
        
        for(Package pItem : packages) {
            output += 
                rb.getString("packageIDLabel") + " " + pItem.getPackageID() + "\n" +
                rb.getString("arrivedAtLabel") + " " + pItem.getArrivalTime() + "\n" +
                rb.getString("nameLabel") + " " + pItem.getName() + "\n" +
                rb.getString("addressLabel") + " " + pItem.getAddress() + "\n" +
                rb.getString("cityLabel") + " " + pItem.getCity() + "\n" +
                rb.getString("countyLabel") + " " + pItem.getCounty() +"\n" +
                rb.getString("contactNoLabel") + " " + pItem.getContactNumber() + "\n" +
                rb.getString("descriptionLabel") + " " + pItem.getDescription() + "\n" +
                rb.getString("priceLabel") + " " + pItem.getPrice() + "\n" +
                rb.getString("prepaidLabel") + " " + pItem.isPrePaid() + "\n\n";  
        }
        
        JOptionPane.showMessageDialog(rootPane, output);
    }//GEN-LAST:event_displayAllButtonActionPerformed

    private void displayPackagesComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_displayPackagesComboBoxActionPerformed
        DefaultListModel dlm = new DefaultListModel();

        for(Package pItem : packages) {
            if(pItem.getCounty().equalsIgnoreCase(displayPackagesComboBox.getSelectedItem().toString())) {
                dlm.addElement(pItem.getPackageID());
            }
        }
        
        IDByCountyList.setModel(dlm);
    }//GEN-LAST:event_displayPackagesComboBoxActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        //Buttons
        addButton.setEnabled(false);
        scanButton.setEnabled(false);
        editButton.setEnabled(false);
        updateButton.setEnabled(true);
        backButton.setEnabled(false);
        nextButton.setEnabled(false);
        displayAllButton.setEnabled(false);
        removeButton.setEnabled(false);
        
        inputsOn(true);
    }//GEN-LAST:event_editButtonActionPerformed

    private void updateButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateButtonActionPerformed
        //Ensures Everything Is Entered
        if(inputsEntered()) {
            try { 
                double price = Double.parseDouble(priceTextField.getText());      

                for(Package pItem : packages) {
                    if(pItem.getPackageID() == Integer.parseInt(packageIDTextField.getText())) {
                        pItem.updatePackage(
                            nameTextField.getText(), addressTextField.getText(), 
                            cityTextField.getText(), countyComboBox.getSelectedItem().toString(), 
                            contactNoTextField.getText(), descriptionTextField.getText(), 
                            price, radioButtonYes.isSelected()
                        );
                        
                        break;
                    }
                }

                //Inputs
                inputsOn(false);
                
                //Auto Set Buttons
                enableAndDisableButtons();

                //Save
                MyFileIO.writeToFile(packages);
            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(rootPane, rb.getString("priceError")); 
            }
        }
    }//GEN-LAST:event_updateButtonActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        int reply = JOptionPane.showConfirmDialog(rootPane, rb.getString("deleteQuestion"), "", JOptionPane.YES_NO_OPTION);
        
        if (reply == JOptionPane.YES_OPTION) {
            for(Package pItem : packages) {
                if(pItem.getPackageID() == Integer.parseInt(packageIDTextField.getText())) {
                    packages.remove(pItem);
                    break;
                }
            }

            clearInputs();
            currentPackageIndex = -1;
            //Auto Set Buttons
            enableAndDisableButtons();
            MyFileIO.writeToFile(packages);
        }
    }//GEN-LAST:event_removeButtonActionPerformed

    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        int packageToDisplay = currentPackageIndex + 1;
            
        arrivedAtTextField.setText(packages.get(packageToDisplay).getArrivalTime());
        packageIDTextField.setText("" + packages.get(packageToDisplay).getPackageID());
        nameTextField.setText(packages.get(packageToDisplay).getName());
        addressTextField.setText(packages.get(packageToDisplay).getAddress());
        cityTextField.setText(packages.get(packageToDisplay).getCity());
        contactNoTextField.setText(packages.get(packageToDisplay).getContactNumber());
        descriptionTextField.setText(packages.get(packageToDisplay).getDescription());
        priceTextField.setText("" + packages.get(packageToDisplay).getPrice());        
        countyComboBox.setSelectedItem(packages.get(packageToDisplay).getCounty());      

        if(packages.get(packageToDisplay).isPrePaid()) {
            radioButtonYes.setSelected(true);
        } else radioButtonNo.setSelected(true);

        currentPackageIndex++;

        //Auto Set Buttons
        enableAndDisableButtons();            
    }//GEN-LAST:event_nextButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        int packageToDisplay = currentPackageIndex - 1;

        arrivedAtTextField.setText(packages.get(packageToDisplay).getArrivalTime());
        packageIDTextField.setText("" + packages.get(packageToDisplay).getPackageID());
        nameTextField.setText(packages.get(packageToDisplay).getName());
        addressTextField.setText(packages.get(packageToDisplay).getAddress());
        cityTextField.setText(packages.get(packageToDisplay).getCity());
        contactNoTextField.setText(packages.get(packageToDisplay).getContactNumber());
        descriptionTextField.setText(packages.get(packageToDisplay).getDescription());
        priceTextField.setText("" + packages.get(packageToDisplay).getPrice());  
        countyComboBox.setSelectedItem(packages.get(packageToDisplay).getCounty());  

        if(packages.get(packageToDisplay).isPrePaid()) {
            radioButtonYes.setSelected(true);
        } else radioButtonNo.setSelected(true);            

        currentPackageIndex--;

        //Auto Set Buttons
        enableAndDisableButtons();
    }//GEN-LAST:event_backButtonActionPerformed

    private void enableAndDisableButtons() {
        //Next Button
        if(currentPackageIndex < packages.size() - 1) {
            nextButton.setEnabled(true);
        } else nextButton.setEnabled(false);
        
        //Back Button
        if(currentPackageIndex <= 0) {
            backButton.setEnabled(false);
        } else backButton.setEnabled(true);     
        
        //Edit Button
        if(currentPackageIndex >= 0) {
            editButton.setEnabled(true);
        } else editButton.setEnabled(false);
        
        //Remove Button
        if(currentPackageIndex >= 0) {
            removeButton.setEnabled(true);
        } else removeButton.setEnabled(false);
          
        //Display Button
        if(packages.size() > 0) {
            displayAllButton.setEnabled(true);
        } else displayAllButton.setEnabled(false);        
        
        //Edit and Remove
        if(packageIDTextField.getText().isEmpty()) {
            editButton.setEnabled(false);
            removeButton.setEnabled(false);
        } else {
            editButton.setEnabled(true);
            removeButton.setEnabled(true);
        } 
        
        scanButton.setEnabled(true);
        updateButton.setEnabled(false);
        addButton.setEnabled(false);
    }
    
    private void clearInputs() {
        arrivedAtTextField.setText("");
        packageIDTextField.setText("");
        nameTextField.setText("");
        addressTextField.setText("");
        cityTextField.setText("");
        countyComboBox.setSelectedIndex(0);
        contactNoTextField.setText("");
        descriptionTextField.setText("");
        priceTextField.setText("");
    }
   
    private void inputsOn(boolean answer) {
        nameTextField.setEditable(answer);
        addressTextField.setEditable(answer);
        cityTextField.setEditable(answer);
        contactNoTextField.setEditable(answer);
        descriptionTextField.setEditable(answer);
        priceTextField.setEditable(answer);
        radioButtonYes.setEnabled(answer);
        radioButtonNo.setEnabled(answer);
        countyComboBox.setEnabled(answer);
        
        nameTextField.setEnabled(answer);
        addressTextField.setEnabled(answer);
        cityTextField.setEnabled(answer);
        contactNoTextField.setEnabled(answer);
        descriptionTextField.setEnabled(answer);
        priceTextField.setEnabled(answer);
        radioButtonYes.setEnabled(answer);
        radioButtonNo.setEnabled(answer);
        countyComboBox.setEnabled(answer);        
    }
    
    //Input Validation
    public boolean inputsEntered() {
        if(nameTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Enter Name", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }
        
        if(addressTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Enter Address", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if(cityTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Enter City", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if(contactNoTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Enter Contact Number", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }

        if(descriptionTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Enter Description", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }        
        
        if(priceTextField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Enter Address", "Error", JOptionPane.ERROR_MESSAGE);
            return false;
        }              
        
        return true;
    }
    
    //Internationalisation
    public static void setMyLocale(Locale myLocale) {
        locale = myLocale;
    }
    
    private void updateLabels() {
        arrivedAtLabel.setText(rb.getString("arrivedAtLabel"));
        packageIDLabel.setText(rb.getString("packageIDLabel"));
        nameLabel.setText(rb.getString("nameLabel"));
        addressLabel.setText(rb.getString("addressLabel"));
        cityLabel.setText(rb.getString("cityLabel"));
        countyLabel.setText(rb.getString("countyLabel"));
        contactNoLabel.setText(rb.getString("contactNoLabel"));
        descriptionLabel.setText(rb.getString("descriptionLabel"));
        priceLabel.setText(rb.getString("priceLabel"));
        prepaidLabel.setText(rb.getString("prepaidLabel"));
        radioButtonYes.setText(rb.getString("radioButtonYes"));
        radioButtonNo.setText(rb.getString("radioButtonNo"));
        scanButton.setText(rb.getString("scanButton"));
        addButton.setText(rb.getString("addButton"));
        removeButton.setText(rb.getString("removeButton"));
        editButton.setText(rb.getString("editButton"));
        updateButton.setText(rb.getString("updateButton"));
        backButton.setText(rb.getString("backButton"));
        nextButton.setText(rb.getString("nextButton"));
        displayAllButton.setText(rb.getString("displayAllButton"));
        informationPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(rb.getString("packageInformation")));
        packagesByCountyPanel.setBorder(javax.swing.BorderFactory.createTitledBorder(rb.getString("packageByCountry")));
    }
    
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
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> IDByCountyList;
    private javax.swing.JButton addButton;
    private javax.swing.JLabel addressLabel;
    private javax.swing.JTextField addressTextField;
    private javax.swing.JLabel arrivedAtLabel;
    private javax.swing.JTextField arrivedAtTextField;
    private javax.swing.JButton backButton;
    private javax.swing.JPanel basePanel;
    private javax.swing.JLabel cityLabel;
    private javax.swing.JTextField cityTextField;
    private javax.swing.JLabel contactNoLabel;
    private javax.swing.JTextField contactNoTextField;
    private javax.swing.JComboBox<String> countyComboBox;
    private javax.swing.JLabel countyLabel;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JTextField descriptionTextField;
    private javax.swing.JButton displayAllButton;
    private javax.swing.JComboBox<String> displayPackagesComboBox;
    private javax.swing.JButton editButton;
    private javax.swing.JPanel informationPanel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JButton nextButton;
    private javax.swing.JLabel packageIDLabel;
    private javax.swing.JTextField packageIDTextField;
    private javax.swing.JPanel packagesByCountyPanel;
    private javax.swing.ButtonGroup prepaidButtonGroup;
    private javax.swing.JLabel prepaidLabel;
    private javax.swing.JLabel priceLabel;
    private javax.swing.JTextField priceTextField;
    private javax.swing.JRadioButton radioButtonNo;
    private javax.swing.JRadioButton radioButtonYes;
    private javax.swing.JButton removeButton;
    private javax.swing.JButton scanButton;
    private javax.swing.JButton updateButton;
    // End of variables declaration//GEN-END:variables
}
