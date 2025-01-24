/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;
import Business.Network.*;
import Business.Doctor.*;
import Business.Recode.*;
import Business.Admin.*;
/**
 *
 * @author prospace
 */
public class Hospital {
    private String name;
    private String location;
    private LabDepartment LDpart = new LabDepartment();
    private ManagementDepartment MDpart = new ManagementDepartment();
    private RecordDepartment RDpart = new RecordDepartment();
    private DoctorList doctor_list = new DoctorList();
    private RecodeList record_list = new RecodeList();
    private HospitalAdminList Admin_list = new HospitalAdminList();
    
    public void setName(String x){
        name = x;
    }
    
    public void setLocation(String x){
        location = x;
    }
    
    public String getName(){
        return name;
    }
    
    public String getLocation(){
        return location;
    }
    
    public DoctorList getDoctorList(){
        return doctor_list;
    }
    
    public RecodeList getRecodeList(){
        return record_list;
    }
    
    public HospitalAdminList getAdminList(){
        return Admin_list;
    }
    
    public RecordDepartment getRDpart(){
        return RDpart;
    }
    
    public ManagementDepartment getMDpart(){
        return MDpart;
    }
    
    public LabDepartment getLDepartment(){
        return LDpart;
    }
    @Override
    public String toString(){
        return name;
    }
}
