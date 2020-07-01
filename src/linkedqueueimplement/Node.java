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
public class Node {
    private String data;
    private Node next;
    
    public Node(){
        next = null;
        data = null;
    }
    
    public Node(String data, Node next){
        this.data = data;
        this.next = next;
    }

    /**
     * @return the data
     */
    public String getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(String data) {
        this.data = data;
    }

    /**
     * @return the next
     */
    public Node getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(Node next) {
        this.next = next;
    }
    
    
    
}
