/*
 * ScalePanel.java
 *
 * Created on February 19, 2006, 3:35 PM
 */

package ika.gui;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author  Bernhard Jenny, Institute of Cartography, ETH Zurich
 */
public class ScalePanel extends javax.swing.JPanel {
    
    private double scale = 1d;
    
    public boolean showScaleDialog(Frame frame) {
        // fill GUI with values
        this.scaleNumberField.setDoubleValue(this.scale);
                
        String title = "Scale Selected Features";
        Icon icon = ika.app.ApplicationInfo.getApplicationIcon();
        Object[] options = { "OK", "Cancel" };
        int resID = JOptionPane.showOptionDialog(frame,
                                   this,
                                   title,
                                   JOptionPane.YES_NO_OPTION,
                                   JOptionPane.PLAIN_MESSAGE,
                                   icon,
                                   options,
                                   options[0]);
        if (resID == JOptionPane.CANCEL_OPTION
                || resID == JOptionPane.CLOSED_OPTION
                || resID == 1)
            return false;
        
        // read settings from dialog
        this.scale = this.scaleNumberField.getDoubleValue();
        return true;
    }
    
    /** Creates new form MovePanel */
    public ScalePanel() {
        initComponents();
    }

    public double getScale() {
        return scale;
    }

    public void setScale(double scale) {
        this.scale = scale;
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        buttonGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        scaleNumberField = new ika.gui.NumberField();

        setLayout(new java.awt.GridBagLayout());

        setNextFocusableComponent(scaleNumberField);
        jLabel1.setText("Scale Factor:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        add(jLabel1, gridBagConstraints);

        scaleNumberField.setMin(0.0);
        scaleNumberField.setMinimumSize(new java.awt.Dimension(50, 22));
        scaleNumberField.setPattern("#,##0.######");
        scaleNumberField.setPreferredSize(new java.awt.Dimension(100, 22));
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.insets = new java.awt.Insets(0, 10, 0, 0);
        add(scaleNumberField, gridBagConstraints);

    }// </editor-fold>//GEN-END:initComponents
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup;
    private javax.swing.JLabel jLabel1;
    private ika.gui.NumberField scaleNumberField;
    // End of variables declaration//GEN-END:variables
    
}
