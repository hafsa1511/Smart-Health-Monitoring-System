/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.DiseaseControlPanel;

import javax.swing.*;
import Business.*;
import Business.Admin.*;
import Business.DB4OUtil.*;
import Business.Disease.*;
import Business.Doctor.*;
import Business.Enterprise.*;
import Business.Network.*;
import Business.Patient.*;
import Business.Recode.*;
import java.awt.*;
import java.io.File;
import java.util.*;

/**
 *
 * @author cestdrama
 */
public class AnalyzePanel extends javax.swing.JPanel {

    /**
     * Creates new form AnalyzePanel
     */
    File directory = new File("");
    String pex=directory.getAbsolutePath()+"/images/";
    JPanel rightPanel;
    DiseaseList disease_list;
    Map<String, Integer> CountCase = new HashMap<>();
    public AnalyzePanel(JPanel rightPanel, DiseaseList disease_list) {
        initComponents();
        this.rightPanel = rightPanel;       
        this.disease_list = disease_list;
        AnalyzeMost();  
        //
         //UI
        ImageIcon icon=new ImageIcon(pex+"centertitle.png");
        title.setText("");
        title.setIcon(icon);
        
        initBTN();
    }
    
     //
    public void initBTN(){
        resetButton(BackBtn,
                pex+"back1.png",
                pex+"back2.png");
        
    }
    //
    public void resetButton(JButton btn,String path1,String path2){
       ImageIcon img1 = new ImageIcon(path1);
       ImageIcon img2 = new ImageIcon(path2);
      // ImageIcon img3 = new ImageIcon("/Users/cestdrama/Desktop/swg1207/display_pressed.jpg");        
          btn.setText("");
          btn.setSize(img2.getIconWidth(),img2.getIconHeight());
          btn.setContentAreaFilled(false);
          //BTN1.setBorderPainted(false);
          btn.setIcon(img1);
          btn.setPressedIcon(img2); 
          btn.setRolloverIcon(img2);
          //btn.setBorderPainted(false);
    }
    //
     public void AnalyzeMost(){
        for (Recode x : Datastore.getInstance().getRecords().values()){
            if (disease_list.getList().contains(Datastore.getInstance().getDiseases().get(x.getDisName())) == false) continue;
            if (CountCase.containsKey(x.getDisName())==false){
                CountCase.put(x.getDisName(), 1);
            }else{
                CountCase.put(x.getDisName(), CountCase.get(x.getDisName())+1);
            }
        }
        int maxf = 0;
        String ansdis = "N/A";
        for (String s : CountCase.keySet()){
            if (CountCase.get(s) > maxf)
            {
                maxf = CountCase.get(s);
                ansdis = s;
            }
        }
        
        MostDisNameText.setText(ansdis);
        MostDisNumText.setText(Integer.toString(maxf));
        MostDisNameText.setEnabled(false);
        MostDisNumText.setEnabled(false);
        
        
        
        CountCase.clear();
        for (Recode x : Datastore.getInstance().getRecords().values()){
            if (disease_list.getList().contains(Datastore.getInstance().getDiseases().get(x.getDisName())) == false) continue;
            if (Datastore.getInstance().getPatients().get(x.getPID()).getSex().equals("F")) continue; 
            if (CountCase.containsKey(x.getDisName())==false){
                CountCase.put(x.getDisName(), 1);
            }else{
                CountCase.put(x.getDisName(), CountCase.get(x.getDisName())+1);
            }
        }
        maxf = 0;
        ansdis = "N/A";
        for (String s : CountCase.keySet()){
            if (CountCase.get(s) > maxf)
            {
                maxf = CountCase.get(s);
                ansdis = s;
            }
        }
        A21Text.setText(ansdis);
        A22Text.setText(Integer.toString(maxf));
        A21Text.setEnabled(false);
        A22Text.setEnabled(false);
        
        CountCase.clear();
        for (Recode x : Datastore.getInstance().getRecords().values()){
            if (disease_list.getList().contains(Datastore.getInstance().getDiseases().get(x.getDisName())) == false) continue;
            if (Datastore.getInstance().getPatients().get(x.getPID()).getSex().equals("M")) continue; 
            if (CountCase.containsKey(x.getDisName())==false){
                CountCase.put(x.getDisName(), 1);
            }else{
                CountCase.put(x.getDisName(), CountCase.get(x.getDisName())+1);
            }
        }
        maxf = 0;
        ansdis = "N/A";
        for (String s : CountCase.keySet()){
            if (CountCase.get(s) > maxf)
            {
                maxf = CountCase.get(s);
                ansdis = s;
            }
        }
        A31Text.setText(ansdis);
        A32Text.setText(Integer.toString(maxf));
        A31Text.setEnabled(false);
        A32Text.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        title = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        MostDisNameText = new javax.swing.JTextField();
        MostDisNumText = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        A21Text = new javax.swing.JTextField();
        A22Text = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        A31Text = new javax.swing.JTextField();
        A32Text = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        BackBtn = new javax.swing.JButton();
        jLabel15 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        title.setText("title");

        jLabel6.setFont(new java.awt.Font("Monaco", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 102, 0));
        jLabel6.setText(">>>>>The most frequent disease in total  >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        jLabel8.setFont(new java.awt.Font("Monaco", 3, 16)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 255));
        jLabel8.setText("Disease name:");

        jLabel9.setFont(new java.awt.Font("Monaco", 3, 16)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 255));
        jLabel9.setText("Number of cases:");

        jLabel10.setFont(new java.awt.Font("Monaco", 3, 16)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 255));
        jLabel10.setText("Disease name:");

        jLabel7.setFont(new java.awt.Font("Monaco", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 102, 0));
        jLabel7.setText(">>>>>The most frequent disease for male >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        jLabel11.setFont(new java.awt.Font("Monaco", 3, 16)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 255));
        jLabel11.setText("Number of cases:");

        jLabel12.setFont(new java.awt.Font("Monaco", 3, 16)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 255));
        jLabel12.setText("Disease name:");

        jLabel13.setFont(new java.awt.Font("Monaco", 0, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 102, 0));
        jLabel13.setText(">>>>>The most frequent disease for female>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        jLabel14.setFont(new java.awt.Font("Monaco", 3, 16)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 51, 255));
        jLabel14.setText("Number of cases:");

        BackBtn.setText("jButton1");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Monaco", 0, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 102, 0));
        jLabel15.setText(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 740, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(MostDisNumText, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                            .addComponent(MostDisNameText)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(127, 127, 127)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel12)
                            .addComponent(jLabel14))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addComponent(A31Text, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(A32Text))))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(122, 122, 122)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel10)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(A21Text, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE)
                            .addComponent(A22Text)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(320, 320, 320)
                        .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(title)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(MostDisNameText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(MostDisNumText, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(A21Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(A22Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(A31Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(A32Text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel15)
                .addGap(18, 18, 18)
                .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(74, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
        rightPanel.remove(this);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.previous(rightPanel);
    }//GEN-LAST:event_BackBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField A21Text;
    private javax.swing.JTextField A22Text;
    private javax.swing.JTextField A31Text;
    private javax.swing.JTextField A32Text;
    private javax.swing.JButton BackBtn;
    private javax.swing.JTextField MostDisNameText;
    private javax.swing.JTextField MostDisNumText;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
