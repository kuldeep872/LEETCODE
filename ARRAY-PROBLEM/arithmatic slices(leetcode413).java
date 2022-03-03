class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        int previoscount=0;
        int total =0;
        for(int i=2;i<nums.length;i++){
            if(nums[i]-nums[i-1] == nums[i-1]-nums[i-2]){
                previoscount=previoscount+1;
            }else{
                previoscount=0;
            }
            total +=previoscount;
        }
        return total;
        
    }
}