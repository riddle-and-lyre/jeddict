/**
 * Copyright [2014] Gaurav Gupta
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package org.netbeans.jpa.modeler.properties.validation;

import javax.swing.DefaultComboBoxModel;
import org.netbeans.jpa.modeler.spec.JoinColumn;
import org.netbeans.modeler.properties.entity.custom.editor.combobox.client.entity.Entity;
import org.netbeans.modeler.properties.entity.custom.editor.combobox.client.entity.RowValue;
import org.netbeans.modeler.properties.entity.custom.editor.combobox.internal.EntityComponent;
import org.netbeans.modeler.widget.properties.customattr.Property;

public class BeanValidationPanel extends EntityComponent<JoinColumn> {

    @Override
    public void postConstruct() {
        initComponents();
        validation_ComboBox.removeAllItems();
        Property[] validationProperties = new Property[]{
            new Property("ASSERT_TRUE", "Assert True"),
            new Property("ASSERT_FALSE", "Assert False"),
            new Property("DECIMAL_MAX", "Decimal Max"),
            new Property("DECIMAL_MIN", "Decimal Min"),
            new Property("MAX", "Max"),
            new Property("MIN", "Min"),
            new Property("FUTURE", "Future"),
            new Property("PAST", "Past"),
            new Property("NOT_NULL", "NotNull"),
            new Property("NULL", "Null"),
            new Property("PATTERN", "Pattern"),
            new Property("SIZE", "Size"),
            new Property("DIGITS", "Digits")
        };
        validation_ComboBox.setModel(new DefaultComboBoxModel(validationProperties));
    }

    @Override
    public void init() {
    }

    @Override
    public void createEntity(Class<? extends Entity> entityWrapperType) {
        this.setTitle("Create new Validation");
        if (entityWrapperType == RowValue.class) {
            this.setEntity(new RowValue(new Object[4]));
        }
//        name_TextField.setText("");
//        referencedColumnName_TextField.setText("");
//        table_TextField.setText("");
//        columnDefinition_TextArea.setText("");
//        unique_CheckBox.setSelected(false);
//        nullable_CheckBox.setSelected(true);
//        insertable_CheckBox.setSelected(true);
//        updatable_CheckBox.setSelected(true);
    }

    @Override
    public void updateEntity(Entity<JoinColumn> entityValue) {
        this.setTitle("Update Validation");
        if (entityValue.getClass() == RowValue.class) {
            this.setEntity(entityValue);
            Object[] row = ((RowValue) entityValue).getRow();
            JoinColumn joinColumn = (JoinColumn) row[0];
//            name_TextField.setText(joinColumn.getName());
//            referencedColumnName_TextField.setText(joinColumn.getReferencedColumnName());
//            table_TextField.setText(joinColumn.getTable());
//            columnDefinition_TextArea.setText(joinColumn.getColumnDefinition());
//            unique_CheckBox.setSelected(joinColumn.isUnique());
//            nullable_CheckBox.setSelected(joinColumn.isNullable());
//            insertable_CheckBox.setSelected(joinColumn.isInsertable());
//            updatable_CheckBox.setSelected(joinColumn.isUpdatable());

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLayeredPane1 = new javax.swing.JLayeredPane();
        validation_LayeredPane = new javax.swing.JLayeredPane();
        validation_Label = new javax.swing.JLabel();
        validation_ComboBox = new javax.swing.JComboBox();
        max_LayeredPane = new javax.swing.JLayeredPane();
        max_Label = new javax.swing.JLabel();
        max_Spinner = new javax.swing.JSpinner();
        min_LayeredPane = new javax.swing.JLayeredPane();
        min_Label = new javax.swing.JLabel();
        min_Spinner = new javax.swing.JSpinner();
        integer_LayeredPane = new javax.swing.JLayeredPane();
        integer_Label = new javax.swing.JLabel();
        integer_Spinner = new javax.swing.JSpinner();
        fraction_LayeredPane = new javax.swing.JLayeredPane();
        fraction_Label = new javax.swing.JLabel();
        fraction_Spinner = new javax.swing.JSpinner();
        regex_LayeredPane = new javax.swing.JLayeredPane();
        regex_Label = new javax.swing.JLabel();
        regex_TextField = new javax.swing.JTextField();
        message_LayeredPane = new javax.swing.JLayeredPane();
        message_Label = new javax.swing.JLabel();
        message_ScrollPane = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        action_LayeredPane = new javax.swing.JLayeredPane();
        save_Button = new javax.swing.JButton();
        cancel_Button = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLayeredPane1.setPreferredSize(new java.awt.Dimension(340, 372));
        jLayeredPane1.setLayout(new java.awt.GridBagLayout());

        org.openide.awt.Mnemonics.setLocalizedText(validation_Label, org.openide.util.NbBundle.getMessage(BeanValidationPanel.class, "BeanValidationPanel.validation_Label.text")); // NOI18N

        validation_ComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                validation_ComboBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout validation_LayeredPaneLayout = new javax.swing.GroupLayout(validation_LayeredPane);
        validation_LayeredPane.setLayout(validation_LayeredPaneLayout);
        validation_LayeredPaneLayout.setHorizontalGroup(
            validation_LayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(validation_LayeredPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(validation_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(validation_ComboBox, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        validation_LayeredPaneLayout.setVerticalGroup(
            validation_LayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(validation_LayeredPaneLayout.createSequentialGroup()
                .addGroup(validation_LayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(validation_Label)
                    .addComponent(validation_ComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        validation_LayeredPane.setLayer(validation_Label, javax.swing.JLayeredPane.DEFAULT_LAYER);
        validation_LayeredPane.setLayer(validation_ComboBox, javax.swing.JLayeredPane.DEFAULT_LAYER);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 350;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(11, 10, 0, 10);
        jLayeredPane1.add(validation_LayeredPane, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(max_Label, org.openide.util.NbBundle.getMessage(BeanValidationPanel.class, "BeanValidationPanel.max_Label.text")); // NOI18N

        javax.swing.GroupLayout max_LayeredPaneLayout = new javax.swing.GroupLayout(max_LayeredPane);
        max_LayeredPane.setLayout(max_LayeredPaneLayout);
        max_LayeredPaneLayout.setHorizontalGroup(
            max_LayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(max_LayeredPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(max_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(max_Spinner)
                .addContainerGap())
        );
        max_LayeredPaneLayout.setVerticalGroup(
            max_LayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(max_LayeredPaneLayout.createSequentialGroup()
                .addGroup(max_LayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(max_Label)
                    .addComponent(max_Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        max_LayeredPane.setLayer(max_Label, javax.swing.JLayeredPane.DEFAULT_LAYER);
        max_LayeredPane.setLayer(max_Spinner, javax.swing.JLayeredPane.DEFAULT_LAYER);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.ipadx = 321;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(10, 10, 0, 10);
        jLayeredPane1.add(max_LayeredPane, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(min_Label, org.openide.util.NbBundle.getMessage(BeanValidationPanel.class, "BeanValidationPanel.min_Label.text")); // NOI18N

        javax.swing.GroupLayout min_LayeredPaneLayout = new javax.swing.GroupLayout(min_LayeredPane);
        min_LayeredPane.setLayout(min_LayeredPaneLayout);
        min_LayeredPaneLayout.setHorizontalGroup(
            min_LayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(min_LayeredPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(min_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(min_Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(201, Short.MAX_VALUE))
        );
        min_LayeredPaneLayout.setVerticalGroup(
            min_LayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(min_LayeredPaneLayout.createSequentialGroup()
                .addGroup(min_LayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(min_Label)
                    .addComponent(min_Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        min_LayeredPane.setLayer(min_Label, javax.swing.JLayeredPane.DEFAULT_LAYER);
        min_LayeredPane.setLayer(min_Spinner, javax.swing.JLayeredPane.DEFAULT_LAYER);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.ipadx = 321;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 0, 10);
        jLayeredPane1.add(min_LayeredPane, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(integer_Label, org.openide.util.NbBundle.getMessage(BeanValidationPanel.class, "BeanValidationPanel.integer_Label.text")); // NOI18N

        javax.swing.GroupLayout integer_LayeredPaneLayout = new javax.swing.GroupLayout(integer_LayeredPane);
        integer_LayeredPane.setLayout(integer_LayeredPaneLayout);
        integer_LayeredPaneLayout.setHorizontalGroup(
            integer_LayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(integer_LayeredPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(integer_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(integer_Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(201, Short.MAX_VALUE))
        );
        integer_LayeredPaneLayout.setVerticalGroup(
            integer_LayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(integer_LayeredPaneLayout.createSequentialGroup()
                .addGroup(integer_LayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(integer_Label)
                    .addComponent(integer_Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        integer_LayeredPane.setLayer(integer_Label, javax.swing.JLayeredPane.DEFAULT_LAYER);
        integer_LayeredPane.setLayer(integer_Spinner, javax.swing.JLayeredPane.DEFAULT_LAYER);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.ipadx = 321;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 0, 10);
        jLayeredPane1.add(integer_LayeredPane, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(fraction_Label, org.openide.util.NbBundle.getMessage(BeanValidationPanel.class, "BeanValidationPanel.fraction_Label.text")); // NOI18N

        javax.swing.GroupLayout fraction_LayeredPaneLayout = new javax.swing.GroupLayout(fraction_LayeredPane);
        fraction_LayeredPane.setLayout(fraction_LayeredPaneLayout);
        fraction_LayeredPaneLayout.setHorizontalGroup(
            fraction_LayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fraction_LayeredPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(fraction_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(fraction_Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(201, Short.MAX_VALUE))
        );
        fraction_LayeredPaneLayout.setVerticalGroup(
            fraction_LayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fraction_LayeredPaneLayout.createSequentialGroup()
                .addGroup(fraction_LayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fraction_Label)
                    .addComponent(fraction_Spinner, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        fraction_LayeredPane.setLayer(fraction_Label, javax.swing.JLayeredPane.DEFAULT_LAYER);
        fraction_LayeredPane.setLayer(fraction_Spinner, javax.swing.JLayeredPane.DEFAULT_LAYER);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.ipadx = 321;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 0, 10);
        jLayeredPane1.add(fraction_LayeredPane, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(regex_Label, org.openide.util.NbBundle.getMessage(BeanValidationPanel.class, "BeanValidationPanel.regex_Label.text")); // NOI18N

        regex_TextField.setText(org.openide.util.NbBundle.getMessage(BeanValidationPanel.class, "BeanValidationPanel.regex_TextField.text")); // NOI18N

        javax.swing.GroupLayout regex_LayeredPaneLayout = new javax.swing.GroupLayout(regex_LayeredPane);
        regex_LayeredPane.setLayout(regex_LayeredPaneLayout);
        regex_LayeredPaneLayout.setHorizontalGroup(
            regex_LayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(regex_LayeredPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(regex_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(regex_TextField)
                .addContainerGap())
        );
        regex_LayeredPaneLayout.setVerticalGroup(
            regex_LayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(regex_LayeredPaneLayout.createSequentialGroup()
                .addGroup(regex_LayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(regex_Label)
                    .addComponent(regex_TextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        regex_LayeredPane.setLayer(regex_Label, javax.swing.JLayeredPane.DEFAULT_LAYER);
        regex_LayeredPane.setLayer(regex_TextField, javax.swing.JLayeredPane.DEFAULT_LAYER);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 5;
        gridBagConstraints.ipadx = 344;
        gridBagConstraints.ipady = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 0, 10);
        jLayeredPane1.add(regex_LayeredPane, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(message_Label, org.openide.util.NbBundle.getMessage(BeanValidationPanel.class, "BeanValidationPanel.message_Label.text")); // NOI18N

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        message_ScrollPane.setViewportView(jTextArea1);

        javax.swing.GroupLayout message_LayeredPaneLayout = new javax.swing.GroupLayout(message_LayeredPane);
        message_LayeredPane.setLayout(message_LayeredPaneLayout);
        message_LayeredPaneLayout.setHorizontalGroup(
            message_LayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(message_LayeredPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(message_Label, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(message_ScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 220, Short.MAX_VALUE)
                .addContainerGap())
        );
        message_LayeredPaneLayout.setVerticalGroup(
            message_LayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(message_LayeredPaneLayout.createSequentialGroup()
                .addGroup(message_LayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(message_Label)
                    .addGroup(message_LayeredPaneLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(message_ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        message_LayeredPane.setLayer(message_Label, javax.swing.JLayeredPane.DEFAULT_LAYER);
        message_LayeredPane.setLayer(message_ScrollPane, javax.swing.JLayeredPane.DEFAULT_LAYER);

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 6;
        gridBagConstraints.ipadx = 327;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 10, 11, 10);
        jLayeredPane1.add(message_LayeredPane, gridBagConstraints);

        org.openide.awt.Mnemonics.setLocalizedText(save_Button, org.openide.util.NbBundle.getMessage(BeanValidationPanel.class, "BeanValidationPanel.save_Button.text")); // NOI18N
        save_Button.setToolTipText(org.openide.util.NbBundle.getMessage(BeanValidationPanel.class, "BeanValidationPanel.save_Button.toolTipText")); // NOI18N
        save_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_ButtonActionPerformed(evt);
            }
        });
        action_LayeredPane.add(save_Button);
        save_Button.setBounds(30, 0, 57, 23);

        org.openide.awt.Mnemonics.setLocalizedText(cancel_Button, org.openide.util.NbBundle.getMessage(BeanValidationPanel.class, "BeanValidationPanel.cancel_Button.text")); // NOI18N
        cancel_Button.setToolTipText(org.openide.util.NbBundle.getMessage(BeanValidationPanel.class, "BeanValidationPanel.cancel_Button.toolTipText")); // NOI18N
        cancel_Button.setPreferredSize(new java.awt.Dimension(60, 23));
        cancel_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_ButtonActionPerformed(evt);
            }
        });
        action_LayeredPane.add(cancel_Button);
        cancel_Button.setBounds(90, 0, 70, 23);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 450, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(action_LayeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(action_LayeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
  private boolean validateField() {
//        if (this.name_TextField.getText().trim().length() <= 0 /*|| Pattern.compile("[^\\w-]").matcher(this.id_TextField.getText().trim()).find()*/) {
//            JOptionPane.showMessageDialog(this, "Parameter column name can't be empty", "Invalid Value", javax.swing.JOptionPane.WARNING_MESSAGE);
//            return false;
//        }//I18n
//        if (this.referencedColumnName_TextField.getText().trim().length() <= 0 /*|| Pattern.compile("[^\\w-]").matcher(this.id_TextField.getText().trim()).find()*/) {
//            JOptionPane.showMessageDialog(this, "Parameter referenced column name can't be empty", "Invalid Value", javax.swing.JOptionPane.WARNING_MESSAGE);
//            return false;
//        }//I18n
        return true;
    }

    private void save_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_ButtonActionPerformed
        if (!validateField()) {
            return;
        }
        JoinColumn joinColumn = null;

        if (this.getEntity().getClass() == RowValue.class) {
            Object[] row = ((RowValue) this.getEntity()).getRow();
            if (row[0] == null) {
                joinColumn = new JoinColumn();
            } else {
                joinColumn = (JoinColumn) row[0];
            }
        }

