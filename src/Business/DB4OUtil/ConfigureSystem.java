/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DB4OUtil;

import Business.Admin.Admin;
import Business.DiseaseCenter;
import Business.*;
import Business.Recode.*;
import Business.Admin.*;
import Business.DB4OUtil.*;
import Business.Disease.*;
import Business.Doctor.*;
import Business.Patient.*;
import Business.Enterprise.*;
import java.awt.CardLayout;
import userinterface.PatientPanel.*;
import userinterface.HospitalPanel.*;
import userinterface.DoctorPanel.*;
import userinterface.DiseaseControlPanel.*;

/**
 *
 * @author zhangjianwei
 */
public class ConfigureSystem {
    
    
    public static Datastore configure(){
        Datastore datastore = Datastore.getInstance();
        Admin init_admin = new Admin();
        init_admin.setUsername("pp");
        init_admin.setPasswords("123");

        
        Datastore.getInstance().getAdmins().put(init_admin.getUsername(), init_admin);
        
        init_data();
        System.out.println("Read datastore.configure susscess");

        return datastore;
    }
    static void init_data(){
        Patient tmp1 = new Patient();
        tmp1.setFirstName("Hao");
        tmp1.setLastName("Cui");
        tmp1.setID("123");
        tmp1.setSex("M");
        tmp1.setPasswords("123");
        tmp1.setAddress("11");
        tmp1.setEmail("22");
        tmp1.setStreet("33");
        Datastore.getInstance().getPatients().put(tmp1.getId(), tmp1);
        Doctor tmp2 = new Doctor("ChengCheng","Peng","123",1L,"F","CVS");
        Datastore.getInstance().getDoctors().put(1L, tmp2);
        
        Recode tmp3 = new Recode("123",1L,"CVS","Cold","2018-11-29",1);
        Datastore.getInstance().getRecords().put(1,tmp3);
        tmp2.getRecordHistory().add(tmp3);
        Hospital tmp4 = new Hospital();
        tmp4.getDoctorList().Add(tmp2);
        tmp4.getRecodeList().add(tmp3);
        tmp4.setName("CVS");
        tmp4.setLocation("Boston");
        Datastore.getInstance().getHospitals().put("CVS", tmp4);
        Disease tmp5 = new Disease("Cold","Hot Water",1,1);
        Datastore.getInstance().getDiseases().put("Cold", tmp5);
        
        Admin tmp6 =new Admin("321","321");
        Datastore.getInstance().getAdmins().put("321",tmp6);
        
        Disease tmp7 = new Disease("Fewer","Hot Water",0,1);
        Datastore.getInstance().getDiseases().put("Fewer", tmp7);
        
        Disease tmp8 = new Disease("hurt","band",0,0);
        Datastore.getInstance().getDiseases().put("hurt", tmp8);
        
        HospitalAdmin tmp9 = new HospitalAdmin("123", "123", "CVS", "Lab");
        HospitalAdmin tmp10 = new HospitalAdmin("123", "123", "CVS", "Manage");
        HospitalAdmin tmp11 = new HospitalAdmin("123", "123", "CVS", "Record");
        
        tmp4.getAdminList().add(tmp9);
        tmp4.getAdminList().add(tmp10);
        tmp4.getAdminList().add(tmp11);
        
        Recode tmp12 = new Recode("123",1L,"CVS","hurt","2018-11-30",2);
        Datastore.getInstance().getRecords().put(2,tmp12);
        tmp2.getRecordHistory().add(tmp12);
        tmp4.getRecodeList().add(tmp12);
        
        System.out.println("Data Initialized susscess");

    }
}
