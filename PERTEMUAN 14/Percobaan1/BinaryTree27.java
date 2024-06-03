package Percobaan1;
public class BinaryTree27 {
    Node27 root;

boolean isEmpty(){
    return root == null;
}

void add(int data) {
    if (isEmpty()) {
        root = new Node27(data);
    } else {
        Node27 current = root;
        while (true) {
            if (data < current.data) {
                if (current.left == null) {
                    current.left = new Node27(data);
                    break;
                } else {
                    current = current.left;
                }
            } else if (data > current.data) {
                if (current.right == null) {
                    current.right = new Node27(data);
                    break;
                } else {
                    current = current.right;
                }
            } else {
                break;
            }
        }
    }
}

boolean find(int data) {
    Node27 current = root;
    boolean result = false;

    while (current != null) {
        // Jika data ditemukan pada node saat ini
        if (current.data == data) {
            return true; // Elemen ditemukan
        } else if (data < current.data) {
            current = current.left; // Pindah ke subtree kiri
        } else {
            current = current.right; // Pindah ke subtree kanan
        }
    }
    return result;
}

void traversePreOrder(Node27 node) {
    if (node != null) {
        System.out.print(" " + node.data);
        traversePreOrder(node.left);
        traversePreOrder(node.right);
    }
}

void traversePostOrder(Node27 node) {
    if (node != null) {
        traversePostOrder(node.left);
        traversePostOrder(node.right);
        System.out.print(" " + node.data);
    }
}

void traverseInOrder(Node27 node) {
    if (node != null) {
        traverseInOrder(node.left);
        System.out.print(" " + node.data);
        traverseInOrder(node.right);
    }
}

Node27 getSuccessor(Node27 del){
    Node27 successor = del.right;
    Node27 successorParent = del;
    while(successor.left!= null){
        successorParent = successor;
        successor = successor.left;
    }
    if(successor != del.right){
        successorParent.left = successor.right;
        successor.right = del.right;
    }
    return successor;
}

public void delete(int data) {
    if (isEmpty()) {
        System.out.println("Tree is empty!");
        return;
    }

    Node27 parent = null;
    Node27 current = root;
    boolean isLeftChild = false;
    while (current != null && current.data != data) {
        parent = current;
        if (data < current.data) {
            current = current.left;
            isLeftChild = true;
        } else {
            current = current.right;
            isLeftChild = false;
        }
    }

    // Jika node tidak ditemukan
    if (current == null) {
        System.out.println("Couldn't find data!");
        return;
    }

    //tidak memiliki anak
    if (current.left == null && current.right == null) {
        if (current == root) {
            root = null;
        } else if (isLeftChild) {
            parent.left = null;
        } else {
            parent.right = null;
        }
    }
    //satu anak (hanya anak kiri atau kanan)
    else if (current.right == null) { //nak kiri
        if (current == root) {
            root = current.left;
        } else if (isLeftChild) {
            parent.left = current.left;
        } else {
            parent.right = current.left;
        }
    } else if (current.left == null) { // anak kanan
        if (current == root) {
            root = current.right;
        } else if (isLeftChild) {
            parent.left = current.right;
        } else {
            parent.right = current.right;
        }
    }
    //dua anak
    else {
        Node27 successor = getSuccessor(current);
        if (current == root) {
            root = successor;
        } else if (isLeftChild) {
            parent.left = successor;
        } else {
            parent.right = successor;
        }
        successor.left = current.left;
    }
}

void tambahRekursif(Node27 current, int data){ // TUGAS 1
    if (current == null) {
        current = new Node27(data); 
    } else {
        // Jika data kurang dari data node current, periksa subtree kiri
        if (data < current.data) {
            if (current.left != null) {
                tambahRekursif(current.left, data);
            } else {
                current.left = new Node27(data);
            }
        }
        // Jika data lebih dari data node current, subtree kanan
        else if (data > current.data) {
            if (current.right != null) {
                tambahRekursif(current.right, data);
            } else {
                current.right = new Node27(data);
            }
        }
    }

}
int cariMin(){ //TUGAS 2
    Node27 current = root;
    while (current.left != null) {
        current = current.left;
    }
    return current.data;
}

int cariMax(){ // TUGAS 2
    Node27 current = root;
    while (current.right != null) {
        current = current.right;
    }
    return current.data;
}  

void tampilDataLeaf(Node27 node) { // TUGAS 3
    if (node != null) {
        if (node.left == null && node.right == null) {
            System.out.print(node.data +" ");
        } else {
            tampilDataLeaf(node.left);
            tampilDataLeaf(node.right);
        }
    }
}

int tampilJumlahLeaf(Node27 node) { // TUGAS 4
    if (node == null) {
        return 0;
    }else if (node.left == null && node.right == null) {
        System.out.println(" " + node.data);
        return 1;
    } else {
        return tampilJumlahLeaf(node.left) + tampilJumlahLeaf(node.right);
    }
}



}



