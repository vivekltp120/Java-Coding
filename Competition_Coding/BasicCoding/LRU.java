

/*Please note that it's Function problem i.e.
you need to write your solution in the form of Function(s) only.
Driver Code to call/invoke your function is mentioned above.*/

/*You are required to complete below class */

import java.util.*;
class Node{
    int key,value;
    public Node(int k,int val){
        key=k;
        value=val;
    }
    public int getValue(){
        return value;
    }
    public void setValue(int val){
        this.value=val;
    }
    public int getKey(){
        return key;
    }
    public void setKey(int val){
        this.key=val;
    }
}

class LRU{
    int cs;
    HashMap<Integer,Node> frame;
    LinkedList<Node> ll;
    /*Inititalize an LRU cache with size N */
    public LRU(int N) {
       cs=N;
       frame=new HashMap<>(cs);
       ll=new LinkedList<>();
       
    }
    
    /*Returns the value of the key x if 
     present else returns -1 */
    public int get(int x) {
       //Your code here
       if(frame.containsKey(x)){
           Node tempnode=frame.get(x);
           int value=tempnode.getValue();
           if (tempnode!=ll.getFirst()){
               ll.remove(tempnode);
               ll.addFirst(tempnode);
           }
           return value;
           
       }
       else{
           return -1;
       }
    }
    
    /*Sets the key x with value y in the LRU cache */
    public void set(int x, int y) {
       //Your code here
       if (frame.containsKey(x)){
           Node tempnode=frame.get(x);
           tempnode.setValue(y);
           if (tempnode!=ll.getFirst()){
               ll.remove(tempnode);
               ll.addFirst(tempnode);
           }

       }
       else{
           Node t=new Node(x,y);
           if(ll.size()>=cs){
               Node lrunode=ll.removeLast();
               frame.remove(lrunode.getKey());
               ll.addFirst(t);
               frame.put(x,t);
           }
           else{
               ll.addFirst(t);
               frame.put(x,t);
           }
           
       }
       
    }
}
