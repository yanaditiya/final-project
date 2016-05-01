# Final Project Praktikum Pemrograman Lanjut

### Rule ###

* Tiap kelompok berisi 3 orang, jadi ada 13 kelompok;
* Setiap kelompok salah satu anggotanya harus ada yang bertugas sebagai team leader yang bertugas untuk mengordinasi anggotanya, memantau proses pengembangan perangkat lunak, dan tentu saja terlibat aktif dalam proses pengembangan;
* Tiap kelompok diwajibkan melakukan commit pekerjaannya di fork repositori ini, dan tiap repositori harus berisi 3 contributor dan tiap contributor diwajibkan pula terlibat dalam proses coding yang dibuktikan dari commit history;
* Dokumen perancangan perangkat lunak harus disertakan, misalkan:
    *   UML Diagram {class diagram, sequence diagram, use case diagram, dll};
    *   Entity Relationship Diagram (jika ada, atau jika memakai DBMS relasional);
    *   CRC (Class Responsibility Collaboration) card;
    *   Dokumentasi dari tiap method yang ditulis.
* Dokumentasi silakan dijadikan satu di file pdf (template menyusul). Untuk dokumentasi per method silakan ditulis langsung di source codenya seperti contoh dibawah;
* Diperbolehkan memanfaatkan materi/teknologi yang tidak diajarkan di praktikum, misalkan penggunaan DBMS atau library-library lain. Asalkan sesuai dengan requirement;
* **Pengerjaan project akhir ini merupakan simulasi/miniatur dari proses pengembangan perangkat lunak yang sesungguhnya.**

### Penilaian ###

* Penilaian terdiri dari komponen sebagai berikut:
    * Penilaian progress pengerjaan project yang dilakukan diluar praktikum kepada asisten;
    * Penilaian dokumentasi program;
    * Penilaian testing/debug program;
    * Penilaian per individu.

### Contoh Dokumentasi Source Code ###

```java
/**
*
* Menghitung nilai faktorial
*
* @param num bilangan yang akan dicari nilai faktorialnya
* @return nilai faktorialnya
*
*/
public int calculateFactorial(int num) {
    return (num == 1) ? 1 : num * calculateFactorial(num - 1);
}
```
