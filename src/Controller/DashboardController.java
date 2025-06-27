/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import Dao.PetDAO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.JOptionPane;
import view.DashboardView;
import java.io.ByteArrayOutputStream;
import model.Pet;

public class DashboardController {
    private DashboardView view;
    private PetDAO petDAO = new PetDAO();
    private int currentPetId = 1; // Example pet ID; adjust as needed

    public DashboardController(DashboardView view) {
        this.view = view;
        this.view.addUpdateListener(new UpdateListener());
        this.view.addAddListener(new AddListener());
        loadInitialImages();
    }

    class UpdateListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setDialogTitle("Select Vaccination Record Image");
            FileNameExtensionFilter filter = new FileNameExtensionFilter("Image Files", "jpg", "jpeg", "png", "gif");
            fileChooser.setFileFilter(filter);

            int result = fileChooser.showOpenDialog(view);
            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                try {
                    BufferedImage originalImage = ImageIO.read(selectedFile);
                    int labelWidth = 200;
                    int labelHeight = 150;
                    ImageIcon imageIcon = new ImageIcon(originalImage.getScaledInstance(labelWidth, labelHeight, java.awt.Image.SCALE_SMOOTH));

                    // Update the label
                    view.getVaccinationImage().setIcon(imageIcon);
                    view.getVaccinationImage().setText("");

                    // Convert image to byte array and save to database
                    byte[] imageBytes = convertImageToByteArray(selectedFile);
                    Pet pet = petDAO.getPetById(currentPetId);
                    if (pet == null) {
                        pet = new Pet();
                        pet.setPetId(currentPetId);
                    }
                    pet.setImage(imageBytes);
                    pet.setLastWeightUpdate(java.time.LocalDateTime.now()); // Update timestamp
                    petDAO.updatePet(pet);

                    JOptionPane.showMessageDialog(view, "Vaccination record updated successfully!", "Success",
                            JOptionPane.ERROR_MESSAGE);
                } catch (IOException ex) {
                    JOptionPane.showMessageDialog(view, "Error reading image file: " + ex.getMessage(), "Error",
                            JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }

    class AddListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            JOptionPane.showMessageDialog(view, "Add functionality not implemented yet.", "Info",
                    JOptionPane.INFORMATION_MESSAGE);
            // Implement insurance record addition logic here
        }
    }

    private byte[] convertImageToByteArray(File file) throws IOException {
        BufferedImage originalImage = ImageIO.read(file);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ImageIO.write(originalImage, "jpg", baos);
        return baos.toByteArray();
    }

    private void loadInitialImages() {
        Pet pet = petDAO.getPetById(currentPetId);
        if (pet != null && pet.getImage() != null) {
            ImageIcon imageIcon = new ImageIcon(pet.getImage());
            view.getVaccinationImage().setIcon(imageIcon);
            view.getVaccinationImage().setText("");
        }
    }

    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                DashboardView view = new DashboardView();
                new DashboardController(view);
                view.setVisible(true);
            }
        });
    }
}
    
}
