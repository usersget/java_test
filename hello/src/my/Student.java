package my;

public class Student {
   public String id; //ѧ��
   
   public String name; //����
   
   public boolean sex; //true���У�false��Ů��
   
   public String cellphone;//�ֻ���
   StudentCards cards = new StudentCards();//���Ƕ��
   //���ڱ���
    public void show(){
		for(int i= 0; i<10; i++)
		{
			System.out.println("����: " + (i+1));
		}
	}
    public void show2(int from,int to){
		for(int i= from; i<to; i++)
		{
			System.out.println("����: " + (i+1));
		}
	}
}

