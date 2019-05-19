import java.util.regex.*;
public class MyPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("This class for pattern matching:"+args[0]);
		
        Pattern p=Pattern.compile(args[0]);
        Matcher m=p.matcher(args[0]);
        while(m.find()) {
             System.out.print(m.group());
        }
	}
  

}
