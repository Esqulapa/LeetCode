class Solution {
    public int searchInsert(int[] nums, int target) {

               if (target > nums[nums.length - 1]) return nums.length;

               int whereItSupposeToBe = 0;

               for (int i = 0 ; i < nums.length; i++){
                   if (nums[i] == target) {
                       return i;

                   }
                   else if (target < nums[i])
                   {
                       whereItSupposeToBe = i ;
                       break;
                   }

               }

               return whereItSupposeToBe;
           }
}