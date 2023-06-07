//package final_project;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class Registration_form extends javax.swing.JFrame {
    
    int count=0;
    String display,details="";
    

    public Registration_form() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtFullname = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtIdnumber = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtDetails = new javax.swing.JTextArea();
        btnSubmit = new javax.swing.JButton();
        btnReset = new javax.swing.JButton();
        btnDeleteAll = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtCount = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 255));
        jLabel1.setText("Registration Form");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Name in full:");

        txtFullname.setBackground(new java.awt.Color(204, 255, 204));
        txtFullname.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtFullname.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        txtFullname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFullnameActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("National ID card number:");

        txtIdnumber.setBackground(new java.awt.Color(204, 255, 204));
        txtIdnumber.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtIdnumber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIdnumberActionPerformed(evt);
            }
        });

        txtDetails.setEditable(false);
        txtDetails.setBackground(new java.awt.Color(255, 255, 204));
        txtDetails.setColumns(20);
        txtDetails.setFont(new java.awt.Font("Monospaced", 1, 13)); // NOI18N
        txtDetails.setRows(5);
        txtDetails.setText("\t\tRegistration Form\n-----------------------------------------------------\nNo.\tName with initials\t\tDate of birth\n");
        jScrollPane1.setViewportView(txtDetails);

        btnSubmit.setBackground(new java.awt.Color(153, 255, 255));
        btnSubmit.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnSubmit.setText("Submit");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });

        btnReset.setBackground(new java.awt.Color(255, 102, 51));
        btnReset.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnReset.setText("Reset");
        btnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnResetActionPerformed(evt);
            }
        });

        btnDeleteAll.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        btnDeleteAll.setForeground(new java.awt.Color(255, 51, 51));
        btnDeleteAll.setText("Delete All");
        btnDeleteAll.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteAllActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Count:");

        txtCount.setEditable(false);
        txtCount.setFont(new java.awt.Font("Tahoma", 1, 10)); // NOI18N
        txtCount.setText("0");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(btnDeleteAll)
                .addGap(41, 41, 41))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(175, 175, 175)
                                .addComponent(btnSubmit, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)
                                .addComponent(btnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(43, 43, 43)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtCount, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIdnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(jLabel1)))
                        .addGap(56, 56, 56))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtFullname, javax.swing.GroupLayout.PREFERRED_SIZE, 389, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtFullname, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtIdnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnSubmit)
                            .addComponent(btnReset))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCount, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 384, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(46, 46, 46)
                .addComponent(btnDeleteAll)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFullnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFullnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFullnameActionPerformed

    private void txtIdnumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIdnumberActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIdnumberActionPerformed

    private void btnDeleteAllActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteAllActionPerformed
        String display;
        count=0;
        details="";
        
        txtDetails.setText("");
        txtCount.setText(Integer.toString(count));
        
        display="\t\tRegistration Form\n";
        display+="-----------------------------------------------------\n";
        display+="No.\tName with initials\t\tDate of birth\n";
        
        txtDetails.setText(display);
        
    }//GEN-LAST:event_btnDeleteAllActionPerformed

    private void btnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnResetActionPerformed

        txtFullname.setText("");
        txtIdnumber.setText("");
        
    }//GEN-LAST:event_btnResetActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        
        String name,id,a = "",initial_N = "";
        int lenName,lenId,daysToBirthday,day = 0,month = 0,year = 0;
        boolean ans=true;
        
        int month_Not_Leap_Year[] = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int month_Leap_Year[] = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        name = txtFullname.getText();
        id = txtIdnumber.getText();
                        
        display="\t\tRegistration Form\n";
        display+="-----------------------------------------------------\n";
        display+="No.\tName with initials\t\tDate of birth\n";
        
        txtDetails.setText(display);
                        
        lenName = name.length();
        lenId = id.length();
        
        if (name.isEmpty() || id.isEmpty() || lenId!=10){
            JOptionPane.showMessageDialog(null, "Invalid Entry!");
            txtDetails.setText(display+details);
        }
        else{  
            for (int y=0;y<id.length()-1;y++){
                int b = (int) id.charAt(y);
                if (b<48 || b>57){
                    ans = false;
                }
            }
            
            for (int y=0;y<name.length();y++){
                int b = (int) name.charAt(y);
                if (!((b>=65 && b<=90) || (b>=97 && b<=122) || (b==32))){
                    ans = false;
                }
            }
            if (ans==true){
                String str[] = name.split(" ");

                char chr[] = new char[str.length - 1];

                for (int i = 0; i < str.length - 1; i++) {
                    chr[i] = str[i].charAt(0);
                }

                int len = str.length;

                for (int i = 0; i < chr.length; i++) {
                    initial_N = initial_N + Character.toUpperCase(chr[i]) + ".";
                }

                String last_N = (str[len - 1]);
                initial_N = initial_N + last_N;

                if (lenId!=10 || id.charAt(9)!='V'){
                    JOptionPane.showMessageDialog(null, "Invalid ID Card Number!");
                    txtDetails.setText(display+details);
                }   
                else{
                    year = Integer.parseInt(id.substring(0,2));
                    year += 1900;
                    daysToBirthday = Integer.parseInt(id.substring(2,5));

                    if (daysToBirthday>500){
                        daysToBirthday-=500;
                    }

                    if (year % 400 == 0)
                        a = "Leap year";
                    else if (year % 100 == 0)
                        a = "Not leap year";
                    else
                        a = "Leap year";

                    if (a=="Leap year"){
                        for (int x=0;x<12;x++){
                            if (daysToBirthday>month_Leap_Year[x]){
                                daysToBirthday-=month_Leap_Year[x];
                                month=x+2;
                                day=daysToBirthday;
                            }
                        }
                    }
                    else{
                        for (int x=0;x<12;x++){
                            if (daysToBirthday>month_Not_Leap_Year[x]){
                                daysToBirthday-=month_Not_Leap_Year[x];
                                month=x+2;
                                day=daysToBirthday;
                            }
                        }
                    }

                    count+=1;
                    txtCount.setText(Integer.toString(count));

                    details = details+count+"\t"+initial_N+"\t\t\t"+year+"/"+month+"/"+day+"\n";

                    txtDetails.setText(display+details);
                }
            }
            else{
                JOptionPane.showMessageDialog(null, "Invalid Entry!");
                txtDetails.setText(display+details);
            }
        }        
    }//GEN-LAST:event_btnSubmitActionPerformed

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
            java.util.logging.Logger.getLogger(Registration_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registration_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registration_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registration_form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registration_form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeleteAll;
    private javax.swing.JButton btnReset;
    private javax.swing.JButton btnSubmit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField txtCount;
    private javax.swing.JTextArea txtDetails;
    private javax.swing.JTextField txtFullname;
    private javax.swing.JTextField txtIdnumber;
    // End of variables declaration//GEN-END:variables
}
