/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Acer
 */
public class CertificationModel {
    
    private String img;
    private String img2;
    

public CertificationModel(String img,String img2){
this.img= img;
this.img2= img2;
}

public String getCertificationImg(){
return img;
}
public String getVaccinationImg(){
return img2;
}
public void setCertificationImg(String img) {
        this.img = img;
    }
public void setVaccinationImg(String img) {
        this.img2 = img2;
    }
}