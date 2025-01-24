/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;

import Business.Recode.*;
/**
 *
 * @author prospace
 */
public class RecordDepartment {
    private RecodeList RList = new RecodeList();
    public RecodeList getRList(){
        return RList;
    }
    public void add(Recode x){
        RList.add(x);
    }
    
    public void del(Recode x){
        RList.del(x);
    }
    
    public int getSize(){
        return RList.getSize();
    }
    
}
