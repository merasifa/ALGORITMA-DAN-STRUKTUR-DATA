public class Vaksin27 {
    NodeVaksin27 head;
    int size;

    public Vaksin27() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addLast(String data) {
        if (isEmpty()) {
            head = new NodeVaksin27(data);
        } else {
            NodeVaksin27 current = head;
            while (current.next != null) {
                current = current.next;
            }
            NodeVaksin27 newNode = new NodeVaksin27(data);
            current.next = newNode;
            newNode.prev = current;
        }
        size++;
        System.out.println("Peserta " + data + " telah ditambahkan ke antrian. Sisa antrian: " + size);
    }

    public void remove(String data) {
        if (isEmpty()) {
            System.out.println("Antrian vaksinasi kosong.");
            return;
        }
        NodeVaksin27 current = head;
        while (current != null) {
            if (current.data.equals(data)) {
                if (current == head) {
                    head = current.next;
                    if (head != null) {
                        head.prev = null;
                    }
                } else {
                    current.prev.next = current.next;
                    if (current.next != null) {
                        current.next.prev = current.prev;
                    }
                }
                System.out.println("Peserta " + data + " telah divaksin.");
                size--;
                return;
            }
            current = current.next;
        }
        System.out.println("Peserta " + data + " tidak ditemukan dalam antrian vaksinasi.");
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Antrian vaksinasi kosong.");
            return;
        }
        NodeVaksin27 current = head;
        int nomorAntrian = 1;
        System.out.println("Nomor Antrian | Nama");
        System.out.println("--------------------");
        while (current != null) {
            System.out.printf("%13d | %s\n", nomorAntrian, current.data);
            current = current.next;
            nomorAntrian++;
        }
    }
}
