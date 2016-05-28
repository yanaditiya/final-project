package javaapplication103;

import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import java.lang.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;

public class finalGUI extends javax.swing.JFrame {

    String namDp, domisili, idNum, numPel, checkout;
    int hargaInap, lamaInap;
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
        bookRegPanel.setVisible(false);
        bookPrePanel.setVisible(false);
        bookSuiPanel.setVisible(false);
        bookVipPanel.setVisible(false);
        buttonReturn.setVisible(false);
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

        mainTitle = new javax.swing.JLabel();
        Clock = new javax.swing.JLabel();
        secTick = new javax.swing.JLabel();
        amPm = new javax.swing.JLabel();
        dMY = new javax.swing.JLabel();
        guestIDshow = new javax.swing.JLabel();
        signUpPanel = new javax.swing.JPanel();
        checkInButton = new javax.swing.JButton();
        checkOutButton = new javax.swing.JButton();
        buttonReturn = new javax.swing.JButton();
        checkInPanel = new javax.swing.JPanel();
        pnRegClass = new javax.swing.JPanel();
        titleReg = new javax.swing.JLabel();
        bookRegButton = new javax.swing.JButton();
        icoReg = new javax.swing.JLabel();
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
        fieldCustNumInput = new javax.swing.JTextField();
        jScrollPane5 = new javax.swing.JScrollPane();
        jTextArea5 = new javax.swing.JTextArea();
        lbCustNumInput = new javax.swing.JLabel();
        buttonCustCheckOut = new javax.swing.JButton();
        buttonReturn5 = new javax.swing.JButton();
        buttonConfirm4 = new javax.swing.JButton();
        bookRegPanel = new javax.swing.JPanel();
        fieldName = new javax.swing.JTextField();
        fieldIdentityNum = new javax.swing.JTextField();
        lbFieldName = new javax.swing.JLabel();
        lbFieldIdentityNum = new javax.swing.JLabel();
        lbFieldOrigin = new javax.swing.JLabel();
        lbFieldStayLength = new javax.swing.JLabel();
        lbDays = new javax.swing.JLabel();
        fieldOrigin = new javax.swing.JTextField();
        fieldStayLength = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        buttonSubmit = new javax.swing.JButton();
        buttonConfirm = new javax.swing.JButton();
        buttonReturn1 = new javax.swing.JButton();
        bookPrePanel = new javax.swing.JPanel();
        fieldName1 = new javax.swing.JTextField();
        fieldIdentityNum1 = new javax.swing.JTextField();
        lbFieldName1 = new javax.swing.JLabel();
        lbFieldIdentityNum1 = new javax.swing.JLabel();
        lbFieldOrigin1 = new javax.swing.JLabel();
        lbFieldStayLength1 = new javax.swing.JLabel();
        lbDays1 = new javax.swing.JLabel();
        fieldOrigin1 = new javax.swing.JTextField();
        fieldStayLength1 = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        buttonSubmit1 = new javax.swing.JButton();
        buttonConfirm1 = new javax.swing.JButton();
        buttonReturn2 = new javax.swing.JButton();
        bookSuiPanel = new javax.swing.JPanel();
        fieldName2 = new javax.swing.JTextField();
        fieldIdentityNum2 = new javax.swing.JTextField();
        lbFieldName2 = new javax.swing.JLabel();
        lbFieldIdentityNum2 = new javax.swing.JLabel();
        lbFieldOrigin2 = new javax.swing.JLabel();
        lbFieldStayLength2 = new javax.swing.JLabel();
        lbDays2 = new javax.swing.JLabel();
        fieldOrigin2 = new javax.swing.JTextField();
        fieldStayLength2 = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTextArea3 = new javax.swing.JTextArea();
        buttonSubmit2 = new javax.swing.JButton();
        buttonConfirm2 = new javax.swing.JButton();
        buttonReturn3 = new javax.swing.JButton();
        bookVipPanel = new javax.swing.JPanel();
        fieldName3 = new javax.swing.JTextField();
        fieldIdentityNum3 = new javax.swing.JTextField();
        lbFieldName3 = new javax.swing.JLabel();
        lbFieldIdentityNum3 = new javax.swing.JLabel();
        lbFieldOrigin3 = new javax.swing.JLabel();
        lbFieldStayLength3 = new javax.swing.JLabel();
        lbDays3 = new javax.swing.JLabel();
        fieldOrigin3 = new javax.swing.JTextField();
        fieldStayLength3 = new javax.swing.JTextField();
        jScrollPane4 = new javax.swing.JScrollPane();
        jTextArea4 = new javax.swing.JTextArea();
        buttonSubmit3 = new javax.swing.JButton();
        buttonConfirm3 = new javax.swing.JButton();
        buttonReturn4 = new javax.swing.JButton();
        regHomePanel = new javax.swing.JPanel();
        infoRoomReg = new javax.swing.JLabel();
        premHomePanel = new javax.swing.JPanel();
        infoRoomPre = new javax.swing.JLabel();
        suiHomePanel = new javax.swing.JPanel();
        infoRoomSui = new javax.swing.JLabel();
        vipHomePanel = new javax.swing.JPanel();
        infoRoomVip = new javax.swing.JLabel();
        picBG = new javax.swing.JLabel();
        sideBg = new javax.swing.JLabel();
        bg1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        mainTitle.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fachri\\Pictures\\titlelable.png")); // NOI18N
        getContentPane().add(mainTitle);
        mainTitle.setBounds(680, 0, 180, 70);

