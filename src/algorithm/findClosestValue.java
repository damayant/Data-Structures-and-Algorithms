package algorithm;

public class findClosestValue {
    int answer;
    findClosestValue(Node node,int target)
    {
        answer = finder(node, target, Integer.MAX_VALUE);
    }
    public int finder(Node node, int target,int closest)
    {
        if(Math.abs(closest - target) >= Math.abs(node.key - target))
        {
            closest = node.key ;
        }
        if(node.key > target && node.left!=null)
        {
            return finder(node.left,target,closest);
        }
        if(node.key < target && node.right!=null)
        {
            return finder(node.right,target,closest);
        }
        else
        return closest ;
    }
}
