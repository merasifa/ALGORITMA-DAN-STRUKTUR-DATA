# <p align ="center">  LAPORAN PRAKTIKUM ALGORITMA DAN STRUKTUR DATA </p> 
# <p align ="center">  JOBSHEET 2 </p> 
<br><br><br><br>

<p align="center">
   <img src="https://static.wikia.nocookie.net/logopedia/images/8/8a/Politeknik_Negeri_Malang.png/revision/latest?cb=20190922202558" width="30%"> </p>

<br><br><br><br><br>


<p align = "center"> Nama : Tiara Mera Sifa </p>
<p align = "center"> NIM  : 2341720247 </p>
<p align = "center"> Prodi: D-IV Teknik Informatika</p>
<p align = "center"> Kelas: 1B / 27 </p>

<br><br><br><br><br>


## 2.1 Percobaan 1: Deklarasi Class, Atribut dan Method
![Alt text](<img/Screenshot 2024-02-21 130839.png>)

## 2.1.3 Pertanyaan
1. Sebutkan dua karakteristik class atau object!<br>
   Karakteristik class atau object adalah mempunyai sesuatu dan melakukan sesuatu
2. Perhatikan class Buku pada Praktikum 1 tersebut, ada berapa atribut yang dimiliki oleh class Buku? Sebutkan apa saja atributnya!<br>
   Class buku memiliki 5 Atribut yaitu judul, pengarang, halaman, stok, harga.
3. Ada berapa method yang dimiliki oleh class tersebut? Sebutkan apa saja methodnya!<br>
   Class tersebut memiliki 4 Method, diantaranya yaitu method tampilInformasi, method terjual, method restock, dan method gantiHarga.
4. Perhatikan method terjual() yang terdapat di dalam class Buku. Modifikasi isi method tersebut sehingga proses pengurangan hanya dapat dilakukan jika stok masih ada (lebih besar dari 0)!<br>
   void terjual(int jml) {
        if (stok > 0 && jml <= stok)
        stok -= jml;
5. Menurut Anda, mengapa method restock() mempunyai satu parameter berupa bilangan int?<br>
   Agar hasil dari method tersebut bisa dijumlahkan dengan stock dan jumlah
6. Commit dan push kode program ke Github


## 2.2 Percobaan 2: Instansiasi Object, serta Mengakses Atribut dan Method
![alt text](<img/image.png>)

## 2.2.3 Pertanyaan
1. Pada class BukuMain, tunjukkan baris kode program yang digunakan untuk proses instansiasi!</br>
Apa nama object yang dihasilkan?
   Baris Program yang digunakan untuk instansiasi Buku27 bk1 = new Buku27();
   Nama Object yang dihasilkan adalah bk1
2. Bagaimana cara mengakses atribut dan method dari suatu objek?
   Menambahkan operator titik(.) dan diikuti oleh nama atribut.
3. Mengapa hasil output pemanggilan method tampilInformasi() pertama dan kedua berbeda?
   Karena tergantung pada implementasi method tersebut dan juga keadaan objek pada saat pemanggilan.


## 2.3 Percobaan 3: Membuat Konstruktor
![alt text](<img/image1.png>)
![alt text](<img/image2.png>)

## 2.3.2 Verifikasi Hasil Percobaan


## 2.3.3 Pertanyaan
1. Pada class Buku di Percobaan 3, tunjukkan baris kode program yang digunakan untuk
mendeklarasikan konstruktor berparameter!<br>
   public Buku27(String jud, String pg, int hal, int stok, int har)
2. Perhatikan class BukuMain. Apa sebenarnya yang dilakukan pada baris program berikut?<br>
   Baris kode tersebut adalah instansiasi objek dari class buku27, dengan menggunakan constructor parameter. "bk2" adalah nama objek yang baru dibuat. "self reward", "maheera ayesha", 160, 29, 59000 adalah argumen yang diberikan kepada konstruktor. 
3. Hapus konstruktor default pada class Buku, kemudian compile dan run program. Bagaimana
hasilnya? Jelaskan mengapa hasilnya demikian!<br>
   Hasilnya erorr. Hasilnya error karena class tidak akan bisa memiliki konstruktor yang menerima parameter.
4. Setelah melakukan instansiasi object, apakah method di dalam class Buku harus diakses
secara berurutan? Jelaskan alasannya!<br>
   Tidak, kita bisa memanggil method sesuai kebutuhan yang diinginkan
5. Buat object baru dengan nama buku<NamaMahasiswa> menggunakan konstruktor berparameter dari class Buku!<br>
![alt text](<img/image3.png>)
6. Commit dan push kode program ke Github


## 2.4 Latihan Praktikum
1. . Pada class Buku yang telah dibuat, tambahkan tiga method yaitu hitungHargaTotal(),
hitungDiskon(), dan hitungHargaBayar() dengan penjelasan sebagai berikut:

2. Buat program berdasarkan class diagram dragon berikut ini!
# dragon.java
![alt text](<img/image4.png>)
# dragonmain.java
![alt text](<img/image5.png>)
# Hasil Percobaan 
![alt text](<img/image6.png>)