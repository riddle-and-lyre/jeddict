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
package org.netbeans.jpa.modeler.properties.named.storedprocedurequery;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import org.netbeans.jpa.modeler.spec.ParameterMode;
import org.netbeans.jpa.modeler.spec.StoredProcedureParameter;
import org.netbeans.modeler.core.ModelerFile;
import org.netbeans.modeler.core.NBModelerUtil;
import org.netbeans.modeler.properties.entity.custom.editor.combobox.client.entity.ComboBoxValue;
import org.netbeans.modeler.properties.entity.custom.editor.combobox.client.entity.Entity;
import org.netbeans.modeler.properties.entity.custom.editor.combobox.client.entity.RowValue;
import org.netbeans.modeler.properties.entity.custom.editor.combobox.internal.EntityComponent;

public class StoredProcedureParameterPanel extends EntityComponent<StoredProcedureParameter> {

    private final ModelerFile modelerFile;

    public StoredProcedureParameterPanel(ModelerFile modelerFile) {

        this.modelerFile = modelerFile;
    }

    @Override
    public void postConstruct() {
        initComponents();
    }

    @Override
    public void init() {
        mode_jComboBox.removeAllItems();
        mode_jComboBox.addItem(new ComboBoxValue(null, ""));
        mode_jComboBox.addItem(new ComboBoxValue(ParameterMode.IN, "In"));
        mode_jComboBox.addItem(new ComboBoxValue(ParameterMode.INOUT, "In Out"));
        mode_jComboBox.addItem(new ComboBoxValue(ParameterMode.OUT, "Out"));
        mode_jComboBox.addItem(new ComboBoxValue(ParameterMode.REF_CURSOR, "Reference Cursor"));
    }

    @Override
    public void createEntity(Class<? extends Entity> entityWrapperType) {
        this.setTitle("Create new StoredProcedure Parameter");
        if (entityWrapperType == RowValue.class) {
            this.setEntity(new RowValue(new Object[4]));
        }
        name_TextField.setText("");
        type_jComboBox.setSelectedItem("");
        mode_jComboBox.setSelectedIndex(0);
    }

    @Override
    public void updateEntity(Entity<StoredProcedureParameter> entityValue) {
        this.setTitle("Update StoredProcedure Parameter");
        if (entityValue.getClass() == RowValue.class) {
            this.setEntity(entityValue);
            Object[] row = ((RowValue) entityValue).getRow();
            StoredProcedureParameter storedProcedureParameter = (StoredProcedureParameter) row[0];
            name_TextField.setText(storedProcedureParameter.getName());

            if (((DefaultComboBoxModel) type_jComboBox.getModel()).getIndexOf(storedProcedureParameter.getClazz()) == -1) {
                ((DefaultComboBoxModel) type_jComboBox.getModel()).addElement(storedProcedureParameter.getClazz());
            }
            type_jComboBox.setSelectedItem(storedProcedureParameter.getClazz());

            setParameterMode(storedProcedureParameter.getMode());
        }
    }

    private void setParameterMode(ParameterMode parameterMode) {
        if (parameterMode == null) {
            mode_jComboBox.setSelectedIndex(0);
        } else {
            for (int i = 0; i < mode_jComboBox.getItemCount(); i++) {
                if (((ComboBoxValue<ParameterMode>) mode_jComboBox.getItemAt(i)).getValue() == parameterMode) {
                    mode_jComboBox.setSelectedIndex(i);
                }
            }
        }
    }

    private ParameterMode getParameterMode() {
        return ((ComboBoxValue<ParameterMode>) mode_jComboBox.getSelectedItem()).getValue();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        root_jLayeredPane = new javax.swing.JLayeredPane();
        name_LayeredPane = new javax.swing.JLayeredPane();
        name_Label = new javax.swing.JLabel();
        name_TextField = new javax.swing.JTextField();
        mode_LayeredPane = new javax.swing.JLayeredPane();
        mode_Label = new javax.swing.JLabel();
        mode_jComboBox = new javax.swing.JComboBox();
        action_jLayeredPane = new javax.swing.JLayeredPane();
        save_Button = new javax.swing.JButton();
        cancel_Button = new javax.swing.JButton();
        type_LayeredPane1 = new javax.swing.JLayeredPane();
        type_Label = new javax.swing.JLabel();
        type_SearchAction = new javax.swing.JButton();
        type_jComboBox = new javax.swing.JComboBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new java.awt.GridLayout());

