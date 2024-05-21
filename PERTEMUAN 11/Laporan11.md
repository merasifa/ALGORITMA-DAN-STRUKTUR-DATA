# <p align ="center">  LAPORAN PRAKTIKUM ALGORITMA DAN STRUKTUR DATA </p> 
# <p align ="center">  JOBSHEET 11 </p> 
# <p align ="center">  LINKED LIST </p> 
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
## 2.1 Pembuatan Single Linked List

### class Node27.java

            public class Node27 {
                int data;
                Node27 next;

                Node27 (int nilai, Node27 berikutnya){
                    data = nilai;
                    next = berikutnya;
                }
            }

### class SingleLinkedList27.java

            public class SingleLinkedList27 {
                Node27 head, tail;

                boolean isEmpty() {
                    return head == null;
                }

                void print() {
                    if (isEmpty()) {
                        System.out.println("Linked List kosong");
                    } else {
                        Node27 tmp = head;
                        System.out.print("Isi Linked List \t");
                        while (tmp != null) {
                            System.out.print(tmp.data + "\t");
                            tmp = tmp.next;
                        }
                        System.out.println("");
                    }
                }

                void addFirst(int input) {
                    Node27 ndInput = new Node27(input, null);
                    if (isEmpty()) {
                        head = ndInput;
                        tail = ndInput;
                    } else {
                        ndInput.next = head;
                        head = ndInput;
                    }
                }

                void addLast(int input) {
                    Node27 ndInput = new Node27(input, null);
                    if (isEmpty()) {
                        head = ndInput;
                        tail = ndInput;
                    } else {
                        tail.next = ndInput;
                        tail = ndInput;
                    }
                }

                void insertAfter(int key, int input) {
                    Node27 ndInput = new Node27(input, null);
                    Node27 temp = head;
                    while (temp != null) {
                        if (temp.data == key) {
                            ndInput.next = temp.next;
                            temp.next = ndInput;
                            if (ndInput.next == null) {
                                tail = ndInput;
                            }
                            break;
                        }
                        temp = temp.next;
                    }
                }

                void insertAt(int index, int input) {
                    Node27 ndInput = new Node27(input, null);
                    if (index < 0) {
                        System.out.println("Perbaiki logikanya! Kalau indeksnya -1 bagaimana??");
                    } else if (index == 0) {
                        addFirst(input);
                    } else {
                        Node27 temp = head;
                        for (int i = 0; i < index - 1 && temp != null; i++) {
                            temp = temp.next;
                        }
                        if (temp != null) {
                            ndInput.next = temp.next;
                            temp.next = ndInput;
                            if (ndInput.next == null) {
                                tail = ndInput;
                            }
                        } else {
                            System.out.println("Indeks melebihi panjang linked list");
                        }
                    }
                }
            }


### class SLLMain.java

            public class SLLMain {
                public static void main(String[] args) {
                    SingleLinkedList27 singLL = new SingleLinkedList27();
                    singLL.print();
                    singLL.addFirst(890);
                    singLL.print();;
                    singLL.addLast(760);
                    singLL.print();
                    singLL.addFirst(700);
                    singLL.print();;
                    singLL.insertAfter(700, 999);
                    singLL.print();
                    singLL.insertAt(3, 833);
                    singLL.print();
                }
            }

## 2.1.1 Verifikasi Hasil Percobaan
![alt text](image.png)

## 2.1.2 Pertanyaan
1. Mengapa hasil compile kode program di baris pertama menghasilkan “Linked List Kosong”?
2. Jelaskan kegunaan variable temp secara umum pada setiap method!
3. Perhatikan class SingleLinkedList, pada method insertAt Jelaskan kegunaan kode berikut 

## 2.2 Modifikasi Elemen pada Single Linked List

### SingleLinkedList.java

### SLLMain.java

## 2.2.1 Verifikasi Hasil Percobaan

## 2.2.2 Pertanyaan
1. Mengapa digunakan keyword break pada fungsi remove? Jelaskan!
2. Jelaskan kegunaan kode dibawah pada method remove

## TUGAS
1. 
### Mahasiswa27.java

        public class Mahasiswa27 {
            int NIM;
            String Nama;
            Mahasiswa27 next;

            public Mahasiswa27(int NIM, String Nama) {
                this.NIM = NIM;
                this.Nama = Nama;
                this.next = null;
            }
        }

