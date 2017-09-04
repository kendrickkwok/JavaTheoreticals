/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package LinkedList;

/**
 *
 * @author Joseph
 */
public class PracticeTest {

    //public static LinkedList ll;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) 
    {
        
       LinkedList ll = new LinkedList();
       ll.add(2);
       ll.add(5);
       ll.add("Hello");
       ll.traverse();
       ll.delete(5);
       ll.traverse();
       //ll.add(5);
        
    }
}

  class LinkedList
    {
       private int counter;
       private Node head;
       private Node tail;
       
       public void add(Object data)
       {           
           if(head == null)
           {
               head = new Node(data);
           }
           
           else
           {
           Node temp = new Node(data);
           Node currentNode = head;  
           
           if (currentNode != null)
           {
               while (currentNode.getNext() != null)
               {
                   currentNode = currentNode.getNext();
               }
               
               currentNode.setNext(temp);
               currentNode = currentNode.getNext();
               tail = currentNode;
           }
           }
       }
       
       
       public void delete(Object data)
       {
           Node tmp = head;   
          // System.out.println(head.getData());
           while(true)
           {
               if (tmp.getNext() == null)
               {
                   System.out.print("No nodes found");
                   break;
               }
               
               if (tmp.getNext().getData() == data)
               {
                   System.out.println("Deleted" + data);
                   tmp.setNext(tmp.getNext().getNext());
               }
               
               tmp = tmp.getNext();
           }
       }

       
       public void traverse()
       {
           Node tmp = head;
           while(true)
           {
               if (tmp == null)
               {
                   break;
               }
               System.out.println(tmp.getData());
               tmp = tmp.getNext();
           }
       }
    }
    
    class Node
    {
        Node next;
        Object data;
        
        public Node(Object dataValue)
        {
            next = null;
            data = dataValue;
        }
        
        public Node(Object dataValue, Node nextValue)
        {
            next = nextValue;
            data = dataValue;
        }
        
        public Object getData() 
        {
            return data;
        }
        
        public void setData(Object dataValue)
        {
            data = dataValue;
        }
        
        public Node getNext()
        {
            return next;
        }
        
        public void setNext(Node nextValue)
        {
            next = nextValue;
        }
    }