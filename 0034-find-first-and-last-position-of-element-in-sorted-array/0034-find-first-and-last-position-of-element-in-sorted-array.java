class Solution {
    public int[] searchRange(int[] nums, int target) {

        int ans [] = new int[2];

        ans[0] = FindFirst(nums, target);
        ans[1] = FindSecond(nums , target);


       return ans;
        
    }

    public static int FindFirst(int [] arr, int target){

        int n = arr.length;
    
        int low = 0;
        int high = n -1;
        int ans = -1;

        while(low <= high){

            int mid = low + (high - low)/2;

            if(arr[mid] == target){
                 ans = mid;

                 high = mid -1;
            }

          else if(arr[mid] > target ){
                high = mid -1;
            }else{
                low = mid + 1;
            }
        }
         return ans ;
    }
  public static int FindSecond(int [] arr, int target){

        int n = arr.length;

        int low = 0;
        int high = n -1;
        int ans = -1;

        while(low <= high){

            int mid = low + (high - low)/2;

            if(arr[mid] == target){
                 ans = mid;

                 low = mid + 1;
            }

           else if(arr[mid] > target ){
                high = mid -1;
            }else{
                low = mid + 1;
            }
        }
         return ans ;
    }

}