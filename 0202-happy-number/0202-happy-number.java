class Solution {
    public static int getSquareSum(int n) { //O(N) O(1)
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;//gets last digit of n
            sum += digit * digit;//squares the digit and adds the squares to sum
            n /= 10;//removes last digit from n
        }
        return sum;
    }

    public static boolean isHappy(int n) {
        int slow = n;
        int fast = getSquareSum(n);

        while (fast != 1 && slow != fast) {//Floyd's cycle detection
            slow = getSquareSum(slow);
            fast = getSquareSum(getSquareSum(fast));
        }
        return fast == 1;
    }
    
}
