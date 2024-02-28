# <p align ="center">  LAPORAN PRAKTIKUM ALGORITMA DAN STRUKTUR DATA </p> 
# <p align ="center">  JOBSHEET 3 </p> 
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
## 3.2 Membuat Array dari Object, Mengisi dan Menampilkan
![alt text](<img/1.png>)
![alt text](<img/2.png>)
## 3.2.2 Verifikasi Hasil Percobaan
![alt text](<img/3.png>)
## 3.2.3 Pertanyaan
1. Berdasarkan uji coba 3.2, apakah class yang akan dibuat array of object harus selalu memiliki atribut dan sekaligus method?Jelaskan!<br> Tidak, jadi setiap class yang akan dibuat sebagai array tidak wajib memiliki atribut dan method. Mehod dan atribut diberikan sesuai kebutuhan program

2. Apakah class PersegiPanjang memiliki konstruktor?Jika tidak, kenapa dilakukan pemanggilan konstruktur pada baris program berikut :
    tidak memiliki konstruktor, ppArray[0] = new PersegiPanjang(); digunakan untuk instance objek ppArray dengan indeks ke 0
3. Apa yang dimaksud dengan kode berikut ini:<br>
    kode berikut berisi kode instance array PersegiPanjang dengan panjang 3
4. Apa yang dimaksud dengan kode berikut ini:<br>
    ppArray[1] = new PersegiPanjang(); //instance objek persegi panjang pada indeks 0
    ppArray[1].panjang = 80;
    ppArray[1].lebar = 40; 
    Kode diatas berisi pengisian nilai atribut untuk panjang dan lebar dari objek ppArray di indeks ke-1.

5. Mengapa class main dan juga class PersegiPanjang dipisahkan pada uji coba 3.2?<br>
Agar terstruktur dan lebih rapi, serta memisahkan tanggung jawab antar kode.

## 3.3 Menerima Input Isian Array Menggunakan Looping
![alt text](<img/6.png>)

## 3.3.2 Verifikasi Hasil Percobaan
![alt text](<img/image2.png>)

## 3.3.3 Pertanyaan
1. Apakah array of object dapat diimplementasikan pada array 2 Dimensi?<br>
bisa
2. Jika jawaban soal no satu iya, berikan contohnya! Jika tidak, jelaskan!<br>

3. Jika diketahui terdapat class Persegi yang memiliki atribut sisi bertipe integer, maka kode 
dibawah ini akan memunculkan error saat dijalankan. Mengapa?<br>

4. Modifikasi kode program pada praktikum 3.3 agar length array menjadi inputan dengan Scanner!<br>

5. Apakah boleh Jika terjadi duplikasi instansiasi array of objek, misalkan saja instansiasi dilakukan 
pada ppArray[i] sekaligus ppArray[0]?Jelaskan !<br>

## 3.4 Operasi Matematika Atribut Object Array
![alt text](<img/4.png>)
![alt text](<img/5.png>)
## 3.4.2 Verifikasi Hasil Percobaan
![alt text](img/image1.png)
## 3.4.3 Pertanyaan
1. Dapatkah konstruktor berjumlah lebih dalam satu kelas? Jelaskan dengan contoh!
2. Jika diketahui terdapat class Segitiga seperti berikut ini:<br>
![alt text](<img/image soal.png>)<br>
Tambahkan konstruktor pada class Segitiga tersebut yang berisi parameter int a, int t
yang masing-masing digunakan untuk mengisikan atribut alas dan tinggi.
3. Tambahkan method hitungLuas() dan hitungKeliling() pada class Segitiga
tersebut.
4. Pada fungsi main, buat array Segitiga sgArray yang berisi 4 elemen, isikan masing-masing 
atributnya sebagai berikut:
sgArray ke-0 alas: 10, tinggi: 4
sgArray ke-1 alas: 20, tinggi: 10
sgArray ke-2 alas: 15, tinggi: 6
sgArray ke-3 alas: 25, tinggi: 10
5. Kemudian menggunakan looping, cetak luas dan keliling dengan cara memanggil method 
hitungLuas() dan hitungKeliling().


