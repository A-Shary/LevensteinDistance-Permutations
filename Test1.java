/*
 * 1. Given a collection of arrbers that might contain duplicates, return all possible 
 * unique permutations. For example, [1,1,2] have the following unique permutations:

[1,1,2], [1,2,1], and [2,1,1].

函数：
   1、permutation(int [] arr);
   2、构造函数permutation(int [] arr,int head,List<Arraylist<Integer>> result);参数分别为临时数组arr[],

思路整理：
	明确一：函数的功能是什么？
	      将给定一组可能包含重复数字的数组，返回所有可能的唯一排列。
	明确二：函数功能实现过程中是否有其他位置变量参与？
	   有
	  a)参与排列的随机输入的数据;
	  b)存储数据的动态数组;
	  c)临时数组（判断数组中的数据是否重复）;

       过程简述：
     方法一：1)先排序;2)再封装方法对排好序的数组遍历，当存在重复数据时，直接跳过，就可以避免重复排列。
     方法二：1)对数据进行排序；2)判定是否存在重复数据，是->此时重复数的顺序按照之前的顺序排列，否->交换数据进行排列。
     以方法二为例：

时间：2017/9/6 23:48
 * */


package timeComplexity;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;


public class Test1 
{
	//定义permutaton()泛型方法
	public List<ArrayList<Integer>> permutation(int[] arr) 
	{
		List<ArrayList<Integer>> result = new ArrayList<ArrayList<Integer>>();
		permutation(arr, 0, result);
		return result;
	}
	
	 //构造函数
	private void permutation(int[] arr, int head, List<ArrayList<Integer>> result) 
	{
	 //当索引head>=arr.length时表示数组中还没有数据，此时调用add()方法填入数据
		if (head >= arr.length ) 
		{
			ArrayList<Integer> item = new ArrayList<Integer>();
			
			for (int i = 0; i < arr.length; i++) 
			{
				item.add(arr[i]);
			}
			result.add(item);
		}
		
	 //当索引j<arr.length-1时，遍历数组
		for (int j = head; j <= arr.length-1; j++) 
		{
			/*当检测到数组arr中有重复的数字时，此时重复数的顺序按照之前的顺序排列。
			例：[1,1]两个数第一个1在前与第二个1排在前都认为是同样的效果。
			*/
			if (containsDuplicate(arr, head, j)) 
			{
				swap(arr, head, j);
				permutation(arr, head + 1, result);
				swap(arr, head, j);
			}
		}
	}
	
	//用于对数据是否重复作判定条件
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
	 //分装swap()方法交换指定两个数的位置
	private void swap(int[] a, int i, int j) 
	{
		int temp = a[i];
		a[i] = a[j];
		a[j] = temp;
	}
	

}
