/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedqueueimplement;

/**
 *
 * @author username
 */
public class linkedQueue<E> {
    
    private Node front, rear;
    private int size;
    
    public linkedQueue(){
        front = null;
        rear = null;
        size = 0;
    }
    
    public boolean isEmpty() {
        return front == null;
    }
    
    public int getSize() {
        return size;
    }
    
    public void insert(String data){
        Node nptr = new Node(data, null);
        if (rear == null){
            front = nptr;
            rear = nptr;
        }
        else {
            rear.setNext(nptr);
            rear = rear.getNext();
        }
        size++;
    }
    
    public String remove() {
        if (isEmpty() )
        return front.getData();
        return null;
    }
    
    public void display() {
        System.out.print("\nQueue = ");
        if (size == 0) {
            System.out.print("Empty\n");
            return;
        }
        Node ptr = front;
        while (ptr != rear.getNext() )
        {
            System.out.print(ptr.getData()+" ");
            ptr = ptr.getNext();
        }
        System.out.println();
    }

    void enqueue(Node c2) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    int size() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}

