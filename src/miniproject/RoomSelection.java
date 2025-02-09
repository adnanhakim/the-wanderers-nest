/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniproject;

/**
 *
 * @author lenovo
 */
public class RoomSelection extends javax.swing.JFrame {

    /**
     * Creates new form RoomSelection
     */
    public RoomSelection() {
        initComponents();
        destinationlabel.setText(destination);
    }
    
    String destination, checkin, checkout;
    long days;
    int totalprice;
    public RoomSelection(String destination, long days, String checkin, String checkout) {
        initComponents();
        this.destination = destination;
        this.days = days;
        this.checkin = checkin;
        this.checkout = checkout;
        header2label.setText(destination);
        checkinlabel.setText(checkin);
        checkoutlabel.setText(checkout);
        destinationlabel.setText(destination);
        Teaflabel.setVisible(false);
        Teafprice.setVisible(false);
        Tetlabel.setVisible(false);
        Tetpricelabel.setVisible(false);
        Troomlabel.setVisible(false);
        Troompricelabel.setVisible(false);
        Tsubtotallabel.setVisible(false);
        Tsubtotalprice.setVisible(false);
        Ttotallabel.setVisible(false);
        Ttotalpricelabel.setVisible(false);
        alertstextarea.setVisible(false);
        avgpricelabel.setVisible(false);
        hotelalertslabel.setVisible(false);
        imagelabel.setVisible(false);
        searchbutton.setVisible(false);
        pernightlabel.setVisible(false);
        roomcostslabel.setVisible(false);
        roomtypelabel.setVisible(false);
        jScrollPane1.setVisible(false);
        separator.setVisible(false);
        paymentbutton.setVisible(false);
    }
    
    void hideEverything()
    {
        Teaflabel.setVisible(false);
        Teafprice.setVisible(false);
        Tetlabel.setVisible(false);
        Tetpricelabel.setVisible(false);
        Troomlabel.setVisible(false);
        Troompricelabel.setVisible(false);
        Tsubtotallabel.setVisible(false);
        Tsubtotalprice.setVisible(false);
        Ttotallabel.setVisible(false);
        Ttotalpricelabel.setVisible(false);
        alertstextarea.setVisible(false);
        avgpricelabel.setVisible(false);
        hotelalertslabel.setVisible(false);
        imagelabel.setVisible(false);
        searchbutton.setVisible(false);
        pernightlabel.setVisible(false);
        roomcostslabel.setVisible(false);
        roomtypelabel.setVisible(false);
        jScrollPane1.setVisible(false);
        separator.setVisible(false);
        paymentbutton.setVisible(false);
    }
           
    void showEverything()
    {
        Teaflabel.setVisible(true);
        Teafprice.setVisible(true);
        Tetlabel.setVisible(true);
        Tetpricelabel.setVisible(true);
        Troomlabel.setVisible(true);
        Troompricelabel.setVisible(true);
        Tsubtotallabel.setVisible(true);
        Tsubtotalprice.setVisible(true);
        Ttotallabel.setVisible(true);
        Ttotalpricelabel.setVisible(true);
        alertstextarea.setVisible(true);
        avgpricelabel.setVisible(true);
        hotelalertslabel.setVisible(true);
        imagelabel.setVisible(true);
        searchbutton.setVisible(true);
        pernightlabel.setVisible(true);
        roomcostslabel.setVisible(true);
        roomtypelabel.setVisible(true);
        jScrollPane1.setVisible(true);
        separator.setVisible(true);
        paymentbutton.setVisible(true);

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
        checkinlabel = new javax.swing.JLabel();
        yoursearchlabel = new javax.swing.JLabel();
        checkoutlabel = new javax.swing.JLabel();
        destinationlabel = new javax.swing.JLabel();
        headerlabel1 = new javax.swing.JLabel();
        headerpanel = new javax.swing.JPanel();
        header2label = new javax.swing.JLabel();
        header2label1 = new javax.swing.JLabel();
        mainpanel = new javax.swing.JPanel();
        roomtypecb = new javax.swing.JComboBox();
        selectroomlabel = new javax.swing.JLabel();
        separator = new javax.swing.JSeparator();
        imagelabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        alertstextarea = new javax.swing.JTextArea();
        roomcostslabel = new javax.swing.JLabel();
        roomselectionbutton = new javax.swing.JButton();
        Tsubtotalprice = new javax.swing.JLabel();
        Tetlabel = new javax.swing.JLabel();
        Tetpricelabel = new javax.swing.JLabel();
        Teaflabel = new javax.swing.JLabel();
        Teafprice = new javax.swing.JLabel();
        Ttotallabel = new javax.swing.JLabel();
        Ttotalpricelabel = new javax.swing.JLabel();
        Troomlabel = new javax.swing.JLabel();
        Troompricelabel = new javax.swing.JLabel();
        Tsubtotallabel = new javax.swing.JLabel();
        roomtypelabel = new javax.swing.JLabel();
        hotelalertslabel = new javax.swing.JLabel();
        pernightlabel = new javax.swing.JLabel();
        avgpricelabel = new javax.swing.JLabel();
        searchbutton = new javax.swing.JButton();
        paymentbutton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        sidepanel.setBackground(new java.awt.Color(36, 47, 65));
        sidepanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        checkinlabel.setFont(new java.awt.Font("HelveticaNeue", 0, 16)); // NOI18N
        checkinlabel.setForeground(new java.awt.Color(204, 204, 204));
        checkinlabel.setText("Check in date");
        sidepanel.add(checkinlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 140, 140, 30));

