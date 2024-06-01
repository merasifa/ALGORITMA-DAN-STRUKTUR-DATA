public class BinaryTreeMain27 {
    public static void main(String[] args) {
        BinaryTree27 bt = new BinaryTree27();
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        bt.add(10);
        bt.add(15);
        
        System.out.println("Pre Order Traversal: ");
        bt.traversePreOrder(bt.root);
        System.out.println();

        System.out.println("in Order Traversal: ");
        bt.traverseInOrder(bt.root);
        System.out.println();

        System.out.println("Post Order Traversal: ");
        bt.traversePostOrder(bt.root);
        System.out.println();
        
        System.out.println("Find Node :" +bt.find(5));
        System.out.println("Delete node 8 ");
        bt.delete(8);
        System.out.println(" ");
        System.out.println("Pre Order Traversal: ");
        bt.traversePreOrder(bt.root);
        System.out.println("");
        
    }
}