        Clock.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 76)); // NOI18N
        Clock.setForeground(new java.awt.Color(204, 204, 255));
        Clock.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        Clock.setText("clock");
        Clock.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(Clock);
        Clock.setBounds(0, 370, 130, 80);

        secTick.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 28)); // NOI18N
        secTick.setForeground(new java.awt.Color(204, 204, 255));
        secTick.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        secTick.setText("sec");
        getContentPane().add(secTick);
        secTick.setBounds(130, 380, 50, 30);

        amPm.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 28)); // NOI18N
        amPm.setForeground(new java.awt.Color(204, 204, 255));
        amPm.setText("AP");
        amPm.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        getContentPane().add(amPm);
        amPm.setBounds(130, 410, 40, 31);

        dMY.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        dMY.setForeground(new java.awt.Color(204, 204, 255));
        dMY.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        dMY.setText("date");
        getContentPane().add(dMY);
        dMY.setBounds(20, 440, 140, 20);

        guestIDshow.setFont(new java.awt.Font("Tw Cen MT Condensed", 0, 18)); // NOI18N
        guestIDshow.setForeground(new java.awt.Color(204, 204, 255));
        guestIDshow.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        guestIDshow.setText("guest status");
        guestIDshow.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        getContentPane().add(guestIDshow);
        guestIDshow.setBounds(0, 10, 180, 50);

        signUpPanel.setBackground(new java.awt.Color(106, 139, 155));
        signUpPanel.setToolTipText("");
        signUpPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        checkInButton.setText("Daftar dan Check In");
        checkInButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkInButtonActionPerformed(evt);
            }
        });
        signUpPanel.add(checkInButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 160, 40));

        checkOutButton.setText("Check Out");
        checkOutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkOutButtonActionPerformed(evt);
            }
        });
        signUpPanel.add(checkOutButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, 160, 40));

        buttonReturn.setText("◄ Kembali");
        buttonReturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonReturnActionPerformed(evt);
            }
        });
        signUpPanel.add(buttonReturn, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 100, -1));

        getContentPane().add(signUpPanel);
        signUpPanel.setBounds(0, 170, 180, 160);

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
        pnRegClass.add(titleReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 90, 30));

        bookRegButton.setText("Booking");
        bookRegButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookRegButtonActionPerformed(evt);
            }
        });
        pnRegClass.add(bookRegButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, -1, -1));

        icoReg.setIcon(new javax.swing.ImageIcon("C:\\Users\\Fachri\\Pictures\\icoReg.jpg")); // NOI18N
        pnRegClass.add(icoReg, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 60));

        checkInPanel.add(pnRegClass);
        pnRegClass.setBounds(10, 10, 630, 80);

        pnPremClass.setBackground(new java.awt.Color(155, 106, 106));
        pnPremClass.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        titlePrem.setFont(new java.awt.Font("Arial Black", 0, 18)); // NOI18N
        titlePrem.setForeground(new java.awt.Color(255, 255, 255));
        titlePrem.setHorizontalAlignment(javax.swing.SwingConstants.TRAILING);
        titlePrem.setText("Premium ");
        pnPremClass.add(titlePrem, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 100, 30));

        bookPremButton.setText("Booking");
        bookPremButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookPremButtonActionPerformed(evt);
            }
        });
        pnPremClass.add(bookPremButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, -1, -1));

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
        pnSuiClass.add(titleSui, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 60, 30));

        bookSuiButton.setText("Booking");
        bookSuiButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookSuiButtonActionPerformed(evt);
            }
        });
        pnSuiClass.add(bookSuiButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, -1, -1));

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
        pnVipClass.add(titleVip, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 0, 50, 30));

        bookVipButton.setText("Booking");
        bookVipButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bookVipButtonActionPerformed(evt);
            }
        });
        pnVipClass.add(bookVipButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 30, -1, -1));

        icoVip.setText("jLabel5");
        pnVipClass.add(icoVip, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 120, 60));

        checkInPanel.add(pnVipClass);
        pnVipClass.setBounds(10, 310, 630, 80);

        getContentPane().add(checkInPanel);
        checkInPanel.setBounds(210, 80, 650, 400);

        checkOutPanel.setBackground(new java.awt.Color(255, 255, 204));
        checkOutPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        checkOutPanel.add(fieldCustNumInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, 130, -1));

        jTextArea5.setColumns(20);
        jTextArea5.setRows(5);
        jScrollPane5.setViewportView(jTextArea5);

        checkOutPanel.add(jScrollPane5, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 16, 230, 330));

        lbCustNumInput.setText("Masukkan nomor pelanggan");
        checkOutPanel.add(lbCustNumInput, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 160, 140, 20));

        buttonCustCheckOut.setText("Periksa");
        checkOutPanel.add(buttonCustCheckOut, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 220, 90, -1));

        buttonReturn5.setText("◄ Kembali");
        checkOutPanel.add(buttonReturn5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 90, -1));

        buttonConfirm4.setText("Lanjut ►");
        checkOutPanel.add(buttonConfirm4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 360, 90, -1));

        getContentPane().add(checkOutPanel);
        checkOutPanel.setBounds(210, 80, 650, 400);

        bookRegPanel.setBackground(new java.awt.Color(255, 255, 204));
        bookRegPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        bookRegPanel.add(fieldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 190, -1));
        bookRegPanel.add(fieldIdentityNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 190, -1));

        lbFieldName.setText("Nama");
        bookRegPanel.add(lbFieldName, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 40, 20));

        lbFieldIdentityNum.setText("Nomor ID");
        bookRegPanel.add(lbFieldIdentityNum, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 60, 20));

        lbFieldOrigin.setText("Domisili");
        bookRegPanel.add(lbFieldOrigin, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 50, 20));

        lbFieldStayLength.setText("Menginap");
        bookRegPanel.add(lbFieldStayLength, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 60, 20));

        lbDays.setText("hari");
        bookRegPanel.add(lbDays, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, -1, 20));
        bookRegPanel.add(fieldOrigin, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 190, -1));
        bookRegPanel.add(fieldStayLength, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 60, -1));

        jTextArea1.setBackground(new java.awt.Color(255, 255, 204));
        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setBorder(null);
        jScrollPane1.setViewportView(jTextArea1);

        bookRegPanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 280, 320));

        buttonSubmit.setText("Daftar");
        buttonSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSubmitActionPerformed(evt);
            }
        });
        bookRegPanel.add(buttonSubmit, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 100, -1));

        buttonConfirm.setText("Selesai");
        buttonConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonConfirmActionPerformed(evt);
            }
        });
        bookRegPanel.add(buttonConfirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 360, 90, -1));

        buttonReturn1.setText("◄ Kembali");
        buttonReturn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonReturn1ActionPerformed(evt);
            }
        });
        bookRegPanel.add(buttonReturn1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 90, -1));

        getContentPane().add(bookRegPanel);
        bookRegPanel.setBounds(210, 80, 650, 400);

        bookPrePanel.setBackground(new java.awt.Color(255, 255, 204));
        bookPrePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        bookPrePanel.add(fieldName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 190, -1));
        bookPrePanel.add(fieldIdentityNum1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 190, -1));

        lbFieldName1.setText("Nama");
        bookPrePanel.add(lbFieldName1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 40, 20));

        lbFieldIdentityNum1.setText("Nomor ID");
        bookPrePanel.add(lbFieldIdentityNum1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 60, 20));

        lbFieldOrigin1.setText("Domisili");
        bookPrePanel.add(lbFieldOrigin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 50, 20));

        lbFieldStayLength1.setText("Menginap");
        bookPrePanel.add(lbFieldStayLength1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 60, 20));

        lbDays1.setText("hari");
        bookPrePanel.add(lbDays1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, -1, 20));
        bookPrePanel.add(fieldOrigin1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 190, -1));
        bookPrePanel.add(fieldStayLength1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 60, -1));

        jTextArea2.setBackground(new java.awt.Color(255, 255, 204));
        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jTextArea2.setBorder(null);
        jScrollPane2.setViewportView(jTextArea2);

        bookPrePanel.add(jScrollPane2, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 280, 320));

        buttonSubmit1.setText("Daftar");
        buttonSubmit1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSubmit1ActionPerformed(evt);
            }
        });
        bookPrePanel.add(buttonSubmit1, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 100, -1));

        buttonConfirm1.setText("Lanjut ►");
        bookPrePanel.add(buttonConfirm1, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 360, 90, -1));

        buttonReturn2.setText("◄ Kembali");
        bookPrePanel.add(buttonReturn2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 90, -1));

        getContentPane().add(bookPrePanel);
        bookPrePanel.setBounds(210, 80, 650, 400);

        bookSuiPanel.setBackground(new java.awt.Color(255, 255, 204));
        bookSuiPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        bookSuiPanel.add(fieldName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 190, -1));
        bookSuiPanel.add(fieldIdentityNum2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 190, -1));

        lbFieldName2.setText("Nama");
        bookSuiPanel.add(lbFieldName2, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 40, 20));

        lbFieldIdentityNum2.setText("Nomor ID");
        bookSuiPanel.add(lbFieldIdentityNum2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 60, 20));

        lbFieldOrigin2.setText("Domisili");
        bookSuiPanel.add(lbFieldOrigin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 50, 20));

        lbFieldStayLength2.setText("Menginap");
        bookSuiPanel.add(lbFieldStayLength2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 60, 20));

        lbDays2.setText("hari");
        bookSuiPanel.add(lbDays2, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, -1, 20));
        bookSuiPanel.add(fieldOrigin2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 190, -1));
        bookSuiPanel.add(fieldStayLength2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 60, -1));

        jTextArea3.setBackground(new java.awt.Color(255, 255, 204));
        jTextArea3.setColumns(20);
        jTextArea3.setRows(5);
        jTextArea3.setBorder(null);
        jScrollPane3.setViewportView(jTextArea3);

        bookSuiPanel.add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 280, 320));

        buttonSubmit2.setText("Daftar");
        buttonSubmit2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSubmit2ActionPerformed(evt);
            }
        });
        bookSuiPanel.add(buttonSubmit2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 100, -1));

        buttonConfirm2.setText("Lanjut ►");
        bookSuiPanel.add(buttonConfirm2, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 360, 90, -1));

        buttonReturn3.setText("◄ Kembali");
        bookSuiPanel.add(buttonReturn3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 90, -1));

        getContentPane().add(bookSuiPanel);
        bookSuiPanel.setBounds(210, 80, 650, 400);

        bookVipPanel.setBackground(new java.awt.Color(255, 255, 204));
        bookVipPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        bookVipPanel.add(fieldName3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, 190, -1));
        bookVipPanel.add(fieldIdentityNum3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 150, 190, -1));

        lbFieldName3.setText("Nama");
        bookVipPanel.add(lbFieldName3, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 120, 40, 20));

        lbFieldIdentityNum3.setText("Nomor ID");
        bookVipPanel.add(lbFieldIdentityNum3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, 60, 20));

        lbFieldOrigin3.setText("Domisili");
        bookVipPanel.add(lbFieldOrigin3, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, 50, 20));

        lbFieldStayLength3.setText("Menginap");
        bookVipPanel.add(lbFieldStayLength3, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 210, 60, 20));

        lbDays3.setText("hari");
        bookVipPanel.add(lbDays3, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 210, -1, 20));
        bookVipPanel.add(fieldOrigin3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 180, 190, -1));
        bookVipPanel.add(fieldStayLength3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 210, 60, -1));

        jTextArea4.setBackground(new java.awt.Color(255, 255, 204));
        jTextArea4.setColumns(20);
        jTextArea4.setRows(5);
        jTextArea4.setBorder(null);
        jScrollPane4.setViewportView(jTextArea4);

        bookVipPanel.add(jScrollPane4, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 280, 320));

        buttonSubmit3.setText("Daftar");
        buttonSubmit3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSubmit3ActionPerformed(evt);
            }
        });
        bookVipPanel.add(buttonSubmit3, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 260, 100, -1));

        buttonConfirm3.setText("Lanjut ►");
        bookVipPanel.add(buttonConfirm3, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 360, 90, -1));

        buttonReturn4.setText("◄ Kembali");
        bookVipPanel.add(buttonReturn4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 360, 90, -1));

        getContentPane().add(bookVipPanel);
        bookVipPanel.setBounds(210, 80, 650, 400);

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

    private void checkInButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkInButtonActionPerformed
        checkInPanel.setVisible(true);
        buttonReturn.setVisible(true);
        checkInButton.setVisible(false);
        checkOutButton.setVisible(false);
    }//GEN-LAST:event_checkInButtonActionPerformed

    private void checkOutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkOutButtonActionPerformed
        // TODO add your handling code here:
        System.out.println("User langsung menuju panel check out");
        checkOutPanel.setVisible(true);
        buttonReturn.setVisible(true);
        checkInButton.setVisible(false);
        checkOutButton.setVisible(false);
    }//GEN-LAST:event_checkOutButtonActionPerformed

    private void bookRegButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookRegButtonActionPerformed
        // TODO add your handling code here:
        checkInPanel.setVisible(false);
        bookRegPanel.setVisible(true);
        buttonConfirm.setVisible(false);
    }//GEN-LAST:event_bookRegButtonActionPerformed

    private void bookPremButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookPremButtonActionPerformed
        // TODO add your handling code here:
        checkInPanel.setVisible(false);
        bookPrePanel.setVisible(true);
        buttonConfirm1.setVisible(false);
    }//GEN-LAST:event_bookPremButtonActionPerformed

    private void bookSuiButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookSuiButtonActionPerformed
        // TODO add your handling code here:
        checkInPanel.setVisible(false);
        bookSuiPanel.setVisible(true);
        buttonConfirm2.setVisible(false);
    }//GEN-LAST:event_bookSuiButtonActionPerformed

    private void bookVipButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bookVipButtonActionPerformed
        // TODO add your handling code here:
        checkInPanel.setVisible(false);
        bookVipPanel.setVisible(true);
        buttonConfirm3.setVisible(false);
    }//GEN-LAST:event_bookVipButtonActionPerformed

    private void buttonReturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonReturnActionPerformed
        // TODO add your handling code here:
        checkInButton.setVisible(true);
        checkOutButton.setVisible(true);
    }//GEN-LAST:event_buttonReturnActionPerformed

    private void buttonConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonConfirmActionPerformed
        bookRegPanel.setVisible(false);
        checkInButton.setVisible(true);
        checkOutButton.setVisible(true);
        buttonReturn.setVisible(false);
    }//GEN-LAST:event_buttonConfirmActionPerformed

    private void buttonReturn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonReturn1ActionPerformed
        bookRegPanel.setVisible(false);
        checkInPanel.setVisible(false);
        buttonReturn.setVisible(true);
    }//GEN-LAST:event_buttonReturn1ActionPerformed

    private void buttonSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSubmitActionPerformed
        // TODO add your handling code here:
        buttonReturn1.setVisible(false);
        buttonConfirm.setVisible(true);
        String idInap;
        namDp = fieldName.getText();
        idNum = fieldIdentityNum.getText();
        domisili = fieldOrigin.getText();
        if (statReg <= 9){
            idInap = "REG0"+String.valueOf(statReg);
        } else {
            idInap = "REG"+String.valueOf(statReg);
        }
        custData [i] = new Customer (idInap, idNum, namDp, domisili);
        statReg--;
        String x = fieldStayLength.getText();
        lamaInap = Integer.parseInt(x);
        DateFormat dateFormat = new SimpleDateFormat("dd MMMM yyyy");
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.DATE, lamaInap);
        Date next = cal.getTime();
        checkout = dateFormat.format(next);
        for (i = 0; i < roomRg.length; i++) {
                String y = fieldStayLength.getText();
                lamaInap = Integer.parseInt(x);
                roomRg[i].setStatus("Booked");
                hargaInap = roomRg[i].setPrice(lamaInap);  
        }
        jTextArea1.setText("Nama : "+namDp+"\nNo. Identitas : "+idNum+"\nDomisili : "
        +domisili+"\n\nID Pelanggan : "+idInap+"\nCheck Out tanggal : "+checkout+"\n"
                + "Biaya : Rp"+hargaInap+
                "\n\nSimpan ID pelanggan sebagai bukti check out"+
                "\nSegera melakukan pembayaran di resepsionis");
    }//GEN-LAST:event_buttonSubmitActionPerformed

    private void buttonSubmit1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSubmit1ActionPerformed
        // TODO add your handling code here:
        namDp = fieldName.getText();
        idNum = fieldIdentityNum.getText();
        domisili = fieldOrigin.getText();
    }//GEN-LAST:event_buttonSubmit1ActionPerformed

    private void buttonSubmit2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSubmit2ActionPerformed
        // TODO add your handling code here:
        namDp = fieldName.getText();
        idNum = fieldIdentityNum.getText();
        domisili = fieldOrigin.getText();
    }//GEN-LAST:event_buttonSubmit2ActionPerformed

    private void buttonSubmit3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSubmit3ActionPerformed
        // TODO add your handling code here:
        namDp = fieldName.getText();
        idNum = fieldIdentityNum.getText();
        domisili = fieldOrigin.getText();
    }//GEN-LAST:event_buttonSubmit3ActionPerformed

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
    private javax.swing.JPanel bookPrePanel;
    private javax.swing.JButton bookPremButton;
    private javax.swing.JButton bookRegButton;
    private javax.swing.JPanel bookRegPanel;
    private javax.swing.JButton bookSuiButton;
    private javax.swing.JPanel bookSuiPanel;
    private javax.swing.JButton bookVipButton;
    private javax.swing.JPanel bookVipPanel;
    private javax.swing.JButton buttonConfirm;
    private javax.swing.JButton buttonConfirm1;
    private javax.swing.JButton buttonConfirm2;
    private javax.swing.JButton buttonConfirm3;
    private javax.swing.JButton buttonConfirm4;
    private javax.swing.JButton buttonCustCheckOut;
    private javax.swing.JButton buttonReturn;
    private javax.swing.JButton buttonReturn1;
    private javax.swing.JButton buttonReturn2;
    private javax.swing.JButton buttonReturn3;
    private javax.swing.JButton buttonReturn4;
    private javax.swing.JButton buttonReturn5;
    private javax.swing.JButton buttonSubmit;
    private javax.swing.JButton buttonSubmit1;
    private javax.swing.JButton buttonSubmit2;
    private javax.swing.JButton buttonSubmit3;
    private javax.swing.JButton checkInButton;
    private javax.swing.JPanel checkInPanel;
    private javax.swing.JButton checkOutButton;
    private javax.swing.JPanel checkOutPanel;
    private javax.swing.JLabel dMY;
    private javax.swing.JTextField fieldCustNumInput;
    private javax.swing.JTextField fieldIdentityNum;
    private javax.swing.JTextField fieldIdentityNum1;
    private javax.swing.JTextField fieldIdentityNum2;
    private javax.swing.JTextField fieldIdentityNum3;
    private javax.swing.JTextField fieldName;
    private javax.swing.JTextField fieldName1;
    private javax.swing.JTextField fieldName2;
    private javax.swing.JTextField fieldName3;
    private javax.swing.JTextField fieldOrigin;
    private javax.swing.JTextField fieldOrigin1;
    private javax.swing.JTextField fieldOrigin2;
    private javax.swing.JTextField fieldOrigin3;
    private javax.swing.JTextField fieldStayLength;
    private javax.swing.JTextField fieldStayLength1;
    private javax.swing.JTextField fieldStayLength2;
    private javax.swing.JTextField fieldStayLength3;
    private javax.swing.JLabel guestIDshow;
    private javax.swing.JLabel icoPrem;
    private javax.swing.JLabel icoReg;
    private javax.swing.JLabel icoSui;
    private javax.swing.JLabel icoVip;
    private javax.swing.JLabel infoRoomPre;
    private javax.swing.JLabel infoRoomReg;
    private javax.swing.JLabel infoRoomSui;
    private javax.swing.JLabel infoRoomVip;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextArea jTextArea3;
    private javax.swing.JTextArea jTextArea4;
    private javax.swing.JTextArea jTextArea5;
    private javax.swing.JLabel lbCustNumInput;
    private javax.swing.JLabel lbDays;
    private javax.swing.JLabel lbDays1;
    private javax.swing.JLabel lbDays2;
    private javax.swing.JLabel lbDays3;
    private javax.swing.JLabel lbFieldIdentityNum;
    private javax.swing.JLabel lbFieldIdentityNum1;
    private javax.swing.JLabel lbFieldIdentityNum2;
    private javax.swing.JLabel lbFieldIdentityNum3;
    private javax.swing.JLabel lbFieldName;
    private javax.swing.JLabel lbFieldName1;
    private javax.swing.JLabel lbFieldName2;
    private javax.swing.JLabel lbFieldName3;
    private javax.swing.JLabel lbFieldOrigin;
    private javax.swing.JLabel lbFieldOrigin1;
    private javax.swing.JLabel lbFieldOrigin2;
    private javax.swing.JLabel lbFieldOrigin3;
    private javax.swing.JLabel lbFieldStayLength;
    private javax.swing.JLabel lbFieldStayLength1;
    private javax.swing.JLabel lbFieldStayLength2;
    private javax.swing.JLabel lbFieldStayLength3;
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
    private javax.swing.JPanel signUpPanel;
    private javax.swing.JPanel suiHomePanel;
    private javax.swing.JLabel titlePrem;
    private javax.swing.JLabel titleReg;
    private javax.swing.JLabel titleSui;
    private javax.swing.JLabel titleVip;
    private javax.swing.JPanel vipHomePanel;
    // End of variables declaration//GEN-END:variables
}
