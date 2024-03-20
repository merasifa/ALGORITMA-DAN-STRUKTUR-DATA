# <p align ="center">  LAPORAN PRAKTIKUM ALGORITMA DAN STRUKTUR DATA </p> 
# <p align ="center">  JOBSHEET 5 </p> 
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
## 5.2 Mengurutkan Data Mahasiswa Berdasarkan IPK Menggunakan Bubble Sort

      Class mahasiswa27
               public class mahasiswa27 {
                  int nim;
                  String nama;
                  int umur;
                  double ipk;

            public mahasiswa27( String ni, int n, int u, double i){
               nama = ni;
               nim = n;
               umur = u;
               ipk = i;
            }

            void tampil(){
               System.out.println("NIM   :"+ nim);
               System.out.println("Nama  :"+ nama);
               System.out.println("Umur  :"+ umur);
               System.out.println("IPK  :"+ ipk);
            }
         }

Class DaftarMhsPrestasi

         public class DaftarMhsPrestasi {
            mahasiswa27[] listMhs = new mahasiswa27[5];
            int idx;

            void tambah(mahasiswa27 m ){
               if (idx < listMhs.length){
                     listMhs[idx]  = m;
                     idx++;
               }else{
                     System.out.println("Data sudah penuh");
               }
            }

            void tampil(){
               for(mahasiswa27 m : listMhs){
                     m.tampil();
                     System.out.println("============================");
               }
            }

            void bubbleSort(){
               for (int i=0; i<listMhs.length-1; i++){
                     for (int j=1; j<listMhs.length-i; j++){
                        if(listMhs[j].ipk > listMhs [j-1].ipk){ // proses membandingkan
                           //proses swap
                           mahasiswa27 tmp = listMhs[j];
                           listMhs[j] = listMhs [j-1];
                           listMhs [j-1] = tmp;
                        }
                     }
               }
            }
         }
Class Mhs
         import java.util.Scanner;

         public class mainMhs {
            public static void main(String[] args) {
               DaftarMhsPrestasi list = new DaftarMhsPrestasi();
               mahasiswa27 m1 = new mahasiswa27("Nusa", 2017, 25, 3);
               mahasiswa27 m2 = new mahasiswa27("Rara", 2012, 19, 4);
               mahasiswa27 m3 = new mahasiswa27("Dompu", 2018, 19, 3.5);
               mahasiswa27 m4 = new mahasiswa27("Abdul", 2017, 23, 2);
               mahasiswa27 m5 = new mahasiswa27("Ummi", 2019, 21, 3.75);

               list.tambah(m1);
               list.tambah(m2);
               list.tambah(m3);
               list.tambah(m4);
               list.tambah(m5);

               System.out.println("Data mahasiswa sebelum sorting = ");
               list.tampil();

               System.out.println("Data mahasiswa setelah sorting desc berdasarkan ipk ");
               list.bubbleSort();
               list.tampil();


            }
         }



## 5.2.2 Verifikasi Hasil Percobaan
![alt text](img/image-1.png)

## 5.2.3 Pertanyaan
1. Terdapat di method apakah proses bubble sort?
2. Di dalam method bubbleSort(), terdapat baris program seperti di bawah ini:
Untuk apakah proses tersebut?
3. Perhatikan perulangan di dalam bubbleSort() di bawah ini:
a. Apakah perbedaan antara kegunaan perulangan i dan perulangan j?
b. Mengapa syarat dari perulangan i adalah i<listMhs.length-1 ?
c. Mengapa syarat dari perulangan j adalah j<listMhs.length-i ?
d. Jika banyak data di dalam listMhs adalah 50, maka berapakali perulangan i akan
berlangsung? Dan ada berapa Tahap bubble sort yang ditempuh?

## 5.2 Mengurutkan Data Mahasiswa Berdasarkan IPK Menggunakan Selection Sort
            void selectionSort(){
               for (int i=0; i<listMhs.length-1; i++){
                     int idxMin = i;
                     for (int j=i+1; j<listMhs.length; j++){
                        if(listMhs[j].ipk < listMhs [idxMin].ipk){ // proses membandingkan
                           idxMin = j;
                        }
                     }
                           //proses swap
                           mahasiswa27 tmp = listMhs[idxMin];
                           listMhs[idxMin] = listMhs [i];
                           listMhs [i] = tmp;
                        }
                     }      
            
Class main

                  System.out.println("Data mahasiswa setelah sorting asc berdasarkan ipk");
                  list.selectionSort();
                  list.tampil();



## 5.2.2 Verifikasi Hasil Percobaan

## 5.2.3 Pertanyaan
Di dalam method selection sort, terdapat baris program seperti di bawah ini:
Untuk apakah proses tersebut, jelaskan!

## 5.2 Mengurutkan Data Mahasiswa Berdasarkan IPK Menggunakan  Insertion Sort
Class DaftarMhsPrestasi

            void insertionSort(){
               for (int i=1; i<listMhs.length; i++){
                     mahasiswa27 temp = listMhs[i];
                     int j = i;
                     while ( j < 0 && listMhs[j-1].ipk > temp.ipk) {
                        listMhs[j] = listMhs[ j-1 ];
                        j--;
                     }
                     listMhs[j] = temp;
                     }
            }


class Main

         System.out.println("Data mahasiswa setelah sorting insertion asc berdasarkan ipk");
               list.selectionSort();
               list.tampil();


## 5.2.2 Verifikasi Hasil Percobaan

## 5.2.3 Pertanyaan
Ubahlah fungsi pada InsertionSort sehingga fungsi ini dapat melaksanakan proses sorting
dengan cara descending.

## 5.5 Latihan Praktikum