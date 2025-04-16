# Two Sum Problem

## Description

Given an array of integers `nums` and an integer `target`, return **indices** of the two numbers such that they add up to `target`.

You may assume that each input would have **exactly one solution**, and you may **not use the same element twice**.

You can return the answer in **any order**.

---

## Examples

### Example 1:
**Input:**

**Explanation:**  
Because `nums[0] + nums[1] == 9`, we return `[0, 1]`.

---

### Example 2:
**Input:**

---

## Constraints

- 2 <= nums.length <= 10⁴  
- -10⁹ <= nums[i] <= 10⁹  
- -10⁹ <= target <= 10⁹  
- **Only one valid answer exists.**

---

## Follow-Up

Can you come up with an algorithm that has a time complexity **less than O(n²)**?

Hint: Try using a hash map (dictionary) to store values and their indices for faster lookup.
