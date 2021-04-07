package nai;

import java.util.Scanner;

public class Dy {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
	int month,day,a=0;
	Scanner reader=new Scanner(System.in);
	System.out.println("请输入月份");
	month=reader.nextInt(); 
	System.out.println("请输入日");
	day=reader.nextInt();
	switch(month)
	{
	case 12:a+=30;
	case 11:a+=31;
	case 10:a+=30;
	case 9 :a+=31;
	case 8 :a+=31;
	case 7 :a+=30;
	case 6 :a+=31;
	case 5 :a+=30;
	case 4 :a+=31;
	case 3 :a+=29;
	case 2 :a+=31;
	case 1 :a+=day;
	System.out.println("这是2020年的第"+a+"天");break;
	}
	}
	}
/*ABCDEFGHIJKLMNOPQRSTUVWXYZ
 * */
	/*case 1:a=day;
	System.out.println("这是2020年的第"+a+"天");break;
	case 2:a=31+day;
	System.out.println("这是2020年的第"+a+"天");break;
	case 3:a=31+29+day;
	System.out.println("这是2020年的第"+a+"天");break;
	case 4:a=31+29+31+day;
	System.out.println("这是2020年的第"+a+"天");break;
	case 5:a=31+29+31+30+day;
	System.out.println("这是2020年的第"+a+"天");break;
	case 6:a=31+29+31+30+31+day;
	System.out.println("这是2020年的第"+a+"天");break;
	case 7:a=31+29+31+30+31+30+day;
	System.out.println("这是2020年的第"+a+"天");break;
	case 8:a=31+29+31+30+31+30+31+day;
	System.out.println("这是2020年的第"+a+"天");break;
	case 9:a=31+29+31+30+31+30+31+31+day;
	System.out.println("这是2020年的第"+a+"天");break;
	case 10:a=31+29+31+30+31+30+31+31+30+day;
	System.out.println("这是2020年的第"+a+"天");break;
	case 11:a=31+29+31+30+31+30+31+31+30+31+day;
	System.out.println("这是2020年的第"+a+"天");break;
	case 12:a=31+29+31+30+31+30+31+31+30+31+30+day;
	System.out.println("这是2020年的第"+a+"天");break;
	}
	}
	}*/

