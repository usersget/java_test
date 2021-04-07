package hello100;

public class Machine {
	public int money = 0; // 机器里投入了多少钱	
	// 人民币：1,5,10
	public void insertCash ( int cash )
	{
		if( cash > 10)
		{
			System.out.println("只能识别1元，5元，10元！");
			return;
		}
		else if(cash==1||cash==5||cash==10) {
		this.money += cash;
		System.out.println("当前余额: " + this.money);
		}else {
		}			System.out.println("只能识别1元，5元，10元！");

	}		
	// 交易完成   
	public int exchange ()
	{
		int numOfCoin = this.money / 1;		
		this.money = 0;
		System.out.println("交易完成， 当前余额: " + this.money);		
		return numOfCoin;
	}
}
