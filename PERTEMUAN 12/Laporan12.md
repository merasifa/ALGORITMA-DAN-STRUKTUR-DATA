# <p align ="center">  LAPORAN PRAKTIKUM ALGORITMA DAN STRUKTUR DATA </p> 
# <p align ="center">  JOBSHEET 12 </p> 
# <p align ="center">  DOUBLE LINKED LIST </p> 
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
## 12.2.Percobaan 1

### class Node227.java

         public class Node227 {
            int data;
            Node227 prev, next;

            Node227(Node227 prev, int data, Node227 next) {
               this.prev = prev;
               this.data = data;
               this.next = next;
            }
         }
### class doubleLinkedList27.java

         public class DoubleLinkedList27 {
            Node227 head;
            int size;

            public DoubleLinkedList27() {
               head = null;
               size = 0;
            }

            public boolean isEmpty() {
               return head == null;
            }

            public void addFirst(int item) {
               if (isEmpty()) {
                     head = new Node227(null, item, null);
               } else {
                     Node227 newNode = new Node227(null, item, head);
                     head.prev = newNode;
                     head = newNode;
               }
               size++;
            }

            public void addLast(int item) {
               if (isEmpty()) {
                     addFirst(item);
               } else {
                     Node227 current = head;
                     while (current.next != null) {
                        current = current.next;
                     }
                     Node227 newNode = new Node227(current, item, null);
                     current.next = newNode;
                     size++;
               }
            }

            public void add(int item, int index) throws Exception {
               if (isEmpty()) {
                     addFirst(item);
               } else if (index < 0 || index > size) {
                     throw new Exception("Nilai indeks di luar batas");
               } else {
                     Node227 current = head;
                     int i = 0;
                     while (i < index) {
                        current = current.next;
                        i++;
                     }
                     if (current.prev == null) {
                        Node227 newNode = new Node227(null, item, current);
                        current.prev = newNode;
                        head = newNode;
                     } else {
                        Node227 newNode = new Node227(current.prev, item, current);
                        newNode.prev = current.prev;
                        newNode.next = current;
                        current.prev.next = newNode;
                        current.prev = newNode;
                     }
               }
               size++;
            }

            public int size() {
               return size;
            }

            public void clear() {
               head = null;
               size = 0;
            }

            public void print() {
               if (!isEmpty()) {
                     Node227 tmp = head;
                     while (tmp != null) {
                        System.out.print(tmp.data + "\t");
                        tmp = tmp.next;
                     }
                     System.out.println("\nberhasil diisi");
               } else {
                     System.out.println("Linked List Kosong");
               }
            }

### class doubleLinkedListMain.java

         public class DoubleLinkedListMain27 {
            public static void main(String[] args) throws Exception {
               
               DoubleLinkedList27 dll = new DoubleLinkedList27();
               dll.print();
               System.out.println("Size : " + dll.size());
               System.out.println("========================================");
               dll.addFirst(3);
               dll.addLast(4);
               dll.addFirst(7);
               dll.print();
               System.out.println("Size : " + dll.size());
               System.out.println("========================================");
               dll.add(40, 1);
               dll.print();
               System.out.println("Size : " + dll.size());
               System.out.println("========================================");
               dll.clear();
               dll.print();
               System.out.println("Size : " + dll.size());


## 12.2.2 Verifikasi Hasil Percobaan
![alt text](image-5.png)

## 12.2.3 Pertanyaan Percobaan
1. Jelaskan perbedaan antara single linked list dengan double linked lists!
2. Perhatikan class Node, di dalamnya terdapat atribut next dan prev. Untuk apakah atribut 
tersebut?
3. Perhatikan konstruktor pada class DoubleLinkedLists. Apa kegunaan inisialisasi atribut head dan 
![alt text](image.png)
size seperti pada gambar berikut ini?
4. Pada method addFirst(), kenapa dalam pembuatan object dari konstruktor class Node prev 
dianggap sama dengan null?
Node newNode = new Node(null, item, head);
5. Perhatikan pada method addFirst(). Apakah arti statement head.prev = newNode ?
6. Perhatikan isi method addLast(), apa arti dari pembuatan object Node dengan mengisikan 
parameter prev dengan current, dan next dengan null?
Node newNode = new Node(current, item, null);
7. Pada method add(), terdapat potongan kode program sebagai berikut:
jelaskan maksud dari bagian yang ditandai dengan kotak kuning.
![alt text](image-1.png)

## 12.2.Percobaan 2
### class DoubleLinkedList227.java
         public void removeFirst() throws Exception {
               if (isEmpty()) {
                     throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
               } else if (size == 1) {
                     removeLast();
               } else {
                     head = head.next;
                     head.prev = null;
                     size--;
               }
            }

            public void removeLast() throws Exception{
               if (isEmpty()) {
                     throw new Exception("Linked List masih kosong, tidak dapat dihapus!");
               } else if (head.next == null) {
                     head = null;
                     size--;
                     return;
               }
               Node227 current = head;
               while (current.next.next != null) {
                     current = current.next;
               }
               current.next = null;
               size--;
            }

            public void remove (int index) throws Exception {
               if (isEmpty() || index >= size) {
                     throw new Exception("Nilai indeks di luar batas");
               } else if (index ==0) {
                     removeFirst();
               } else {
                     Node227 current = head;
                     int i = 0;
                     while (i < index) {
                        current = current.next;
                        i++;
                     }
                     if (current.next == null) {
                        current.prev.next = null;
                     } else if (current.prev == null) {
                        current = current.next;
                        current.prev = null;
                        head = current;
                     } else {
                        current.prev.next = current.next;
                        current.next.prev = current.prev;
                     }
                     size--;
               }
            }
## 12.3.2 Verifikasi Hasil Percobaan
![alt text](image-6.png)
## 12.3.3 Pertanyaan Percobaan
1. Apakah maksud statement berikut pada method removeFirst()?
head = head.next;
head.prev = null;
2. Bagaimana cara mendeteksi posisi data ada pada bagian akhir pada method removeLast()?
3. Jelaskan alasan potongan kode program di bawah ini tidak cocok untuk perintah remove!
![alt text](image-2.png)
4. Jelaskan fungsi kode program berikut ini pada fungsi remove!
![alt text](image-3.png)

## 12.2.Percobaan 3

## 12.3.2 Verifikasi Hasil Percobaan

## 12.3.3 Pertanyaan Percobaan
1. Jelaskan method size() pada class DoubleLinkedLists!
2. Jelaskan cara mengatur indeks pada double linked lists supaya dapat dimulai dari indeks ke1!
3. Jelaskan perbedaan karakteristik fungsi Add pada Double Linked Lists dan Single Linked Lists! 
4. Jelaskan perbedaan logika dari kedua kode program di bawah ini!
![alt text](image-4.png)

## TUGAS PRAKTIKUM
1. PROGRAM ANTRIAN VAKSINASI
2. DATA FILM LAYAR LEBAR
