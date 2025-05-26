class Solution {
    public boolean checkValidString(String s) {
        int Min=0, Max=0;

        for(char c: s.toCharArray()){
            if(c=='('){
                Min++;
                Max++;
            }else if(c==')'){
                Min--;
                Max--;
            }else{
                Min--;
                Max++;
            }
            if(Min<0) {
                Min=0;
            }
            if(Max<0){
                return false;
            }
        }
        return (Min==0);
    }
}