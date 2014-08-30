package data.structures.Stack;

import data.structures.LinkedList.LinkedList;
import data.structures.LinkedList.Node;

/**
 *
 * @author jasleen
 * @param <T>
 */
public class Stack<T> {
final LinkedList<T> list;

    public Stack() {
        list=new LinkedList<>();
    }
    public void push(T t)
    {
        list.addAtHead(t);
    }
    public void pop()
    {
        if(!isEmpty())
        list.removeHead();
        else
            System.out.println("There is no item to pop");
    }

    public Node extractTop()
    {
        Node t=list.head();
        pop();
        return t;
    }
    public T top()
    {
        if(isEmpty())
        {
            System.out.println("There is no item");
            return null;
        }
        return list.head().key();
    }
    @Override
    public String toString() {
        StringBuilder builder=new StringBuilder();
        builder.append("[");
        builder.append("\t");
        Node currentTraversing=list.head();
        while(currentTraversing!=null)
        {
            builder.append(currentTraversing.key().toString());
            builder.append("\t");
            currentTraversing=currentTraversing.next();
        }
        builder.append("]");
        return builder.toString();//To change body of generated methods, choose Tools | Templates.
    }

    public boolean isEmpty() {
        return list.head()==null; //To change body of generated methods, choose Tools | Templates.
    }
    
}
