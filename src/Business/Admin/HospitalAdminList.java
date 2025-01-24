/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Admin;

import java.util.ArrayList;

/**
 *
 * @author prospace
 */
public class HospitalAdminList {
    private ArrayList<HospitalAdmin> hospital_admin_list = new ArrayList<>();
    public ArrayList<HospitalAdmin> getList(){
        return hospital_admin_list;
    }
    
    public void add(HospitalAdmin x){
        hospital_admin_list.add(x);
    }
    
    public void remove(HospitalAdmin x){
        hospital_admin_list.remove(x);
    }
    
    public int getSize(){
        return hospital_admin_list.size();
    }
}
