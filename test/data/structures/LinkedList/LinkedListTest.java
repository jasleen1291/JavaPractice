/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data.structures.LinkedList;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jasleen
 */
public class LinkedListTest {

    LinkedList<Integer> list = new LinkedList<>();

    public LinkedListTest() {
        //list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        list.add(50);
        list.add(60);
        list.add(70);
        list.add(80);
        list.add(90);
        list.add(1000);
    }

    @Test
    public void testRemove() {
        list.remove(10);
        list.remove(90);
        list.remove(1000);
        list.remove();
        int head = list.head().key();
        System.out.println(list);
        assertEquals(20, head);
    }
    
}
