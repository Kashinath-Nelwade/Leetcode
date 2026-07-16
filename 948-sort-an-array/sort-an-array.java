class Solution {
    public int[] sortArray(int[] nums) {

        if(nums.length ==1){
            return nums ;
        }

        int [] left = new int [nums.length/2];
        int [] right = new int [nums.length-left.length];

        for(int i=0 ; i<left.length; i++){
            left[i] = nums[i];
        }
        for(int i=0 ; i<right.length; i++){
            right[i] = nums[left.length+i];
        }
        sortArray(left);
        sortArray(right);
        merge(nums,left,right);
        return nums;

    }
    public void merge(int[]arr , int []left , int [] right){
        int p1 = 0 ; 
        int p2 = 0; 
        int p3 = 0 ; 
        while(p1<left.length && p2<right.length){
            if(left[p1]<right[p2] ){
            arr[p3] = left[p1];
            p3++;
            p1++;

         }else{
            arr[p3] = right[p2];
            p3++;
            p2++;
         }
        }
        while(p1<left.length){
            arr[p3]=left[p1];
            p3++;
            p1++;

        }
        while(p2<right.length){
            arr[p3]=right[p2];
            p3++;
            p2++ ;
        }
        

    }

    
}