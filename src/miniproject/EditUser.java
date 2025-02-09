/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniproject;

import java.math.BigInteger;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.ConditionalFeature;
import javax.swing.JOptionPane;

/**
 *
 * @author lenovo
 */
public class EditUser extends javax.swing.JFrame {

    /**
     * Creates new form NewUser
     */
    public EditUser() {
        initComponents();
    }
    
    String fname, lname, email, oldpassmd5;
    long cno;
    public EditUser(String emailid){
        initComponents();
        email = emailid;
        //To retrieve data
        PreparedStatement ps;
        ResultSet rs;
        String selectquery = "SELECT * FROM users WHERE Emailid = ?";
        
        try {
            ps = MyConnection.getConnection().prepareStatement(selectquery);
            ps.setString(1, emailid);
            rs = ps.executeQuery();
            
            rs.next();
            String salutation = rs.getString(1);
            int index = 0;
            switch(salutation)
            {
                case "Mr": index = 0; break;
                case "Ms": index = 1; break;
                case "Mrs": index = 2; break;
            }
            fname = rs.getString(2);
            lname = rs.getString(3);
            cno = rs.getLong(4);
            email = rs.getString(5);
            oldpassmd5 = rs.getString(6);
            
            //Display data
            salutationcb.setSelectedIndex(index);
            fnametext.setText(fname);
            lnametext.setText(lname);
            contacttext.setText("" + cno);
            emailtext.setText(email);
                        
        } catch (SQLException ex) {
            Logger.getLogger(EditUser.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
    
    public String MD5(String password) throws NoSuchAlgorithmException{
        MessageDigest md5 = MessageDigest.getInstance("MD5");
        md5.update(StandardCharsets.UTF_8.encode(password));
        return String.format("%032x", new BigInteger(1, md5.digest()));
    }
    
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        sidepanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        headerpanel = new javax.swing.JPanel();
        greetinglabel = new javax.swing.JLabel();
        mainpanel = new javax.swing.JPanel();
        lnamelabel = new javax.swing.JLabel();
        emailtext = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        emaillabel = new javax.swing.JLabel();
        salutationlabel = new javax.swing.JLabel();
        lnametext = new javax.swing.JTextField();
        fnametext = new javax.swing.JTextField();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        contactlabel = new javax.swing.JLabel();
        oldpasswordlabel = new javax.swing.JLabel();
        contacttext = new javax.swing.JTextField();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        oldpasswordfield = new javax.swing.JPasswordField();
        backbutton = new javax.swing.JButton();
        savebutton = new javax.swing.JButton();
        fnamelabel = new javax.swing.JLabel();
        salutationcb = new javax.swing.JComboBox();
        lnameerror = new javax.swing.JLabel();
        contacterror = new javax.swing.JLabel();
        fnameerror = new javax.swing.JLabel();
        oldpassworderror = new javax.swing.JLabel();
        emailerror = new javax.swing.JLabel();
        errorlabel = new javax.swing.JLabel();
        newpasswordlabel = new javax.swing.JLabel();
        newpasswordfield = new javax.swing.JPasswordField();
        jSeparator6 = new javax.swing.JSeparator();
        newpassworderror = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidepanel.setBackground(new java.awt.Color(36, 47, 65));
        sidepanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Have Heart One", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("The Wanderer's Nest");
        sidepanel.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 400, 140, 40));

        getContentPane().add(sidepanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 450));

