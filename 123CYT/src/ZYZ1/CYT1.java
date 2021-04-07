package ZYZ1;
import java.util.Scanner;
public class CYT1 
{
	public static void main(String[] arge) {
		Scanner reader =new Scanner(System.in);
		System.out.println("请输入第一个正数：");
		int a = reader.nextInt();
		System.out.print("请输入二个整数：");
		int b = reader.nextInt();
		System.out.println((float)a/b);
	    reader.close();
      }
}