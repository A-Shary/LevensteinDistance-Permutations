# LevensteinDistance-Permutations
笔记整理：
Test1：主要考察排列
       扩展：Java二维数组的实现一般有map和list

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
      
Test2主要考察莱文斯坦距离，量化两个字符差异程度。

/*
  test2：
Given two words word1 and word2, find the minimum number of steps required to convert
 word1 to word2. (each operation is counted as 1 step.)
You have the following 3 operations permitted on a word:
a) Insert a character

b) Delete a character

c) Replace a character

函数:1、getDistance(strA,strB):返回两个字符的编辑距离，即最小的转换步骤。
       参数strA、strB分别表示输入的两个字符
     2、封装min(int a,int b,int c)方法,取出转移step中的最小值。

Author:侯晓渝Shary

思路整理：
	   明确一：函数的功能是什么？
                       返回两个字符的最小编辑距离。
          明确二：这个功能的实现过程中是否需要未知内容参与运算？
                       需要
             a)输入的两个字符
             b)存储字符的数组
             c)数组的长度
         过程简述：           
     1、检测输入数据的合法性；
     2、定义字符串长度；
     3、申请二维数组存储字符；
     4、初始化转化的边界值；
     5、转化的状态编写；
     6、调用函数min()取转化状态中的最小值；
     
Date:2017/9/6 13:45
 * */
