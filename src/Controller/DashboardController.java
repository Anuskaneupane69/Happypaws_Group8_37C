package Controller;


import Dao.ProductDao;
import model.ProductModel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JPanel;
import view.AdminDashboard;
import view.Dashboard;
import view.ProductFrame;    



public class DashboardController{
    private Dashboard dash;
    public DashboardController(Dashboard dash){
        this.dash = dash;
    }
    public void open(){
        this.dash.setVisible(true);
    }
}
