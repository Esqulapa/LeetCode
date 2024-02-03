class Solution {
    public int removeDuplicates(int[] nums) {

               int temp = 1;

               for (int i = 0; i < nums.length - 1; i++) {
                       if (nums[i] != nums[i + 1])
                       {
                           nums[temp++] = nums[i + 1];
                           
                       }
                   }
               return temp;
           }
}