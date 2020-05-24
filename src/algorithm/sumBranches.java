package algorithm;

import java.util.ArrayList;
import java.util.List;

public class sumBranches {

    public List sumOfAllBranch(Node root)
    {
        List<Integer> sum = new ArrayList<Integer>();
        int nodeVals = 0 ;
        calculateSum(root,sum,nodeVals);

        return sum;
    }

    public void calculateSum(Node node, List sum,int nodeValues)
    {
        if(node == null) return;
        int newSum = nodeValues + node.key ;
        if(node.left == null && node.right == null)
        {
            sum.add(newSum);
            return ;
        }
        calculateSum(node.left,sum,newSum);
        calculateSum(node.right,sum,newSum);
    }
}
