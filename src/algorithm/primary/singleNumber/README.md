### 只出现一次的数字
给定一个非空整数数组，除了某个元素只出现一次以外，其余每个元素均出现两次。找出那个只出现了一次的元素。

说明：

你的算法应该具有线性时间复杂度。 你可以不使用额外空间来实现吗？

**示例 1:**
```markdown
输入: [2,2,1]
输出: 1
```

**示例 2:**
```markdown
输入: [4,1,2,1,2]
输出: 4
```

**题解**
```markdown
1. 一开始想到的就是嵌套循环，但是题目有线性时间要求，故嵌套循不环符合要求。
2. 使用hashSet去重，严格来讲使用来额外的空间，也不太符合题目要求。
3. 使用数组排序，java Arrays工具类下的sort排序，先比较nums[i] 和 nums[i+1],如果不相等则返回nums[i]
   否则返回最后一组元素。因为使用了排序，也不符合题目要求。
4. 利用异或运算的特性，任何数与0异或都是它本身，相同数异或等于0。
```