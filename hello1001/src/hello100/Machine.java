package hello100;

public class Machine {
	public int money = 0; // ������Ͷ���˶���Ǯ	
	// ����ң�1,5,10
	public void insertCash ( int cash )
	{
		if( cash > 10)
		{
			System.out.println("ֻ��ʶ��1Ԫ��5Ԫ��10Ԫ��");
			return;
		}
		else if(cash==1||cash==5||cash==10) {
		this.money += cash;
		System.out.println("��ǰ���: " + this.money);
		}else {
		}			System.out.println("ֻ��ʶ��1Ԫ��5Ԫ��10Ԫ��");

	}		
	// �������   
	public int exchange ()
	{
		int numOfCoin = this.money / 1;		
		this.money = 0;
		System.out.println("������ɣ� ��ǰ���: " + this.money);		
		return numOfCoin;
	}
}
