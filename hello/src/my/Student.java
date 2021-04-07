package my;

public class Student {
   public String id; //学号
   
   public String name; //姓名
   
   public boolean sex; //true；男；false；女；
   
   public String cellphone;//手机号
   StudentCards cards = new StudentCards();//类的嵌套
   //用于报数
    public void show(){
		for(int i= 0; i<10; i++)
		{
			System.out.println("报数: " + (i+1));
		}
	}
    public void show2(int from,int to){
		for(int i= from; i<to; i++)
		{
			System.out.println("报数: " + (i+1));
		}
	}
}

