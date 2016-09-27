c class Solution {
    /** 
     *@param L: Given n pieces of wood with length L[i]
     *@param k: An integer
     *return: The maximum length of the small pieces.
     */
    public int woodCut(int[] L, int k) {
        int max = 0;
        for(int i = 0; i < L.length;i++){
            max = Math.max(L[i],max);
        }
        int start = 1, end = max;
        while(start + 1 < end){
            int mid = start + (end - start) /2;
            if(count(L,mid) >= k){
                start = mid;
            }else{
                end = mid;
            }
        }
        if(count(L,end) >= k){
            return end;
        }
        if(count(L,start) >= k){
            return start;
        }
        return 0;
        
    }
    private int count(int[] list, int longth){
        int num = 0;
        for(int i = 0; i < list.length; i++){
            num += list[i] / longth;
        }
        return num;
    }
}
