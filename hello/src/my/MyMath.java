package my;

public class MyMath {
	public void print ( int n )
	{
		if(n<=0) 
		{
			System.out.println("��������<=0!!");
			return;
		}
		if(n>10)
		{
			System.out.println("��������̫����!");
			return;
		}		
		int rows = 0; // ����
		int cols = 0; // ����
		for(int k=1; k<=n; k++)
		{
			System.out.print( k + " ");
			cols ++;
			if( cols > rows )
			{
				System.out.print("\n"); // ����
				rows ++;
				cols = 0;
			}			
		}
}		
}
