package javaapplication103;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import java.lang.*;
import javax.swing.JOptionPane;

public class finalGUI extends javax.swing.JFrame {

    String namDp, namBl, domisili, uName, pWord, idNum;
    static String userStatus = "Tamu";
    static int statReg, statPre, statSui, statVip, userLog, i;
    private static final int windowW = 890;
    private static final int windowH = 530;
    VIP[] roomVi = new VIP[10];
    Suite[] roomSu = new Suite[20];
    Premium[] roomPr = new Premium[20];
    Regular[] roomRg = new Regular[50];
    Customer[] custData = new Customer[100];

    public finalGUI() {

        for (int i = 0; i < roomVi.length; i++) {
            roomVi[i] = new VIP("VIP", 750000, "V" + (i + 1), "Available");
        }
        for (int i = 0; i < roomPr.length; i++) {
            roomPr[i] = new Premium("Premium", 200000, "P" + (i + 1), "Available");
            roomSu[i] = new Suite("Suite", 350000, "S" + (i + 1), "Available");
        }
        for (int i = 0; i < roomRg.length; i++) {
            roomRg[i] = new Regular("Regular", 100000, "R" + (i + 1), "Available");
        }

        initComponents();
        
        signUpPanel.setVisible(true);
        checkInPanel.setVisible(false);
        checkOutPanel.setVisible(false);
        cReturnButton.setVisible(false);
        setJam();
        setTanggal();
        setRoomStatus();
        setRoomCounter();
        
        guestIDshow.setText("Selamat datang, "+userStatus);
        
        setResizable(false);

    }

    @Override
    public Dimension getPreferredSize() {
        return new Dimension(windowW, windowH);
    }
    
    public void userLogin () {
        
    }

    public void setRoomStatus() {

        for (int v = 0; v < roomVi.length; v++) {
            if (roomVi[v].getStatus().equalsIgnoreCase("Available")) {
                statVip++;
            }
        }

        for (int s = 0; s < roomSu.length; s++) {
            if (roomSu[s].getStatus().equalsIgnoreCase("Available")) {
                statSui++;
            }
        }

        for (int p = 0; p < roomPr.length; p++) {
            if (roomPr[p].getStatus().equalsIgnoreCase("Available")) {
                statPre++;
            }
        }

        for (int r = 0; r < roomRg.length; r++) {
            if (roomRg[r].getStatus().equalsIgnoreCase("Available")) {
                statReg++;
            }
        }
    }

    public void setRoomCounter() {

        if (statVip == 0) {
            infoRoomVip.setText("Sudah penuh");
        } else {
            infoRoomVip.setText("Tersedia " + statVip + " kamar");
        }

        if (statSui == 0) {
            infoRoomSui.setText("Sudah penuh");
        } else {
            infoRoomSui.setText("Tersedia " + statSui + " kamar");
        }

        if (statPre == 0) {
            infoRoomPre.setText("Sudah penuh");
        } else {
            infoRoomPre.setText("Tersedia " + statPre + " kamar");
        }

        if (statReg == 0) {
            infoRoomReg.setText("Sudah penuh");
        } else {
            infoRoomReg.setText("Tersedia " + statReg + " kamar");
        }

    }

    public void setTanggal() {
        java.util.Date skrg = new java.util.Date();
        java.text.SimpleDateFormat kal = new java.text.SimpleDateFormat("dd MMMM yyyy");
        dMY.setText(kal.format(skrg));
    }

