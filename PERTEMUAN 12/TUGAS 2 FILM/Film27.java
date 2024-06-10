public class Film27 {
    int id;
    String judul;
    double rating;
    Film27 prev;
    Film27 next;

    Film27 ( int id, String judul, double rating){
        this.id = id;
        this.judul = judul;
        this.rating = rating;
        this.prev = null;
        this.next = null;
    }
}
