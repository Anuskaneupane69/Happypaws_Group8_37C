/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;
import java.awt.event.*;
import javax.swing.*;

/**
 *
 * @author suyas
 */
public class PetProfileController {
    
    private final JTextField weightField;
    private final JLabel lastUpdatedLabel;
    private final JButton updateButton;
    private final JButton certButton;
    private final JButton feedButton;
    private final JButton galleryButton;
    private final JButton appointmentButton;

    private double currentWeight = 2.6; // Example default weight

    public PetProfileController(JTextField weightField, JLabel lastUpdatedLabel,
                                JButton updateButton, JButton certButton, JButton feedButton,
                                JButton galleryButton, JButton appointmentButton) {
        this.weightField = weightField;
        this.lastUpdatedLabel = lastUpdatedLabel;
        this.updateButton = updateButton;
        this.certButton = certButton;
        this.feedButton = feedButton;
        this.galleryButton = galleryButton;
        this.appointmentButton = appointmentButton;

        initListeners();
    }

    private void initListeners() {
        updateButton.addActionListener((ActionEvent e) -> {
            try {
                double newWeight = Double.parseDouble(weightField.getText());
                currentWeight = newWeight;
                // In real case, update to database here
                lastUpdatedLabel.setText("Last Updated Weight : " + currentWeight + " kgs (Today)");
                JOptionPane.showMessageDialog(null, "Weight updated successfully!");
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(null, "Invalid weight. Please enter a number.");
            }
        });

        certButton.addActionListener(e -> JOptionPane.showMessageDialog(null, "Open Certification Page"));
        feedButton.addActionListener(e -> JOptionPane.showMessageDialog(null, "Open Feeding Tracker"));
        galleryButton.addActionListener(e -> JOptionPane.showMessageDialog(null, "Open Gallery"));
        appointmentButton.addActionListener(e -> JOptionPane.showMessageDialog(null, "Book Appointment Page"));
    }
   

}

    

