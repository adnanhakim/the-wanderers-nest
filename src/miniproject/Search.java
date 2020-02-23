/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniproject;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 *
 * @author lenovo
 */
public class Search extends javax.swing.JFrame {

    /**
     * Creates new form Search
     */
    
    String checkin, checkout, destin, emailid;
    public Search(String emailid)
    {
        initComponents();
        this.emailid = emailid;
    }
    public Search(String checkin, String checkout, String destin){
        initComponents();
        this.checkin = checkin;
        this.checkout = checkout;
        this.destin = destin;
        //CiDatecb.setSelectedIndex(Integer.parseInt(checkin.substring(0, 2)));
        //CiMonthcb.setSelectedIndex(Integer.parseInt(checkin.substring(3, 5)));
        //CiYearcb.setSelectedIndex(Integer.parseInt(checkin.substring(6, 10)));
        //CoDatecb.setSelectedIndex(Integer.parseInt(checkout.substring(0, 2)));
        //CoMonthcb.setSelectedIndex(Integer.parseInt(checkout.substring(3, 5)));
        //CoYearcb.setSelectedIndex(Integer.parseInt(checkout.substring(6, 10)));
    }
    
    public Search() {
        initComponents();
    }
    
    long daysBetween;
    String destination, cindate, coutdate, checkindate, checkoutdate;
    
    public String dateFormat(int month)
    {
        String monthname = null;
        switch(month)
        {
            case 1: monthname = "Jan "; break;
            case 2: monthname = "Feb "; break;
            case 3: monthname = "Mar "; break;
            case 4: monthname = "Apr "; break;
            case 5: monthname = "May "; break;
            case 6: monthname = "Jun "; break;
            case 7: monthname = "Jul "; break;
            case 8: monthname = "Aug "; break;
            case 9: monthname = "Sep "; break;
            case 10: monthname = "Oct "; break;
            case 11: monthname = "Nov "; break;
            case 12: monthname = "Dec "; break;
        }
        return monthname;
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
        buttonGroup1 = new javax.swing.ButtonGroup();
        jFileChooser1 = new javax.swing.JFileChooser();
        sidepanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        destinationcb = new javax.swing.JComboBox();
        CoDatecb = new javax.swing.JComboBox();
        CoYearcb = new javax.swing.JComboBox();
        CoMonthcb = new javax.swing.JComboBox();
        CiDatecb = new javax.swing.JComboBox();
        CiMonthcb = new javax.swing.JComboBox();
        CiYearcb = new javax.swing.JComboBox();
        CiDatelabel = new javax.swing.JLabel();
        SelectRoomLabel = new javax.swing.JLabel();
        GreetingLabel = new javax.swing.JLabel();
        Errorlabel = new javax.swing.JLabel();
        SearchButton = new javax.swing.JButton();
        Editbutton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 520, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 450, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidepanel.setBackground(new java.awt.Color(36, 47, 65));
        sidepanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("HelveticaNeue", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Check-out Date");
        sidepanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 210, 30));

