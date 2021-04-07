package lx;

public class lianxi {
	
	public static void main(String[] args) {
		/*//第0题
		System.out.println("一到一百之间的奇数有：");
		int[] arr = new int[50];
        for (int i = 0; i <50; i++) {
            arr[i]=i*2+1;System.out.print(arr[i]);
        }
      
       //第1题
        int[] a = new int[4];
        int[] b = {1,2,3,4};
        int[] c = {5,6,7,8};for(int i =0;i<=b.length;i++) {
        System.out.print(b[i]); 
 System.out.print(c[i]);

        }
        for(int q =0; q <4;q++) {
        	a[q] = b[q];
        	b[q]= c[q];
        	c[q] = a[q];  System.out.println("转换后的数组为"); 
        	for(int u =0;u<=b.length;u++) {
        		  System.out.println(c[u]);  System.out.println(b[u]); 
        	}
        }
          //第2题
		int a =0 ;int as =0;int ss =0;int r =0;int u =0;
        int[] i = {1,2,3,4,5,6};
       int y =0;
        y=i[0];as=i[1];ss=i[2];	a=i[3];r=i[4];u=i[5];
        System.out.print(u+"*");
        System.out.print(r+"*");
        System.out.print(a+"*");
        System.out.print(ss+"*");
        System.out.print(as+"*");
        System.out.print(y+"*");
        	 
      
        
       
      //第3题
        int[] w = {1,2,3,4,5,6};
    int sum=0;sum=sum+w[0]+w[1]+w[2]+w[3]+w[4]+w[5];int y=sum/5;
   System.out.print(y);*/
     	
       
         //第4题
        int[] B= {1,3,5,7,9,0,2,4,6,8};
        int max=B[0];
        int min=B[0];
        for(int r =0;r<=B.length;r++) {
        	if(max<B[r]) {
        		max=B[r];
        		
        	}
        	if(min>B[r]) {
        		min=B[r];  
        	}
        	
        } 
    	System.out.println("数组中的最小值为:"+min);
		System.out.println("数组中的最大值为:"+max);
	}
}
  /*    //第五题
        int[] wu1= {1,2,3};int[] wu2= {4,5};
        int[] wu3=new int[5];
        for(int q=0;q<=2;q++) {
        	wu3[q] =wu1[q];
        }
        wu3[3] = wu2[0];wu3[4] = wu2[1];
        for(int y =0;y<=5;y++) {
        	 System.out.print(wu3[y]);	
        }
          //第六题
        int h=0;int f=0;
        int aar[] = {1,3,10,4,5,7,3,9};int rr[] = new int[10];int re[] = new int[4];
        if(aar.length>0){
            int aar_Max = aar[0];int aar_index =0;
            for(int l=0;l<aar.length;l++){
                if(aar[l]>aar_Max){
                    aar_Max=aar[l];
                    aar_index = l;
                    for(int n=0;n < aar.length;n++) {
                    	if(n <l) {
                    		rr[h] = aar[n];h++;System.out.print("rr数组为"+rr[h]);	
                    	}else if(n==l){
                    		n++;
                    	}else {
                    		re[f] = aar[n];f++;System.out.print("re数组为"+re[f]);
                    	}
                    }
                }
            }
        }

        //第七题
        int[] qi = {1,2,3,0,0,4,5,0,6,0,7};
        int[] qi1 = new int[6];
        int v = 0;
        for(int g =0;g <=qi.length; g++) {
        	if(qi[g] !=0) {
        		
        		qi1[g]=qi[v]; 	v++;System.out.println("qil数组为"+qi1[g]);
        	}else {
        		break;
        	}
        }*/
//  第八题
//        int[] ba = new int[25];
//
//for(int o=2;o<=100;o++) {
//int k; 	int p=0;
//for( k=2;k < o;k++) {
//
//if(o%k==0) {
//	break;
//}
//if(o%k !=0) {
//ba[p] = o; p++;System.out.println("2到100之间的素数有"+o);
//}
//      
//}
	
 //第九题
//String uu = "冒泡";String r ="快速";String i ="选择";
//String y ="希尔";String[] u =  new String [4];
//u[0]=uu;
//第十题



