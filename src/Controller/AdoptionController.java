package Controller;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import model.AdoptionModel;
import view.AdoptionModule;
import Dao.AdoptionDao;
import java.util.List;
import view.AdoptionPannel;

public class AdoptionController {
    private AdoptionModule view;
    private ArrayList<AdoptionModel> adoptionList = new ArrayList<>();
    private AdoptionDao adoptionDao = new AdoptionDao();

    public AdoptionController(AdoptionModule view) {
        System.out.println("Attaching adoption listener.");
        this.view = view;  
        loadAdoption();
    }
    private void loadAdoption() {
    System.out.println("Loading adoption listings...");

    List<AdoptionModel> adoptions = adoptionDao.getAllAdoptions();
    

    for (AdoptionModel adoption : adoptions) {
        AdoptionPannel card = new AdoptionPannel();
        card.setAdoptionPannel(adoption); // Populate the card with data
        view.getAdoptionpannelField().add(card);
    }

    view.getAdoptionpannelField().revalidate();
    view.getAdoptionpannelField().repaint();
}

    public void open() {
        this.view.setVisible(true);
    }


}
