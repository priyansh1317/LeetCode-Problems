class Solution {
    public int removeDuplicates(int[] nums) {
        int lo=0;
        for(int hi=1; hi<nums.length; hi++){
            if(nums[hi]!=nums[lo]){
                nums[lo+1] = nums[hi];
                lo++;
            }
        }
        return lo+1;

        // TreeSet<Integer> set = new TreeSet<>();
        // for(int i:nums){
        //     set.add(i);
        // }
        // int count = 0;
        // for (Integer i : set) {
        //     nums[count]=i;
        //     count++;
        // }
        // return count;
    }
}