/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Admin;

import java.util.*;

/**
 *
 * @author prospace
 */
public class AdminList {
    private ArrayList<Admin> admin_list = new ArrayList<>();
    public ArrayList<Admin> getList(){
        return admin_list;
    }
    
    public void add(Admin x){
        admin_list.add(x);
    }
    
    public void remove(Admin x){
        admin_list.remove(x);
    }
    
    public int getSize(){
        return admin_list.size();
    }
}
