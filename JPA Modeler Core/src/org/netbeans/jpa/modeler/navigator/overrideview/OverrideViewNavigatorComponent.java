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
package org.netbeans.jpa.modeler.navigator.overrideview;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import javax.swing.SwingUtilities;
import org.netbeans.api.settings.ConvertAsProperties;
import org.netbeans.jpa.modeler.core.widget.EntityWidget;
import org.netbeans.modeler.node.ModelerNavigationNode;
import org.netbeans.modeler.properties.view.manager.BasePropertyViewManager;
import org.netbeans.modeler.properties.view.manager.PropertyNode;
import org.openide.awt.ActionID;
import org.openide.awt.ActionReference;
import org.openide.explorer.ExplorerManager;
import org.openide.explorer.ExplorerUtils;
import org.openide.explorer.view.BeanTreeView;
import org.openide.nodes.Node;
import org.openide.util.NbBundle.Messages;
import org.openide.windows.TopComponent;
import org.openide.windows.WindowManager;

@ConvertAsProperties(
        dtd = "-//org.netbeans.jpa.modeler.navigator.dbview//OverrideViewNavigatorComponent//EN",
        autostore = false
)
@TopComponent.Description(
        preferredID = "OverrideViewNavigatorComponent",
        iconBase = "org/netbeans/jpa/modeler/specification/model/file/JPA_FILE_ICON.png",
        persistenceType = TopComponent.PERSISTENCE_ALWAYS
)
@TopComponent.Registration(mode = "navigator", openAtStartup = false)
@ActionID(category = "Window", id = "org.netbeans.jpa.modeler.navigator.dbview.OverrideViewNavigatorComponent")
@ActionReference(path = "Menu/Window/JPA Modeler", position = 3333)
@TopComponent.OpenActionRegistration(
        displayName = "#CTL_OverrideViewNavigatorComponentAction",
        preferredID = "OverrideViewNavigatorComponent"
)
@Messages({
    "CTL_OverrideViewNavigatorComponentAction=JPA Override View (Attribute/Association)",
    "CTL_OverrideViewNavigatorComponent=JPA Override View",
    "HINT_OverrideViewNavigatorComponent=JPA Override View"
})
public final class OverrideViewNavigatorComponent extends TopComponent implements ExplorerManager.Provider, PropertyChangeListener {

    private transient ExplorerManager explorerManager = new ExplorerManager();
    private boolean opened;

    public OverrideViewNavigatorComponent() {
        initComponents();
        setName(Bundle.CTL_OverrideViewNavigatorComponent());
        setToolTipText(Bundle.HINT_OverrideViewNavigatorComponent());
        associateLookup(ExplorerUtils.createLookup(explorerManager, getActionMap()));
        hideOverrideView();
    }

    private static OverrideViewNavigatorComponent instance;

    public static OverrideViewNavigatorComponent getInstance() {
        if (instance == null) {
            instance = (OverrideViewNavigatorComponent) WindowManager.getDefault().findTopComponent("OverrideViewNavigatorComponent");
        }
        return instance;
    }

    private EntityWidget entityWidget;

    public void showOverrideView() {
        if (!((BeanTreeView) navigatorPane).isVisible()) {
            ((BeanTreeView) navigatorPane).setVisible(true);
        }
        overrideViewTypeComboBox.setEnabled(true);
        SwingUtilities.invokeLater(this::overrideViewTypeComboBoxActionPerformed);

    }

    public void hideOverrideView() {
        this.entityWidget = null;
        ((BeanTreeView) navigatorPane).setVisible(false);
        overrideViewTypeComboBox.setEnabled(false);
    }

