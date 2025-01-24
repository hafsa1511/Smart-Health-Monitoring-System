/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Enterprise;

import java.util.*;

/**
 *
 * @author prospace
 */
public class HospitalList {
    private ArrayList<Hospital> hlist= new ArrayList<>();
    public ArrayList<Hospital> getHospitalList(){
        return hlist;
    }
    public void Add(Hospital x){
        hlist.add(x);
    }
    
    public void del(Hospital x){
        hlist.remove(x);
    }
    public int getsize(){
        return hlist.size();
    }
}
