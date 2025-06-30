package Controller;

import Dao.CertificationDao;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import model.CertificationModel;
import model.UserSession;
import view.NewCertification;

public class NewCertificationController {
    private String vaccinationImagePath;
    private String insuranceImagePath;
    private CertificationDao certi = new CertificationDao();
    private NewCertification userView;

    private CertificationModel model;
    private CertificationModel model2;
    
    
    


    public NewCertificationController(NewCertification userView) {
        this.vaccinationImagePath = userView.getVaccinationImagePath();
        this.insuranceImagePath = userView.getInsuranceImagePath();
        this.userView = userView;
        UserSession.setUserId(1);//Temprorary
        userView.addImageListener(new ImageListener());
        System.out.println("Here");
        this.model = new CertificationModel(vaccinationImagePath, UserSession.getUserId());
        this.model2 = new CertificationModel(UserSession.getUserId(), insuranceImagePath);
    }
    
    public void open(){
        this.userView.setVisible(true);
    }

    // Insert both vaccination and insurance certificate
    public void insertCertificationData() {
        if (vaccinationImagePath != null && !vaccinationImagePath.isEmpty()) {
            certi.insertVaccationImagePath(model);
        }

        if (insuranceImagePath != null && !insuranceImagePath.isEmpty()) {
            certi.insertInsuranceImagePath(model2);
        }
    }
    
    class ImageListener implements ActionListener{

        @Override
        public void actionPerformed(ActionEvent e) {
            String vaccinationImage = userView.getVaccinationImagePath();
            String insuranceImage = userView.getInsuranceImagePath();

            CertificationModel certi1 = new CertificationModel(vaccinationImage,UserSession.getUserId());
            
            CertificationModel certi2 = new CertificationModel(UserSession.getUserId(),insuranceImage);
            
            certi.insertInsuranceImagePath(certi2);
            
            certi.insertVaccationImagePath(certi1);
           
        }
        
    }
}