        name_LayeredPane.setToolTipText(org.openide.util.NbBundle.getMessage(StoredProcedureParameterPanel.class, "StoredProcedureParameterPanel.name_LayeredPane.toolTipText")); // NOI18N
        name_LayeredPane.setLayout(new java.awt.BorderLayout());

        org.openide.awt.Mnemonics.setLocalizedText(name_Label, org.openide.util.NbBundle.getMessage(StoredProcedureParameterPanel.class, "StoredProcedureParameterPanel.name_Label.text")); // NOI18N
        name_LayeredPane.add(name_Label, java.awt.BorderLayout.WEST);

        name_TextField.setText(org.openide.util.NbBundle.getMessage(StoredProcedureParameterPanel.class, "StoredProcedureParameterPanel.name_TextField.text")); // NOI18N
        name_TextField.setToolTipText(org.openide.util.NbBundle.getMessage(StoredProcedureParameterPanel.class, "StoredProcedureParameterPanel.name_TextField.toolTipText")); // NOI18N
        name_LayeredPane.add(name_TextField, java.awt.BorderLayout.CENTER);

        mode_LayeredPane.setToolTipText(org.openide.util.NbBundle.getMessage(StoredProcedureParameterPanel.class, "StoredProcedureParameterPanel.mode_LayeredPane.toolTipText")); // NOI18N
        mode_LayeredPane.setLayout(new java.awt.BorderLayout());

        org.openide.awt.Mnemonics.setLocalizedText(mode_Label, org.openide.util.NbBundle.getMessage(StoredProcedureParameterPanel.class, "StoredProcedureParameterPanel.mode_Label.text")); // NOI18N
        mode_LayeredPane.add(mode_Label, java.awt.BorderLayout.WEST);

        mode_jComboBox.setToolTipText(org.openide.util.NbBundle.getMessage(StoredProcedureParameterPanel.class, "StoredProcedureParameterPanel.mode_jComboBox.toolTipText")); // NOI18N
        mode_LayeredPane.add(mode_jComboBox, java.awt.BorderLayout.CENTER);

