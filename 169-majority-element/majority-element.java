class Solution {
    public int majorityElement(int[] nums) {
        HashMap <Integer, Integer> map = new HashMap<>();
        for (int element : nums) {
            map.put(element, map.getOrDefault(element, 0)+1);
            if(map.get(element)>nums.length/2) return (element);
        }
        return -1;
    }
}