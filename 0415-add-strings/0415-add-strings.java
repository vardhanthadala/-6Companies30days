class Solution {
    public String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();

        int i = num1.length() - 1; // pointer for num1
        int j = num2.length() - 1; // pointer for num2
        int carry = 0;

         while (i >= 0 || j >= 0 || carry > 0) {
            int digit1 = (i >= 0) ? num1.charAt(i) - '0' : 0;
            int digit2 = (j >= 0) ? num2.charAt(j) - '0' : 0;

            int sum = digit1 + digit2 + carry;
            sb.append(sum % 10); // last digit of sum
            carry = sum / 10;    // carry for next step
            
            i--;
            j--;
         }
          return sb.reverse().toString();
    }
}