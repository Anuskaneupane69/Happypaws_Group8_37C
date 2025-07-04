
package model;


public class CertificationModel {
    private String insuranceImagePath;
    private String vaccinationImagePath;
    private Integer userId;
    public CertificationModel(String imagePath, Integer userId){
        this.vaccinationImagePath = imagePath;
        this.userId = userId;
    }
    public CertificationModel( Integer userId, String insuranceImagePath){
        this.insuranceImagePath = insuranceImagePath;
        this.userId = userId;
    }
    
    
    public String getInsuranceImagePath(){
        return insuranceImagePath;
    }
    
    public String getVaccinationImagePath(){
        return vaccinationImagePath;
    }
    
    public Integer getUserId(){
        return userId;
    }
}
