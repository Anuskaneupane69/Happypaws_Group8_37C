package Controller;

import Dao.UserDao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.User;
import view.Signup;
import view.Login;

public class SignupController {
    private Signup userView;
    private final UserDao userDao = new UserDao();

    public SignupController(Signup signupView) {
        this.userView = signupView;

        // THIS IS MISSING OR NEEDS TO BE ADDED
        this.userView.addAddUserListener(new AddUserListener());
        userView.addLoginListener(new LoginListener());
        
    }

    public void open() {
        userView.setVisible(true);
    }
     public void close() {
        this.userView.dispose();
    }


    class AddUserListener implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            System.out.println("Signup button clicked"); // Debug log

            String username = userView.getUsernameField().getText();
            String email = userView.getEmailField().getText();
            String password = new String(userView.getPasswordField().getPassword());

            User user = new User(username, email, password);
            UserDao dao = new UserDao();
            boolean result = dao.signup(user);


            if (result) {
                System.out.println("User registered successfully");
            } else {
                System.out.println("Failed to register user");
            }
        }
    }
    class LoginListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            Login loginView = new Login();
            LoginController login = new LoginController(loginView);
            close();
            login.open();
        }
    }
    
    
    
}
