Given two integers a and b, return the sum of the two integers without using the operators + and -.

 class Solution {
    public int getSum(int a, int b) {
        int c=0;
        while(b!=0){
        c=(a&b)<<1;
        a=a^b;
        b=c;
        }
        return a;

    }
}
