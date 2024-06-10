public class DoubleFilm27 {
    Film27 head;
    int size;

    public DoubleFilm27(){
        this.head =  null;
        this.size = 0;

    }

    public boolean isEmpty() {
        return head == null;
    }

    public void tambahAwal (int id, String judul, double rating) {
        Film27 newFilm27 = new Film27(id, judul, rating);
        if (isEmpty()) {
            head = new Film27(id, judul, rating);
        } else {
            newFilm27.next = head;
            head.prev = newFilm27;
            head = newFilm27;
        }
        size++;
    }

    public void tambahAkhir(int id, String judul, double rating) {
        if (isEmpty()) {
            head = new Film27(id, judul, rating);
        } else {
            Film27 current = head;
            while (current.next != null) {
                current = current.next;
            }
            Film27 newFilm27 = new Film27(id, judul, rating);
            current.next = newFilm27;
            size++;
        }
    }



}

