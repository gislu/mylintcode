c class Solution {
    /**
     * @param nums: a rotated sorted array
     * @return: the minimum number in the array
     */
    public int findMin(int[] nums) {
        // write your code here
        if (nums == null || nums.length == 0){
            return -1;
        }
        int start = 0, end = nums.length -1;
        //use the last as the target to avoid a unrotated array error
        int target = nums[end];
        while(start + 1 < end){
            int mid = start + (end - start) / 2;
            if (nums[mid] <= target){
                end = mid;
            }else if (nums[mid] > target){
                start = mid;
            }
        }
        
        if(nums[start] <= nums[end]){
            return nums[start];
        }else {
            return nums[end];
        }
        

    }
}
