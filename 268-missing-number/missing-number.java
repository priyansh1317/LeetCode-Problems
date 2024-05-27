class Solution {
    public int missingNumber(int[] nums) {
        int n = nums.length;
        int sumOfConsecutiveN = (n+1) * n/2;
        int sumOfGivenArray = 0;
        for(int i=0; i<n; i++){
            sumOfGivenArray += nums[i];
        }
        return sumOfConsecutiveN - sumOfGivenArray;
    }
}