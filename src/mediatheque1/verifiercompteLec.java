/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package mediatheque1;

import static java.lang.Thread.sleep;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;

/**
 *
 * @author PC
 */
public class verifiercompteLec extends javax.swing.JFrame {
    static String groupe;
    Connection con= null;
    PreparedStatement pst= null;
    ResultSet rs= null;
    
    public verifiercompteLec(String groupe) {
        this.groupe=groupe;
        initComponents();
        clock();
        con = Connectionbdd.ConnecrDb();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        bDate = new javax.swing.JLabel();
        bTime = new javax.swing.JLabel();
        Nom_text = new javax.swing.JTextField();
        Prenom_text = new javax.swing.JTextField();
        DateNaissance_text = new javax.swing.JTextField();
        email_text = new javax.swing.JTextField();
        CodeLecteur_text = new javax.swing.JTextField();
        nbrEmp = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        DateNaissance_text1 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(0, 153, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setBackground(new java.awt.Color(0, 102, 102));
        jLabel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 56, 790, 90));

        jLabel8.setFont(new java.awt.Font("Segoe UI Historic", 3, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("Code de Lecteur:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 72, 210, 60));

        jLabel2.setFont(new java.awt.Font("Segoe UI Emoji", 3, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Prénom :");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 270, 110, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI Emoji", 3, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Nombre Emprunt:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 460, 210, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI Emoji", 3, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Date Naissance :");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 330, 190, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Emoji", 3, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Nom :");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 200, 80, -1));

        jLabel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 970, 50));

        jLabel7.setFont(new java.awt.Font("Sitka Text", 3, 36)); // NOI18N
        jLabel7.setText("MYS");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 100, 60));

        bDate.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        bDate.setText("Date");
        jPanel1.add(bDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 190, 30));

        bTime.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        bTime.setText("Time");
        jPanel1.add(bTime, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 10, 200, -1));
        jPanel1.add(Nom_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 192, 380, 30));
        jPanel1.add(Prenom_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 270, 380, 30));
        jPanel1.add(DateNaissance_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 340, 30));
        jPanel1.add(email_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 400, 380, 30));

        CodeLecteur_text.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CodeLecteur_textMouseClicked(evt);
            }
        });
        CodeLecteur_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CodeLecteur_textActionPerformed(evt);
            }
        });
        jPanel1.add(CodeLecteur_text, new org.netbeans.lib.awtextra.AbsoluteConstraints(291, 80, 330, 40));

        nbrEmp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nbrEmpActionPerformed(evt);
            }
        });
        jPanel1.add(nbrEmp, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 460, 330, 30));

        jButton8.setBackground(new java.awt.Color(0, 102, 102));
        jButton8.setFont(new java.awt.Font("Segoe UI Black", 1, 14)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/back1.png"))); // NOI18N
        jButton8.setText("Retour");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 560, 170, 50));

        jButton1.setBackground(new java.awt.Color(0, 102, 102));
        jButton1.setFont(new java.awt.Font("Segoe UI Black", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/search2.png"))); // NOI18N
        jButton1.setText("Vérifirer");
        jButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, java.awt.Color.white, null, null));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(665, 63, 200, 70));

        jLabel9.setFont(new java.awt.Font("Segoe UI Emoji", 3, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Email :");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 400, 90, -1));
        jPanel1.add(DateNaissance_text1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 330, 340, 30));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
void fermer(){dispose();}
    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        
          if(groupe.equals("B")){
                          Bénevole benevole = new Bénevole(groupe);
                          benevole.setVisible(true);
                          fermer();
                          
                    }
                    else if(groupe.equals("P")){
                          Personnel per = new Personnel(groupe);
                          per.setVisible(true);
                    fermer();}
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String code= CodeLecteur_text.getText().toString();
          String sql= "select * from personne where idPersonne= ? and groupe = 'L' " ;
          try{

              pst = con.prepareStatement(sql);
              pst.setString(1, code);
              rs = pst.executeQuery();
              if(rs.next())
              {
                   String nom= rs.getString("nom");
                   String prenom = rs.getString("prenom");
                   String DateNaissance = rs.getString("dateNaissance");
                   String Email = rs.getString("email");
                   String nbEmp =rs.getString("nbrEmprunt");
              //String pass1= pass.substring(0,3);

              Nom_text.setText(nom);
              Prenom_text.setText(prenom);
              DateNaissance_text.setText(DateNaissance);
              email_text.setText(Email);
              nbrEmp.setText(nbEmp);
              
              }

          }catch(java.sql.SQLException e){
              e.printStackTrace();
          }      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void nbrEmpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nbrEmpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nbrEmpActionPerformed

    private void CodeLecteur_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CodeLecteur_textActionPerformed
       
    }//GEN-LAST:event_CodeLecteur_textActionPerformed

    private void CodeLecteur_textMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CodeLecteur_textMouseClicked
     clearFiled();
    }//GEN-LAST:event_CodeLecteur_textMouseClicked

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
            java.util.logging.Logger.getLogger(verifiercompteLec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(verifiercompteLec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(verifiercompteLec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(verifiercompteLec.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new verifiercompteLec(groupe).setVisible(true);
            }
        });
    }
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

  private void clearFiled(){
        
        
       Nom_text.setText("");   
    Prenom_text.setText(""); 
    DateNaissance_text.setText(""); 
    email_text.setText("");    
   nbrEmp.setText(""); 
   DateNaissance_text1.setText(""); 
    
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CodeLecteur_text;
    private javax.swing.JTextField DateNaissance_text;
    private javax.swing.JTextField DateNaissance_text1;
    private javax.swing.JTextField Nom_text;
    private javax.swing.JTextField Prenom_text;
    private javax.swing.JLabel bDate;
    private javax.swing.JLabel bTime;
    private javax.swing.JTextField email_text;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton8;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField nbrEmp;
    // End of variables declaration//GEN-END:variables
}
