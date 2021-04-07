package sjfz;

public class SZ {
	public static void main(String[] ages) {
	//创建一个长度为6的int型一维数组，要求数组的元素值在1-30之间，随机赋值，要求各个元素不同
	//方式一，有重复值则通过i--进行当前循环
     int[] a = new int[6]; 
	     for (int i = 0; i < a.length; i++) {
		a[i] = (int)(Math.random() * 30 );//元素赋值，将随机数范围[0,1）扩展至[0,30)，随机数为浮点型，需要强转为int型
		/* for (int j = 0; j < i; j++) {
		 if(a[i] == a[j]) {//判断是否重复
	    i--;//如果重复则重新开始本次循环
	    break; //如果重复结束当前循环    
		 }
	  }*/
	}
	for (int u = 0;u< a.length;u++) {
		System.out.print(a[u] + " ");//输出所有数组元素
	}
	System.out.println("\n");
	}}
