class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result =new int[2];
        HashMap<Integer,Integer> sum= new HashMap<>();
        for(int i=0;i<nums.length;i++){
            int comp=target-nums[i];
            if(sum.containsKey(comp)){
                result[0]=sum.get(comp);
                result[1]=i;
            }else{
                sum.put(nums[i],i);
            }
        }
        return result;
    }
}