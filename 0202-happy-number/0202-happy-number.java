class Solution {
    // public static int getSquareSum(int n) { //O(N) O(1)
    //     int sum = 0;
    //     while (n > 0) {
    //         int digit = n % 10;//gets last digit of n
    //         sum += digit * digit;//squares the digit and adds the squares to sum
    //         n /= 10;//removes last digit from n
    //     }
    //     return sum;
    // }

    // public static boolean isHappy(int n) {
    //     int slow = n;
    //     int fast = getSquareSum(n);

    //     while (fast != 1 && slow != fast) {//Floyd's cycle detection
    //         slow = getSquareSum(slow);
    //         fast = getSquareSum(getSquareSum(fast));
    //     }
    //     return fast == 1;
    // }


    //Using HashMap  O(logN) O(1)-but takes more memory ..so we use Hashset
    // public static boolean isHappy(int n) {
    //     HashMap<Integer, Boolean> hadSeen = new HashMap<>();

    //     while(n!=1){
    //         if (hadSeen.containsKey(n)) {//already seen this number --> cycle detected --> false  
    //             return false; 
    //         }
    //         hadSeen.put(n, true); //Mark as visited
    //         n = getSquareSum(n);
    //     }
    //     return true;

    // }

    // public static int getSquareSum(int n) { //O(N) O(1)
    //     int sum = 0;
    //     while (n > 0) {
    //         int digit = n % 10;//gets last digit of n
    //         sum += digit * digit;//squares the digit and adds the squares to sum
    //         n /= 10;//removes last digit from n
    //     }
    //     return sum;
    // }


    //Using HashSet O(logN) O(1)
    public static boolean isHappy(int n) {
        Set<Integer> hadSeen = new HashSet<>();
        while(n!=1){
            if(hadSeen.contains(n)){
                return false;
            }
            hadSeen.add(n);
             n=getSquareSum(n);
        }
        return true;
    }
    public static int getSquareSum(int n) { //O(N) O(1)
        int sum = 0;
        while (n > 0) {
            int digit = n % 10;//gets last digit of n
            sum += digit * digit;//squares the digit and adds the squares to sum
            n /= 10;//removes last digit from n
        }
        return sum;
    }
}
