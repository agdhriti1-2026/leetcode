class Solution {
    public boolean isHappy(int n) {
    int res=digsumsquare(n);
     while(res>4)
    res=digsumsquare(res);
     if(res==1)
    return true;
    else
    return false;
    }
 int digsumsquare(int n){
        
        int s=0;
        while(n!=0)
        {
            int d=n%10;
            s=s+(d*d);
            n=n/10;

        }
        return s;
     }
}