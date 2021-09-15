package PackQueue;
import java.util.LinkedList; 
import java.util.Queue; 
import java.util.Scanner;

public class queue {
        public static void main(String[] args){ 
        Scanner console = new Scanner(System.in);
        Queue queue = new LinkedList(); 
        queue.add(2);
        queue.add(5);
        queue.add(8);
         while (true){
         System.out.println("Select Operation: ");
	 System.out.println("[1] Enqueue");
	 System.out.println("[2] Dequeue");
	 System.out.println("[3] Front");
	 System.out.println("[4] Exit");                 
         int choice = console.nextInt();
	 
              switch(choice) {
		case 1:
		   System.out.println("Enter a number to push.");
                   int tulak = console.nextInt();	
		   queue.add(tulak);
                   System.out.println(queue);
                   System.out.println("_________________________________________");
		   break;
		
		case 2:
		   queue.poll();
                   System.out.println(queue);
                   System.out.println("_________________________________________");
		   break;
		   
		case 3:
		   Object top = queue.peek();
                   System.out.println(top);
                   System.out.println("_________________________________________");
		   break;
		   
		case 4:
		    System.exit(0);
		    break;

		default :
		  System.exit(0);			
	  }
          } 
        }
}
