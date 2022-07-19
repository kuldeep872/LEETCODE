class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character,Character> stmap=new HashMap<>();
        HashMap<Character,Character> tsmap=new HashMap<>();
        for(int i=0;i<s.length();i++){
            Character schar=s.charAt(i);
            Character tchar=t.charAt(i);
            if(stmap.containsKey(schar)){
                if(stmap.get(schar)!=tchar){
                    return false;
                }
            }
            if(tsmap.containsKey(tchar)){
                if(tsmap.get(tchar)!=schar){
                    return false;
                }
            }
            stmap.put(schar,tchar);
            tsmap.put(tchar,schar);
        }
        return true;
    }
}