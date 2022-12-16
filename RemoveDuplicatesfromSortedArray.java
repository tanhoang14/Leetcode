class Solution {
    public int removeDuplicates(int[] nums) {
       // Return the length of the array if it is 0 or 1
if (nums.length <= 1) {
  return nums.length;
}

// Initialize a variable to keep track of the number of unique elements
int k = 1;

// Iterate through the array and add unique elements to the first k positions
for (int i = 0; i < nums.length-1; i++) {
  if (nums[i] != nums[i+1]) {
    nums[k++] = nums[i+1];
  }
}

// Return the number of unique elements
return k;




    }
}
