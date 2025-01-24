/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userinterface.PatientPanel;

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
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author prospace
 */
public class PatientShowPanel extends javax.swing.JPanel {

    /**
     * Creates new form PatientShowPanel
     */
    JPanel rightPanel;
    Patient patient;
    File directory = new File("");
    String pex=directory.getAbsolutePath()+"/images/";
    public PatientShowPanel(JPanel rightPanel, Patient patient) {
        this.rightPanel = rightPanel;
        this.patient = patient;
        initComponents();
        refresh_patient();
        populate();
        //
        ImageIcon icon=new ImageIcon(pex+"ptitle.png");
        title.setText("");
        title.setIcon(icon);
        initBTN();
    }
    //
    public void initBTN(){
          resetButton(BackBtn,
                pex+"back1.png",
                pex+"back2.png");
          resetButton(ViewBtn,
                pex+"view1.png",
                pex+"view2.png");
          resetButton(ChangeBtn,
                pex+"update1.png",
                pex+"update2.png");
          resetButton(ShowAllBtn,
                pex+"showall1.png",
                pex+"showall2.png");
          resetButton(SearchBtn,
                pex+"Search1.png",
                pex+"Search2.png");
    }
     
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
     }
    
    public void refresh_patient(){
        this.patient.getRecordHistory().getRecodeList().clear();
        for (int RID : Datastore.getInstance().getRecords().keySet()){
            if (Datastore.getInstance().getRecords().get(RID).getPID().equals(patient.getId()))
                patient.getRecordHistory().add(Datastore.getInstance().getRecords().get(RID));
        }        
    }
    
    public void populate(){
        DefaultTableModel dtm = (DefaultTableModel)jTable1.getModel();
        dtm.setRowCount(0);
        
        for(Recode a : patient.getRecordHistory().getRecodeList()){
            Object[] row = new Object[dtm.getColumnCount()];
            row[0] = a;
            row[1] = a.getHospital();
            row[2] = Datastore.getInstance().getDoctors().get(a.getDID()).getFirstName() + " " 
                   + Datastore.getInstance().getDoctors().get(a.getDID()).getLastName();
            row[3] = a.getDID();
            row[4] = a.getDisName();
            row[5] = a.getDate();
            dtm.addRow(row);
        }
    }

    public void populate(String s1, String s2, String s3, String s4, String s5){
        DefaultTableModel dtm = (DefaultTableModel)jTable1.getModel();
        dtm.setRowCount(0);
        
        for(Recode a : patient.getRecordHistory().getRecodeList()){
            if (s1.equals("")==false && a.getHospital().equals(s1) == false) continue;
            if (s2.equals("")==false){
                String tmp_name = Datastore.getInstance().getDoctors().get(a.getDID()).getFirstName() + " " 
                                + Datastore.getInstance().getDoctors().get(a.getDID()).getLastName();
                if (tmp_name.contains(s2) == false) continue; 
            }
            
            if (s3.equals("")==false && a.getDisName().equals(s3) == false) continue;
            if (s4.equals("")==false && a.getDate().compareTo(s4)<0) continue;
            if (s5.equals("")==false && a.getDate().compareTo(s5)>0) continue;
            
            Object[] row = new Object[dtm.getColumnCount()];
            row[0] = a;
            row[1] = a.getHospital();
            row[2] = Datastore.getInstance().getDoctors().get(a.getDID()).getFirstName() + " " 
                   + Datastore.getInstance().getDoctors().get(a.getDID()).getLastName();
            row[3] = a.getDID();
            row[4] = a.getDisName();
            row[5] = a.getDate();
            dtm.addRow(row);
        }
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        SearchBtn = new javax.swing.JButton();
        ChangeBtn = new javax.swing.JButton();
        ViewBtn = new javax.swing.JButton();
        BackBtn = new javax.swing.JButton();
        ShowAllBtn = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        title = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Hospital", "Doctor", "DoctorID", "Disease", "Date"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        SearchBtn.setText("Search");
        SearchBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchBtnActionPerformed(evt);
            }
        });

        ChangeBtn.setText("Update");
        ChangeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeBtnActionPerformed(evt);
            }
        });

        ViewBtn.setText("View");
        ViewBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ViewBtnActionPerformed(evt);
            }
        });

        BackBtn.setText("Back");
        BackBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackBtnActionPerformed(evt);
            }
        });

        ShowAllBtn.setText("Show All");
        ShowAllBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowAllBtnActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Monaco", 0, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(0, 51, 255));
        jLabel11.setText(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        title.setText("jLabel3");

        jLabel12.setFont(new java.awt.Font("Monaco", 0, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 255));
        jLabel12.setText(">>>>>Medical record info >>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(title, javax.swing.GroupLayout.PREFERRED_SIZE, 720, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 671, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(8, 8, 8)
                                .addComponent(jLabel11))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addComponent(ViewBtn)
                        .addGap(31, 31, 31)
                        .addComponent(ChangeBtn)
                        .addGap(18, 18, 18)
                        .addComponent(ShowAllBtn)
                        .addGap(27, 27, 27)
                        .addComponent(SearchBtn)
                        .addGap(73, 73, 73)
                        .addComponent(BackBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel12)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(title)
                .addGap(20, 20, 20)
                .addComponent(jLabel12)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ChangeBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ViewBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ShowAllBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SearchBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BackBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel11)
                .addContainerGap(104, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ChangeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChangeBtnActionPerformed
        // TODO add your handling code here:
        ChangeInfoPanel changeInfoPanel = new ChangeInfoPanel(rightPanel,patient);
        rightPanel.add("changeInfoPanel",changeInfoPanel);
        CardLayout layout = (CardLayout)rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_ChangeBtnActionPerformed

    private void BackBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackBtnActionPerformed
        // TODO add your handling code here:
        rightPanel.remove(this);
        CardLayout layout = (CardLayout) rightPanel.getLayout();
        layout.previous(rightPanel);
    }//GEN-LAST:event_BackBtnActionPerformed

    private void ViewBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ViewBtnActionPerformed
        // TODO add your handling code here:
        int selectRow = jTable1.getSelectedRow();
        if (selectRow < 0){
            JOptionPane.showMessageDialog(null, "Please Select a Row");
        }else {
            Recode rec = (Recode) jTable1.getValueAt(selectRow, 0);
            PatientViewRecordPanel vPanel = new PatientViewRecordPanel(rightPanel,rec);
            rightPanel.add("ViewPanel", vPanel);
            CardLayout layout = (CardLayout)rightPanel.getLayout();
            layout.next(rightPanel);
        }
    }//GEN-LAST:event_ViewBtnActionPerformed

    private void ShowAllBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowAllBtnActionPerformed
        // TODO add your handling code here:
        populate();
    }//GEN-LAST:event_ShowAllBtnActionPerformed

    private void SearchBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchBtnActionPerformed
        // TODO add your handling code here:
        PatientSearchRecordPanel searchInfoPanel = new PatientSearchRecordPanel(rightPanel);
        rightPanel.add("searchInfoPanel",searchInfoPanel);
        CardLayout layout = (CardLayout)rightPanel.getLayout();
        layout.next(rightPanel);
    }//GEN-LAST:event_SearchBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackBtn;
    private javax.swing.JButton ChangeBtn;
    private javax.swing.JButton SearchBtn;
    private javax.swing.JButton ShowAllBtn;
    private javax.swing.JButton ViewBtn;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JLabel title;
    // End of variables declaration//GEN-END:variables
}
