class Solution {
    public List<Integer> findAnagrams(String s, String p) {
       List<Integer> ans = new ArrayList<>();

		int unmatchingCharCount = p.length();

		if(p.length()>s.length()){
			return ans;
		}

		int[] freqCount = new int[26];

		for(int i=0;i<p.length();i++){
			int index = p.charAt(i)-'a';
			freqCount[index]++;
		}

		int start =0;
		int end =0;
		for(;end<p.length();end++) {
			int index = s.charAt(end)-'a';
			if(freqCount[index]>0){

				unmatchingCharCount--;
			}
			freqCount[index]--;

		}
		if(unmatchingCharCount==0){
			ans.add(start);

		}
		for(;end<s.length();){
			// remove starting index
			int indexStart = s.charAt(start) -'a';

			if(freqCount[indexStart]>=0) {
				// char was present in t
				unmatchingCharCount++;
			}

			freqCount[indexStart]++;

			start++;

			int indexEnd = s.charAt(end)-'a';
			if(freqCount[indexEnd]>0){
				unmatchingCharCount--;
			}
			freqCount[indexEnd]--;

			end++;

			if(unmatchingCharCount==0){
				ans.add(start);
			}

		}

		return ans; 
    }
}