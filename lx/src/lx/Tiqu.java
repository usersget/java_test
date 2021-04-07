package lx;

import java.util.Scanner;

public class Tiqu {
public static void main(String[] args) {
	System.out.println("ÇëÊäÈë×Ö·û´®");
	@SuppressWarnings("resource")
	Scanner reader=new Scanner(System.in);
	String a =reader.next();
		char[] arr = a.toCharArray();  
		  for(int s=0;s<=arr.length;s++) {
              if(arr[s]=='-' && arr[s+1]=='>'){
            	  for(int y=s;y<=arr.length-1;y++) {
            		  if(arr[y]=='<'&& arr[y+1]=='-'&& y!=s+1) {
            		
					} 
            		     else {
         	            	 continue;
            		         }  
            		  for(int t=s+2;t<y;t++) {
            		      int A=arr[t];
            		        A=Integer.valueOf(A);
            			  if(A>=48&&A<=56||A>=65&&A<=90||A>=97&&A<=122) {
            			System.out.println(arr[t]);}
            		}
            		  }  
	             }else {
	            	continue;
	         }
              continue;
             }
}
} 