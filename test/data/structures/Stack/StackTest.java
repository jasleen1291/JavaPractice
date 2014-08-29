/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package data.structures.Stack;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jasleen
 */
public class StackTest {
    
    public StackTest() {
    }

    @Test
    public void testSomeMethod() {
    Stack<Character> stack=new Stack<>();
    stack.push('a');
    stack.push('b');
    stack.push('c');
    stack.push('d');
    stack.pop();
    stack.pop();
    stack.pop();
    stack.pop();
    stack.pop();
    assertEquals(true, stack.isEmpty());
    }
    
}
