package javaapplication103;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

public class Customer {

    protected int jam;
    protected String nik, frName, lsName, checkin, checkout, kamar, password, id;

    public Customer(String id, String nik, String frName, String kamar) {
        
        this.id = id;
        this.nik = nik;
        this.frName = frName;
        this.kamar = kamar;
    }

    public Customer() {

    }

    public String getLsName() {
        return lsName;
    }

    public void setLsName(String lsName) {
        this.lsName = lsName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public void setFrName(String name) {
        this.frName = name;
    }

    public void setCheckin() {
        this.checkin = getTanggal();
    }

    public void setJam() {
        this.jam = getJam();
    }

    public String getId() {
        return id;
    }

    public String getNik() {
        return nik;
    }

    public String getName() {
        return frName;
    }

    public String getCheckin() {
        return checkin;
    }

    public String getCheckout() {
        return checkout;
    }

    public String getKamar() {
        return kamar;
    }

    public String getTanggal() {
        DateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
        Date date = new Date();
        return dateFormat.format(date);
    }

    public int getJam() {
        SimpleDateFormat sdf = new SimpleDateFormat("HH");
        Date skrg = new Date();
        int A = Integer.parseInt(sdf.format(skrg));
        return A;
    }

}
