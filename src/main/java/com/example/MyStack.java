package com.example;

public interface MyStack {
    // int max = 100;
    // int[] stack = new int[max];
    // int top = 0;
    
    // 스택 push
    public void push(int x);
    
    // 스택 pop
    public int pop();
    
    // 스택 비었는지 확인
    public boolean isEmpty();

    // 스택 비었는지 확인
    public boolean isFull();
}
