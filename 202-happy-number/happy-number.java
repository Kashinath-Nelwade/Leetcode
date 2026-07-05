class Solution {
    public boolean isHappy(int n) {
        while(n!=1 && n!=4){
            n = sum(n) ;
        }
        return n==1 ? true : false ;

    }
    public int sum(int num){
        int res = 0 ; 
        while(num!=0){
            int last = num%10 ; 
            res+= last*last ;
            num/=10;
        }
        return res ;
    }
}