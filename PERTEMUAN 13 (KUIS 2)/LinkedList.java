public class LinkedList {
    Node head;
    Node tail;

    public LinkedList() {
        head = null;
        tail = null;
    }

    public void addTim(Tim tim) {
        Node newNode = new Node(tim);
        if (head == null) {
            head = tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public Tim cariTim(int index) {
        Node current = head;
        int count = 0;
        while (current != null) {
            if (count == index) {
                return current.tim;
            }
            count++;
            current = current.next;
        }
        return null; 
    }
    

    public void sorttims() {
        if (head == null) {
            return;
        }
        Node current = head;
        Node index;
        Tim temp;

        while (current != null) {
            index = current.next;
            while (index != null) {
                if (current.tim.poin < index.tim.poin) {
                    temp = current.tim;
                    current.tim = index.tim;
                    index.tim = temp;
                }
                index = index.next;
            }
            current = current.next;
        }
    }

       public void tampilkanKlasemen() {
        System.out.printf("%-5s | %-25s | %-5s | %-6s | %-5s | %-5s | %-3s%n", "Rank", "Tim", "Poin", "Menang", "Seri", "Kalah", "SG");
        System.out.println("--------------------------------------------------------------------------");
        Node current = head;
        int ranking = 1;
        while (current != null) {
            System.out.printf("%-5d | %-25s | %-5d | %-6d | %-5d | %-5d | %-3d%n", ranking, current.tim.nama, current.tim.poin, current.tim.menang, current.tim.seri, current.tim.kalah, current.tim.selisihGol);
            current = current.next;
            ranking++;
        }
    }

    public void tampilkanHasil(int[] hasil) {
        System.out.printf("%-25s | %-25s | %s%n", "Tim Kandang", "Tim Tandang", "Skor");
        System.out.println("-----------------------------------------------------------");
      
        for (int i = 0; i < hasil.length; i += 4) {
          int indexKandang = hasil[i];
          int indexTandang = hasil[i + 1];
          int golKandang = hasil[i + 2];
          int golTandang = hasil[i + 3];
      
          // Ambil objek Tim dari LinkedList berdasarkan indeks
          Tim timKandang = cariTim(indexKandang);
          Tim timTandang = cariTim(indexTandang);
      
          // Periksa apakah tim ditemukan
          if (timKandang != null && timTandang != null) {
            // Akses nama tim langsung dari objek Tim
            String namaKandang = timKandang.nama;
            String namaTandang = timTandang.nama;
      
            // Format dan cetak hasil pertandingan
            System.out.printf("%-25s | %-25s | %d - %d%n",
                    namaKandang, namaTandang, golKandang, golTandang);
          } else {
            // Tim tidak ditemukan, tampilkan pesan kesalahan
            System.out.println("Tim dengan indeks " + indexKandang + " atau " + indexTandang + " tidak ditemukan.");
          }
        }
      }
      

    public void urutkanKlasemen() {
        if (head == null || head.next == null) {
            return;
        }

        boolean swapped;
        do {
            swapped = false;
            Node current = head;
            Node prev = null;
            Node next = head.next;

            while (next != null) {
                if (current.tim.poin < next.tim.poin) {
                    if (prev != null) {
                        prev.next = next;
                    } else {
                        head = next;
                    }
                    current.next = next.next;
                    next.next = current;

                    prev = next;
                    next = current.next;
                    swapped = true;
                } else {
                    prev = current;
                    current = next;
                    next = next.next;
                }
            }
        } while (swapped);
    }

    public void updateKlasemen(int[] hasil) {
        for (int i = 0; i < hasil.length; i += 4) {
            int indexKandang = hasil[i];
            int indexTandang = hasil[i + 1];
            int golKandang = hasil[i + 2];
            int golTandang = hasil[i + 3];
    
            // Ambil tim berdasarkan indeks
            Tim timKandang = cariTim(indexKandang);
            Tim timTandang = cariTim(indexTandang);
    
            // Perbarui statistik tim berdasarkan hasil pertandingan
            if (timKandang != null && timTandang != null) {
                if (golKandang > golTandang) {
                    // Tim kandang menang
                    timKandang.menang++;
                    timTandang.kalah++;
                } else if (golKandang < golTandang) {
                    // Tim tandang menang
                    timKandang.kalah++;
                    timTandang.menang++;
                } else {
                    // Pertandingan seri
                    timKandang.seri++;
                    timTandang.seri++;
                }
    
                // Perbarui selisih gol
                timKandang.selisihGol += (golKandang - golTandang);
                timTandang.selisihGol += (golTandang - golKandang);
    
                // Perbarui poin
                if (golKandang > golTandang) {
                    timKandang.poin += 3; // Tim kandang menang, mendapatkan 3 poin
                } else if (golKandang < golTandang) {
                    timTandang.poin += 3; // Tim tandang menang, mendapatkan 3 poin
                } else {
                    timKandang.poin++; // Pertandingan seri, masing-masing tim mendapatkan 1 poin
                    timTandang.poin++;
                }
            }
        }
        sorttims();
    }
    

 


}
