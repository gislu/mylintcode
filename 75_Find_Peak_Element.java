ass Solution {
    /**
     * @param A: An integers array.
     * @return: return any of peek positions.
     */
    public int findPeak(int[] A) {
        // simple version:
        // if(A.length == 0 || A == null){
        //     return -1;
        // }
        // int start = 0, end = A.length - 1;
        // int mid;
        // while(start + 1 < end){
        //     mid = start + (end - start) / 2;
        //     if(A[mid] > A[mid - 1] && A[mid] > A[mid + 1]){
        //         return mid;
        //     }else if(A[mid] < A[mid - 1] && A[mid] > A[mid + 1]){
        //         end = mid;
        //     }else{
        //         start = mid;
        //     }
        // }
        // if(A[start] > A[start - 1] && A[start] > A[start + 1]){
        //     return start;
        // }
        // if(A[end] > A[end - 1] && A[end] > A[end + 1]){
        //     return end;
        // }
        
        // return -1;
        int start = 1, end = A.length-2; // 1.答案在之间，2.不会出界 
        while(start + 1 <  end) {
            int mid = (start + end) / 2;
            if(A[mid] < A[mid - 1]) {
                end = mid;
            } else if(A[mid] < A[mid + 1]) {
                start = mid;
            } else {
                end = mid;
            }
        }
        if(A[start] < A[end]) {
            return end;
        } else { 
            return start;
        }
    }
}