        org.openide.awt.Mnemonics.setLocalizedText(save_Button, org.openide.util.NbBundle.getMessage(StoredProcedureParameterPanel.class, "StoredProcedureParameterPanel.save_Button.text")); // NOI18N
        save_Button.setToolTipText(org.openide.util.NbBundle.getMessage(StoredProcedureParameterPanel.class, "StoredProcedureParameterPanel.save_Button.toolTipText")); // NOI18N
        save_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                save_ButtonActionPerformed(evt);
            }
        });
        action_jLayeredPane.add(save_Button);
        save_Button.setBounds(0, 0, 70, 30);

        org.openide.awt.Mnemonics.setLocalizedText(cancel_Button, org.openide.util.NbBundle.getMessage(StoredProcedureParameterPanel.class, "StoredProcedureParameterPanel.cancel_Button.text")); // NOI18N
        cancel_Button.setToolTipText(org.openide.util.NbBundle.getMessage(StoredProcedureParameterPanel.class, "StoredProcedureParameterPanel.cancel_Button.toolTipText")); // NOI18N
        cancel_Button.setPreferredSize(new java.awt.Dimension(60, 23));
        cancel_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_ButtonActionPerformed(evt);
            }
        });
        action_jLayeredPane.add(cancel_Button);
        cancel_Button.setBounds(80, 0, 70, 30);

        type_LayeredPane1.setToolTipText(org.openide.util.NbBundle.getMessage(StoredProcedureParameterPanel.class, "StoredProcedureParameterPanel.type_LayeredPane1.toolTipText")); // NOI18N
        type_LayeredPane1.setLayout(new java.awt.BorderLayout());

        org.openide.awt.Mnemonics.setLocalizedText(type_Label, org.openide.util.NbBundle.getMessage(StoredProcedureParameterPanel.class, "StoredProcedureParameterPanel.type_Label.text")); // NOI18N
        type_LayeredPane1.add(type_Label, java.awt.BorderLayout.WEST);

        type_SearchAction.setBackground(new java.awt.Color(255, 255, 255));
        type_SearchAction.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/netbeans/jpa/modeler/properties/resource/searchbutton.png"))); // NOI18N
        type_SearchAction.setToolTipText(org.openide.util.NbBundle.getMessage(StoredProcedureParameterPanel.class, "StoredProcedureParameterPanel.type_SearchAction.toolTipText")); // NOI18N
        type_SearchAction.setAlignmentY(0.0F);
        type_SearchAction.setBorderPainted(false);
        type_SearchAction.setMargin(null);
        type_SearchAction.setPreferredSize(new java.awt.Dimension(33, 22));
        type_SearchAction.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                type_SearchActionActionPerformed(evt);
            }
        });
        type_LayeredPane1.add(type_SearchAction, java.awt.BorderLayout.EAST);

        type_jComboBox.setEditable(true);
        type_LayeredPane1.add(type_jComboBox, java.awt.BorderLayout.CENTER);

        javax.swing.GroupLayout root_jLayeredPaneLayout = new javax.swing.GroupLayout(root_jLayeredPane);
        root_jLayeredPane.setLayout(root_jLayeredPaneLayout);
        root_jLayeredPaneLayout.setHorizontalGroup(
            root_jLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(root_jLayeredPaneLayout.createSequentialGroup()
                .addGap(0, 365, Short.MAX_VALUE)
                .addComponent(action_jLayeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, root_jLayeredPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(root_jLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(type_LayeredPane1)
                    .addComponent(name_LayeredPane, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mode_LayeredPane, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        root_jLayeredPaneLayout.setVerticalGroup(
            root_jLayeredPaneLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(root_jLayeredPaneLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(name_LayeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(type_LayeredPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15)
                .addComponent(mode_LayeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(action_jLayeredPane, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        root_jLayeredPane.setLayer(name_LayeredPane, javax.swing.JLayeredPane.DEFAULT_LAYER);
        root_jLayeredPane.setLayer(mode_LayeredPane, javax.swing.JLayeredPane.DEFAULT_LAYER);
        root_jLayeredPane.setLayer(action_jLayeredPane, javax.swing.JLayeredPane.DEFAULT_LAYER);
        root_jLayeredPane.setLayer(type_LayeredPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        getContentPane().add(root_jLayeredPane);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private boolean validateField() {
        if (this.type_jComboBox.getSelectedItem().toString().trim().length() <= 0 /*|| Pattern.compile("[^\\w-]").matcher(this.id_TextField.getText().trim()).find()*/) {
            JOptionPane.showMessageDialog(this, "Type can't be empty", "Invalid Value", javax.swing.JOptionPane.WARNING_MESSAGE);
            return false;
        }//I18n

        return true;
    }

    private void save_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_save_ButtonActionPerformed
        if (!validateField()) {
            return;
        }
        StoredProcedureParameter storedProcedureParameter = null;
        if (this.getEntity().getClass() == RowValue.class) {
            Object[] row = ((RowValue) this.getEntity()).getRow();
            if (row[0] == null) {
                storedProcedureParameter = new StoredProcedureParameter();
            } else {
                storedProcedureParameter = (StoredProcedureParameter) row[0];
            }
        }
        storedProcedureParameter.setName(name_TextField.getText());
        storedProcedureParameter.setClazz(type_jComboBox.getSelectedItem().toString());
        storedProcedureParameter.setMode(getParameterMode());

        if (this.getEntity().getClass() == RowValue.class) {
            Object[] row = ((RowValue) this.getEntity()).getRow();
            row[0] = storedProcedureParameter;
            row[1] = storedProcedureParameter.getName();
            row[2] = storedProcedureParameter.getClazz();
            row[3] = storedProcedureParameter.getMode();
        }
        saveActionPerformed(evt);
    }//GEN-LAST:event_save_ButtonActionPerformed

    private void cancel_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_ButtonActionPerformed
        cancelActionPerformed(evt);
    }//GEN-LAST:event_cancel_ButtonActionPerformed

    private void type_SearchActionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_type_SearchActionActionPerformed
        String dataType = NBModelerUtil.browseClass(modelerFile);
        if (((DefaultComboBoxModel) type_jComboBox.getModel()).getIndexOf(dataType) == -1) {
            ((DefaultComboBoxModel) type_jComboBox.getModel()).addElement(dataType);
        }
        type_jComboBox.setSelectedItem(dataType);
    }//GEN-LAST:event_type_SearchActionActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane action_jLayeredPane;
    private javax.swing.JButton cancel_Button;
    private javax.swing.JLabel mode_Label;
    private javax.swing.JLayeredPane mode_LayeredPane;
    private javax.swing.JComboBox mode_jComboBox;
    private javax.swing.JLabel name_Label;
    private javax.swing.JLayeredPane name_LayeredPane;
    private javax.swing.JTextField name_TextField;
    private javax.swing.JLayeredPane root_jLayeredPane;
    private javax.swing.JButton save_Button;
    private javax.swing.JLabel type_Label;
    private javax.swing.JLayeredPane type_LayeredPane1;
    private javax.swing.JButton type_SearchAction;
    private javax.swing.JComboBox type_jComboBox;
    // End of variables declaration//GEN-END:variables
}
