import java.util.*;

public class GFGdynamic {
    
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
           lpsubst();
	}

	public static int getMax(int x, int y) {
		if(x<y) {
			return y;
		}
		return x;
	}
	public static int lpsubst() {
		String a= "a";
		int size=a.length();
		int t[][]=new int[size][size];
		int d[][]=new int[size][size];
//		for length of one
		int mlen=0;
		if (a.length()==1)
		{
			mlen=1;
			System.out.print("Max length substring-"+mlen);
            return mlen;
		}
		
		for (int i=0;i<size;i++) {
			t[i][i]=1;
			 mlen=getMax(mlen,t[i][i]);
		}
//		for length of two
		for (int i=0;i<size-1;i++) {
			if(a.charAt(i)==a.charAt(i+1)) {
			 t[i][i+1]=2;
			 mlen=getMax(mlen,t[i][i+1]);
			}
			else {
				t[i][i+1]=0;
			}
		}
		
		for(int l=3;l<=size;l++) {
			for(int i=0;i<size;i++)
			{	
			  int j=i+l-1;
//			  System.out.print("Jai Shri Ram");
			  if (j<size) {
              if (a.charAt(i)==a.charAt(j)) {
                	   if(t[i+1][j-1]!=0) {
                		   t[i][j]=t[i+1][j-1]+2;
                	   }
                   }
              else 
              {
            	t[i][j]=0;
              } 
              mlen=getMax(mlen,t[i][j]);
			}
				 

			}  
			  
			

		}
		System.out.print("Max length substring-"+mlen);
		return mlen;
		
		
	
	}
	
}
