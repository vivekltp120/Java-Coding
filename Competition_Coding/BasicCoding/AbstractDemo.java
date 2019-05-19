class TestClass extends AbstractDemo{

	TestClass(String s) {
		super(s);
		// TODO Auto-generated constructor stub
	}
   
	@Override
	void living(String s) {
		// TODO Auto-generated method stub
		
	}
	
}






class Animals{
	String name;
	Animals(String s){
		System.out.println("This is constructor of Animals");
		name=s;
	}
	String getName() {
		return name;
	}
    void voice() {
    	System.out.println("Voice of Animal "+name+"-");
    }
}



abstract class AbstractDemo extends Animals {
   AbstractDemo(String s) {
	   super(s);
	   System.out.println("This is AbstractDemo class");
   }
	
   public void voice(String v) {
	   System.out.println("Voice in AbstractDemo");
   }
   public void weight(int w) {
		System.out.println("Weight in AbstractDemo");
	}
   
   abstract void living(String s);
	
}
