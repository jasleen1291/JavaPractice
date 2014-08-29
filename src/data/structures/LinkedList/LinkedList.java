package data.structures.LinkedList;

/**
 *
 * @author jasleen
 * @param <T>
 */
public class LinkedList <T>{
    Node<T> head=null;
    private Node<T> current;
    
    public void remove(T t)
    {
        //System.out.println(t);
        Node currentTraversing=head();
        if(currentTraversing.key()==t)
        {
            if(current==currentTraversing)
                current=null;
            head(currentTraversing.next());
            currentTraversing=null;
            return;
        }
        while(currentTraversing.next()!=null &&!currentTraversing.next().key().equals(t))
        {
           
            currentTraversing=currentTraversing.next();
        }
        
        if(currentTraversing!=null)
        {
            Node itemToBeremoved=currentTraversing.next();
            if(itemToBeremoved==null)
        {
            System.out.println("Key not found. Sorry!!!");
        }
            if(itemToBeremoved==current)
                current=currentTraversing;
            if(itemToBeremoved!=null&&itemToBeremoved.next()!=null)
                currentTraversing.next(itemToBeremoved.next());
            else
                currentTraversing.next(null);
            
        }
        
    }

    public void remove()
    {
        Node currentTraversing=head();
        if(currentTraversing!=null)
        {
            while(currentTraversing!=null&& currentTraversing.next()!=current)
            {
                currentTraversing=currentTraversing.next();

            }
            System.out.println(currentTraversing.key());
            currentTraversing.next(null);
            current=currentTraversing;
        }
        else
        {
        System.out.println("No Item to remove");
        }
        
    }
    public void setCurrent(Node<T> current) {
        this.current = current;
    }
    public void add(T t)
    {
        if(head()!=null)
        {
            current.next(new Node<>(t));
            current=current.next();
        }
        else
        {
            head=new Node<>(t);
            current=head;
        }
    }
    public void addAtHead(T t)
    {
        if(head()!=null)
        {
            Node oldHead=head();
            //Setting head to new node
            Node newHead=new Node<>(t);
            head(newHead);
            //Setting the next element of new head to old head
            head().next(oldHead);
        }
        else
        {
            head=new Node<>(t);
        }
    }
    public Node<T> head()
    {
        return head;
    }
    public void head(Node<T> t)
    {
        this.head=t;
    }

    @Override
    public String toString() {
        StringBuilder builder=new StringBuilder();
        builder.append("[");
        builder.append("\t");
        Node currentTraversing=head();
        while(currentTraversing!=null)
        {
            builder.append(currentTraversing.key().toString());
            builder.append("\t");
            currentTraversing=currentTraversing.next();
        }
        builder.append("]");
        return builder.toString();
    }

    public void removeHead() {
      Node oldHead=head();
      head(oldHead.next());
      oldHead=null;
    }
    
}
