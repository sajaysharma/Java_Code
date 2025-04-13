# 26. Remove Duplicates from Sorted Array

**Difficulty**: Easy  
**Topics**: Array, Two Pointers  
**Companies**: Facebook, Google, Microsoft, Amazon

---

## 📝 Problem Statement

Given an integer array `nums` sorted in **non-decreasing order**, remove the duplicates **in-place** such that each unique element appears only once. The relative order of the elements should be kept the same. Then return the number of unique elements in `nums`.

You must do this by **modifying the input array in-place** with **O(1) extra memory**.

---

### ✅ Requirements

To get accepted, you need to do the following:

- Modify the array `nums` such that the first `k` elements contain the unique elements in the order they were present initially.
- The remaining elements of `nums` are not important.
- Return `k`.

The judge will test your solution with the following code:

```java
int[] nums = [...]; // Input array
int[] expectedNums = [...]; // The expected answer with correct length

int k = removeDuplicates(nums); // Calls your implementation

assert k == expectedNums.length;
for (int i = 0; i < k; i++) {
    assert nums[i] == expectedNums[i];
}
