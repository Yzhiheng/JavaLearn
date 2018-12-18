//给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
public class C07 {
    public static void main(String[] args) {
        Solution7 solution7 = new Solution7();
        int A = 123;
        int B = -123;
        int A1 = solution7.reverse(A);
        int B1 =solution7.reverse(B);
        System.out.println(A1);
        System.out.println(B1);

    }
}

class Solution7 {
    public int reverse(int x) {
        int rev = 0;
        while(x != 0){
            int pop = x%10;
            x /= 10;
            if(rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE/10 && pop > 7))
                return 0;
            if(rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE/10 && pop < -8))
                return 0;
            rev = rev * 10 +pop;
        }
        return rev;
    }
}