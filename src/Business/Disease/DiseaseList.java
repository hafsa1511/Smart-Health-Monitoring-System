/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Disease;

import java.util.*;
/**
 *
 * @author prospace
 */
public class DiseaseList {
    private ArrayList<Disease> disease_list = new ArrayList<>();
    public ArrayList<Disease> getList(){
        return disease_list;
    }
    
    public void add(Disease x){
        disease_list.add(x);
    }
    
    public void remove(Disease x){
        disease_list.remove(x);
    }
    
    public int getSize(){
        return disease_list.size();
    }
}
