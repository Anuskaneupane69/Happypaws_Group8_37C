package Controller;


import Dao.ProductDao;
import model.ProductModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import view.AdminDashboard;
import view.Dashboard;
import view.ProductFrame;    


//public class DashboardController{
//
//private void initListeners() {
////        updateButton.addActionListener((ActionEvent e) -> {
////            try {
////                double newWeight = Double.parseDouble(weigh8tField.getText());
////                currentWeight = newWeight;
////                // In real case, update to database here
////                lastUpdatedLabel.setText("Last Updated Weight : " + currentWeight + " kgs (Today)");
////                JOptionPane.showMessageDialog(null, "Weight updated successfully!");
////            } catch (NumberFormatException ex) {
////                JOptionPane.showMessageDialog(null, "Invalid weight. Please enter a number.");
////            }
////        });
////
////        certButton.addActionListener(e -> JOptionPane.showMessageDialog(null, "Open Certification Page"));
////        feedButton.addActionListener(e -> JOptionPane.showMessageDialog(null, "Open Feeding Tracker"));
////        galleryButton.addActionListener(e -> JOptionPane.showMessageDialog(null, "Open Gallery"));
////        appointmentButton.addActionListener(e -> JOptionPane.showMessageDialog(null, "Book Appointment Page"));
////    }
//}