//        joinColumn.setName(name_TextField.getText());
//        joinColumn.setReferencedColumnName(referencedColumnName_TextField.getText());
//        joinColumn.setTable(table_TextField.getText());
//        joinColumn.setColumnDefinition(columnDefinition_TextArea.getText());
//        joinColumn.setUnique(unique_CheckBox.isSelected());
//        joinColumn.setNullable(nullable_CheckBox.isSelected());
//        joinColumn.setInsertable(insertable_CheckBox.isSelected());
//        joinColumn.setUpdatable(updatable_CheckBox.isSelected());
        if (this.getEntity().getClass() == RowValue.class) {
            Object[] row = ((RowValue) this.getEntity()).getRow();
            row[0] = joinColumn;
            row[1] = joinColumn.getName();
            row[2] = joinColumn.getReferencedColumnName();
        }

        saveActionPerformed(evt);
    }//GEN-LAST:event_save_ButtonActionPerformed

    private void cancel_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_ButtonActionPerformed
        cancelActionPerformed(evt);
    }//GEN-LAST:event_cancel_ButtonActionPerformed

    private void validation_ComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_validation_ComboBoxActionPerformed
        String validationType = (String) ((Property) validation_ComboBox.getSelectedItem()).getKey();
        if (validationType.equals("ASSERT_TRUE") || validationType.equals("ASSERT_FALSE")
                || validationType.equals("NOT_NULL") || validationType.equals("NULL")
                || validationType.equals("PAST") || validationType.equals("FUTURE")) {
            max_LayeredPane.setVisible(false);
            min_LayeredPane.setVisible(false);
            integer_LayeredPane.setVisible(false);
            fraction_LayeredPane.setVisible(false);
            regex_LayeredPane.setVisible(false);
        } else if (validationType.equals("DECIMAL_MAX") || validationType.equals("MAX")) {
            max_LayeredPane.setVisible(true);
            min_LayeredPane.setVisible(false);
            integer_LayeredPane.setVisible(false);
            fraction_LayeredPane.setVisible(false);
            regex_LayeredPane.setVisible(false);
        } else if (validationType.equals("DECIMAL_MIN") || validationType.equals("MIN")) {
            max_LayeredPane.setVisible(false);
            min_LayeredPane.setVisible(true);
            integer_LayeredPane.setVisible(false);
            fraction_LayeredPane.setVisible(false);
            regex_LayeredPane.setVisible(false);
        } else if (validationType.equals("SIZE")) {
            max_LayeredPane.setVisible(true);
            min_LayeredPane.setVisible(true);
            integer_LayeredPane.setVisible(false);
            fraction_LayeredPane.setVisible(false);
            regex_LayeredPane.setVisible(false);
        } else if (validationType.equals("DIGITS")) {
            max_LayeredPane.setVisible(false);
            min_LayeredPane.setVisible(false);
            integer_LayeredPane.setVisible(true);
            fraction_LayeredPane.setVisible(true);
            regex_LayeredPane.setVisible(false);
        } else if (validationType.equals("PATTERN")) {
            max_LayeredPane.setVisible(false);
            min_LayeredPane.setVisible(false);
            integer_LayeredPane.setVisible(false);
            fraction_LayeredPane.setVisible(false);
            regex_LayeredPane.setVisible(true);
        }

    }//GEN-LAST:event_validation_ComboBoxActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane action_LayeredPane;
    private javax.swing.JButton cancel_Button;
    private javax.swing.JLabel fraction_Label;
    private javax.swing.JLayeredPane fraction_LayeredPane;
    private javax.swing.JSpinner fraction_Spinner;
    private javax.swing.JLabel integer_Label;
    private javax.swing.JLayeredPane integer_LayeredPane;
    private javax.swing.JSpinner integer_Spinner;
    private javax.swing.JLayeredPane jLayeredPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JLabel max_Label;
    private javax.swing.JLayeredPane max_LayeredPane;
    private javax.swing.JSpinner max_Spinner;
    private javax.swing.JLabel message_Label;
    private javax.swing.JLayeredPane message_LayeredPane;
    private javax.swing.JScrollPane message_ScrollPane;
    private javax.swing.JLabel min_Label;
    private javax.swing.JLayeredPane min_LayeredPane;
    private javax.swing.JSpinner min_Spinner;
    private javax.swing.JLabel regex_Label;
    private javax.swing.JLayeredPane regex_LayeredPane;
    private javax.swing.JTextField regex_TextField;
    private javax.swing.JButton save_Button;
    private javax.swing.JComboBox validation_ComboBox;
    private javax.swing.JLabel validation_Label;
    private javax.swing.JLayeredPane validation_LayeredPane;
    // End of variables declaration//GEN-END:variables
}
