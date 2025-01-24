/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author prospace
 */


import Business.Enterprise.HospitalList;
import Business.Admin.*;
import Business.Disease.*;


public class DiseaseCenter {
    private AdminList alist = new AdminList();
    private HospitalList hlist = new HospitalList();
    private DiseaseList dlist = new DiseaseList();
    public DiseaseCenter(){System.out.println("My DiseaseCenter Constructed");}  

//    public DiseaseCenter(){
//        System.out.println("DC generated");
//    }
//    
    public AdminList getAdminList(){
        return alist;
    }
    
    public HospitalList getHospitalList(){
        return hlist;
    }
    
    public DiseaseList getDiseaseList(){
        return dlist;
    }
    
}
