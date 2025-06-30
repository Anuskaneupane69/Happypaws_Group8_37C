package model;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author suyas
 */
public class InsuranceDetail {

    private int id;
    private String patientName;
    private String policyNumber;
    private String provider;

    public InsuranceDetail(int id, String patientName, String policyNumber, String provider) {
        this.id = id;
        this.patientName = patientName;
        this.policyNumber = policyNumber;
        this.provider = provider;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getPatientName() { return patientName; }
    public void setPatientName(String patientName) { this.patientName = patientName; }
    public String getPolicyNumber() { return policyNumber; }
    public void setPolicyNumber(String policyNumber) { this.policyNumber = policyNumber; }
    public String getProvider() { return provider; }
    public void setProvider(String provider) { this.provider = provider; }
}
   
