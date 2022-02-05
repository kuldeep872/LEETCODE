//TC-O(N)
class Solution {
    public void reverseString(char[] s) {
        recursive(s,0,s.length -1);
    }
    private void recursive(char[] s, int left, int right){
        if(left>right)
            return;
        char temp=s[left];
        s[left]=s[right];
        s[right]=temp;
        recursive(s,left+1,right-1);
    }
}