package my;

public class FIND {
	// �ѷ���Ҫ��������ڷ���ֵ��
		public int[] find8( int[] arr)
		{
			// �����ȴ������
			int[] temp = new int[ arr.length];
			int count = 0;		
			for (int i=0; i<arr.length; i++)
			{
				if( arr[i] % 8 == 0)
				{
					temp[count] = arr[i];
					count ++;
				}
			}		
			// ���������������
			int[] result = new int[ count ];
			for(int i=0; i<count; i++)
			{
				result[i] = temp[i];
			}		
			return result;
		}



}
