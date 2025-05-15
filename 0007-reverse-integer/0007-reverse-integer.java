class Solution {
    public int reverse(int x) {
        int reversed =0;
        while(x!=0){
            int digit=x%10; //gets last digit
            

            if(reversed > Integer.MAX_VALUE / 10 || (reversed == Integer.MAX_VALUE / 10 && digit > 7)) return 0; // check for overflow
            if (reversed < Integer.MIN_VALUE / 10 || (reversed == Integer.MIN_VALUE / 10 && digit < -8)) return 0;//check for overflow

            reversed=reversed*10+digit; //adding digts by multiplying last digit with 10
            x/=10;//removes last digit for next process
        }
        return reversed;
    }
}