package algorithm;

public class checkHeight {
    int calculateHeight(Node node)
    {
        if (node == null) return 0;
        int rightHeight , leftHeight = 0;

        leftHeight = calculateHeight(node.left);
        rightHeight = calculateHeight(node.right);

        return Math.max(leftHeight,rightHeight)+1 ;

    }
}
