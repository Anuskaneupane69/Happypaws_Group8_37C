
package model;


public class user {
    private int id;
    private String username;
    private String email;
    private String password;
    
    public user(String username, String email, String password){
        this.username = username;
        this.email=email;
        this.password=password;       
    }
public int getId(){
    return id;
}
public void setId(int id){
    this.id=id;
}
public String getEmail(){
    return email;
}
public void setEmail(String email){
    this.email =email;
}

}


 