        yoursearchlabel.setFont(new java.awt.Font("HelveticaNeue", 0, 16)); // NOI18N
        yoursearchlabel.setForeground(new java.awt.Color(204, 204, 204));
        yoursearchlabel.setText("Your Search:");
        sidepanel.add(yoursearchlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 140, 30));

        checkoutlabel.setFont(new java.awt.Font("HelveticaNeue", 0, 16)); // NOI18N
        checkoutlabel.setForeground(new java.awt.Color(204, 204, 204));
        checkoutlabel.setText("Check out date");
        sidepanel.add(checkoutlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, 140, 30));

        destinationlabel.setFont(new java.awt.Font("HelveticaNeue", 0, 16)); // NOI18N
        destinationlabel.setForeground(new java.awt.Color(204, 204, 204));
        destinationlabel.setText("Destination");
        sidepanel.add(destinationlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 140, 30));

        headerlabel1.setFont(new java.awt.Font("Have Heart One", 0, 24)); // NOI18N
        headerlabel1.setForeground(new java.awt.Color(204, 204, 204));
        headerlabel1.setText("The Wanderer's Nest");
        sidepanel.add(headerlabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 380, 140, 60));

        getContentPane().add(sidepanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 160, 450));

        headerpanel.setBackground(new java.awt.Color(97, 212, 195));
        headerpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        header2label.setFont(new java.awt.Font("Have Heart One", 0, 30)); // NOI18N
        header2label.setForeground(new java.awt.Color(255, 255, 255));
        header2label.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        header2label.setText("Destination");
        headerpanel.add(header2label, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 0, 180, 60));

        header2label1.setFont(new java.awt.Font("Have Heart One", 0, 36)); // NOI18N
        header2label1.setForeground(new java.awt.Color(255, 255, 255));
        header2label1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        header2label1.setText("Review your reservation");
        headerpanel.add(header2label1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, 250, 60));

        getContentPane().add(headerpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 0, 640, 60));

        mainpanel.setBackground(new java.awt.Color(255, 255, 255));
        mainpanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        roomtypecb.setFont(new java.awt.Font("HelveticaNeue", 0, 14)); // NOI18N
        roomtypecb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Single Room", "Double Room", "Deluxe Room", "Luxury Room" }));
        mainpanel.add(roomtypecb, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 10, 200, 30));

        selectroomlabel.setFont(new java.awt.Font("HelveticaNeue", 0, 14)); // NOI18N
        selectroomlabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        selectroomlabel.setText("Please select your room:");
        mainpanel.add(selectroomlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 180, 30));
        mainpanel.add(separator, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 100, 580, 20));

        imagelabel.setText("Image");
        mainpanel.add(imagelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, 80, 70));

        alertstextarea.setColumns(20);
        alertstextarea.setFont(new java.awt.Font("HelveticaNeue", 0, 14)); // NOI18N
        alertstextarea.setRows(5);
        alertstextarea.setText("All children under 12 stay free in existing\nbedding. Extra beds are charged per person. \nThis additional charge will be added to the \nroom rate at hotel. For prepaid bookings\nthe credit/debit card used must be presented");
        alertstextarea.setEnabled(false);
        jScrollPane1.setViewportView(alertstextarea);

        mainpanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 220, 300, 110));

        roomcostslabel.setFont(new java.awt.Font("HelveticaNeue", 1, 16)); // NOI18N
        roomcostslabel.setText("Room Costs");
        roomcostslabel.setToolTipText("");
        mainpanel.add(roomcostslabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 120, 160, 30));

        roomselectionbutton.setFont(new java.awt.Font("HelveticaNeue", 0, 14)); // NOI18N
        roomselectionbutton.setText("Select");
        roomselectionbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                roomselectionbuttonActionPerformed(evt);
            }
        });
        mainpanel.add(roomselectionbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 10, 80, 30));

        Tsubtotalprice.setFont(new java.awt.Font("HelveticaNeue", 0, 12)); // NOI18N
        Tsubtotalprice.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Tsubtotalprice.setText("Subtotal price");
        mainpanel.add(Tsubtotalprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 180, 100, 30));

        Tetlabel.setFont(new java.awt.Font("HelveticaNeue", 0, 12)); // NOI18N
        Tetlabel.setText("Estimated Taxes");
        mainpanel.add(Tetlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 210, 140, 30));

        Tetpricelabel.setFont(new java.awt.Font("HelveticaNeue", 0, 12)); // NOI18N
        Tetpricelabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Tetpricelabel.setText("ET Price");
        mainpanel.add(Tetpricelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 210, 100, 30));

        Teaflabel.setFont(new java.awt.Font("HelveticaNeue", 0, 12)); // NOI18N
        Teaflabel.setText("Estimated Additional Fees");
        mainpanel.add(Teaflabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 240, 140, 30));

        Teafprice.setFont(new java.awt.Font("HelveticaNeue", 0, 12)); // NOI18N
        Teafprice.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Teafprice.setText("EAF Price");
        mainpanel.add(Teafprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 240, 100, 30));

        Ttotallabel.setFont(new java.awt.Font("HelveticaNeue", 1, 14)); // NOI18N
        Ttotallabel.setText("Total");
        mainpanel.add(Ttotallabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 290, 140, 40));

        Ttotalpricelabel.setFont(new java.awt.Font("HelveticaNeue", 1, 14)); // NOI18N
        Ttotalpricelabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Ttotalpricelabel.setText("TotalPrice");
        mainpanel.add(Ttotalpricelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 290, 100, 40));

        Troomlabel.setFont(new java.awt.Font("HelveticaNeue", 0, 12)); // NOI18N
        Troomlabel.setText("Room");
        mainpanel.add(Troomlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 150, 140, 30));

        Troompricelabel.setFont(new java.awt.Font("HelveticaNeue", 0, 12)); // NOI18N
        Troompricelabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        Troompricelabel.setText("Price");
        mainpanel.add(Troompricelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 150, 100, 30));

        Tsubtotallabel.setFont(new java.awt.Font("HelveticaNeue", 0, 12)); // NOI18N
        Tsubtotallabel.setText("Subtotal");
        mainpanel.add(Tsubtotallabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 180, 140, 30));

        roomtypelabel.setFont(new java.awt.Font("HelveticaNeue", 0, 18)); // NOI18N
        roomtypelabel.setText("Single Room");
        mainpanel.add(roomtypelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 190, 40));

        hotelalertslabel.setFont(new java.awt.Font("HelveticaNeue", 1, 16)); // NOI18N
        hotelalertslabel.setText("Hotel Alerts");
        hotelalertslabel.setToolTipText("");
        mainpanel.add(hotelalertslabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 190, 160, 30));

        pernightlabel.setFont(new java.awt.Font("HelveticaNeue", 0, 12)); // NOI18N
        pernightlabel.setText("Price");
        mainpanel.add(pernightlabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 60, 80, 30));

        avgpricelabel.setFont(new java.awt.Font("HelveticaNeue", 0, 12)); // NOI18N
        avgpricelabel.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        avgpricelabel.setText("Average price per night:");
        mainpanel.add(avgpricelabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 60, 140, 30));

        searchbutton.setFont(new java.awt.Font("HelveticaNeue", 0, 14)); // NOI18N
        searchbutton.setText("Back to search");
        searchbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchbuttonActionPerformed(evt);
            }
        });
        mainpanel.add(searchbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, 190, 30));

        paymentbutton.setFont(new java.awt.Font("HelveticaNeue", 0, 14)); // NOI18N
        paymentbutton.setText("Proceed for Payment");
        paymentbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                paymentbuttonActionPerformed(evt);
            }
        });
        mainpanel.add(paymentbutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 340, 190, 30));

        getContentPane().add(mainpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 60, 640, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void roomselectionbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_roomselectionbuttonActionPerformed
        if(null != destination)
        // TODO add your handling code here:
        switch (destination) {
            case "Mumbai":{ showEverything();
                int price = 0, taxes;
                if(roomtypecb.getSelectedIndex() == 0)
                {
                    price = 8664;
                    roomtypelabel.setText("Single Room");
                }
                else if(roomtypecb.getSelectedIndex() == 1)
                {
                    price = 9272;
                    roomtypelabel.setText("Double Room");
                }
                else if(roomtypecb.getSelectedIndex() == 2)
                {
                    price = 9761;
                    roomtypelabel.setText("Deluxe Room");
                }
                else if(roomtypecb.getSelectedIndex() == 3)
                {
                    price = 12298;
                    roomtypelabel.setText("Luxury Room");
                }       
                pernightlabel.setText("INR " + price);
                Troompricelabel.setText(""+days+"x INR "+ price);
                Tsubtotalprice.setText("INR "+(days*price));
                taxes = (int) ((days*price) * 0.28);
                Tetpricelabel.setText("INR "+taxes);
                Teafprice.setText("INR "+800);
                totalprice = (int)((days*price)+taxes+800);
                Ttotalpricelabel.setText("INR "+totalprice);
                    break;
                }
            case "Dubai":{ showEverything();
                int price = 0, taxes;
                if(roomtypecb.getSelectedIndex() == 0)
                {
                    price = 438;
                    roomtypelabel.setText("Single Room");
                }
                else if(roomtypecb.getSelectedIndex() == 1)
                {
                    price = 470;
                    roomtypelabel.setText("Double Room");
                }
                else if(roomtypecb.getSelectedIndex() == 2)
                {
                    price = 494;
                    roomtypelabel.setText("Deluxe Room");
                }
                else if(roomtypecb.getSelectedIndex() == 3)
                {
                    price = 622;
                    roomtypelabel.setText("Luxury Room");
                }       
                pernightlabel.setText("DHS " + price);
                Troompricelabel.setText(""+days+"x DHS "+ price);
                Tsubtotalprice.setText("DHS "+(days*price));
                taxes = 0;
                Tetpricelabel.setText("DHS "+taxes);
                Teafprice.setText("DHS "+40);
                totalprice = (int)((days*price)+taxes+40);
                    Ttotalpricelabel.setText("DHS "+totalprice);
                    break;
                }
            case "London":{ showEverything();
                int price = 0, taxes;
                if(roomtypecb.getSelectedIndex() == 0)
                {
                    price = 92;
                    roomtypelabel.setText("Single Room");
                }
                else if(roomtypecb.getSelectedIndex() == 1)
                {
                    price = 98;
                    roomtypelabel.setText("Double Room");
                }
                else if(roomtypecb.getSelectedIndex() == 2)
                {
                    price = 103;
                    roomtypelabel.setText("Deluxe Room");
                }
                else if(roomtypecb.getSelectedIndex() == 3)
                {
                    price = 130;
                    roomtypelabel.setText("Luxury Room");
                }       
                pernightlabel.setText("GBP " + price);
                Troompricelabel.setText(""+days+"x GBP "+ price);
                Tsubtotalprice.setText("GBP "+(days*price));
                taxes = (int) ((days*price) * 0.05);
                Tetpricelabel.setText("GBP "+taxes);
                Teafprice.setText("GBP "+8);
                totalprice = (int)((days*price)+taxes+8);
                    Ttotalpricelabel.setText("GBP "+totalprice);
                    break;
                }
        }
    }//GEN-LAST:event_roomselectionbuttonActionPerformed

    private void searchbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchbuttonActionPerformed
        // TODO add your handling code here:
        new Search(checkin, checkout, destination).setVisible(true);
        this.dispose(); 
    }//GEN-LAST:event_searchbuttonActionPerformed

    private void paymentbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_paymentbuttonActionPerformed
        // TODO add your handling code here:
        new Payments(destination, days, checkin, checkout, totalprice).setVisible(true);
        this.dispose();
    }//GEN-LAST:event_paymentbuttonActionPerformed

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
            java.util.logging.Logger.getLogger(RoomSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RoomSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RoomSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RoomSelection.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RoomSelection().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Teaflabel;
    private javax.swing.JLabel Teafprice;
    private javax.swing.JLabel Tetlabel;
    private javax.swing.JLabel Tetpricelabel;
    private javax.swing.JLabel Troomlabel;
    private javax.swing.JLabel Troompricelabel;
    private javax.swing.JLabel Tsubtotallabel;
    private javax.swing.JLabel Tsubtotalprice;
    private javax.swing.JLabel Ttotallabel;
    private javax.swing.JLabel Ttotalpricelabel;
    private javax.swing.JTextArea alertstextarea;
    private javax.swing.JLabel avgpricelabel;
    private javax.swing.JLabel checkinlabel;
    private javax.swing.JLabel checkoutlabel;
    private javax.swing.JLabel destinationlabel;
    private javax.swing.JLabel header2label;
    private javax.swing.JLabel header2label1;
    private javax.swing.JLabel headerlabel1;
    private javax.swing.JPanel headerpanel;
    private javax.swing.JLabel hotelalertslabel;
    private javax.swing.JLabel imagelabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel mainpanel;
    private javax.swing.JButton paymentbutton;
    private javax.swing.JLabel pernightlabel;
    private javax.swing.JLabel roomcostslabel;
    private javax.swing.JButton roomselectionbutton;
    private javax.swing.JComboBox roomtypecb;
    private javax.swing.JLabel roomtypelabel;
    private javax.swing.JButton searchbutton;
    private javax.swing.JLabel selectroomlabel;
    private javax.swing.JSeparator separator;
    private javax.swing.JPanel sidepanel;
    private javax.swing.JLabel yoursearchlabel;
    // End of variables declaration//GEN-END:variables
}