        destinationcb.setFont(new java.awt.Font("HelveticaNeue", 0, 14)); // NOI18N
        destinationcb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Mumbai", "Dubai", "London" }));
        destinationcb.setBorder(null);
        sidepanel.add(destinationcb, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 210, 30));

        CoDatecb.setFont(new java.awt.Font("HelveticaNeue", 0, 14)); // NOI18N
        CoDatecb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        sidepanel.add(CoDatecb, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 270, -1, 30));

        CoYearcb.setFont(new java.awt.Font("HelveticaNeue", 0, 14)); // NOI18N
        CoYearcb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2018", "2019" }));
        sidepanel.add(CoYearcb, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 270, -1, 30));

        CoMonthcb.setFont(new java.awt.Font("HelveticaNeue", 0, 14)); // NOI18N
        CoMonthcb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        sidepanel.add(CoMonthcb, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, -1, 30));

        CiDatecb.setFont(new java.awt.Font("HelveticaNeue", 0, 14)); // NOI18N
        CiDatecb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        sidepanel.add(CiDatecb, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, -1, 30));

        CiMonthcb.setFont(new java.awt.Font("HelveticaNeue", 0, 14)); // NOI18N
        CiMonthcb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));
        sidepanel.add(CiMonthcb, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 190, -1, 30));

        CiYearcb.setFont(new java.awt.Font("HelveticaNeue", 0, 14)); // NOI18N
        CiYearcb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "2018", "2019" }));
        sidepanel.add(CiYearcb, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 190, -1, 30));

        CiDatelabel.setFont(new java.awt.Font("HelveticaNeue", 0, 16)); // NOI18N
        CiDatelabel.setForeground(new java.awt.Color(204, 204, 204));
        CiDatelabel.setText("Check-in Date");
        sidepanel.add(CiDatelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 210, 30));

        SelectRoomLabel.setFont(new java.awt.Font("HelveticaNeue", 0, 16)); // NOI18N
        SelectRoomLabel.setForeground(new java.awt.Color(204, 204, 204));
        SelectRoomLabel.setText("Select your destination");
        sidepanel.add(SelectRoomLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 80, 210, 30));

        GreetingLabel.setFont(new java.awt.Font("Have Heart One", 0, 36)); // NOI18N
        GreetingLabel.setForeground(new java.awt.Color(204, 204, 204));
        GreetingLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        GreetingLabel.setText("Plan your stay");
        sidepanel.add(GreetingLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 20, 210, 50));

        Errorlabel.setFont(new java.awt.Font("HelveticaNeue", 0, 14)); // NOI18N
        Errorlabel.setForeground(new java.awt.Color(255, 51, 51));
        Errorlabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Errorlabel.setToolTipText("");
        sidepanel.add(Errorlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 310, 210, 20));

        SearchButton.setFont(new java.awt.Font("HelveticaNeue", 0, 14)); // NOI18N
        SearchButton.setText("Search");
        SearchButton.setBorder(null);
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });
        sidepanel.add(SearchButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 110, 30));

        Editbutton.setFont(new java.awt.Font("HelveticaNeue", 0, 14)); // NOI18N
        Editbutton.setForeground(new java.awt.Color(255, 255, 255));
        Editbutton.setText("Edit your details");
        Editbutton.setBorder(null);
        Editbutton.setContentAreaFilled(false);
        Editbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditbuttonActionPerformed(evt);
            }
        });
        sidepanel.add(Editbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 120, 30));

        getContentPane().add(sidepanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(500, 20, 270, 400));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/miniproject/hotelsearch.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-6, 0, 810, 450));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchButtonActionPerformed
        // TODO add your handling code here:
        
        //To get destination
        int index = destinationcb.getSelectedIndex();
        if(index == 0)
            destination = "Mumbai";
        else if(index == 1)
            destination = "Dubai";
        else if(index == 2)
            destination = "London";
        
        //To get dates from combo boxes
        int cidate = CiDatecb.getSelectedIndex()+1;
        int cimonth = CiMonthcb.getSelectedIndex()+1;
        int ciyear = CiYearcb.getSelectedIndex()+2018;
        int codate = CoDatecb.getSelectedIndex()+1;
        int comonth = CoMonthcb.getSelectedIndex()+1;
        int coyear = CoYearcb.getSelectedIndex()+2018;
        
        //To get date format eg Oct 28, 2018
        String cimonthname = dateFormat(cimonth);
        if(cidate <= 9)
            checkindate = cimonthname + "0" + cidate + ", " + ciyear;
        else
            checkindate = cimonthname + cidate + ", " + ciyear;
        String comonthname = dateFormat(comonth);
        if(codate <= 9)
            checkoutdate = comonthname + "0" +codate + ", " + coyear;
        else
            checkoutdate = comonthname + codate + ", " + coyear;

        //To get system date
        Date date = new Date();
        DateFormat dfd = new SimpleDateFormat("dd");
        DateFormat dfh = new SimpleDateFormat("MM");
        DateFormat dfy = new SimpleDateFormat("yyyy");
        String sysd = dfd.format(date);
        String sysm = dfh.format(date);
        String sysy = dfy.format(date);
        //To convert to string to integer
        int sysdate = Integer.parseInt(sysd);
        int sysmonth = Integer.parseInt(sysm);
        int sysyear = Integer.parseInt(sysy);
        
        //To convert date string into yyyy-MM-dd (eg 1st january 2019 to 2019-01-01) for LocalDate
        //To convert check in date
        if(cidate <= 9 && cimonth <= 9)
            cindate = ""+ciyear+"-0"+cimonth+"-0"+cidate;
        else if(cimonth <= 9)
            cindate = ""+ciyear+"-0"+cimonth+"-"+cidate;
        else if(cidate <= 9)
            cindate = ""+ciyear+"-"+cimonth+"-0"+cidate;
        else
            cindate = ""+ciyear+"-"+cimonth+"-"+cidate;
        
        //To convert check out date        
        if(codate <= 9 && comonth <= 9)
            coutdate = ""+coyear+"-0"+comonth+"-0"+codate;
        else if(comonth <= 9)
            coutdate = ""+coyear+"-0"+comonth+"-"+codate;
        else if(codate <= 9)
            coutdate = ""+coyear+"-"+comonth+"-0"+codate;
        else
            coutdate = ""+coyear+"-"+comonth+"-"+codate; 
        
        //To check if system date exceeds check in date 
        if((sysyear>ciyear) || (sysmonth>cimonth && sysyear==ciyear) || (sysdate>cidate && sysmonth==cimonth && sysyear>ciyear))
            Errorlabel.setText("Invalid dates");
        
        //To check if check in date exceeds check out date
        else if((ciyear>coyear) || (cimonth>comonth && cimonth==comonth) || (cidate>=codate && cimonth==comonth && ciyear>coyear))
            Errorlabel.setText("Please check your dates");
        
        //To check if period exceeds 30 days
        else
        {
            //This can only be done if check in date < check out date
            LocalDate dateBefore = LocalDate.parse(cindate);
            LocalDate dateAfter = LocalDate.parse(coutdate);
            daysBetween = ChronoUnit.DAYS.between(dateBefore, dateAfter);
            if(daysBetween > 30)
                Errorlabel.setText("Selected period more than 30 days");
            
            //If everything is fine
            else
            {
                Errorlabel.setText("");
                new RoomSelection(destination,daysBetween,checkindate,checkoutdate).setVisible(true);
                this.dispose();
            }            
        }
        
    }//GEN-LAST:event_SearchButtonActionPerformed

    private void EditbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditbuttonActionPerformed
        // TODO add your handling code here:
        new EditUser(emailid).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_EditbuttonActionPerformed
    
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
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Search.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Search().setVisible(true);
                
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox CiDatecb;
    private javax.swing.JLabel CiDatelabel;
    private javax.swing.JComboBox CiMonthcb;
    private javax.swing.JComboBox CiYearcb;
    private javax.swing.JComboBox CoDatecb;
    private javax.swing.JComboBox CoMonthcb;
    private javax.swing.JComboBox CoYearcb;
    private javax.swing.JButton Editbutton;
    private javax.swing.JLabel Errorlabel;
    private javax.swing.JLabel GreetingLabel;
    private javax.swing.JButton SearchButton;
    private javax.swing.JLabel SelectRoomLabel;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox destinationcb;
    private javax.swing.JFileChooser jFileChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel sidepanel;
    // End of variables declaration//GEN-END:variables
}
