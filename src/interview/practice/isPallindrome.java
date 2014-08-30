/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interview.practice;

import data.structures.LinkedList.LinkedList;
import data.structures.LinkedList.Node;
import data.structures.Stack.Stack;

/**
 *
 * @author jasleen
 */
public class isPallindrome {

    public static boolean isPallindrome(LinkedList list) {
        Node single = list.head(), doubl = list.head();
        Stack stack = new Stack();
        if (single == null||single.next()==null) {
            return false;
        }
        while (single.next() != null && doubl.next().next() != null) {
            stack.push(single.key());
            single = single.next();
            doubl = doubl.next().next();
            if ( doubl.next() == null) {
                break;
            }
        }
        System.out.println(doubl);
        System.out.println(single);
        System.out.println(stack);
        if (doubl.next()!= null) {
            stack.push(single.key());
            single = single.next();
            
            Node popped=stack.extractTop();
            if (!single.key().toString().equals(popped.key().toString())) {
                System.out.println("Returning at key" + popped.key().toString()+single.key());
                return false;
            }
            
        }
        single = single.next();
        System.out.println(stack);
        //System.out.println(single.key());
        while (single != null) {
            Node popped=stack.extractTop();
            if (!single.key().toString().equals(popped.key().toString())) {
                System.out.println("Returning at key" + popped.key().toString()+single.key());
                return false;
            }
            single = single.next();
        }
        
        return true;
    }

    public static void main(String args[]) {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(10);
      /*  list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        //list.add(50);
        list.add(40);
        list.add(30);
        list.add(20);
        list.add(10);*/
        System.out.println(isPallindrome(list));
    }
}