    public void setJam() {
        ActionListener taskPerformer = new ActionListener() {

            public void actionPerformed(ActionEvent evt) {
                String nol_jam = "", nol_menit = "", nol_detik = "";

                java.util.Date dateTime = new java.util.Date();
                int nilai_jam = dateTime.getHours();
                int nilai_menit = dateTime.getMinutes();
                int nilai_detik = dateTime.getSeconds();
                String ampm = "AM";

                if (nilai_jam == 24) {
                    nilai_jam = nilai_jam - 24;
                    ampm = "AM";
                }

                if (nilai_jam >= 13) {
                    nilai_jam = nilai_jam - 12;
                    ampm = "PM";
                }

                if (nilai_jam <= 9) {
                    nol_jam = "0";
                }
                if (nilai_menit <= 9) {
                    nol_menit = "0";
                }
                if (nilai_detik <= 9) {
                    nol_detik = "0";
                }

                if (nilai_jam == 12) {
                    ampm = "PM";
                }

                String waktu = nol_jam + Integer.toString(nilai_jam);
                String menit = nol_menit + Integer.toString(nilai_menit);
                String detik = nol_detik + Integer.toString(nilai_detik);

                Clock.setText(waktu + ":" + menit);
                secTick.setText(":" + detik);
                amPm.setText(ampm);
            }
        };
        new Timer(1000, taskPerformer).start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        signUpPanel = new javax.swing.JPanel();
        lbSignUp = new javax.swing.JLabel();
        signUpButton = new javax.swing.JButton();
        logInPanelButton = new javax.swing.JButton();
        lbLogInButton = new javax.swing.JLabel();
        checkInPanel = new javax.swing.JPanel();
        pnRegClass = new javax.swing.JPanel();
        titleReg = new javax.swing.JLabel();
        bookRegButton = new javax.swing.JButton();
        icoReg = new javax.swing.JLabel();
        descripReg = new javax.swing.JLabel();
        pnPremClass = new javax.swing.JPanel();
        titlePrem = new javax.swing.JLabel();
        bookPremButton = new javax.swing.JButton();
        icoPrem = new javax.swing.JLabel();
        pnSuiClass = new javax.swing.JPanel();
        titleSui = new javax.swing.JLabel();
        bookSuiButton = new javax.swing.JButton();
        icoSui = new javax.swing.JLabel();
        pnVipClass = new javax.swing.JPanel();
        titleVip = new javax.swing.JLabel();
        bookVipButton = new javax.swing.JButton();
        icoVip = new javax.swing.JLabel();
        checkOutPanel = new javax.swing.JPanel();
        mainTitle = new javax.swing.JLabel();
        Clock = new javax.swing.JLabel();
        secTick = new javax.swing.JLabel();
        amPm = new javax.swing.JLabel();
        dMY = new javax.swing.JLabel();
        cReturnButton = new javax.swing.JButton();
        guestIDshow = new javax.swing.JLabel();
        regHomePanel = new javax.swing.JPanel();
        infoRoomReg = new javax.swing.JLabel();
        premHomePanel = new javax.swing.JPanel();
        infoRoomPre = new javax.swing.JLabel();
        suiHomePanel = new javax.swing.JPanel();
        infoRoomSui = new javax.swing.JLabel();
        vipHomePanel = new javax.swing.JPanel();
        infoRoomVip = new javax.swing.JLabel();
        bookRegPanel = new javax.swing.JPanel();
        picBG = new javax.swing.JLabel();
        sideBg = new javax.swing.JLabel();
        bg1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        signUpPanel.setBackground(new java.awt.Color(106, 139, 155));
        signUpPanel.setToolTipText("");
        signUpPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbSignUp.setForeground(new java.awt.Color(255, 255, 255));
        lbSignUp.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbSignUp.setText("Daftar Terlebih Dahulu");
        lbSignUp.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        signUpPanel.add(lbSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 180, 20));

