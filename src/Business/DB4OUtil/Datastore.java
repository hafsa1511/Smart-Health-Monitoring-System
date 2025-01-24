/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.DB4OUtil;

import Business.Enterprise.Hospital;
import java.util.HashMap;
import java.util.*;

import Business.Recode.*;
import Business.Admin.*;
import Business.DB4OUtil.*;
import Business.Disease.*;
import Business.Doctor.*;
import Business.Patient.*;
/**
 *
 * @author harshalneelkamal
 */
public class Datastore {
    
    private static Datastore dataStore;
    
    private Map<String, Patient> patients;
    private Map<Long, Doctor> doctors;
    private Map<Integer, Recode> records;
    private Map<String, Disease> diseases;
    private Map<String, Hospital> hospitals;
    private Map<String, Admin> admins;
    private Map<String, HospitalAdmin> hospitaladmins;
    private Map<String, DiseaseList> dislists;
    
    private Datastore(){
        patients = new HashMap<>();
        doctors = new HashMap<>();
        records = new HashMap<>();
        diseases = new HashMap<>();
        hospitals = new HashMap<>();
        admins = new HashMap<>();
        hospitaladmins = new HashMap<>();
        dislists= new HashMap<>();
    }
    
    public static Datastore getInstance(){
        if(dataStore == null)
            dataStore = new Datastore();
        return dataStore;
    }

    public static Datastore getDataStore() {
        return dataStore;
    }

    public static void setDataStore(Datastore dataStore) {
        Datastore.dataStore = dataStore;
    }

    public Map<String, Patient> getPatients() {
        return patients;
    }

    public void setPatients(Map<String, Patient> patients) {
        this.patients = patients;
    }

    public Map<Long, Doctor> getDoctors() {
        return doctors;
    }

    public void setDoctors(Map<Long, Doctor> doctors) {
        this.doctors = doctors;
    }

    public Map<Integer, Recode> getRecords() {
        return records;
    }

    public void setRecords(Map<Integer, Recode> records) {
        this.records = records;
    }

    public Map<String, Disease> getDiseases() {
        return diseases;
    }

    public void setDiseases(Map<String, Disease> diseases) {
        this.diseases = diseases;
    }
    
    public Map<String, Hospital> getHospitals() {
        return hospitals;
    }

    public void setHospitals(Map<String, Hospital> hospitals) {
        this.hospitals = hospitals;
    }
    
    public Map<String, Admin> getAdmins() {
        return admins;
    }

    public void setAdmins(Map<String, Admin> admins) {
        this.admins = admins;
    }
    
    public Map<String, HospitalAdmin> getHospitalAdmins(){
        return hospitaladmins;
    }

    public void setHospitalAdmins(Map<String, HospitalAdmin> hospitaladmins) {
        this.hospitaladmins = hospitaladmins;
    }
    
    public Map<String, DiseaseList>  getDislists(){
        return dislists;
    }
    
    public void setDislist(Map<String, DiseaseList> dislists){
        this.dislists = dislists;
    }
    
}
