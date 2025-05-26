package Controller;

import Dao.UserDao;
import model.User;
import view.Signup;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class SignupController {
    private final UserDao userDao = new UserDao();
    private final Signup userView;

    public SignupController(Signup userView) {
        this.userView = userView;
    }

    public void open() {
        this.userView.setVisible(true);
    }

    public void close() {
        this.userView.dispose();
    }

    class AddUserListener implements ActionListener {


        private AddUserListener() {
            throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        }
        public void actionPerformed(ActionEvent e) {
            try {
                String name = userView.getUsernameField().getText();
                String email = userView.getEmailField().getText();
                String password = new String(userView.getPasswordField().getPassword());
                
                User user = new User(name, email, password);
                
                boolean check = userDao.CheckUser(user);
                if (check) {
                    JOptionPane.showMessageDialog(userView, "Duplicate user");
                } else {
                    userDao.signup(user);
                    JOptionPane.showMessageDialog(userView, "User registered successfully");
                }
            } catch (Exception ex) {
                System.out.println("Error adding user: " + ex.getMessage());
                ex.printStackTrace();
            }
        }
    }
}
