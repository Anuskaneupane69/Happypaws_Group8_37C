package model;
public class AdoptionModel {
    private String Adoptname;      // For the adopter's name
    private String Adoptspecies;   // For the species of the animal being adopted
    private int Adoptage;          // For the age of the animal
    private String Adoptinfo;      // For additional information about the adoption
    private String Adoptno;        // For the contact number of the adopter
    private String adoptionImg;     // For the image path related to the adoption
    // Full constructor
    public AdoptionModel(String Adoptname, String Adoptspecies, int Adoptage, String Adoptinfo, String Adoptno, String adoptionImg) {
        this.Adoptname = Adoptname;
        this.Adoptspecies = Adoptspecies;
        this.Adoptage = Adoptage;
        this.Adoptinfo = Adoptinfo;
        this.Adoptno = Adoptno;
        this.adoptionImg = adoptionImg; // Initialize adoptionImg
    }
    // Getter and Setter for adoptionImg
    public String getAdoptionImg() {
        return adoptionImg;
    }
    public void setAdoptionImg(String adoptionImg) {
        this.adoptionImg = adoptionImg;
    }
    // Getters and Setters for other fields remain unchanged
    public String getAdoptname() {
        return Adoptname;
    }
    
    public void setAdoptname(String Adoptname) {
        this.Adoptname = Adoptname;
    }
    public String getAdoptspecies() {
        return Adoptspecies;
    }
    public void setAdoptspecies(String Adoptspecies) {
        this.Adoptspecies = Adoptspecies;
    }
    public int getAdoptage() {
        return Adoptage;
    }
    public void setAdoptage(int Adoptage) {
        this.Adoptage = Adoptage;
    }
    public String getAdoptinfo() {
        return Adoptinfo;
    }
    public void setAdoptinfo(String Adoptinfo) {
        this.Adoptinfo = Adoptinfo;
    }
    public String getAdoptno() {
        return Adoptno;
    }
    public void setAdoptno(String Adoptno) {
        this.Adoptno = Adoptno;
    }
}
