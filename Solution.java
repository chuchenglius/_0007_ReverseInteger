public class Solution {
    public int reverse(int x) {
        long sum=0;
        int value=x;
        if(x<0) value *=-1;
        while (value>0)
        {
            sum=sum*10+x%10;
            x/=10;
            value/=10;
        }
        if(sum>Integer.MAX_VALUE || sum<Integer.MIN_VALUE) return 0;
        return (int)sum;
    }
}
