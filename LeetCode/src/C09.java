//判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。

public class C09 {
    public static void main(String[] args) {
        int x = 123321;
        Solution9 solution9 = new Solution9();
        Boolean aBoolean = solution9.isPalindrome(x);
        System.out.println(aBoolean);
    }
}

class Solution9 {
    public boolean isPalindrome(int x) {
        if (x<0 || (x%10==0 && x!=0)){
            return false;
        }
        int revertedNumber = 0;
        while (x>revertedNumber){
            revertedNumber = revertedNumber * 10 + x%10;
            x /= 10;
        }
        return x==revertedNumber || x == revertedNumber/10;
    }
}