import java.util.*;
class First_Circular_tour
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int t =sc.nextInt();
		while(t>0)
		{
			int n = sc.nextInt();
			sc.nextLine();
			String str = sc.nextLine();
			String arr[] = str.split(" ");
			System.out.println(arr.toString());
			int p[] = new int[n];
			int d[] = new int[n];
			int j=0;
			int k=0;
			for(int i=0; i<2*n; i++)
			{
				if(i%2 == 0)
				{
					p[j]= Integer.parseInt(arr[i]);
					j++;
				}
				else
				{
					d[k] = Integer.parseInt(arr[i]);
					k++;
				}
			}
			
			System.out.println(new GfG().tour(p,d));
		t--;
		}
	}
}
class GfG
{
    int tour(int petrol[], int distance[])
    {
    int start=0;
   	     int end =1;
   	     int n=petrol.length;
   	     int cp=petrol[start]-distance[start];
   	     while(end!=start || cp<0) {
   	    	 while(cp<0  && start!=end ) {
   	    		 cp-=petrol[start]+distance[start];
   	    		 start=(start+1)%n;
   	    		 if(start==0) {
   	    			 return -1;
   	    		 }
   	    	 }
   	    	 cp+=petrol[start]-distance[start];
   	    	 end=(end+1)%n;
   	    	 
   	     }
    	 return start;
    }    	 
}