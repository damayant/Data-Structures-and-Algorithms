package algorithm;

public class bstTraversal {

    /*given a binary tree prints the tree inorder --> left--root--right*/
    void inorder(Node node)
    {
        if (node == null)
        {
            return ;
        }

        //first recur on left child
        inorder(node.left);
        System.out.print(node.key + " ");
        //now recur the right child
        inorder(node.right);
    }

}
