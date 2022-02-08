class Solution {
    public int addDigits(int num) {
     int ans =num;
        while(true){
            ans=helperString(ans);
            if(ans<10){
                break;
            }
        }
        return ans;
    }
    private int helper(int no){
        int addDigitResult =0;
        while(no!=0){
            addDigitResult +=no%10;
            no =no/10;
        }
        return addDigitResult;
    }
    private int helperString(int no){
        int addDigitResult=0;
        String nostr =no+"";
        for(char c: nostr.toCharArray()){
            addDigitResult+=(c-'0');
        }
        return addDigitResult;
    }
}