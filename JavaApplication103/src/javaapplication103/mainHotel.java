package tugasakhir;

import java.util.Scanner;

public class mainHotel {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, i = 0;
        String k;
        byte num, b = 1;
        Costumer[] c = new Costumer[100];
        Regular[] r = new Regular[50];
        Premium[] p = new Premium[20];
        Suite[] s = new Suite[20];
        VIP[] v = new VIP[10];
        Room[] R = new Room[100];
        for (i = 0; i < v.length; i++) {
            v[i] = new VIP("VIP", 750000, "V" + (i + 1), "Available");
        }
        for (i = 0; i < p.length; i++) {
            p[i] = new Premium("Premium", 200000, "P" + (i + 1), "Available");
            s[i] = new Suite("Suite", 350000, "S" + (i + 1), "Available");
        }
        for (i = 0; i < r.length; i++) {
            r[i] = new Regular("Regular", 100000, "R" + (i + 1), "Available");
        }
        for (a = 0; a < v.length; a++) {
            R[a] = v[a];
        }
        for (i = 0; i < p.length; i++) {
            R[a++] = p[i];
        }
        for (i = 0; i < s.length; i++) {
            R[a++] = s[i];
        }
        for (i = 0; i < r.length; i++) {
            R[a++] = r[i];
        }
        System.out.println("SELAMAT DATANG DI HOTEL MANTAP" + "\nMenu:" + "\n1. Check in"
                + "\n2. Check Out" + "\n3. Check Room" + "\n4. Keluar" + "\nMasukkan Pilihan : ");
        num = in.nextByte();
        switch (num) {
            case 1:
                System.out.println("" + "\nJenis kamar yang ingin anda pilih :" + "\n1. VIP (@ Rp750000)"
                        + "\n2. Suite (@ Rp350000)" + "\n3. Premium (@ Rp200000)"
                        + "\n4. Regular (@ Rp100000)" + "\n5. Cancel" + "\nMasukkan Pilihan :");
                num = 0;
                num = in.nextByte();
                switch (num) {
                    case 1:
                        System.out.println("");
                        do {
                            System.out.println("===========LIST KAMAR===========");
                            System.out.println("|| NO || ID ROOM || STATUS ||   ");
                            for (Room vip : v) {
                                System.out.printf("%5d%4s%4s\n", (b++), "", vip);
                            }
                            System.out.println("Masukkan id kamar : ");
                            k = in.next();
                            for (i = 0; i < r.length; i++) {
                                if (k.equalsIgnoreCase(r[i].getIdRoom())) {
                                    r[i].setStatus("Booked");
                                    System.out.println("\nAnda memesan kamar hotel " + r[i].getIdRoom() + "\nMasukkan jumlah hari check in : ");
                                    num = 0;
                                    num = in.nextByte();
                                    c[i] = new Costumer();
                                    System.out.print("Masukkan nama anda : ");
                                    c[i].setNama(in.next());
                                    c[i].setNama(in.nextLine());
                                    System.out.print("Masukkan NIK : ");
                                    c[i].setNik(in.nextLine());
                                    System.out.print("Masukkan id : ");
                                    c[i].setId(in.nextInt());
                                    System.out.print("Masukkan Tempat Tanggal Lahir : ");
                                    c[i].setTtl(in.next());
                                    c[i].setTtl(in.nextLine());
                                    System.out.println("");
                                    System.out.println(R[i].setPrice(num));
                                    c[i].display();
                                    System.out.println("Apakah anda ingin memesan kamar lagi ? (Y/T) ");
                                    k = "null";
                                    k = in.nextLine();
                                    b = 1;
                                }
                            }
                        } while (k.equalsIgnoreCase("y"));
                        System.out.println(i);
                        break;
                    case 2:
                        System.out.println(i);
                        do {
                            System.out.println("===========LIST KAMAR===========");
                            System.out.println("|| NO || ID ROOM || STATUS ||   ");
                            for (Room suite : s) {
                                System.out.printf("%5d%4s%4s\n", (b++), "", suite);
                            }
                            System.out.println("Masukkan id kamar : ");
                            k = in.nextLine();
                            k = in.next();
                            for (i = 0; i < s.length; i++) {
                                if (k.equalsIgnoreCase(s[i].getIdRoom())) {
                                    s[i].setStatus("Booked");
                                    System.out.println("\nAnda memesan kamar hotel " + s[i].getIdRoom() + "\nMasukkan jumlah hari check in : ");
                                    num = 0;
                                    num = in.nextByte();
                                    c[i] = new Costumer();
                                    System.out.print("Masukkan nama anda : ");
                                    c[i].setNama(in.next());
                                    c[i].setNama(in.nextLine());
                                    System.out.print("Masukkan NIK : ");
                                    c[i].setNik(in.nextLine());
                                    System.out.print("Masukkan id : ");
                                    c[i].setId(in.nextInt());
                                    System.out.print("Masukkan Tempat Tanggal Lahir : ");
                                    c[i].setTtl(in.next());
                                    c[i].setTtl(in.nextLine());
                                    System.out.println("");
                                    System.out.println(R[i].setPrice(num));
                                    c[i].display();
                                    System.out.println("Apakah anda ingin memesan kamar lagi ? (Y/T) ");
                                    k = "null";
                                    k = in.nextLine();
                                }
                            }
                        } while (k.equalsIgnoreCase("y"));
                        break;
                    case 3:
                        do {
                            System.out.println("===========LIST KAMAR===========");
                            System.out.println("|| NO || ID ROOM || STATUS ||   ");
                            for (Room premium : p) {
                                System.out.printf("%5d%4s%4s\n", (b++), "", premium);
                            }
                            System.out.println("Masukkan id kamar : ");
                            k = in.nextLine();
                            k = in.next();
                            for (i = 0; i < r.length; i++) {
                                if (k.equalsIgnoreCase(p[i].getIdRoom())) {
                                    v[i].setStatus("Booked");
                                    System.out.println("\nAnda memesan kamar hotel " + p[i].getIdRoom() + "\nMasukkan jumlah hari check in : ");
                                    num = 0;
                                    num = in.nextByte();
                                    c[i] = new Costumer();
                                    System.out.print("Masukkan nama anda : ");
                                    c[i].setNama(in.next());
                                    c[i].setNama(in.nextLine());
                                    System.out.print("Masukkan NIK : ");
                                    c[i].setNik(in.nextLine());
                                    System.out.print("Masukkan id : ");
                                    c[i].setId(in.nextInt());
                                    System.out.print("Masukkan Tempat Tanggal Lahir : ");
                                    c[i].setTtl(in.next());
                                    c[i].setTtl(in.nextLine());
                                    System.out.println("");
                                    System.out.println(R[i].setPrice(num));
                                    c[i].display();
                                    System.out.println("Apakah anda ingin memesan kamar lagi ? (Y/T) ");
                                    k = "null";
                                    k = in.nextLine();
                                }
                            }
                        } while (k.equalsIgnoreCase("y"));
                        break;

                }

        }

    }

}
}
