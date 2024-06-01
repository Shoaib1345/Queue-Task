/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package queue_example;
import java.util.LinkedList;
import java.util.Queue;
/**
 *
 * @author Shoaib Ahmed Bullo <your.name at your.org>
 */
public class Queue_Example {

    public static void main(String[] args) {
        // TODO code application logic here
        
        Queue<Integer>  queue=new LinkedList<>();
        queue.add(1);
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        
        System.out.println("here is elements :"+queue);
        System.out.println("here is use of peek method :"+queue.peek());
        System.out.println("here is use  of poll method :"+queue.poll());
        System.out.println("here is elements :"+queue.offer(9));
    }
    
}
