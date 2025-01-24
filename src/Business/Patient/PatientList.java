/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Patient;

import java.util.*;
/**
 *
 * @author prospace
 */
public class PatientList {
    private ArrayList<Patient> plist= new ArrayList<>();
    ArrayList<Patient> getPatientList(){
        return plist;
    }
    void AddPatient(Patient x){
        plist.add(x);
    }
    
    void delPatient(Patient x){
        plist.remove(x);
    }
    int getsize(){
        return plist.size();
    }
}
