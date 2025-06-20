package model;

public class LoginRequest{
 private String email;
 private String password;
 private int id;
  
 public LoginRequest(String email,String password){
    this.email =email;
    this.password =password;    
 } 


 
 public String getemail(){
     return email;
 }
 public void setemail(String email){
     this.email= email;
 }
public String getpassword(){
    return password;
}
public void setpassword(String password){
    this.password = password;
}



}
