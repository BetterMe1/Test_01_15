/**
 * date：2019/01/15
 * author:BetterMe1
 * program:leetcode:两数之和,回文数
 * compiler:jdk1.7.0_51
 */


package xust;

import java.util.Scanner;

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
 * 算法思想：在数组中遍历所有数， 当两数（不为同一个元素）之和等于目标值时返回这两个数的下标（用数组存起来返回）
 */
//public class Test_0115 {
//	public static void main(String[] args){
//		int[] nums={1,2,3,4,5,6};
//		int target=9;
//		Solution So=new Solution();
//		int[] num=So.twoSum(nums,target);
//		System.out.println(num[0]);
//		System.out.println(num[1]);
//	}
//}
//class Solution {
//    public int[] twoSum(int[] nums, int target) {
//    	int[] num=new int[] {-1,-1};
//    	for (int i = 0; i<nums.length; i++){
//    		for (int j = 0; j<nums.length; j++){
//    			if (i != j && nums[i] + nums[j] == target){
//    				num[0]=i;
//    				num[1]=j;
//    				return num;
//    			}
//    		}
//    	}
//		return num;
//    }
//}

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
		System.out.print("请输入一个数字：");
		Scanner sc= new Scanner (System.in);
		int x=sc.nextInt();
		Solution1 So1=new Solution1();
		Solution1 So2=new Solution1();
		if(So1.isPalindrome(x)){
			System.out.println("将整数转为字符串解决:"+x+"是一个回文数.");
		}
		else{
			System.out.println("将整数转为字符串解决:"+x+"不是一个回文数.");	
		}
		if(So2.isPalindrome(x)){
			System.out.println("不将整数转为字符串解决:"+x+"是一个回文数.");
		}
		else{
			System.out.println("不将整数转为字符串解决:"+x+"不是一个回文数.");	
		}
	}
}
	
/*
 * 将整数转为字符串解决
 * 算法思想：将整数转为字符串，用left标记字符串第一个字符，用right 标记字符串最后一个字符，
 * 比较left、right标记的字符，不相等返回false,相等则left++,right--,比较完毕若都相等，则返回true.
 */
class Solution1 {
    public boolean isPalindrome(int x) {
        String s=String.valueOf(x);
        int left=0;
        int len=s.length();
        int right=len-1;
        while(left<len-1 && right>=0){
        	if(s.charAt(left)!=s.charAt(right)){
        		return false;
        	}
        	left++;
        	right--;
        }
        return true;
    }
}
/*
 * 不将整数转为字符串解决
 * 算法思想:将数字的后半部分逆置之后得到一个整数，与前半部分数字组成的整数进行比较，若相等，返回true，不相等，返回false
 */
class Solution2 {
    public boolean isPalindrome(int x) {
    	if(x>=0){
    		int y=x;
            int len=1;//数据长度
        	while(y>9){
        		y=y/10;
        		len++;
        	}
        	int right=0;
            for(int i=len;i>=len/2;i--){
         	   right=right*10+x%10;
         	   x/=10;
            }
            //如果数据长度是技奇数，应该消除最中间的一位
            if((right==x)||(right==x/10)){
            	return true;
            }
            else{
            	return false;
            }
    	}
    	return false;
    	
    }
}
    