package com.example;

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test //상속 여부 확인
    public void testInheritance() {
        MyStack stack = new my_stack();

        assertTrue(stack instanceof MyStack);
    }

    @Test
    public void testQueueInit() {
        MyStack stack = new my_stack();
    
        assertTrue(stack.isEmpty());
        assertFalse(stack.isFull());

    }

    @Test
    public void testQueueAct() {
        MyStack stack = new my_stack();
        
        stack.push(30);
        assertEquals(30, stack.pop());
        assertTrue(stack.isEmpty());
        assertFalse(stack.isFull());
        for(int i = 0; i < 100; i++){
            stack.push(i);
        }

        assertTrue(stack.isFull());
        for(int i = 0; i <100; i++){
            stack.pop();
        }
        assertTrue(stack.isEmpty());
    }




}
