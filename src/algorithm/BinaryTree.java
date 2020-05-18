package algorithm;

public class BinaryTree {
    Node root;

    BinaryTree()
    {
        root = null;
    }

    public static void main(String[] args)
    {
        BinaryTree tree= new BinaryTree();
        tree.root = new Node(5);
        tree.root.left = new Node(3);
        tree.root.left.right = new Node(4);
        tree.root.left.left = new Node(1);
        tree.root.right = new Node(7);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(8);

/*
        bstTraversal tree_traversal = new bstTraversal();
        tree_traversal.inorder(tree.root);
        System.out.println("");
        tree_traversal.preorder(tree.root);
        System.out.println("");
        tree_traversal.postorder(tree.root);
        System.out.println("");

        isBstBalanced checkbstbalance = new isBstBalanced();
        System.out.println(checkbstbalance.checkBSTBalance(tree.root));

        */

        findClosestValue closestValue = new findClosestValue(tree.root,2);
        System.out.println(closestValue.answer);
    }
}
