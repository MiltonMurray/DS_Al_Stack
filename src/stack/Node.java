/*
 * Creates nodes for the stack
 */
package stack;

/**
 *
 * @author Milton Murray
 */
public class Node {

        public String data;
        public Node next;
//==============================================================================
        /**
         * Class constructor
         * 
         * @param data 
         */
        public Node(String data) {
            this.data = data;
            
        }//end Node()
//==============================================================================
        /**
         * accessors and mutators
         * @param data 
         */
        public void setData(String data) {
            this.data = data;
        } //end setData()

        public void setNext(Node next) {
            this.next = next;
        } //end setNext()
        
        public String getData(){
            return data;
        }//end getData()
        public Node getNext(){
            return next;
        }//end getNext()
    }//end class Node

