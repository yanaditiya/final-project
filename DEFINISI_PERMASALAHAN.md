# Definisi Masalah

Hotel Mantap sedang membutuhkan developer terbaik untuk mengembangkan sistem informasi reservasi kamar hotelnya dengan menggunakan Java.

Ada beberapa requirement yang diinginkan oleh sang pemilik hotel, diantaranya :

**1)** Hotel memiliki 100 kamar, yang memiliki rincian kelas kamar dan harga kamar per malam sebagai berikut :

Kelas | Jumlah Kamar | Harga Per Malam (Rp)
:------:|:--------------:|:----------------:
Reguler | 50 | 100.000
Premium | 20 | 200.000
Suite | 20 | 350.000
VIP | 10 | 750.000

Tiap kamar pastinya memiliki nomer kamar yang berbeda dan memiliki status apakah kamar tersebut disewa apa tidak.

**2)** Tiap pelanggan akan terdaftar dalam sistem dan akan mendapatkan diskon harga sewa kamar bergantung pada seberapa sering pelanggan tersebut menginap di hotelnya. Rinciannya sebagai berikut :

Akumulasi Lama Sewa (hari) | Diskon
:--------------------:|:-------:
0 - 9 | 0 %
10 - 30 | 10 %
31 - 60 | 15 %
61 - dst | 25 %

**3)** Detail pelanggan yang disimpan meliputi : nomor id pelanggan (bebas, bisa digenerate otomatis maupun diinput manual), NIK, nama lengkap, tempat tanggal lahir dan tanggal dimana pelanggan tersebut terdaftar dalam sistem.

**4)** Setiap kamar yang nantinya dipesan, jumlah kamar yang tersimpan dalam sistem akan berkurang setiap transaksi. Tangani juga jika jumlah kamarnya habis atau tidak cukup. Untuk jam check out, disamakan dengan jam check in. Jika pelanggan terlambat checkout, maka dikenakan denda Rp. 30.000/jam. Pembayaran dilakukan pada waktu checkout. Setelah dilakukan checkout, maka jumlah kamar akan secara otomatis bertambah sebanyak jumlah kamar yang dicheckout terakhir.

**5)** Sistem akan mencetak detail pelanggan, tagihan biaya kamar hotel, berapa yang dibayarkan dan uang kembalian yang formatnya bebas ditentukan sendiri oleh developer. Pembayaran dibatasi hanya pembayaran dengan uang tunai.

**6)** Setiap transaksi reservasi kamar hotel akan selalu tercatat yang berisikan detail penyewa, detail kamar, biaya kamar, tanggal check in dan check out, dan status masih ditempati maupun sudah checkout.

**7)** Sistem akan mencetak laporan pendapatan hotel yang digenerate setiap bulannya.

**8)** Buatlah tampilan semenarik mungkin dengan memanfaatkan GUI toolkit yang ada di Java, dan usahakan data transaksi maupun data pelanggan ditampilkan dengan table. Manfaatkan fungsi CRUD (create, read, update, delete) dengan maksimal.

**9)** Penyimpanan datanya usahakan permanen, misalkan disimpan di file teks maupun memakai database.

**10)** Dokumentasi perangkat lunak jangan lupa disertakan.

**Selamat Mengerjakan ^^**

>Karena sesungguhnya sesudah kesulitan itu ada kemudahan;
Sesungguhnya sesudah kesulitan itu ada kemudahan. (QS Al Insyirah, 5-6)
