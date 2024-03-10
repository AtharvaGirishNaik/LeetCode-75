class Solution {
    public int singleNumber(int[] nums) {
        //Brute force
        //Time Complexity - O(N^2)
        //Space Complexity - O(1)
        // int n = nums.length;
        // for(int i = 0; i<n; i++)
        // {
        //     int num = nums[i];
        //     int count = 0;
        //     for(int j = 0; j<n; j++)
        //     {
        //         if(nums[j] == num)
        //         {
        //             count++;
        //         }
        //     }
        //     if(count == 1)
        //     {
        //         return num;
        //     }
        // }
        // return 0;
        //Optimal Solution
        //Time complexity - O(N)
        //Space complexity - O(1)

        int xor = 0;
        for(int i = 0;i<nums.length;i++)
        {
            xor = xor ^ nums[i];
        }
        return xor;
    }
}

// Intuition
// Two important properties of XOR are the following:
// XOR of two same numbers is always 0 i.e. a ^ a = 0. ←Property 1.
// XOR of a number with 0 will result in the number itself i.e. 0 ^ a = a. ←Property 2
// Here all the numbers except the single number appear twice and so will form a pair. Now, if we perform XOR of all elements of the array, the XOR of each pair will result in 0 according to the XOR property 1. The result will be = 0 ^ (single number) = single number (according to property 2).
// So, if we perform the XOR of all the numbers of the array elements, we will be left with a single number.

// Approach
// We will just perform the XOR of all elements of the array using a loop and the final XOR will be the answer.


// Given a non-empty array of integers nums, every element appears twice except for one. Find that single one.
// You must implement a solution with a linear runtime complexity and use only constant extra space.

// Example 1:
// Input: nums = [2,2,1]
// Output: 1
  
// Example 2:
// Input: nums = [4,1,2,1,2]
// Output: 4
  
// Example 3:
// Input: nums = [1]
// Output: 1
