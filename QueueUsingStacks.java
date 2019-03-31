package epamtask4;

import java.util.*;
 class Arrayqueue
{
    int rear=-1,front=-1;
    int queue[]=new int[1000000];
    void enqueue(int element)/* enqueue function is used to push the elements into queue */
    {
        if(front==-1)
        {
        front=0;
        rear=0;
        }
        queue[rear]=element;/* we have to push into queue by using rear because insertion is possible from rear side only*/
        rear++;  /* we have increment rear position as we are pushing the elements into queue */
    }
    void display()
    {
       
        System.out.println(queue[front]);/* display function is used to display the first element in the queue */ 
    }
    void dequeue()/* dequeue function is used to remove one element from queue */
    {
        if(front!=rear)
        {
        for(int i=0;i<rear-1;i++)
        queue[i]=queue[i+1];/* we have to move element towards left so that first element will be deleted */
        }
        rear--;/* whenever we are call the dequeue() we need to decrement the rear position by 1 as we are removing one element from queue */
    }
}

public class QueueUsingStacks {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int queries,type,value;
       Arrayqueue obj=new Arrayqueue();
       Scanner sc=new Scanner(System.in);
       queries=sc.nextInt();
        for(int i=0;i<queries;i++)
        {
            type=sc.nextInt();
            if(type==1)
            {
                value=sc.nextInt();
                obj.enqueue(value);
            }
            else if(type==2)
            {
                obj.dequeue();
            }
            else if(type==3)
            {
                obj.display();
            }
        }
        sc.close();
        
        
    }
}


