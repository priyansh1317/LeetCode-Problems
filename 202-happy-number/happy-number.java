class Solution {
    public int getSquare(int num){
        int sum=0;
        while(num>0){
            int rem=num%10;
            sum=sum+(int)(Math.pow(rem,2));
            num=num/10;
        }
        return sum;
    }

    public boolean isHappy(int n) {
        int slow=n;
        int fast=n;
        do{
            slow=getSquare(slow);
            fast=getSquare(getSquare(fast));
        } while(slow!=fast);
        
        if(slow==1||fast==1){
            return true;
        }
        return false;
        
    }
}