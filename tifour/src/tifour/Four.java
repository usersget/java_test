package tifour;

public class Four {
//*4.给定一个数组a{1,3,5,7,9,0,2,4,6,8} 找寻数组中的最大值和最小值(极值问题)
public static void main(String[] args){
		//买一件衬衫   百货商场   最便宜的
		//第一家    200块    记录一下200(小本本  脑子里)
		//第二家    180块    如果比记录的这个便宜   抹去记录的信息  重新记录  小本本180
		//第三家    250块    如果比记录的小本本数据贵   算啦继续找下一家
		//第四家    50块      如果比小本本便宜    抹去 重新记录  小本本50
		//以上是分析的思路
		int[] a = {1,3,5,7,9,2,4,6,8};
		//1.创建一个变量   当作小本本   记录信息
		int min = a[0];
		int max = a[0];
		//2.挨个寻找数组中的元素  与变量中的元素进行比较 
		for(int i=1;i<a.length;i++){
			if(a[i]<min){
				min = a[i];
			}
			if(a[i]>max){
				max = a[i];
			}
		}
		System.err.println("数组中的最小值为:"+min);
		System.err.println("数组中的最大值为:"+max);
	} 
}
	