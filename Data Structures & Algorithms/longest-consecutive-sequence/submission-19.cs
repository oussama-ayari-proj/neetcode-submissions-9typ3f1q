public class Solution {
    public int LongestConsecutive(int[] nums) {
    if (nums.Length == 0)
        return 0;

    List<int> res = new List<int>();
    Array.Sort(nums);
    nums = nums.Distinct().ToArray(); // Remove duplicates after sorting

    int count = 1; // Initialize count to 1 since the first number is part of a sequence
    int maxCount = 1; // Track the longest sequence
    int firstOcc = nums[0];

    for (int i = 1; i < nums.Length; i++)
    {
        if (nums[i] == firstOcc + 1) // Check if it's a consecutive number
        {
            count++;
            firstOcc = nums[i];
        }
        else
        {
            // If not consecutive, reset count and track the max
            maxCount = Math.Max(maxCount, count);
            count = 1; // Reset to 1 because the current number starts a new sequence
            firstOcc = nums[i];
        }
    }

    // Final check for the last sequence
    maxCount = Math.Max(maxCount, count);

    return maxCount;
    
    }
    
    }
