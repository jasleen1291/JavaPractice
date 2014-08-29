/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package data.structures.LinkedList;

/**
 *
 * @author jasleen
 * @param <T>
 */
public class Node<T> {
    private Node next,previous;
    private T key;

    public Node(T key) {
        this.previous = null;
        this.next = null;
        this.key=key;
        
    }

    public T key() {
        return key;
    }
    public void key(T key) {
        this.key=key;
    }
    
    public void next(Node node)
    {
        this.next=node;
    }
    public Node next()
    {
        return next;
    }
    public void previous(Node node)
    {
        this.previous=node;
    }
    public Node previous()
    {
        return previous;
    }
}