        headerpanel.setBackground(new java.awt.Color(97, 212, 195));
        headerpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        greetinglabel.setFont(new java.awt.Font("Have Heart One", 0, 36)); // NOI18N
        greetinglabel.setForeground(new java.awt.Color(255, 255, 255));
        greetinglabel.setText("Edit your details");
        headerpanel.add(greetinglabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 300, 40));

        getContentPane().add(headerpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 640, 60));

        mainpanel.setBackground(new java.awt.Color(255, 255, 255));
        mainpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lnamelabel.setFont(new java.awt.Font("HelveticaNeue", 0, 14)); // NOI18N
        lnamelabel.setText("Last Name");
        lnamelabel.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        mainpanel.add(lnamelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 110, 120, 30));

        emailtext.setFont(new java.awt.Font("HelveticaNeue", 0, 14)); // NOI18N
        emailtext.setText("Enter your email address");
        emailtext.setBorder(null);
        emailtext.setEnabled(false);
        emailtext.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                emailtextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                emailtextFocusLost(evt);
            }
        });
        emailtext.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                emailtextInputMethodTextChanged(evt);
            }
        });
        emailtext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailtextActionPerformed(evt);
            }
        });
        mainpanel.add(emailtext, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 190, 300, 30));
        mainpanel.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 140, 300, 10));

        emaillabel.setFont(new java.awt.Font("HelveticaNeue", 0, 14)); // NOI18N
        emaillabel.setText("Email-id");
        emaillabel.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        mainpanel.add(emaillabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 190, 120, 30));

        salutationlabel.setFont(new java.awt.Font("HelveticaNeue", 0, 14)); // NOI18N
        salutationlabel.setText("Salutation");
        salutationlabel.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        mainpanel.add(salutationlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 30, 120, 30));

        lnametext.setFont(new java.awt.Font("HelveticaNeue", 0, 14)); // NOI18N
        lnametext.setText("Enter your last name");
        lnametext.setBorder(null);
        lnametext.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                lnametextFocusGained(evt);
            }
        });
        lnametext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lnametextActionPerformed(evt);
            }
        });
        mainpanel.add(lnametext, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 300, 30));

        fnametext.setFont(new java.awt.Font("HelveticaNeue", 0, 14)); // NOI18N
        fnametext.setText("Enter your first name");
        fnametext.setBorder(null);
        fnametext.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fnametextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fnametextFocusLost(evt);
            }
        });
        fnametext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnametextActionPerformed(evt);
            }
        });
        mainpanel.add(fnametext, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 300, 30));
        mainpanel.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 220, 300, 10));
        mainpanel.add(jSeparator3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 100, 300, 10));

        contactlabel.setFont(new java.awt.Font("HelveticaNeue", 0, 14)); // NOI18N
        contactlabel.setText("Contact Number");
        contactlabel.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        mainpanel.add(contactlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 150, 120, 30));

        oldpasswordlabel.setFont(new java.awt.Font("HelveticaNeue", 0, 14)); // NOI18N
        oldpasswordlabel.setText("Old Password");
        oldpasswordlabel.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        mainpanel.add(oldpasswordlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 120, 30));

        contacttext.setFont(new java.awt.Font("HelveticaNeue", 0, 14)); // NOI18N
        contacttext.setText("Enter your contact number");
        contacttext.setBorder(null);
        contacttext.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                contacttextFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                contacttextFocusLost(evt);
            }
        });
        contacttext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                contacttextActionPerformed(evt);
            }
        });
        mainpanel.add(contacttext, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 150, 300, 30));
        mainpanel.add(jSeparator4, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 260, 300, 10));
        mainpanel.add(jSeparator5, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 300, 10));

        oldpasswordfield.setBorder(null);
        oldpasswordfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                oldpasswordfieldFocusGained(evt);
            }
        });
        mainpanel.add(oldpasswordfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 300, 30));

        backbutton.setFont(new java.awt.Font("HelveticaNeue", 0, 14)); // NOI18N
        backbutton.setText("No change? Click to see rooms!");
        backbutton.setContentAreaFilled(false);
        backbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbuttonActionPerformed(evt);
            }
        });
        mainpanel.add(backbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 340, -1, 20));

        savebutton.setFont(new java.awt.Font("HelveticaNeue", 0, 14)); // NOI18N
        savebutton.setText("Save");
        savebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebuttonActionPerformed(evt);
            }
        });
        mainpanel.add(savebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 330, 130, 40));

        fnamelabel.setFont(new java.awt.Font("HelveticaNeue", 0, 14)); // NOI18N
        fnamelabel.setText("First Name");
        fnamelabel.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        mainpanel.add(fnamelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 70, 120, 30));

        salutationcb.setFont(new java.awt.Font("HelveticaNeue", 0, 14)); // NOI18N
        salutationcb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mr", "Ms", "Mrs" }));
        mainpanel.add(salutationcb, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 30, 70, 30));

        lnameerror.setFont(new java.awt.Font("HelveticaNeue", 0, 14)); // NOI18N
        lnameerror.setForeground(new java.awt.Color(255, 51, 51));
        lnameerror.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainpanel.add(lnameerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 110, 40, 30));

        contacterror.setFont(new java.awt.Font("HelveticaNeue", 0, 14)); // NOI18N
        contacterror.setForeground(new java.awt.Color(255, 51, 51));
        contacterror.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainpanel.add(contacterror, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 150, 40, 30));

        fnameerror.setFont(new java.awt.Font("HelveticaNeue", 0, 14)); // NOI18N
        fnameerror.setForeground(new java.awt.Color(255, 51, 51));
        fnameerror.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainpanel.add(fnameerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 70, 40, 30));

        oldpassworderror.setFont(new java.awt.Font("HelveticaNeue", 0, 14)); // NOI18N
        oldpassworderror.setForeground(new java.awt.Color(255, 51, 51));
        oldpassworderror.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainpanel.add(oldpassworderror, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 230, 40, 30));

        emailerror.setFont(new java.awt.Font("HelveticaNeue", 0, 14)); // NOI18N
        emailerror.setForeground(new java.awt.Color(255, 51, 51));
        emailerror.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainpanel.add(emailerror, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 190, 40, 30));

        errorlabel.setFont(new java.awt.Font("HelveticaNeue", 0, 14)); // NOI18N
        errorlabel.setForeground(new java.awt.Color(255, 51, 51));
        errorlabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        mainpanel.add(errorlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 300, 30));

        newpasswordlabel.setFont(new java.awt.Font("HelveticaNeue", 0, 14)); // NOI18N
        newpasswordlabel.setText("New Password");
        newpasswordlabel.setBorder(javax.swing.BorderFactory.createCompoundBorder());
        mainpanel.add(newpasswordlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 270, 120, 30));

        newpasswordfield.setBorder(null);
        newpasswordfield.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                newpasswordfieldFocusGained(evt);
            }
        });
        mainpanel.add(newpasswordfield, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 270, 300, 30));
        mainpanel.add(jSeparator6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 300, 300, 10));

        newpassworderror.setFont(new java.awt.Font("HelveticaNeue", 0, 14)); // NOI18N
        newpassworderror.setForeground(new java.awt.Color(255, 51, 51));
        newpassworderror.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        mainpanel.add(newpassworderror, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 270, 40, 30));

        getContentPane().add(mainpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 640, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void emailtextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailtextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailtextActionPerformed

    private void lnametextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lnametextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lnametextActionPerformed

    private void fnametextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnametextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnametextActionPerformed

    private void contacttextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_contacttextActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_contacttextActionPerformed

    private void fnametextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fnametextFocusGained
        // TODO add your handling code here:
        if(fnametext.getText().equals("Enter your first name"))
            fnametext.setText("");
    }//GEN-LAST:event_fnametextFocusGained

    private void lnametextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_lnametextFocusGained
        // TODO add your handling code here:
        if(lnametext.getText().equals("Enter your last name"))
            lnametext.setText("");
    }//GEN-LAST:event_lnametextFocusGained

    private void contacttextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contacttextFocusGained
        // TODO add your handling code here:
        if(contacttext.getText().equals("Enter your contact number"))
            contacttext.setText("");
    }//GEN-LAST:event_contacttextFocusGained

    private void emailtextFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailtextFocusGained
        // TODO add your handling code here:
        if(emailtext.getText().equals("Enter your email address"))
            emailtext.setText("");
    }//GEN-LAST:event_emailtextFocusGained

    private void oldpasswordfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_oldpasswordfieldFocusGained
        // TODO add your handling code here:
        oldpasswordfield.setText("");
    }//GEN-LAST:event_oldpasswordfieldFocusGained

    private void fnametextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fnametextFocusLost
        // TODO add your handling code here:
        if(fnametext.getText().equals(""))
            fnametext.setText("Enter your first name");
        else
        {
            String firstname = fnametext.getText();
            int i = 0, flag = 0;
            char[] fn = new char[10];
            fn = firstname.toCharArray();
            while(i != '\0')
            {
                if((fn[i] >= 'a' && fn[i] <= 'z') || (fn[i] >= 'A' && fn[i] <= 'Z'))
                    i++;
                else
                {
                    flag = 1;
                    i++;
                }
            }
            if(flag == 0)
                fnameerror.setText("");
            else
                fnameerror.setText("X");
        }
    }//GEN-LAST:event_fnametextFocusLost

    private void emailtextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_emailtextFocusLost
        // TODO add your handling code here:
        if(emailtext.getText().equals(""))
            emailtext.setText("Enter your email address");
        else
        {
            
        }
    }//GEN-LAST:event_emailtextFocusLost

    private void lnametextFocusLost(java.awt.event.FocusEvent evt) {                                    
        // TODO add your handling code here:
        if(lnametext.getText().equals(""))
            lnametext.setText("Enter your last name");
        else
        {
            String lastname = lnametext.getText();
            int i = 0, flag = 0;
            char[] ln = new char[10];
            ln = lastname.toCharArray();
            while(i != '\0')
            {
                if((ln[i] >= 'a' && ln[i] <= 'z') || (ln[i] >= 'A' && ln[i] <= 'Z'))
                    i++;
                else
                {
                    flag = 1;
                    i++;
                }
            }
            if(flag == 0)
                lnameerror.setText("");
            else
                lnameerror.setText("X");
        }
    }     
    
    private void contacttextFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_contacttextFocusLost
        // TODO add your handling code here:
        if(contacttext.getText().equals(""))
            contacttext.setText("Enter contact number");
        else if(contacttext.getText().length() != 10)
            contacterror.setText("X");
        else
        {
            String contact = contacttext.getText();
            int i = 0, flag = 0;
            char[] cno = new char[10];
            cno = contact.toCharArray();
            while(i != 10)
            {
                if(cno[i] >= '0' && cno[i] <= '9')
                    i++;
                else
                {
                    flag = 1;
                    i++;
                }
            }
            if(flag == 0)
                contacterror.setText("");
            else
                contacterror.setText("X");
        }
    }//GEN-LAST:event_contacttextFocusLost

    private void emailtextInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_emailtextInputMethodTextChanged
        // TODO add your handling code here:
        
    }//GEN-LAST:event_emailtextInputMethodTextChanged

    private void savebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebuttonActionPerformed
        // TODO add your handling code here:
        
        if("Enter your first name".equals(fnametext.getText()))
            fnameerror.setText("X");
        if("Enter your last name".equals(lnametext.getText()))
            lnameerror.setText("X");
        if("Enter your contact number".equals(contacttext.getText()))
            contacterror.setText("X");
        if("Enter your email address".equals(emailtext.getText()))
            emailerror.setText("X");
        //if("".equals(String.valueOf(oldpasswordfield.getPassword())))
            //oldpassworderror.setText("X");
        
      
        //To get password
        String opass = String.valueOf(oldpasswordfield.getPassword());
        String npass = String.valueOf(newpasswordfield.getPassword());
        String opassmd5 = null, npassmd5 = null;
            
        if(opass == "" || npass == "") 
            errorlabel.setText("Enter password");
        else
        { 
            //To convert to md5
            try {
                opassmd5 = MD5(opass);
                npassmd5 = MD5(npass);
                System.out.println(opassmd5);
                System.out.println(npassmd5);
            } catch (NoSuchAlgorithmException ex) {
                Logger.getLogger(EditUser.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        
        //To check old password with the one from database
        if(!oldpassmd5.equals(opassmd5))
            errorlabel.setText("X");

        if(!"".equals(fnameerror.getText()) || !"".equals(lnameerror.getText()) || !"".equals(contacterror.getText()) || !"".equals(emailerror.getText()) || !"".equals(oldpassworderror) || !"".equals(errorlabel.getText()))
            errorlabel.setText("Please check your input(s)");           
        else
        {
            errorlabel.setText("");
            //To get salutation
            int sal = salutationcb.getSelectedIndex();
            String salutation = null;
            switch(sal)
            {
                case 0: salutation = "Mr"; break;
                case 1: salutation = "Ms"; break;
                case 2: salutation = "Mrs"; break;
            }
        
            //To get first name and last name and contact no
            fname = fnametext.getText();
            lname = lnametext.getText();
            String contact = contacttext.getText();
            cno = Long.parseLong(contact);
        
            System.out.println(fname);
            System.out.println(lname);
            System.out.println("" + cno);
            
            
            //To update into database
            PreparedStatement ps;
            String updatequery = "UPDATE users SET Salutation=?, Firstname=?, Lastname=?, Contactno=?,Password=? WHERE Emailid =?";
            System.out.println("uu");
            try{
                ps = MyConnection.getConnection().prepareStatement(updatequery);
               
                ps.setString(1, salutation);
                ps.setString(2, fname);
                ps.setString(3, lname);
                ps.setLong(4, cno);
                ps.setString(5, npassmd5);
                ps.setString(6, email);
                
                System.out.println("hi");
                if(ps.executeUpdate() > 0)
                {
                    JOptionPane.showMessageDialog(null, "Successfully updated");
                    new Search(email).setVisible(true);
                    this.dispose();
                }
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, ex);
                Logger.getLogger(EditUser.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        //new Terms().setVisible(true);
        //this.dispose();
    }//GEN-LAST:event_savebuttonActionPerformed

    private void backbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbuttonActionPerformed
        // TODO add your handling code here:
        new Search(email).setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_backbuttonActionPerformed

    private void newpasswordfieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_newpasswordfieldFocusGained
        // TODO add your handling code here:
    }//GEN-LAST:event_newpasswordfieldFocusGained

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
            java.util.logging.Logger.getLogger(EditUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backbutton;
    private javax.swing.JLabel contacterror;
    private javax.swing.JLabel contactlabel;
    private javax.swing.JTextField contacttext;
    private javax.swing.JLabel emailerror;
    private javax.swing.JLabel emaillabel;
    private javax.swing.JTextField emailtext;
    private javax.swing.JLabel errorlabel;
    private javax.swing.JLabel fnameerror;
    private javax.swing.JLabel fnamelabel;
    private javax.swing.JTextField fnametext;
    private javax.swing.JLabel greetinglabel;
    private javax.swing.JPanel headerpanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JLabel lnameerror;
    private javax.swing.JLabel lnamelabel;
    private javax.swing.JTextField lnametext;
    private javax.swing.JPanel mainpanel;
    private javax.swing.JLabel newpassworderror;
    private javax.swing.JPasswordField newpasswordfield;
    private javax.swing.JLabel newpasswordlabel;
    private javax.swing.JLabel oldpassworderror;
    private javax.swing.JPasswordField oldpasswordfield;
    private javax.swing.JLabel oldpasswordlabel;
    private javax.swing.JComboBox salutationcb;
    private javax.swing.JLabel salutationlabel;
    private javax.swing.JButton savebutton;
    private javax.swing.JPanel sidepanel;
    // End of variables declaration//GEN-END:variables
}
