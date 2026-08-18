class Solution {
    public int addDigits(int num) {
        int res=digsum(num);
        while (res>9)
        res=digsum(res);
        return res;
    }
    int digsum(int n)
    { int d;
    int s=0;
     while(n!=0)
        {
        d=n%10;
        s=s+d;
        n=n/10;
        }
     return s;
    }
}