    @Override
    public ExplorerManager getExplorerManager() {
        return explorerManager;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        rootLayeredPane = new javax.swing.JLayeredPane();
        overrideViewTypeComboBox = new javax.swing.JComboBox();
        navigatorPane = new BeanTreeView();

        setLayout(new java.awt.BorderLayout());

        rootLayeredPane.setLayout(new java.awt.BorderLayout());

        overrideViewTypeComboBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Attribute & Association Override", "Attribute Override", "Association Override" }));
        overrideViewTypeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                overrideViewTypeComboBoxActionPerformed(evt);
            }
        });
        rootLayeredPane.add(overrideViewTypeComboBox, java.awt.BorderLayout.NORTH);
        rootLayeredPane.add(navigatorPane, java.awt.BorderLayout.CENTER);

        add(rootLayeredPane, java.awt.BorderLayout.CENTER);
    }// </editor-fold>//GEN-END:initComponents

    private void overrideViewTypeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_overrideViewTypeComboBoxActionPerformed
        overrideViewTypeComboBoxActionPerformed();
    }//GEN-LAST:event_overrideViewTypeComboBoxActionPerformed

    private void overrideViewTypeComboBoxActionPerformed() {
        if (entityWidget != null) {
            if (overrideViewTypeComboBox.getSelectedItem().equals("Attribute Override")) {
                explorerManager.setRootContext(new OverrideRootNode(entityWidget, new OverrideAttributeChildFactory(entityWidget)));
            } else if (overrideViewTypeComboBox.getSelectedItem().equals("Association Override")) {
                explorerManager.setRootContext(new OverrideRootNode(entityWidget, new OverrideAssociationChildFactory(entityWidget)));
            } else {
                explorerManager.setRootContext(new OverrideRootNode(entityWidget, new OverrideAllChildFactory(entityWidget)));
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane navigatorPane;
    private javax.swing.JComboBox overrideViewTypeComboBox;
    private javax.swing.JLayeredPane rootLayeredPane;
    // End of variables declaration//GEN-END:variables
    @Override
    public void componentOpened() {
        TopComponent.getRegistry().addPropertyChangeListener(this);
        opened = true;
    }

    @Override
    public void componentClosed() {
        TopComponent.getRegistry().removePropertyChangeListener(this);
        opened = false;
    }

    @Override
    public void propertyChange(PropertyChangeEvent evt) {
//        System.out.println(evt.getPropertyName());
        if (opened && "currentNodes".equals(evt.getPropertyName())) {
            Node[] nodes = TopComponent.getRegistry().getCurrentNodes();
            if (nodes != null && nodes.length == 1) {
                if (nodes[0] instanceof ModelerNavigationNode || nodes[0] instanceof PropertyNode) {
                    //skip AbstractNode Selection in OverrideView Window
                } else if (nodes[0] instanceof BasePropertyViewManager && ((BasePropertyViewManager) nodes[0]).getBaseElementWidget() instanceof EntityWidget) {

                    EntityWidget entityWidget_Tmp = (EntityWidget) ((BasePropertyViewManager) nodes[0]).getBaseElementWidget();
                    if (this.entityWidget != entityWidget_Tmp) {
                        this.entityWidget = entityWidget_Tmp;
                        showOverrideView();
                    }

                } else {
                    //modeelrscene , mappedSuperclass , embeddable click
                    hideOverrideView();
                }
            } else if (nodes != null && nodes.length == 0) {
                //skip overrideViewTypeComboBox selected
            } else if (nodes == null) {
                //skip properties textfield click
            } else {
                hideOverrideView();
            }
        } else if ("tcClosed".equals(evt.getPropertyName())) {
            hideOverrideView();
        } else if ("tcOpened".equals(evt.getPropertyName()) && this.entityWidget == null) {
            hideOverrideView();
        }

    }

    void writeProperties(java.util.Properties p) {
        // better to version settings since initial version as advocated at
        // http://wiki.apidesign.org/wiki/PropertyFiles
        p.setProperty("version", "1.0");
        // TODO store your settings
    }

    void readProperties(java.util.Properties p) {
        String version = p.getProperty("version");
        // TODO read your settings according to their version
    }

}
