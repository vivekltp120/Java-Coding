
public class MyMultithreading extends Thread {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		childDemo();
	    senderDemo();
	    
        
	}



	public static void senderDemo() {
		Sender s1= new Sender();
	    Sender s2= new Sender();
	    Sender s3= new Sender();
	    SenderThread st1=new MyMultithreading().new SenderThread(s1,"Jai Shri Ram-I");
	    SenderThread st2=new MyMultithreading().new SenderThread(s1,"Jai Shri Ram-II");
	    SenderThread st3=new MyMultithreading().new SenderThread(s1,"Jai Shri Ram-III");
	    st3.start();
	    st2.start();
	    st1.start();
	    try {
	    st3.join();
	    }
	    catch(Exception e) {
	    	System.out.println("Error-"+e.toString());
	    }
	}

	
	

	public static void childDemo() {
		MyMultithreading mt=new MyMultithreading();
		ChildThread ct1=new MyMultithreading().new ChildThread();
		ChildThread ct2=new MyMultithreading().new ChildThread();
		ChildThread ct3=new MyMultithreading().new ChildThread();
		ct1.setName("Jai");
		ct2.setName("Shree");
		ct3.setName("Ram");
		ct1.start();
		ct2.start();
		ct3.start();
	}
	public class SenderThread extends Thread{
		Sender snd;
		String msg;
		public SenderThread(Sender snd,String msg) {
			this.snd=snd;
			this.msg=msg;
		}
		
		public void run () {
			try {
			synchronized(snd) {
			snd.sendMessage(msg);
			}
			}
			catch(Exception e) {
				System.out.println("Error-"+e.toString());
			}
		}
 }
	
	
	public class ChildThread extends Thread{	
		
	    public void  run()  
	    { 
	    	for (int i = 0; i < 5; i++) 
	        { 
	            System.out.println("Child thread"+" "+i); 
	        } 
	    } 
	}    
}	
