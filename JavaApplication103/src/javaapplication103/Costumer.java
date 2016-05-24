
package tugasakhir;


public class Costumer {
    private int id;
    private String nik,name,ttl;
    private byte checkin;

    public void setId(int id) {
        this.id = id;
    }

    public void setNik(String nik) {
        this.nik = nik;
    }

    public void setNama(String name) {
        this.name = name;
    }

    public void setTtl(String ttl) {
        this.ttl = ttl;
    }

    public void setCheckin(byte checkin) {
        this.checkin = checkin;
    }

    public void display(){
        System.out.println("DETAIL PEMESAN");
        System.out.println("Nama : "+getName());
        System.out.println("Id : "+getId());
        System.out.println("Nik : "+getNik());
        System.out.println("Tempat Tanggal Lahir : "+getTtl());
        System.out.println("Tanggal Check in : "+getCheckin());
    }
    
    public int getId() {
        return id;
    }

    public String getNik() {
        return nik;
    }

    public String getName() {
        return name;
    }

    public String getTtl() {
        return ttl;
    }

    public byte getCheckin() {
        return checkin;
    }
    
    
    
}
