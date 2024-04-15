class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length;i++){
            int num = nums[i];
            int required = target - num;
            if(map.containsKey(required)){
                return new int[]{i,map.get(required)};
            }else{
                map.put(nums[i],i);
            }
        }
    return new int[]{-1,-1};
    }
}