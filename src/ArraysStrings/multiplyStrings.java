package ArraysStrings;

public class multiplyStrings {
    public String multiply(String num1, String num2)
    {
        String result ="";
        int n1 = Integer.parseInt(num1);
        int n2 = Integer.parseInt(num2);
        int r = n1*n2;
        result = Integer.toString(r);
        return result;
    }
    public boolean checkIfNegative(String str)
    {
        if(str.charAt(0) == '-')
        {
            return true;
        }
        return false;
    }
}
