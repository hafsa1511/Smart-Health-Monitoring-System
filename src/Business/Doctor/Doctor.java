/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Doctor;

import Business.Recode.*;
/**
 *
 * @author prospace
 */
public class Doctor {
    private String first_name;
    private String last_name;
    private String passwords;
    private Long Id;
    private String Sex;
    private String Hospital;
    private RecodeList history = new RecodeList();
    
    public Doctor(String s1, String s2, String s3, Long s4, String s5, String s6){
        first_name = s1;
        last_name = s2;
        passwords = s3;
        Id = s4;
        Sex = s5;
        Hospital = s6;
    }
    
    public void setFirstName(String s){
        first_name = s;
    }
    
    public void setLastName(String s){
        last_name = s;
    }
    
    public void setPasswords(String s){
        passwords = s;
    }
    
    public void setID(Long s){
        Id = s;
    }
    
    public void setSex(String s){
        Sex = s;
    }
    
    public void setHospital(String s){
        Hospital = s;
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
    
    public Long getId(){
        return Id;
    }
    
    public String getSex(){
        return Sex;
    }
    
    public String getHospital(){
        return Hospital;
    }
    
    public RecodeList getRecordHistory(){
        return history;
    }
    
    @Override
    public String toString(){
        return first_name + " " + last_name;
    }
}

