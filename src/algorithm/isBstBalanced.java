package algorithm;

public class isBstBalanced {
    boolean checkBSTBalance(Node node)
    {
        if (node == null)
        {
            return true;
        }
        checkHeight heightChecker = new checkHeight();
        int leftHeight = heightChecker.calculateHeight(node.left);
        int rightHeight = heightChecker.calculateHeight(node.right);

        if(Math.abs(leftHeight-rightHeight)<2)
        {
            return true;
        }
        return false;
    }
}
