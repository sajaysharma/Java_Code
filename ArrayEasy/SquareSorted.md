# 977. Squares of a Sorted Array

**Difficulty:** Easy  
**Topics:** Array, Two Pointers, Sorting  
**Companies:** Facebook, Amazon, Google  

---

## Problem Statement

Given an integer array `nums` sorted in **non-decreasing order**, return an array of **the squares of each number** also sorted in **non-decreasing order**.

---

## Example 1:

**Input:**  

**Explanation:**  
After squaring, the array becomes `[16, 1, 0, 9, 100]`.  
After sorting, it becomes `[0, 1, 9, 16, 100]`.

---

## Example 2:

**Input:**  

---

## Constraints:

- `1 <= nums.length <= 10⁴`
- `-10⁴ <= nums[i] <= 10⁴`
- `nums` is sorted in **non-decreasing order**

---

## Solution Approach (Java):

```java
public class SquareSorted {
    public static int[] sortedSquares(int[] nums) {
        int n = nums.length;
        int[] result = new int[n];
        int left = 0, right = n - 1;

        for (int i = n - 1; i >= 0; i--) {
            if (Math.abs(nums[left]) > Math.abs(nums[right])) {
                result[i] = nums[left] * nums[left];
                left++;
            } else {
                result[i] = nums[right] * nums[right];
                right--;
            }
        }
        return result;
    }
}
