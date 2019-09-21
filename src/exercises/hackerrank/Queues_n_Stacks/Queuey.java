package exercises.hackerrank.Queues_n_Stacks;
//  https://www.youtube.com/watch?v=fOHLom4hZME
//At 14 minutes ints changed to strings
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//updated with generics ///link

public class Queuey<D>{

    //LinkedList queue = new LinkedList();
    LinkedList<D> queue;   //notice this initilized below

    public Queuey(){
        queue = new LinkedList();
    }

    //is our que empty
    public  boolean isEmpty(){
        return queue.isEmpty();
    }

    public int size(){
        return  queue.size();
    }

    public void enqueue(D n){  //learn about generics
        queue.addLast(n);
    }

    public D dequeue(){
        return  queue.remove(0); //10:30 example of casting. changed from .removeFirst()
    }

    public D peek(){
        return queue.get(0);
    }

    public static void main(String[] args){
        Stack<String> stacky = new Stack<>();//1800 explains that <String>is just good practice
        stacky.push("there");
        stacky.push("hi");
        System.out.println(stacky.pop() + " ");
        System.out.println(stacky.pop() + "!");
       // Queue<String> queue = new Queue<String>() ;       //2115 queue is abstract so have to extend orr interface???




    Queuey numberQueue = new Queuey();
    numberQueue.enqueue(4);
        numberQueue.enqueue(5);
        numberQueue.enqueue(7);
        numberQueue.enqueue(6);
    System.out.println(numberQueue.dequeue());
        System.out.println(numberQueue.peek());
        System.out.println(numberQueue.dequeue());
        System.out.println(numberQueue.dequeue());

    }
}
