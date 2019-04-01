package epamtask4;
import java.util.*;
 class ArrayQueue
{
    int rear=-1,front=-1,top1=-1,top2=-1;/* initializing the tops of stack1 and stack2 to -1*/
    int stack1[]=new int[1000000];
    int stack2[]=new int[1000000];
    void enqueue1(int element)/* enqueue is function which is used to push the elements into stack1 */
    {
        top1++;
       stack1[top1]=element;
       if(top1==0)/* if stack1 contains only one element we have to push that particular element into stack2 */
       stack2[0]=element;
    }
    void display()
    {
        if(top1!=-1)/* display function is used to print the first element in the queue */
        {
        System.out.println(stack2[0]);
        }
        
    }
    void dequeue()/* dequeue() which is used to remove first inserted element from stack */
    {
        
       if(top1==0)/* if stack1 top1 contains single element we need to decrement the top1 variable */
       {
          top1--;
       }
       else
       {
          int c=0;
       for(int i=0;i<=top1-1;i++)/* if top1>0 we need to delete element from stack1 */
       {
           stack1[i]=stack1[i+1];/* we need to move one element to left side in order to remove first element from stack */
           c++;
       }
       for(int i=0;i<c;i++)/* again we need to copy the stack1 elements from stack2 */
       {
           stack2[i]=stack1[i];
          
       }

       top1--;/* we need to decrement top1 as we are dequeue the elements */
       }
     }
}

public class QueueUsingStacks {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int queries,type,value;
       ArrayQueue obj=new ArrayQueue();
       Scanner sc=new Scanner(System.in);
       queries=sc.nextInt();
        for(int i=0;i<queries;i++)
        {
            type=sc.nextInt();
            if(type==1)
            {
                value=sc.nextInt();
                obj.enqueue1(value);
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

