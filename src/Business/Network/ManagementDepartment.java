/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Doctor.*;
/**
 *
 * @author prospace
 */
public class ManagementDepartment {
    private DoctorList DList = new DoctorList();
    public DoctorList getDList(){
        return DList;
    }
    
    public void add(Doctor x){
        DList.Add(x);
    }
    
    public void del(Doctor x){
        DList.Del(x);
    }
    
    public int getSize(){
        return DList.getSize();
    }
}
