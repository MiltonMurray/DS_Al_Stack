/*******************************************************************************
 * Stack
 * CSCI 211 Spring 2016 
 * Last edited February 18, 7:00 p.m.
 * @author Milton Murray
 ******************************************************************************/
package stack;


public class Stack {

    public static void main(String[] args) {
        //initialize a array of strings
        String[] sArray = {"Joe", "Fred", "Mary"};
        StackElement stack = new StackElement(sArray);
        
        stack.currentSize();    
        System.out.println(stack);
          
        
        stack.reverse();
        stack.currentSize();
        System.out.println("Reversed: " + stack+"\n");
        
        
        stack.pop();
        stack.currentSize();
        System.out.println("Poped first element: "+stack);
        System.out.println("Peek: "+stack.peek()+"\n");
        
        
        stack.push("Joe");
        stack.push("Tom");
        stack.push("Jenny");
        stack.currentSize();
        System.out.println(stack);
        
        stack.reverse();
        System.out.println("Reversed: " + stack+"\n");
        
    }// end main()

}//end class Stack()
