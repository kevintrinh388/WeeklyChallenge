## Coding Challenge due September 16

Java

a) Create a function that reorders the digits of each numerical element in an array based on ascending (asc) or descending (desc) order.

Examples:
reorderDigits([515, 341, 98, 44, 211], "asc") ➞ [155, 134, 89, 44, 112]

reorderDigits([515, 341, 98, 44, 211], "desc") ➞ [551, 431, 98, 44, 211]

reorderDigits([63251, 78221], "asc") ➞ [12356, 12278]

reorderDigits([63251, 78221], "desc") ➞ [65321, 87221]

reorderDigits([1, 2, 3, 4], "asc") ➞ [1, 2, 3, 4]

reorderDigits([1, 2, 3, 4], "desc") ➞ [1, 2, 3, 4]

Notes:
Single-digit numbers should be ordered the same regardless of direction.
Numbers in the array should be kept the same order.

---

b) Write a function that returns true if you can partition an array into one element and the rest, such that this element is equal to the product of all other elements excluding itself.

Examples:
canPartition([2, 8, 4, 1]) ➞ true
// 8 = 2 x 4 x 1

canPartition([-1, -10, 1, -2, 20]) ➞ false

canPartition([-1, -20, 5, -1, -2, 2]) ➞ true

Notes:
The array may contain duplicates.
Multiple solutions can exist, any solution is sufficient to return true.
