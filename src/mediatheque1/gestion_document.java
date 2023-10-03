/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mediatheque1;

import static java.lang.Thread.sleep;
import java.sql.*;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author PC
 */
public class gestion_document extends javax.swing.JFrame {

    Connection conn=null;
    PreparedStatement pst=null;
    ResultSet rs=null;
   static String groupe;
  DefaultTableModel model;
    public gestion_document(String groupe) {
        this.groupe=groupe;
        initComponents();
        clock();
        conn=Connectionbdd.ConnecrDb();
        tablelord();
        
    }
    public void fermer(){
      dispose(); 
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        bDate = new javax.swing.JLabel();
        bTime = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        CoteLabel = new javax.swing.JLabel();
        TitreLabel = new javax.swing.JLabel();
        AuteurLabel = new javax.swing.JLabel();
        DateLabel = new javax.swing.JLabel();
        DomicileLabel = new javax.swing.JLabel();
        EtatLabel = new javax.swing.JLabel();
        EmplacementLabel = new javax.swing.JLabel();
        PrixLabel = new javax.swing.JLabel();
        CautionLabel = new javax.swing.JLabel();
        TypeLabel = new javax.swing.JLabel();
        CoteTextField = new javax.swing.JTextField();
        TitreTextField = new javax.swing.JTextField();
        Auteur = new javax.swing.JTextField();
        DomicileTextField = new javax.swing.JTextField();
        dateTextField = new javax.swing.JTextField();
        EtatTextField = new javax.swing.JTextField();
        EmTextField = new javax.swing.JTextField();
        PrixTextField = new javax.swing.JTextField();
        CautionTextField = new javax.swing.JTextField();
        TypeComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        AjouterButton = new javax.swing.JButton();
        ModifierButton = new javax.swing.JButton();
        SupprimerButton = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        TableDoc = new javax.swing.JTable();
        retourbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(0, 153, 153));
        jPanel2.setEnabled(false);
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setBackground(new java.awt.Color(0, 153, 153));
        jLabel8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 50, 950, 570));

        jLabel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 950, 50));

        jLabel4.setFont(new java.awt.Font("Sitka Text", 3, 36)); // NOI18N
        jLabel4.setText("MYS");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 100, 60));

        bDate.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        bDate.setText("Date");
        jPanel2.add(bDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 190, 30));

        bTime.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        bTime.setText("Time");
        jPanel2.add(bTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 200, -1));

        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(7, 56, 940, 260));

        CoteLabel.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        CoteLabel.setForeground(new java.awt.Color(255, 255, 255));
        CoteLabel.setText("Cote :");
        jPanel2.add(CoteLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 66, 50, 30));

        TitreLabel.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        TitreLabel.setForeground(new java.awt.Color(255, 255, 255));
        TitreLabel.setText("Titre :");
        jPanel2.add(TitreLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 106, 50, 40));

        AuteurLabel.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        AuteurLabel.setForeground(new java.awt.Color(255, 255, 255));
        AuteurLabel.setText("Auteur :");
        jPanel2.add(AuteurLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 150, 60, 40));

        DateLabel.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        DateLabel.setForeground(new java.awt.Color(255, 255, 255));
        DateLabel.setText("Date :");
        jPanel2.add(DateLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 200, 60, 40));

        DomicileLabel.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        DomicileLabel.setForeground(new java.awt.Color(255, 255, 255));
        DomicileLabel.setText("Domicile :");
        jPanel2.add(DomicileLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 250, 80, 40));

        EtatLabel.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        EtatLabel.setForeground(new java.awt.Color(255, 255, 255));
        EtatLabel.setText("Etat :");
        jPanel2.add(EtatLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 66, 100, 30));

        EmplacementLabel.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        EmplacementLabel.setForeground(new java.awt.Color(255, 255, 255));
        EmplacementLabel.setText("Emplacement :");
        jPanel2.add(EmplacementLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 106, 100, 40));

        PrixLabel.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        PrixLabel.setForeground(new java.awt.Color(255, 255, 255));
        PrixLabel.setText("Prix :");
        jPanel2.add(PrixLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(313, 160, 50, 20));

        CautionLabel.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        CautionLabel.setForeground(new java.awt.Color(255, 255, 255));
        CautionLabel.setText("Caution :");
        jPanel2.add(CautionLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 206, 70, 30));

        TypeLabel.setFont(new java.awt.Font("Arial", 3, 14)); // NOI18N
        TypeLabel.setForeground(new java.awt.Color(255, 255, 255));
        TypeLabel.setText("Type :");
        jPanel2.add(TypeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 260, 60, -1));
        jPanel2.add(CoteTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 62, 170, 30));
        jPanel2.add(TitreTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(91, 102, 170, 30));
        jPanel2.add(Auteur, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 160, 30));
        jPanel2.add(DomicileTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 252, 150, 30));
        jPanel2.add(dateTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 202, 160, 30));
        jPanel2.add(EtatTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 62, 200, 30));
        jPanel2.add(EmTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 102, 140, 30));
        jPanel2.add(PrixTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 152, 200, 30));

        CautionTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CautionTextFieldActionPerformed(evt);
            }
        });
        jPanel2.add(CautionTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 202, 180, 30));

        TypeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select document", "Livre", "CDRom", "Jornal", "Microfilm", " " }));
        TypeComboBox.setToolTipText("");
        jPanel2.add(TypeComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 252, 190, 30));

        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel2.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(627, 76, 300, 220));

        AjouterButton.setBackground(new java.awt.Color(0, 102, 102));
        AjouterButton.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        AjouterButton.setForeground(new java.awt.Color(255, 255, 255));
        AjouterButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/add2.png"))); // NOI18N
        AjouterButton.setText("Ajouter");
        AjouterButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        AjouterButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AjouterButtonActionPerformed(evt);
            }
        });
        jPanel2.add(AjouterButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(675, 93, 210, 50));

        ModifierButton.setBackground(new java.awt.Color(0, 102, 102));
        ModifierButton.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        ModifierButton.setForeground(new java.awt.Color(255, 255, 255));
        ModifierButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/update.png"))); // NOI18N
        ModifierButton.setText("Modifier");
        ModifierButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        ModifierButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifierButtonActionPerformed(evt);
            }
        });
        jPanel2.add(ModifierButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(675, 160, 210, 50));

        SupprimerButton.setBackground(new java.awt.Color(0, 102, 102));
        SupprimerButton.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        SupprimerButton.setForeground(new java.awt.Color(255, 255, 255));
        SupprimerButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/delete.png"))); // NOI18N
        SupprimerButton.setText("Supprimer");
        SupprimerButton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        SupprimerButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupprimerButtonActionPerformed(evt);
            }
        });
        jPanel2.add(SupprimerButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(675, 230, 210, 50));

        TableDoc.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        TableDoc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "cote", "titre", "auteur", "date", "domicile", "etat", "emplacement", "prix", "caution", "type"
            }
        ));
        TableDoc.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableDocMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(TableDoc);

        jPanel2.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 930, 230));

        retourbutton.setBackground(new java.awt.Color(0, 102, 102));
        retourbutton.setFont(new java.awt.Font("Segoe UI Black", 3, 18)); // NOI18N
        retourbutton.setForeground(new java.awt.Color(255, 255, 255));
        retourbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back1.png"))); // NOI18N
        retourbutton.setText("Retour");
        retourbutton.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        retourbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                retourbuttonActionPerformed(evt);
            }
        });
        jPanel2.add(retourbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(375, 560, 220, 50));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void retourbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_retourbuttonActionPerformed
     
             //JOptionPane.showMessageDialog(null,"Conexion Echouée, Information Incorrects");
             
               
                    if(groupe.equals("A")){
                          bibliothecaire bibliothecaire = new bibliothecaire(groupe);
                          bibliothecaire.setVisible(true);
                          fermer();
                          
                    }
                    else if(groupe.equals("P")){
                          Personnel per = new Personnel(groupe);
                          per.setVisible(true);
                    fermer();} 
                   
      
      
        
    }//GEN-LAST:event_retourbuttonActionPerformed

    private void AjouterButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AjouterButtonActionPerformed
     String cote=CoteTextField.getText();   
     String titre=TitreTextField.getText();
     String auteur=Auteur.getText();
     String date=dateTextField.getText();   
     String etat=EtatTextField.getText();
     String emplacement=EmTextField.getText();
     String prix=PrixTextField.getText();
     String caution=CautionTextField.getText();     
     String type=TypeComboBox.getSelectedItem().toString();
     String domicile=DomicileTextField.getText();
        
    
 try {
     String sql="INSERT INTO `documents`(`cote`, `titre`, `auteur`, `date`, `domicile`, `etat`, `emplacement`, `prix`, `caution`, `type`) VALUES ('"+cote+"','"+titre+"','"+auteur+"','"+date+"','"+domicile+"','"+etat+"','"+emplacement+"','"+prix+"','"+caution+"','"+type+"')";
     PreparedStatement pst=(PreparedStatement)conn.prepareStatement(sql);
     pst.execute();
     JOptionPane.showMessageDialog(rootPane,"Successfully insert");
     }catch(Exception e  ){
         JOptionPane.showMessageDialog(rootPane,e);
     
     }
 clearFiled();tablelord();
  
    }//GEN-LAST:event_AjouterButtonActionPerformed

    private void TableDocMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableDocMouseClicked
      DefaultTableModel model=(DefaultTableModel )TableDoc.getModel();
      int selectrowindex =TableDoc.getSelectedRow();
      CoteTextField.setText(model.getValueAt(selectrowindex,0).toString());   
    TitreTextField.setText(model.getValueAt(selectrowindex,1).toString()); 
    Auteur.setText(model.getValueAt(selectrowindex,2).toString()); 
    dateTextField.setText(model.getValueAt(selectrowindex,3).toString()); 
       DomicileTextField.setText(model.getValueAt(selectrowindex,4).toString()); 
    EtatTextField.setText(model.getValueAt(selectrowindex,5).toString()); 
    EmTextField.setText(model.getValueAt(selectrowindex,6).toString()); 
    PrixTextField.setText(model.getValueAt(selectrowindex,7).toString()); 
    CautionTextField.setText(model.getValueAt(selectrowindex,8).toString());      
 
    TypeComboBox.setSelectedItem(model.getValueAt(selectrowindex,9).toString()); 
    }//GEN-LAST:event_TableDocMouseClicked

    private void ModifierButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ModifierButtonActionPerformed
     String cote=CoteTextField.getText();   
     String titre=TitreTextField.getText();
     String auteur=Auteur.getText();
     String date=dateTextField.getText(); 
     String etat=EtatTextField.getText();
     String emplacement=EmTextField.getText();
     String prix=PrixTextField.getText();
     String caution=CautionTextField.getText();     
     String type=TypeComboBox.getSelectedItem().toString();
     
        
        
        
        try{
            String sql="UPDATE `documents` SET `titre`='"+titre+"',`auteur`='"+auteur+"',`date`='"+date+"',`etat`='"+etat+"',`emplacement`='"+emplacement+"',`prix`='"+prix+"',`caution`='"+caution+"',`type`='"+type+"' WHERE `cote`='"+cote+"'";
            pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(rootPane, "Update success");
             tablelord();
        }catch(Exception e ){JOptionPane.showMessageDialog(rootPane, e);}
    }//GEN-LAST:event_ModifierButtonActionPerformed

    private void SupprimerButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SupprimerButtonActionPerformed
        
        
        try{
            String sql="DELETE FROM `documents` WHERE `cote`='"+CoteTextField.getText()+"'";
            pst=conn.prepareStatement(sql);
            pst.execute();
            JOptionPane.showMessageDialog(rootPane, "Delete success");
       tablelord();
        }
        catch(Exception e) {JOptionPane.showMessageDialog(rootPane, e);}
    }//GEN-LAST:event_SupprimerButtonActionPerformed

    private void CautionTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CautionTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CautionTextFieldActionPerformed
   
    
    
    public void tablelord(){
          
    try{
    String sql="SELECT * FROM `documents` ";
    pst=conn.prepareStatement(sql);
    rs=pst.executeQuery();
    
   
    TableDoc.setModel(net.proteanit.sql.DbUtils.resultSetToTableModel(rs));
    }
       catch(Exception e){JOptionPane.showConfirmDialog(rootPane, e);}}
  
      
  
    
    
    public void clock(){
        {
            Thread clock=new Thread(){
            public void run(){
            try{
            while(true)
            {Calendar cal= new GregorianCalendar();
            int day=cal.get(Calendar.DAY_OF_MONTH);
            int month=cal.get(Calendar.MONTH)+1;
            int year=cal.get(Calendar.YEAR);
            
            int second=cal.get(Calendar.SECOND);
            int minute =cal.get(Calendar.MINUTE);
            int hour =cal.get(Calendar.HOUR);
            
            bTime.setText(hour+":"+minute+":"+second);
            bDate.setText(year+"-"+month+"-"+day);
                 sleep(1000);
                    
            }}
            catch(Exception e){JOptionPane.showMessageDialog(rootPane,e);}}
        };
        clock.start();}}
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(gestion_document.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(gestion_document.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(gestion_document.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(gestion_document.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new gestion_document(groupe).setVisible(true);
            }
        });
    }
    private void clearFiled(){
        
        
       CoteTextField.setText("");   
    TitreTextField.setText(""); 
    Auteur.setText(""); 
    dateTextField.setText("");    
    EtatTextField.setText(""); 
    EmTextField.setText(""); 
    PrixTextField.setText(""); 
    CautionTextField.setText("");      
    TypeComboBox.setSelectedIndex(0);
    DomicileTextField.setText(""); 
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AjouterButton;
    private javax.swing.JTextField Auteur;
    private javax.swing.JLabel AuteurLabel;
    private javax.swing.JLabel CautionLabel;
    private javax.swing.JTextField CautionTextField;
    private javax.swing.JLabel CoteLabel;
    private javax.swing.JTextField CoteTextField;
    private javax.swing.JLabel DateLabel;
    private javax.swing.JLabel DomicileLabel;
    private javax.swing.JTextField DomicileTextField;
    private javax.swing.JTextField EmTextField;
    private javax.swing.JLabel EmplacementLabel;
    private javax.swing.JLabel EtatLabel;
    private javax.swing.JTextField EtatTextField;
    private javax.swing.JButton ModifierButton;
    private javax.swing.JLabel PrixLabel;
    private javax.swing.JTextField PrixTextField;
    private javax.swing.JButton SupprimerButton;
    private javax.swing.JTable TableDoc;
    private javax.swing.JLabel TitreLabel;
    private javax.swing.JTextField TitreTextField;
    private javax.swing.JComboBox<String> TypeComboBox;
    private javax.swing.JLabel TypeLabel;
    private javax.swing.JLabel bDate;
    private javax.swing.JLabel bTime;
    private javax.swing.JTextField dateTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JButton retourbutton;
    // End of variables declaration//GEN-END:variables
}
