/*
  test2��
Given two words word1 and word2, find the minimum number of steps required to convert
 word1 to word2. (each operation is counted as 1 step.)
You have the following 3 operations permitted on a word:
a) Insert a character

b) Delete a character

c) Replace a character

����:1��getDistance(strA,strB):���������ַ��ı༭���룬����С��ת�����衣
       ����strA��strB�ֱ��ʾ����������ַ�
     2����װmin(int a,int b,int c)����,ȡ��ת��step�е���Сֵ��

Author:������Shary

˼·����
	   ��ȷһ�������Ĺ�����ʲô��
                       ���������ַ�����С�༭���롣
          ��ȷ����������ܵ�ʵ�ֹ������Ƿ���Ҫδ֪���ݲ������㣿
                       ��Ҫ
             a)����������ַ�
             b)�洢�ַ�������
             c)����ĳ���
         ���̼�����           
     1������������ݵĺϷ��ԣ�
     2�������ַ������ȣ�
     3�������ά����洢�ַ���
     4����ʼ��ת���ı߽�ֵ��
     5��ת����״̬��д��
     6�����ú���min()ȡת��״̬�е���Сֵ��
     
Date:2017/9/6 13:45
 * */

package timeComplexity;

public  class Test2
{		 
	   
	    public  int getDistance(String strA, String strB)
	    {
	        int distance=-1;//������distanceʱ��˵�����ݲ��Ϸ���
	        
	     //1������������ݵĺϷ��ԣ�
	        if(null==strA||null==strB||strA.isEmpty()||strB.isEmpty())
	        {
	            return distance;
	        }
	        
	        if (strA.equals(strB)) 
	        {
	            return 0;
	        }
	        
	        //2�������ַ�������
	        System.out.println("FirstString��"+strA);
	        System.out.println("SecondString��"+strB);
	        int lenA=strA.length();
	        int lenB=strB.length();
	        
	        // 3�������ά����洢�ַ���
	        int arr[][]=new int[lenA+1][lenB+1];
	     
	        //4����ʼ��ת���ı߽�ֵ��
	        for(int i=0;i<=lenA;i++){
	            arr[i][0]=i;

	        }
	        for(int j=0;j<=lenB;j++){
	            arr[0][j]=j;
	        }
	        // 5��ת����״̬��д��
	        // 6�����ú���min()ȡת��״̬�е���Сֵ��
	        for(int i=1;i<=lenA;i++){
	            for(int j=1;j<=lenB;j++){
	                arr[i][j]=min(arr[i-1][j]+1,
	                                arr[i][j-1]+1,
	                                arr[i-1][j-1]+(strA.charAt(i-1)==strB.charAt(j-1)?0:1));
	            }
	            
	        }
			return arr[lenA][lenB];
	    }
	    //ȡ��������Сֵ
	        public  int  min(int a,int b, int c){
	        	return Math.min(Math.min(a,b),c);
	              
	        }
	        
	}

