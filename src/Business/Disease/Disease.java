/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Disease;

/**
 *
 * @author prospace
 */
public class Disease {
    private String name;
    private String treatment;
    private int inorder;
    private int isreport;
    
    public Disease(String x1,String x2,int x3,int x4){
        name = x1;
        treatment = x2;
        inorder = x3;
        isreport = x4;
    }
    
    public void setName(String x){
        name = x;
    }
    
    public void setTreatment(String x){
        treatment = x;
    }
    
    public void setInorder(int x){
        inorder = x;
    }
    
    public void setIsreport(int x){
        isreport = x;
    }
    
    public String getName(){
        return name;
    }
    
    public String getTreatment(){
        return treatment;
    }
    
    public int getInorder(){
        return inorder;
    }
    
    public int getIsreport(){
        return isreport;
    }
    
    @Override
    public String toString(){
        return name;
    }
}
