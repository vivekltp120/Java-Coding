import java.util.*;
import java.io.*;
public class GFGVarious {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		GFGVarious gf=new GFGVarious();
		gf.input();

	}
	public void multiple_of_three(String st){
              System.out.println(st.length());

              long sum=0;
              for( int i=0;i<st.length();i++) {
            	  sum=sum*2+Character.getNumericValue(st.charAt(i));
            	  System.out.println(sum);
              }
              if(sum%3==0) {
            	  System.out.println("1");
              }
              else
            	  System.out.println("0");
	    
	} 
	public void input(){
	 Scanner input=new Scanner(System.in);
	 int n=input.nextInt();
	 for (int i=0;i<n;i++){
	     String str=input.next();
	     multiple_of_three(str);
	     }
	}
}
