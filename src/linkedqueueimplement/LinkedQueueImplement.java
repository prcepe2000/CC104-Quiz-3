/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedqueueimplement;

import doublylinkedlist.DNode;
import java.util.*;
/**
 *
 * @author username
 */
public class LinkedQueueImplement {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scan = new Scanner(System.in); 

        Node c1 = new Node("Ryo", null);
        Node c2 = new Node("Yuri", null);
        Node c3 = new Node("Yuto", null);
        Node c4 = new Node("Keito", null);
        Node c5 = new Node("Best", null);
        
        DNode<Node> Queue1 = new DNode<>(c1, null);
        DNode<Node> Queue2 = new DNode<>(c2, null);
        DNode<Node> Queue3 = new DNode<>(c3, null);
        DNode<Node> Queue4 = new DNode<>(c4, null);
        DNode<Node> Queue5 = new DNode<>(c5, null);
        
        linkedQueue<Node> list = new linkedQueue<>();
        list.enqueue(c1);
        list.enqueue(c2);
        list.enqueue(c3);
        list.enqueue(c4);
        list.enqueue(c5);
    }
        
        public static void displayTransaction(linkedQueue<DNode> linkedQueue) throws EmptyQueueException {
            DNode<Node> temp = linkedQueue.first();
            for (int i = 0; i < linkedQueue.size(); i++){
                System.out.println("In Transaction: " + (1 + 1) + ": " + temp.getData());
                        temp = temp.getNext();
            }
    }
}
