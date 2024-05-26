class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        k=k%n;
        int index = 0;
        int[] temp = new int[nums.length];
        for(int i = n-k; i<n; i++){
            temp[index]=nums[i];
            index++;
        }
        for(int i=0; i<n-k; i++){
            temp[index]=nums[i];
            index++;
        }
        for(int i=0;i<temp.length; i++){
            nums[i]=temp[i];
        }
    }
}