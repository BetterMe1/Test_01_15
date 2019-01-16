/**
 * date��2019/01/15
 * author:BetterMe1
 * program:leetcode:����֮��,������
 * compiler:jdk1.7.0_51
 */


package xust;

import java.util.Scanner;

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
 * �㷨˼�룺�������б����������� ����������Ϊͬһ��Ԫ�أ�֮�͵���Ŀ��ֵʱ���������������±꣨��������������أ�
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
		System.out.print("������һ�����֣�");
		Scanner sc= new Scanner (System.in);
		int x=sc.nextInt();
		Solution1 So1=new Solution1();
		Solution1 So2=new Solution1();
		if(So1.isPalindrome(x)){
			System.out.println("������תΪ�ַ������:"+x+"��һ��������.");
		}
		else{
			System.out.println("������תΪ�ַ������:"+x+"����һ��������.");	
		}
		if(So2.isPalindrome(x)){
			System.out.println("��������תΪ�ַ������:"+x+"��һ��������.");
		}
		else{
			System.out.println("��������תΪ�ַ������:"+x+"����һ��������.");	
		}
	}
}
	
/*
 * ������תΪ�ַ������
 * �㷨˼�룺������תΪ�ַ�������left����ַ�����һ���ַ�����right ����ַ������һ���ַ���
 * �Ƚ�left��right��ǵ��ַ�������ȷ���false,�����left++,right--,�Ƚ����������ȣ��򷵻�true.
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
 * ��������תΪ�ַ������
 * �㷨˼��:�����ֵĺ�벿������֮��õ�һ����������ǰ�벿��������ɵ��������бȽϣ�����ȣ�����true������ȣ�����false
 */
class Solution2 {
    public boolean isPalindrome(int x) {
    	if(x>=0){
    		int y=x;
            int len=1;//���ݳ���
        	while(y>9){
        		y=y/10;
        		len++;
        	}
        	int right=0;
            for(int i=len;i>=len/2;i--){
         	   right=right*10+x%10;
         	   x/=10;
            }
            //������ݳ����Ǽ�������Ӧ���������м��һλ
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
    