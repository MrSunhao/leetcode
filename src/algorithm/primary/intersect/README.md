### 两个数组的交集 II
给定两个数组，编写一个函数来计算它们的交集。

**示例 1:**
```markdown
输入: nums1 = [1,2,2,1], nums2 = [2,2]
输出: [2,2]
```

**示例 2:**
```markdown
输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
输出: [4,9]
```

**说明：**
* 输出结果中每个元素出现的次数，应与元素在两个数组中出现的次数一致。
* 我们可以不考虑输出结果的顺序。

**进阶:**
* 如果给定的数组已经排好序呢？你将如何优化你的算法？
* 如果 nums1 的大小比 nums2 小很多，哪种方法更优？
* 如果 nums2 的元素存储在磁盘上，磁盘内存是有限的，并且你不能一次加载所有的元素到内存中，你该怎么办？

**解题思路：**
```markdown
1. 遍历两个数组，比较元素是否相等，相等时打上标记（记录被查找数组的下标），已经标记的元素不再比较。
2. 先将两个数组排序，定义两个数组指针i,j 两数组中元素相同时同时移动指针，否则移动数值较小的数组的指针。
```