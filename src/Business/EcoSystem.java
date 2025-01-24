/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author prospace
 */
public class EcoSystem {
    DiseaseCenter disease_center = new DiseaseCenter();
    
    public DiseaseCenter GetDiseaseCenter(){
        return disease_center;
    }
    
    public void SetDiseaseCenter(DiseaseCenter disease_center){
        this.disease_center = disease_center;
    }
    
}
