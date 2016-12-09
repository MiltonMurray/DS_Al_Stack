/**
 * This class uses methods to push, peek, print, and return 
 * the current size of a stack.
 * 
 * Stack uses a linked data structure 
 *  
 */
package stack;

import java.util.*;

/**
 *
 * @author Milton Murray
 */
public class StackElement {

    private int currentSize = 0;

    public static Node top;
//==============================================================================
    /**
     * Class constructor 
     * pushes string array into stack
     * 
     * @param stack 
     */
    StackElement(String[] stack) {
        top = null;

        for (String stack1 : stack) {
            push(stack1);
        } //end for

    }//end StackElement()
 //=============================================================================
    /**
     * Checks if top is empty
     * 
     * @return 
     */
    public boolean isEmpty() {
        return top == null;
    }//end isEmpty()
//==============================================================================
    /**
     * Clears stack
     */
    public void clear() {
        top = null;
    }//end clear()
//==============================================================================
    /**
     * Pushes a node to the stack
     * iterates size on each push
     * 
     * @param input 
     */
    public void push(String input) {

        Node newNode = new Node(input); //Create a newNode object
        newNode.setNext(top);   //sets the next node to top
        top = newNode;  // newNode is put on top

        System.out.println("PUSH " + input + " Was Added to the Stack ");
        currentSize++; // increment counter by 1
    }//end push()
//==============================================================================
    /**
     * Removes a item off the stack
     * 
     * @return 
     */
    public String pop() {
        //check if stack is empty
        if (isEmpty()) {
            System.out.println("Stack is empty");
        }
        //new top is the next item
        String data = top.data;
        top = top.next;
        currentSize--;  //reduce size by 1
        return data;     
    }//end pop()
//==============================================================================
    /**
     * Looks at the item on top of the stack
     * 
     * @return 
     */
    public String peek() {
        return top.data;
    }//end peek()
//==============================================================================
    /**
     * String representation of the stack
     * 
     * @return 
     */
    public String toString() {
        
        if (isEmpty()) {
            return "[ ]";
        }//end if

        StringBuffer out = new StringBuffer("[");
        Node tmp = top;
        
        while (tmp != null) {
            out.append(tmp.data + "  ");
            tmp = tmp.next;
        }//end while

        out.append("]");
        return out.toString();
    }//end toString()
//==============================================================================
    /**
     * Changes the pointers to 
     * reverse the order of the stack
     */
    public void reverse() {
        
        Node reversedPart = null;
        Node current = top;
        
        while (current != null) {   // moves through the list
            Node next = current.next;   //Second item info is stored into next
            current.next = reversedPart;    //second position is set to null
            reversedPart = current; //first item info is put into the second position
            current = next; //first position is set to next(second item info)
        }//end while
        top = reversedPart; //final swap
        
    }//end reverse()
//==============================================================================
    /**
     * Calls currentSize of the stack
     */
    public void currentSize() {
        System.out.println("Current size of the Stack: " + currentSize);
    }//end currentSize()

}//end class StackElement
