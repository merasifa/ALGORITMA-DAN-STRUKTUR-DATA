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


    public Tim cariTim(String nama) {
        Node current = head;
        while (current != null) {
            if (current.tim.nama.equalsIgnoreCase(nama)) {
                return current.tim;
            }
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


    // public void tampilkanHasil(int[] hasil) {
    //     System.out.printf("%-25s | %-25s | %s%n", "Tim Kandang", "Tim Tandang", "Skor");
    //     System.out.println("-----------------------------------------------------------");
    //     for (int i = 0; i < hasil.length; i += 4) {
    //         int indexKandang = hasil[i];
    //         int indexTandang = hasil[i + 1];
    //         int golKandang = hasil[i + 2];
    //         int golTandang = hasil[i + 3];
    

    //         System.out.printf("%-25s | %-25s | %d - %d%n",
    //                 timKandang.nama, timTandang.nama, golKandang, golTandang);
    //     }
    // }

    // public void urutkanKlasemen() {
    //     if (head == null || head.next == null) {
    //         return;
    //     }

    //     boolean swapped;
    //     do {
    //         swapped = false;
    //         Node current = head;
    //         Node prev = null;
    //         Node next = head.next;

    //         while (next != null) {
    //             if (current.tim.poin < next.tim.poin) {
    //                 if (prev != null) {
    //                     prev.next = next;
    //                 } else {
    //                     head = next;
    //                 }
    //                 current.next = next.next;
    //                 next.next = current;

    //                 prev = next;
    //                 next = current.next;
    //                 swapped = true;
    //             } else {
    //                 prev = current;
    //                 current = next;
    //                 next = next.next;
    //             }
    //         }
    //     } while (swapped);
    // }

 


}
