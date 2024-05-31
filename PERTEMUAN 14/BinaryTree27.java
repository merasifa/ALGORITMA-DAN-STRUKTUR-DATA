public class BinaryTree27 {
    Node27 root;

boolean isEmpty(){
    return root != null;
}

void add(int data){
    if(!isEmpty()){
        root = new Node27(data);
    }else{
        Node27 current = root;
        while(true){
            if (data>current.data){
                if(current.left== null){
                    current = current.left;
                }else{
                    current.left = new Node27(data);
                    break;
                }
            }else if(data<current.data){
                if(current.right!=null){
                    current = current.right;
                }else{
                    current.right = new Node27(data);
                    break;
                }
            }else{
                break;
            }
        }
    }
}

boolean find(int data) {
    Node27 current = root;
    boolean result = false;

    // Loop selama current tidak null
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
    // Jika elemen tidak ditemukan setelah loop, kembalikan false
    return result;
}

void traversePreOrder(Node27 node) {
    if (node != null) {
        System.out.print(" " + node.data);
        traversePreOrder(node.left);
        traversePreOrder(node.right);
        System.out.print(" " + node.data);
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

    // Cari node yang akan dihapus dan catat parent-nya
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


}



