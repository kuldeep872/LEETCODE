class Solution {
    public char findTheDifference(String s, String t) { 
        char C=0;
        for(char cs: s.toCharArray()) C ^=cs;
        for(char ct: t.toCharArray()) C^=ct;
        return C;
    }
}
