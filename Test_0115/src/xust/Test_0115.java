/**
 * date��2019/01/15
 * author:BetterMe1
 * program:leetcode:����֮��
 * compiler:
 */


package xust;

/*
 1. ����֮��
  ����һ���������� nums ��һ��Ŀ��ֵ target�������ڸ��������ҳ���ΪĿ��ֵ���� ���� ���������������ǵ������±ꡣ
  ����Լ���ÿ������ֻ���Ӧһ���𰸡����ǣ��㲻���ظ��������������ͬ����Ԫ�ء�
  ʾ��:
  ���� nums = [2, 7, 11, 15], target = 9
  ��Ϊ nums[0] + nums[1] = 2 + 7 = 9
  ���Է��� [0, 1]
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
 2.�ж�һ�������Ƿ��ǻ���������������ָ���򣨴������ң��͵��򣨴������󣩶�����һ����������ʾ�� 1:
   ����: 121
  ���: true
  ʾ�� 2:
  ����: -121
  ���: false
  ����: �������Ҷ�, Ϊ -121 �� ���������, Ϊ 121- �����������һ����������
  ʾ�� 3:
  ����: 10
  ���: false
  ����: ���������, Ϊ 01 �����������һ����������
 ����:
 ���ܲ�������תΪ�ַ�����������������
 */
public class Test_0115 {
	public static void main(String[] args){
	}
}
	
/*
 * ������תΪ�ַ������
 */
class Solution1 {
    public boolean isPalindrome(int x) {
        
    }
}
