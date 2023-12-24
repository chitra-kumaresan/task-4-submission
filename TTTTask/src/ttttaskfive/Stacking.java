package ttttaskfive;

import java.util.Stack;

public class Stacking {
    public Integer data;

    int stack[] = new int[5];
    int top;
    //Default constructor
    Stacking() {
        int top = 0;
    }
//Method to push data
    //Input:10 20 30 40 50
    //Output:10 20 30 40 50
    //I/p: 10 20 30 40 50 60
    //o/p:Stack is full
    public void push(int data) {
        if (top>stack.length-1){
            System.out.println("Stack is full");
        }
            else{
                stack[top] = data;
                top++;
            }

    }
//Method to display stack
    public void show() {
        for (int n : stack) {
            System.out.print(n + " ");
        }


    }
    //Method to delete the data from stack
    //O/P:50
    //i/p:poped:10 20 30 40 50
    //o/p:Stack is empty
    public int pop() {
        if (top >= 0) {
            top--;
            data = stack[top];

            stack[top] = 0;

            return data;
        } else {
            System.out.println("Stack is empty");
            return -1;
        }
    }
}






