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
public class HospitalAdmin {
    private String username;
    private String passwords;
    private String hospital;
    private String department;
    public HospitalAdmin(){
    }
    public HospitalAdmin(String s1, String s2, String s3, String s4){
        username = s1;
        passwords = s2;
        hospital = s3;
        department = s4;
    }
    
    public void setUsername(String x){
        username = x;
    }
    
    public void setPasswords(String x){
        passwords = x;
    }
    
    public void setHospital(String x){
        hospital = x;
    }
    
    public void setDepartment(String x){
        department = x;
    }
    
    public String getUsername(){
        return username;
    }
    
    public String getPasswords(){
        return passwords;
    }
    
    public String getHospital(){
        return hospital;
    }
    
    public String getDepartment(){
        return department;
    }
}
