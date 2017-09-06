/*
 * 1. Given a collection of arrbers that might contain duplicates, return all possible 
 * unique permutations. For example, [1,1,2] have the following unique permutations:

[1,1,2], [1,2,1], and [2,1,1].

������
   1��permutation(int [] arr);
   2�����캯��permutation(int [] arr,int head,List<Arraylist<Integer>> result);�����ֱ�Ϊ��ʱ����arr[],

˼·����
	��ȷһ�������Ĺ�����ʲô��
	      ������һ����ܰ����ظ����ֵ����飬�������п��ܵ�Ψһ���С�
	��ȷ������������ʵ�ֹ������Ƿ�������λ�ñ������룿
	   ��
	  a)�������е�������������;
	  b)�洢���ݵĶ�̬����;
	  c)��ʱ���飨�ж������е������Ƿ��ظ���;

       ���̼�����
     ����һ��1)������;2)�ٷ�װ�������ź��������������������ظ�����ʱ��ֱ���������Ϳ��Ա����ظ����С�
     ��������1)�����ݽ�������2)�ж��Ƿ�����ظ����ݣ���->��ʱ�ظ�����˳����֮ǰ��˳�����У���->�������ݽ������С�
     �Է�����Ϊ����

ʱ�䣺2017/9/6 23:48
 * */


package timeComplexity;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;


public class Test1 
{
	//����permutaton()���ͷ���
	public List<ArrayList<Integer>> permutation(int[] arr) 
	{
		List<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		permutation(arr, 0, result);
		return result;
	}
	
	 //���캯��
	private void permutation(int[] arr, int head, List<ArrayList<Integer>> result) 
	{
	 //������head>=arr.lengthʱ��ʾ�����л�û�����ݣ���ʱ����add()������������
		if (head >= arr.length ) 
		{
			ArrayList<Integer> item = new ArrayList<Integer>();
			
			for (int i = 0; i < arr.length; i++) 
			{
				item.add(arr[i]);
			}
			result.add(item);
		}
		
	 //������j<arr.length-1ʱ����������
		for (int j = head; j <= arr.length-1; j++) 
		{
			/*����⵽����arr�����ظ�������ʱ����ʱ�ظ�����˳����֮ǰ��˳�����С�
			����[1,1]��������һ��1��ǰ��ڶ���1����ǰ����Ϊ��ͬ����Ч����
			*/
			if (containsDuplicate(arr, head, j)) 
			{
				swap(arr, head, j);
				permutation(arr, head + 1, result);
				swap(arr, head, j);
			}
		}
	}
	
	//���ڶ������Ƿ��ظ����ж�����
	private boolean containsDuplicate(int[] arr, int head, int end)
	{
		for (int i = head; i <= end-1; i++)
		{
			if (arr[i] == arr[end]) 
			{
				return false;
			}
		}
		return true;
	}
	 //��װswap()��������ָ����������λ��
	private void swap(int[] a, int i, int j) 
	{
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	

}
