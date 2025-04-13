# 189. Rotate Array

**Difficulty**: Medium  
**Topics**: Array, Two Pointers, In-Place Algorithm  
**Companies**: Microsoft, Amazon, Google, Apple, Facebook

---

## 📝 Problem Statement

Given an integer array `nums`, rotate the array to the right by `k` steps, where `k` is **non-negative**.

---

## 📌 Examples

### Example 1:
**Input**:  
`nums = [1,2,3,4,5,6,7], k = 3`  
**Output**:  
`[5,6,7,1,2,3,4]`  
**Explanation**:  
- Rotate 1 step: [7,1,2,3,4,5,6]  
- Rotate 2 steps: [6,7,1,2,3,4,5]  
- Rotate 3 steps: [5,6,7,1,2,3,4]

---

### Example 2:
**Input**:  
`nums = [-1,-100,3,99], k = 2`  
**Output**:  
`[3,99,-1,-100]`  
**Explanation**:  
- Rotate 1 step: [99,-1,-100,3]  
- Rotate 2 steps: [3,99,-1,-100]

---

## 📚 Constraints

- `1 <= nums.length <= 10^5`
- `-2^31 <= nums[i] <= 2^31 - 1`
- `0 <= k <= 10^5`

---

## 💡 Follow-up

- Try to solve this in **multiple ways**.
- Can you do it **in-place** with **O(1)** extra space?

---

## 🔁 Approaches

### ✅ Approach 1: Brute Force (O(n × k))
Shift elements one by one, k times.
```java
class Solution {
    public void rotate(int[] nums, int k) {
        int n = nums.length;
        for (int i = 0; i < k; i++) {
            int last = nums[n - 1];
            for (int j = n - 1; j > 0; j--) {
                nums[j] = nums[j - 1];
            }
            nums[0] = last;
        }
    }
}
