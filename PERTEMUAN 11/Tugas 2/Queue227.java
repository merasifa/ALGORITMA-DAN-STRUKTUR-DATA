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
