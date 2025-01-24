/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Recode;

import java.util.*;
/**
 *
 * @author prospace
 */
public class RecodeList {
    private ArrayList<Recode> recode_list = new ArrayList<>();
    public ArrayList<Recode> getRecodeList(){
        return recode_list;
    }
    public void add(Recode x){
        recode_list.add(x);
    }
    public void del(Recode x){
        recode_list.remove(x);
    }
    public int getSize(){
        return recode_list.size();
    }
}
