/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Doctor;

import java.util.*;
/**
 *
 * @author prospace
 */
public class DoctorList {
    private ArrayList<Doctor> doctor_list = new ArrayList<>();
    public ArrayList<Doctor> getDoctorList(){
        return doctor_list;
    }
    
    public void Add(Doctor x){
        doctor_list.add(x);
    }
    
    public void Del(Doctor x){
        doctor_list.remove(x);
    }
    
    public int getSize(){
        return doctor_list.size();
    }
}
