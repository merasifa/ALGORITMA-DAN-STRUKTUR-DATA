# <p align ="center">  LAPORAN PRAKTIKUM ALGORITMA DAN STRUKTUR DATA </p> 
# <p align ="center">  JOBSHEET 4 </p> 
<br><br><br><br>

<p align="center">
   <img src="https://static.wikia.nocookie.net/logopedia/images/8/8a/Politeknik_Negeri_Malang.png/revision/latest?cb=20190922202558" width="30%"> </p>

<br><br><br><br><br>


<p align = "center"> Nama : Tiara Mera Sifa </p>
<p align = "center"> NIM  : 2341720247 </p>
<p align = "center"> Prodi: D-IV Teknik Informatika</p>
<p align = "center"> Kelas: 1B / 27 </p>

<br><br><br><br><br>


# Praktikum
## 4.2 Menghitung Nilai Faktorial dengan Algoritma Brute Force dan Divide and Conquer
![alt text](img/1.png)
![alt text](img/2.png)
## 4.2.2 Verifikasi Hasil Percobaan
![alt text](img/image-1.png)
## 4.2.3 Pertanyaan
1. Pada base line Algoritma Divide Conquer untuk melakukan pencarian nilai faktorial, jelaskan perbedaan bagian kode pada penggunaan if dan else!<br>
Perbedaanya terletak pada pemecahan masalahnya. If Else digunakan untuk mengevaluasi kondisi tertentu dan else digunakan ketika kondisi if tidak terpenuhi. Sedangkan Divide and Conquer membagi satu masalah menjadi sub masalah, dan kemudian sub masalah tersebut di pecahkan secara rekursif dan hasilnya digabung untuk mendapatkan solusi. 

2. Apakah memungkinkan perulangan pada method faktorialBF() dirubah selain menggunakan for?Buktikan!<br>
Memungkinkan. <br>
![alt text](img/image-5.png)

3. Jelaskan perbedaan antara fakto *= i; dan int fakto = n * faktorialDC(n-1); !<br>
jadi fakto *= i, setiap iterasi loop langsung mengalikan nilai fakto dengan nilai i. Sedangkan int fakto = n * faktorialDC(n-1);, memanggil fungsi itu sendiri untuk menghitung nilai faktorial secara berulang sampai kasusnya terselesaikan.

## 4.3 Menghitung Hasil Pangkat dengan Algoritma Brute Force dan Divide and Conquer
![alt text](img/3.png)
![alt text](img/4.png)
## 4.2.2 Verifikasi Hasil Percobaan
![alt text](img/image-2.png)
## 4.2.3 Pertanyaan
1. Jelaskan mengenai perbedaan 2 method yang dibuat yaitu PangkatBF() dan PangkatDC()!<br>
pangkatBF() melakukan perhitungan berulang tanpa memecah masalahnya, sedangkan pangkatDC() membagi masalah menjadi submasalah yang lebih kecil untuk menghitung hasil pangkat.

2. Apakah tahap combine sudah termasuk dalam kode tersebut?Tunjukkan!<br>
![alt text](img/image-6.png)
3. Modifikasi kode program tersebut, anggap proses pengisian atribut dilakukan dengan konstruktor.<br>
![alt text](img/image-7.png)
![alt text](img/image-8.png)
4. Tambahkan menu agar salah satu method yang terpilih saja yang akan dijalankan menggunakan switch-case!<br>
![alt text](img/image-9.png)

## 4.4 Menghitung Sum Array dengan Algoritma Brute Force dan Divide and Conquer
![alt text](img/5.png)
![alt text](img/6.png)
## 4.2.2 Verifikasi Hasil Percobaan
![alt text](img/image-3.png)
## 4.2.3 Pertanyaan
1. Mengapa terdapat formulasi return value berikut?Jelaskan!<br>
![alt text](img/image.png)
Formulasi tersebut digunakan untuk menggabungkan total dari kedua submasalah kiri dan kanan dengan menambahkan nilai elemen tengah untuk mendapatkan total keseluruhan dari array.
2. Kenapa dibutuhkan variable mid pada method TotalDC()?<br>
Variable mid digunakan untuk menentukan pembagian array menjadi dua bagian yang seimbang.

3. Program perhitungan keuntungan suatu perusahaan ini hanya untuk satu perusahaan saja.
Bagaimana cara menghitung sekaligus keuntungan beberapa bulan untuk beberapa
perusahaan.(Setiap perusahaan bisa saja memiliki jumlah bulan berbeda-beda)? Buktikan
dengan program!<br>


## 4.5 Latihan Praktikum 
![alt text](img/7.png)
![alt text](img/8.png)
## HASIL
![alt text](img/image-4.png)