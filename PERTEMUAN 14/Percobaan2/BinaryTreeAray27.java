package Percobaan2;

public class BinaryTreeAray27 {
    int[] data;
    int idxLast;

    public BinaryTreeAray27(){
        data = new int[10];
    }

    void populateData(int data[], int idxLast){
        this.data = data;
        this.idxLast = idxLast;
    }

    void traverseInOrder(int idxStart){
        if(idxStart <= idxLast){
            traverseInOrder(2*idxStart+1);
            System.out.println(data[idxStart]+"");
            traverseInOrder(2*idxStart+2);
        }
    }

    void add(int data){ // TUGAS NO 5A
        if (idxLast == this.data.length - 1) {
            System.out.println("Binary Tree is full");
            return;
        }
        idxLast++;
        this.data[idxLast] = data;
    }

    void traversePreOrder(int idxStart){ // TUGAS NO 5B
        if (idxStart <= idxLast && data[idxStart] != 0) {
            System.out.print(this.data[idxStart] + " ");
            traversePreOrder(2 * idxStart + 1);
            traversePreOrder(2 * idxStart + 2);
        }
    }

    void traversePostOrder(int idxStart){ // TUGAS NO 5B
        if (idxStart <= idxLast && data[idxStart] != 0) {
            traversePostOrder(2 * idxStart + 1);
            traversePostOrder(2 * idxStart + 2);
            System.out.print(this.data[idxStart] + " ");
        }
    }
}