        signUpButton.setText("Daftar dan Check In");
        signUpButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                signUpButtonActionPerformed(evt);
            }
        });
        signUpPanel.add(signUpButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 160, -1));

        logInPanelButton.setText("Langsung Log In");
        logInPanelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInPanelButtonActionPerformed(evt);
            }
        });
        signUpPanel.add(logInPanelButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 160, -1));

        lbLogInButton.setForeground(new java.awt.Color(255, 255, 255));
        lbLogInButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbLogInButton.setText("Sudah Terdaftar?");
        signUpPanel.add(lbLogInButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 160, 20));

        getContentPane().add(signUpPanel);
        signUpPanel.setBounds(0, 30, 180, 360);

        checkInPanel.setBackground(new java.awt.Color(255, 255, 204));
        checkInPanel.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        checkInPanel.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        checkInPanel.setLayout(null);

        pnRegClass.setBackground(new java.awt.Color(106, 139, 155));
        pnRegClass.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleReg.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        titleReg.setForeground(new java.awt.Color(255, 255, 255));
        titleReg.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        titleReg.setText("Regular ");
        pnRegClass.add(titleReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 0, 90, 30));

        bookRegButton.setText("Booking");
        bookRegButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookRegButtonActionPerformed(evt);
            }
        });
        pnRegClass.add(bookRegButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, -1, -1));

        icoReg.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fachri\\Pictures\\icoReg.jpg")); // NOI18N
        pnRegClass.add(icoReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 60));

        descripReg.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        descripReg.setForeground(new java.awt.Color(255, 255, 255));
        descripReg.setText("jLabel1");
        descripReg.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        pnRegClass.add(descripReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 10, 380, 40));

        checkInPanel.add(pnRegClass);
        pnRegClass.setBounds(10, 10, 630, 80);

        pnPremClass.setBackground(new java.awt.Color(155, 106, 106));
        pnPremClass.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titlePrem.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        titlePrem.setForeground(new java.awt.Color(255, 255, 255));
        titlePrem.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        titlePrem.setText("Premium ");
        pnPremClass.add(titlePrem, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 0, 100, 30));

        bookPremButton.setText("Booking");
        bookPremButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookPremButtonActionPerformed(evt);
            }
        });
        pnPremClass.add(bookPremButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, -1, -1));

        icoPrem.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icoPrem.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fachri\\Pictures\\icoPrem.jpg")); // NOI18N
        pnPremClass.add(icoPrem, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 60));

        checkInPanel.add(pnPremClass);
        pnPremClass.setBounds(10, 110, 630, 80);

        pnSuiClass.setBackground(new java.awt.Color(155, 137, 106));
        pnSuiClass.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleSui.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        titleSui.setForeground(new java.awt.Color(255, 255, 255));
        titleSui.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        titleSui.setText("Suite ");
        pnSuiClass.add(titleSui, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 0, 60, 30));

        bookSuiButton.setText("Booking");
        bookSuiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookSuiButtonActionPerformed(evt);
            }
        });
        pnSuiClass.add(bookSuiButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, -1, -1));

        icoSui.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        icoSui.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fachri\\Pictures\\icoSui.jpg")); // NOI18N
        pnSuiClass.add(icoSui, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 60));

        checkInPanel.add(pnSuiClass);
        pnSuiClass.setBounds(10, 210, 630, 80);

        pnVipClass.setBackground(new java.awt.Color(143, 155, 106));
        pnVipClass.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titleVip.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        titleVip.setForeground(new java.awt.Color(255, 255, 255));
        titleVip.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        titleVip.setText("VIP ");
        pnVipClass.add(titleVip, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 0, 50, 30));

        bookVipButton.setText("Booking");
        bookVipButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookVipButtonActionPerformed(evt);
            }
        });
        pnVipClass.add(bookVipButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 50, -1, -1));

        icoVip.setText("jLabel5");
        pnVipClass.add(icoVip, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 60));

        checkInPanel.add(pnVipClass);
        pnVipClass.setBounds(10, 310, 630, 80);

        getContentPane().add(checkInPanel);
        checkInPanel.setBounds(210, 80, 650, 400);

        checkOutPanel.setBackground(new java.awt.Color(255, 255, 204));
        checkOutPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(checkOutPanel);
        checkOutPanel.setBounds(210, 80, 650, 400);

        mainTitle.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fachri\\Pictures\\titlelable.png")); // NOI18N
        getContentPane().add(mainTitle);
        mainTitle.setBounds(680, 0, 180, 70);

        Clock.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 76)); // NOI18N
        Clock.setForeground(new java.awt.Color(204, 204, 255));
        Clock.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Clock.setText("clock");
        Clock.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(Clock);
        Clock.setBounds(0, 400, 130, 80);

        secTick.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 28)); // NOI18N
        secTick.setForeground(new java.awt.Color(204, 204, 255));
        secTick.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        secTick.setText("sec");
        getContentPane().add(secTick);
        secTick.setBounds(130, 410, 50, 30);

        amPm.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 28)); // NOI18N
        amPm.setForeground(new java.awt.Color(204, 204, 255));
        amPm.setText("AP");
        amPm.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(amPm);
        amPm.setBounds(130, 440, 40, 31);

        dMY.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        dMY.setForeground(new java.awt.Color(204, 204, 255));
        dMY.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        dMY.setText("date");
        getContentPane().add(dMY);
        dMY.setBounds(20, 470, 140, 20);

        cReturnButton.setText("Kembali");
        cReturnButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cReturnButtonActionPerformed(evt);
            }
        });
        getContentPane().add(cReturnButton);
        cReturnButton.setBounds(43, 250, 90, 20);

        guestIDshow.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        guestIDshow.setForeground(new java.awt.Color(204, 204, 255));
        guestIDshow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guestIDshow.setText("guest status");
        guestIDshow.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(guestIDshow);
        guestIDshow.setBounds(0, 10, 180, 50);

        regHomePanel.setBackground(new java.awt.Color(106, 139, 155));
        regHomePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        infoRoomReg.setForeground(new java.awt.Color(255, 255, 255));
        infoRoomReg.setText("Regular room number");
        regHomePanel.add(infoRoomReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 140, -1));

        getContentPane().add(regHomePanel);
        regHomePanel.setBounds(220, 90, 305, 180);

        premHomePanel.setBackground(new java.awt.Color(155, 106, 106));
        premHomePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        infoRoomPre.setForeground(new java.awt.Color(255, 255, 255));
        infoRoomPre.setText("Premium room number");
        premHomePanel.add(infoRoomPre, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 150, -1));

        getContentPane().add(premHomePanel);
        premHomePanel.setBounds(545, 90, 305, 180);

        suiHomePanel.setBackground(new java.awt.Color(155, 137, 106));
        suiHomePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        infoRoomSui.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        infoRoomSui.setForeground(new java.awt.Color(255, 255, 255));
        infoRoomSui.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        infoRoomSui.setText("Suite room number");
        suiHomePanel.add(infoRoomSui, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 154, 150, 20));

        getContentPane().add(suiHomePanel);
        suiHomePanel.setBounds(220, 290, 305, 180);

        vipHomePanel.setBackground(new java.awt.Color(143, 155, 106));
        vipHomePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        infoRoomVip.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        infoRoomVip.setForeground(new java.awt.Color(255, 255, 255));
        infoRoomVip.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        infoRoomVip.setText("VIP room number");
        vipHomePanel.add(infoRoomVip, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 154, 200, 20));

        getContentPane().add(vipHomePanel);
        vipHomePanel.setBounds(545, 290, 305, 180);

        bookRegPanel.setBackground(new java.awt.Color(255, 255, 204));
        getContentPane().add(bookRegPanel);
        bookRegPanel.setBounds(210, 80, 650, 400);

        picBG.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fachri\\Pictures\\bgpic.png")); // NOI18N
        getContentPane().add(picBG);
        picBG.setBounds(430, 180, 468, 328);

        sideBg.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fachri\\Pictures\\sb.png")); // NOI18N
        getContentPane().add(sideBg);
        sideBg.setBounds(0, 0, 180, 502);

        bg1.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fachri\\Pictures\\bg.png")); // NOI18N
        getContentPane().add(bg1);
        bg1.setBounds(180, 0, 710, 502);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void signUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_signUpButtonActionPerformed
        
    }//GEN-LAST:event_signUpButtonActionPerformed

    private void logInPanelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInPanelButtonActionPerformed
        // TODO add your handling code here:
        System.out.println("User langsung menuju panel log in");
        signUpPanel.setVisible(false);
    }//GEN-LAST:event_logInPanelButtonActionPerformed

    private void bookRegButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookRegButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookRegButtonActionPerformed

    private void cReturnButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cReturnButtonActionPerformed
        System.out.println("User kembali ke menu pilihan awal");
        cInButton.setVisible(true);
        checkInPanel.setVisible(false);
        cOutButton.setVisible(true);
        checkOutPanel.setVisible(false);
        cReturnButton.setVisible(false);
    }//GEN-LAST:event_cReturnButtonActionPerformed

    private void bookPremButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookPremButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookPremButtonActionPerformed

    private void bookSuiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookSuiButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookSuiButtonActionPerformed

    private void bookVipButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookVipButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bookVipButtonActionPerformed

    public static void main(String args[]) {

        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(finalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(finalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(finalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(finalGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new finalGUI().setVisible(true);
            }
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Clock;
    private javax.swing.JLabel amPm;
    private javax.swing.JLabel bg1;
    private javax.swing.JButton bookPremButton;
    private javax.swing.JButton bookRegButton;
    private javax.swing.JPanel bookRegPanel;
    private javax.swing.JButton bookSuiButton;
    private javax.swing.JButton bookVipButton;
    private javax.swing.JButton cReturnButton;
    private javax.swing.JPanel checkInPanel;
    private javax.swing.JPanel checkOutPanel;
    private javax.swing.JLabel dMY;
    private javax.swing.JLabel descripReg;
    private javax.swing.JLabel guestIDshow;
    private javax.swing.JLabel icoPrem;
    private javax.swing.JLabel icoReg;
    private javax.swing.JLabel icoSui;
    private javax.swing.JLabel icoVip;
    private javax.swing.JLabel infoRoomPre;
    private javax.swing.JLabel infoRoomReg;
    private javax.swing.JLabel infoRoomSui;
    private javax.swing.JLabel infoRoomVip;
    private javax.swing.JLabel lbLogInButton;
    private javax.swing.JLabel lbSignUp;
    private javax.swing.JButton logInPanelButton;
    private javax.swing.JLabel mainTitle;
    private javax.swing.JLabel picBG;
    private javax.swing.JPanel pnPremClass;
    private javax.swing.JPanel pnRegClass;
    private javax.swing.JPanel pnSuiClass;
    private javax.swing.JPanel pnVipClass;
    private javax.swing.JPanel premHomePanel;
    private javax.swing.JPanel regHomePanel;
    private javax.swing.JLabel secTick;
    private javax.swing.JLabel sideBg;
    private javax.swing.JButton signUpButton;
    private javax.swing.JPanel signUpPanel;
    private javax.swing.JPanel suiHomePanel;
    private javax.swing.JLabel titlePrem;
    private javax.swing.JLabel titleReg;
    private javax.swing.JLabel titleSui;
    private javax.swing.JLabel titleVip;
    private javax.swing.JPanel vipHomePanel;
    // End of variables declaration//GEN-END:variables
}