### MahasiswaLinkedList27.java

            public class MahasiswaLinkedList27 {
                Mahasiswa27 head;

                public MahasiswaLinkedList27() {
                    this.head = null;
                }

                void addFirst(int NIM, String Nama) {
                    Mahasiswa27 input = new Mahasiswa27(NIM, Nama);
                    input.next = head;
                    head = input;
                }

                void addLast(int NIM, String Nama) {
                    Mahasiswa27 input = new Mahasiswa27(NIM, Nama);
                    if (head == null) {
                        head = input;
                        return;
                    }
                    Mahasiswa27 temp = head;
                    while (temp.next != null) {
                        temp = temp.next;
                    }
                    temp.next = input;
                }

                public void insertAfter(int key, int NIM, String Nama) {
                    Mahasiswa27 input = new Mahasiswa27(NIM, Nama);
                    Mahasiswa27 temp = head;
                    while (temp != null && temp.NIM != key) {
                        temp = temp.next;
                    }
                    if (temp == null) {
                        System.out.println("Data dengan NIM " + key + " tidak ditemukan.");
                        return;
                    }
                    input.next = temp.next;
                    temp.next = input;
                }

                public void insertAt(int posisi, int NIM, String Nama) {
                    if (posisi < 0) {
                        System.out.println("Posisi tidak boleh negatif!");
                        return;
                    }
                    if (posisi == 0) {
                        addFirst(NIM, Nama);
                        return;
                    }
                    Mahasiswa27 input = new Mahasiswa27(NIM, Nama);
                    Mahasiswa27 temp = head;
                    for (int i = 0; i < posisi - 1; i++) {
                        if (temp == null) {
                            System.out.println("Posisi melebihi panjang linked list!");
                            return;
                        }
                        temp = temp.next;
                    }
                    if (temp == null) {
                        System.out.println("Posisi melebihi panjang linked list!");
                        return;
                    }
                    input.next = temp.next;
                    temp.next = input;
                }

                public void print() {
                    Mahasiswa27 temp = head;
                    System.out.println("Isi Linked List:");
                    while (temp != null) {
                        System.out.println("NIM: " + temp.NIM + ", Nama: " + temp.Nama);
                        temp = temp.next;
                    }
                    System.out.println();
                }
                
            }

### MahasiswaMain.java

            public class MahasiswaMain {
                public static void main(String[] args) {
                    MahasiswaLinkedList27 linkedList = new MahasiswaLinkedList27();


                    linkedList.addFirst(111, "Anton");
                    linkedList.addLast(112, "Prita");
                    linkedList.insertAfter(112, 113, "Yusuf");
                    linkedList.insertAfter(113, 114, "Doni");
                    linkedList.insertAt(4, 115, "Sari");

                    linkedList.print();
                }
            }

## Verifikasi Hasil Percobaan
![alt text](image-1.png)


2.
### MahasiswaQueue227.java

            public class MahasiswaQueue227 {
                int NIM;
                String nama;
                MahasiswaQueue227 next;

                MahasiswaQueue227(int NIM, String nama) {
                    this.NIM = NIM;
                    this.nama = nama;
                    this.next = null;
                }
            }

### Queue227.java

            public class Queue227 {
                MahasiswaQueue227 front, rear;

                Queue227() {
                    this.front = this.rear = null;
                }


                void enqueue(int NIM, String nama) {
                    MahasiswaQueue227 newNode = new MahasiswaQueue227(NIM, nama);
                    if (this.rear == null) {
                        this.front = this.rear = newNode;
                        return;
                    }
                    this.rear.next = newNode;
                    this.rear = newNode;
                }


                MahasiswaQueue227 dequeue() {
                    if (this.front == null) return null;
                    MahasiswaQueue227 temp = this.front;
                    this.front = this.front.next;
                    if (this.front == null) this.rear = null;
                    return temp;
                }

                void printQueue() {
                    MahasiswaQueue227 current = front;
                    while (current != null) {
                        System.out.println("NIM: " + current.NIM + ", Nama: " + current.nama);
                        current = current.next;
                    }
                }

            }

### MahasiswaMain227.java

        public class MahasiswaMain227 {
            public static void main(String[] args) {
                Queue227 queue = new Queue227();
                queue.enqueue(111, "Anton");
                queue.enqueue(112, "Prita");
                queue.enqueue(113, "Yusuf");
                queue.enqueue(114, "Doni");
                queue.enqueue(115, "Sari");

                queue.printQueue();

                System.out.println("\nDequeue: " + queue.dequeue().nama);
                queue.printQueue();
            }
        }

## Verifikasi Hasil Percobaan
![alt text](image-2.png)



