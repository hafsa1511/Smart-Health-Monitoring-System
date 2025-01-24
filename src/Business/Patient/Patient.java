/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

/**
 *
 * @author prospace
 */
import Business.Recode.*;

public class Patient {
    private String first_name;
    private String last_name;
    private String passwords;
    private String Id;
    private String Sex;
    private String address;
    private String street;
    private String Email;
    private RecodeList history = new RecodeList();
    
    public void setFirstName(String s){
        first_name = s;
    }
    
    public void setLastName(String s){
        last_name = s;
    }
    
    public void setPasswords(String s){
        passwords = s;
    }
    
    public void setID(String s){
        Id = s;
    }
    
    public void setSex(String s){
        Sex = s;
    }
    
    public void setAddress(String s){
        address = s;
    }
    
    public void setStreet(String s){
        street = s;
    }
    
    public void setEmail(String s){
        Email = s;
    }
    
    public String getFirstName(){
        return first_name;
    }
    
    public String getLastName(){
        return last_name;
    }
    
    public String getPasswords(){
        return passwords;
    }
    
    public String getId(){
        return Id;
    }
    
    public String getSex(){
        return Sex;
    }
    
    public String getAddress(){
        return address;
    }
    
    public String getStreet(){
        return street;
    }
    
    public String getEmail(){
        return Email;
    }
    
    public RecodeList getRecordHistory(){
        return history;
    }
}

