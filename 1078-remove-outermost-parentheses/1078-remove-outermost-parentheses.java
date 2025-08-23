class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder result=new StringBuilder();
        int count=0;
        for(char c: s.toCharArray()){
            if(c=='('){    //opening parenthesis
                count++;
                if(count>1){//skip (outermost)
                    result.append(c);
                }
            }else{  //closing parenthesis
                count--;
                if(count>0){//skip (outermost closing)
                    result.append(c);
                }
            }
        }
        return result.toString();
    }
}