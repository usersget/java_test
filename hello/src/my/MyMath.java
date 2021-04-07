package my;

public class MyMath {
	public void print ( int n )
	{
		if(n<=0) 
		{
			System.out.println("给定的数<=0!!");
			return;
		}
		if(n>10)
		{
			System.out.println("给定的数太大了!");
			return;
		}		
		int rows = 0; // 行数
		int cols = 0; // 列数
		for(int k=1; k<=n; k++)
		{
			System.out.print( k + " ");
			cols ++;
			if( cols > rows )
			{
				System.out.print("\n"); // 换行
				rows ++;
				cols = 0;
			}			
		}
}		
}
