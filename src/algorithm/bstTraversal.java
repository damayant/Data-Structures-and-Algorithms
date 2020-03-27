package algorithm;

public class bstTraversal {

    //prints the preorder --> root--left--right
    void preorder(Node node)
    {
        if (node == null)
        {
            return ;
        }
        System.out.print(node.key + " ");
        preorder(node.left);
        preorder(node.right);
    }

    //given a binary tree prints the tree inorder --> left--root--right
    void inorder(Node node)
    {
        if (node == null)
        {
            return ;
        }
        inorder(node.left);
        System.out.print(node.key + " ");
        inorder(node.right);
    }

    //prints postorder left--right--root
    void postorder(Node node)
    {
        if(node == null)
        {
            return ;
        }
        postorder(node.left);
        postorder(node.right);
        System.out.print(node.key+ " ");
    }

}
