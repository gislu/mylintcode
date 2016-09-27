c class Solution {
    /** 
     *@param A : an integer rotated sorted array
     *@param target :  an integer to be searched
     *return : an integer
     */
    public int search(int[] nums, int target) {
        if(nums.length == 0 || nums == null){
            return -1;
        }
        int start =0, end = nums.length - 1;
        int mid;
        int flag = nums[0];
        while(start + 1 < end){
            mid = start + (end - start) / 2;
            if(nums[mid] == target){
                return mid;
            }
            if(nums[mid] >= flag){
                if(flag <= target && nums[mid] >= target){
                    end = mid;
                }else{
                    start = mid;
                }
            }else{
                if(flag >= target && nums[mid] < target){
                    start = mid;
                }else{
                    end = mid;
                }
                
            }
        }
        if (nums[start] == target){
            return start;
        }
        if (nums[end] == target){
            return end;
        }
        
        
        return -1;
    }
}

