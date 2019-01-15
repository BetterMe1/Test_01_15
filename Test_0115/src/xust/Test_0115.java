/**
 * date：2019/01/15
 * author:BetterMe1
 * program:leetcode:两数之和
 * compiler:
 */


package xust;

/*
 1. 两数之和
  给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
  你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素。
  示例:
  给定 nums = [2, 7, 11, 15], target = 9
  因为 nums[0] + nums[1] = 2 + 7 = 9
  所以返回 [0, 1]
 */
/*
public class Test_0115 {
	public static void main(String[] args){
		int[] nums={1,2,3,4,5,6};
		int target=9;
		Solution So=new Solution();
		int[] num=So.twoSum(nums,target);
		System.out.println(num[0]);
		System.out.println(num[1]);
	}
}
class Solution {
    public int[] twoSum(int[] nums, int target) {
    	int[] num=new int[] {-1,-1};
    	for (int i = 0; i<nums.length; i++){
    		for (int j = 0; j<nums.length; j++){
    			if (i != j && nums[i] + nums[j] == target){
    				num[0]=i;
    				num[1]=j;
    				return num;
    			}
    		}
    	}
		return num;
    }
}
*/
/*
 2.判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。示例 1:
   输入: 121
  输出: true
  示例 2:
  输入: -121
  输出: false
  解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
  示例 3:
  输入: 10
  输出: false
  解释: 从右向左读, 为 01 。因此它不是一个回文数。
 进阶:
 你能不将整数转为字符串来解决这个问题吗？
 */
public class Test_0115 {
	public static void main(String[] args){
	}
}
	
/*
 * 将整数转为字符串解决
 */
class Solution1 {
    public boolean isPalindrome(int x) {
        
    }
}
