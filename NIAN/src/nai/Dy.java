package nai;

import java.util.Scanner;

public class Dy {
	@SuppressWarnings("resource")
	public static void main(String[] args) {
	int month,day,a=0;
	Scanner reader=new Scanner(System.in);
	System.out.println("�������·�");
	month=reader.nextInt(); 
	System.out.println("��������");
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
	System.out.println("����2020��ĵ�"+a+"��");break;
	}
	}
	}
/*ABCDEFGHIJKLMNOPQRSTUVWXYZ
 * */
	/*case 1:a=day;
	System.out.println("����2020��ĵ�"+a+"��");break;
	case 2:a=31+day;
	System.out.println("����2020��ĵ�"+a+"��");break;
	case 3:a=31+29+day;
	System.out.println("����2020��ĵ�"+a+"��");break;
	case 4:a=31+29+31+day;
	System.out.println("����2020��ĵ�"+a+"��");break;
	case 5:a=31+29+31+30+day;
	System.out.println("����2020��ĵ�"+a+"��");break;
	case 6:a=31+29+31+30+31+day;
	System.out.println("����2020��ĵ�"+a+"��");break;
	case 7:a=31+29+31+30+31+30+day;
	System.out.println("����2020��ĵ�"+a+"��");break;
	case 8:a=31+29+31+30+31+30+31+day;
	System.out.println("����2020��ĵ�"+a+"��");break;
	case 9:a=31+29+31+30+31+30+31+31+day;
	System.out.println("����2020��ĵ�"+a+"��");break;
	case 10:a=31+29+31+30+31+30+31+31+30+day;
	System.out.println("����2020��ĵ�"+a+"��");break;
	case 11:a=31+29+31+30+31+30+31+31+30+31+day;
	System.out.println("����2020��ĵ�"+a+"��");break;
	case 12:a=31+29+31+30+31+30+31+31+30+31+30+day;
	System.out.println("����2020��ĵ�"+a+"��");break;
	}
	}
	}*/

