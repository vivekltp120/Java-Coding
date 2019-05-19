import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.*;

public class Various_Concept {
	int[] a = { 1, 2, 3,10, 4, 5, 6, 7, 8, 9 };
	enum week {mon,tue,wed,thu,fri,sat,sun};
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Various_Concept vc = new Various_Concept();
		vc.enumdemo();
//		vc.create2Dmatrix();
//		vc.hash_map();
//		vc.LinkedList();
//		vc.hashset();
//		vc.treeset();
//		vc.stackDemo();
//		vc.fileReader();
//		vc.arraylist();

	}

	
	public void enumdemo() {
		 for(week i:week.values()) {
			 System.out.println(i);
		 }

	}
	public void treeset() {
		System.out.println("This is TreeSet Demo");

		Set<Integer> s = new TreeSet<>();

		for (int i = 0; i < a.length; i++)
			s.add(a[i]);
		System.out.println("Tree Set -"+s);

	}

	public void hashset() {
		System.out.print("This is HashSet Demo");
		Set<Integer> s = new HashSet<>();
		for (int i = 0; i < a.length; i++)
			s.add(a[i]);
		System.out.println("Hash Set -"+s);
		System.out.println(s.isEmpty());
		System.out.println(s.contains(4));
		
	    System.out.println(s.iterator());
		

	}

	public void hash_map() {
		System.out.print("This is HashMap Demo");

		HashMap<String, Integer> hm = new HashMap<>();
		hm.put("vivek", 1);
		hm.putIfAbsent("vivek", 2);
		hm.put("kumar", 1);
		hm.put("chaurasia", 3);
		System.out.println(hm.get("vivek"));
		System.out.println(hm.containsKey("kumar"));

	}

	public void LinkedList() {
		System.out.print("This is LinkedList Demo");

		LinkedList<Integer> ll = new LinkedList<>();
		for (int i = 0; i < 10; i++) {
			if (i % 2 == 0) {
				ll.add(i);
				continue;
			}
			
		}
		
		
		
		

		System.out.println(ll);
		System.out.println(ll.pollFirst());
		System.out.println(ll.pollLast());
		System.out.println(ll.contains(3));
		
		
		
		for (int i = 0; i < ll.size(); i++) {
			ll.removeLast();
			System.out.println(ll);
		}
		for (Object i : ll.toArray()) {
			System.out.println(i);
		}

	}
	

	public void stackDemo() {
		System.out.print("This is Stack Demo");

		Stack<String> st=new Stack<>();
		st.push("Jai");
		st.push("Shri");
		st.push("Ram");
		System.out.println(st.toString());
	}
	
	public void create2Dmatrix() {
		System.out.println("In the 2D matrix ");
		int[][] mat = new int[10][10];
		System.out.println(mat.length);
		int k = 0;

		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {
				mat[i][j] = k++;
			}
		}
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat.length; j++) {

				System.out.println(mat[i][j]);
			}
		}

	}
	
	
	// File Reader in Java 
    public BufferedReader fileReader() {
    	File file=new File("viv2.txt");
    	FileReader rd = null;
		try {
			rd = new FileReader(file);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
    	
    	BufferedReader br=new BufferedReader(rd);
    	try {
    		String line=br.readLine();
			while ( line!= null) {
				
				System.out.println(line);			
				line=br.readLine();
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} 	
       return br; 	
    }
    
    //arraylist demo
    public void arraylist() {
    	ArrayList<String> al=new ArrayList<>();
    	al.add("vivek");
    	al.add("kumar");
    	al.add("chaurasia");
    	al.add("lalitpur");
    	al.add("IIT-Guwahati");
    	System.out.println(al);
    	System.out.print(al.contains("vivek"));	
    }
    
    
	
	
	
	
	

}
