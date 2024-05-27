class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : nums) {
            int count = map.getOrDefault(num, 0); 
            map.put(num, count + 1);
        }
        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                return key;
            }
        }
        return -1;
        
        // int result = 0;
        // for (int num: nums){
        //     result ^= num;
        // }
        // return result;
    }
}