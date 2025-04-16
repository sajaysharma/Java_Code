# 13. Roman to Integer

**Solved**  
**Difficulty:** Easy  
**Topics:** Strings, HashMap  
**Companies:** Frequently Asked in Interviews  

---

## 📜 Problem Statement

Roman numerals are represented by **seven different symbols**:

| Symbol | Value |
|--------|-------|
| I      | 1     |
| V      | 5     |
| X      | 10    |
| L      | 50    |
| C      | 100   |
| D      | 500   |
| M      | 1000  |

For example:
- 2 is written as `II` in Roman numerals (just two ones added together).
- 12 is written as `XII` (which is `X + II`).
- 27 is written as `XXVII` (which is `XX + V + II`).

Roman numerals are usually written **largest to smallest from left to right**.

However, there are **exceptions** for subtractive notation:
- 4 is not `IIII`, but `IV` (1 before 5).
- 9 is `IX`, and so on.

### ➖ Subtraction Rules:

There are **six instances** where subtraction is used:

- `I` can be placed before `V` (5) and `X` (10) → to make **4 and 9**
- `X` can be placed before `L` (50) and `C` (100) → to make **40 and 90**
- `C` can be placed before `D` (500) and `M` (1000) → to make **400 and 900**

---

## ✅ Task

Given a Roman numeral `s`, convert it to an **integer**.

---

## 🔍 Examples

### Example 1:
**Input:**  
`s = "III"`  
**Output:**  
`3`  
**Explanation:**  
`III = 3`

---

### Example 2:
**Input:**  
`s = "LVIII"`  
**Output:**  
`58`  
**Explanation:**  
`L = 50`, `V = 5`, `III = 3`

---

### Example 3:
**Input:**  
`s = "MCMXCIV"`  
**Output:**  
`1994`  
**Explanation:**  
`M = 1000`, `CM = 900`, `XC = 90`, `IV = 4`

---

## 🧾 Constraints

- 1 <= s.length <= 15  
- `s` contains only the characters: `'I', 'V', 'X', 'L', 'C', 'D', 'M'`  
- It is **guaranteed** that `s` is a **valid Roman numeral** in the range [1, 3999].

---

## 💡 Hint

Use a **HashMap** to map Roman symbols to values and traverse the string from left to right. Subtract when a smaller value is before a bigger one.

---
