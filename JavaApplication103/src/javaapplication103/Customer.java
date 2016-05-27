package javaapplication103;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Calendar;

public class Customer {

    protected int jam;
    protected String id, nik, frName, lsName, ttl, checkin,checkout,kamar;
    
    Customer [] custData = new Customer [100];

    public Customer(String id, String nik, String frName, String lsName,String ttl, String checkin,String checkout,String kamar) {
        this.id = id;
        this.nik = nik;
        this.frName = frName;
        this.lsName = lsName;
        this.ttl = ttl;
        this.checkin = checkin;
        this.checkout= checkout;
        this.kamar= kamar;
    }
    public Customer(){
        
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

    public void setTtl(String ttl) {
        this.ttl = ttl;
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

    public String getTtl() {
        return ttl;
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
