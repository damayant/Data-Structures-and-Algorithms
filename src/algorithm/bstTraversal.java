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
    //zigzag / spiral level order traversal
    public void spiralWithTwoStack(Node root)
    {
        if(root == null)
        {
            return;
        }
        Stack<Node> s1=new Stack<>();
        Stack<Node> s2=new Stack<>();
        s1.push(root);

        while(!s1.isEmpty()||!s2.isEmpty())
        {
            while (!s1.isEmpty())
            {
                root = s1.pop();
                System.out.print(root.key+" ");
                if(root.left!=null)
                {
                    s2.push(root.left);
                }
                if(root.right!=null)
                {
                    s2.push(root.right);
                }
            }
            while(!s2.isEmpty())
            {
                root=s2.pop();
                System.out.print(root.key+" ");
                if(root.right!=null)
                {
                    s1.push(root.right);
                }
                if(root.left!=null)
                {
                    s2.push(root.left);
                }
            }
        }
    }

}
