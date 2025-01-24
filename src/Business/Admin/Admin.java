/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Admin;

/**
 *
 * @author prospace
 */
public class Admin {
    private String username;
    private String passwords;
    
    public Admin(){
    }
    
    public Admin(String s1,String s2){
        username = s1;
        passwords = s2;
    }
    
    public void setUsername(String x){
        username = x;
    }
    
    public void setPasswords(String x){
        passwords = x;
    }
    
    public String getUsername(){
        return username;
    }
    
    public String getPasswords(){
        return passwords;
    }
}
