package Percobaan2;

public class BinaryTreeArrayMain27 {
    public static void main(String[] args) {
        BinaryTreeAray27 bta = new BinaryTreeAray27();
        int[] data = {6, 4, 8, 3, 5, 7, 9,0, 0, 0};
        int idxLast = 6;
        bta.populateData(data, idxLast);
        
        System.out.println("InOrder Traversal : ");
        bta.traverseInOrder(0);
        System.out.println();

        bta.add(2);

        
        System.out.println("Pre-order Traversal:");
        bta.traversePreOrder(0);
        System.out.println();

        System.out.println("Post-order Traversal :");
        bta.traversePostOrder(0);
        System.out.println();
    }
}
