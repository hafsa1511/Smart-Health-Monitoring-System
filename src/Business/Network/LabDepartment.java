/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Network;
import Business.Disease.*;
/**
 *
 * @author prospace
 */
public class LabDepartment {
    private DiseaseList DList = new DiseaseList();
    public DiseaseList getDList(){
        return DList;
    }
    public void add(Disease x){
        DList.add(x);
    }
    public void Del(Disease x){
        DList.remove(x);
    }
    public int getSize(){
        return DList.getSize();
    }
}
