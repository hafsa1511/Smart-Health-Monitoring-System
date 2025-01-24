/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Recode;

/**
 *
 * @author prospace
 */
public class Recode {
    private int ID;
    private String PID;
    private Long DID;
    private String Hospital;
    private String DisName;
    private String Date;
    
    public Recode(String x1,Long x2,String x3, String x4, String x5,int x6){
        ID = x6;
        PID = x1;
        DID = x2;
        Hospital = x3;
        DisName = x4;
        Date = x5;
    }
    
    public void setID(int x){
        ID = x;
    }
    
    public void setPID(String x){
        PID = x;
    }
    
    public void setDID(Long x){
        DID = x;
    }
    
    public void setHospitial(String x){
        Hospital = x;
    }
    
    public void setDisName(String x){
        DisName = x;
    }
    
    public void setDate(String x){
        Date = x;
    }
    
    public int getID(){
        return ID;
    }
    
    public String getPID(){
        return PID;
    }
    
    public Long getDID(){
        return DID;
    }
    
    public String getHospital(){
        return Hospital;
    }
    
    public String getDisName(){
        return DisName;
    }
    
    public String getDate(){
        return Date;
    }
    
    @Override
    public String toString(){
        return String.valueOf(ID);
    }
}
