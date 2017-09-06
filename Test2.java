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

package timeComplexity;

public  class Test2
{		 
	   
	    public  int getDistance(String strA, String strB)
	    {
	        int distance=-1;//当返回distance时，说明数据不合法。
	        
	     //1、检测输入数据的合法性，
	        if(null==strA||null==strB||strA.isEmpty()||strB.isEmpty())
	        {
	            return distance;
	        }
	        
	        if (strA.equals(strB)) 
	        {
	            return 0;
	        }
	        
	        //2、定义字符串长度
	        System.out.println("FirstString："+strA);
	        System.out.println("SecondString："+strB);
	        int lenA=strA.length();
	        int lenB=strB.length();
	        
	        // 3、申请二维数组存储字符；
	        int arr[][]=new int[lenA+1][lenB+1];
	     
	        //4、初始化转化的边界值；
	        for(int i=0;i<=lenA;i++){
	            arr[i][0]=i;

	        }
	        for(int j=0;j<=lenB;j++){
	            arr[0][j]=j;
	        }
	        // 5、转化的状态编写；
	        // 6、调用函数min()取转化状态中的最小值；
	        for(int i=1;i<=lenA;i++){
	            for(int j=1;j<=lenB;j++){
	                arr[i][j]=min(arr[i-1][j]+1,
	                                arr[i][j-1]+1,
	                                arr[i-1][j-1]+(strA.charAt(i-1)==strB.charAt(j-1)?0:1));
	            }
	            
	        }
			return arr[lenA][lenB];
	    }
	    //取三者中最小值
	        public  int  min(int a,int b, int c){
	        	return Math.min(Math.min(a,b),c);
	              
	        }
	        
	}

