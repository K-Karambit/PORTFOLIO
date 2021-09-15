package StackPackage;
import java.util.Scanner;
import java.util.Stack;

public class Stacks {  

  public static void main(String[] args) {
      Scanner console = new Scanner(System.in);
      Stack Stack = new Stack();
      Stack.push(2);
      Stack.push(5);
      Stack.push(8);
  	while (true){
         System.out.println("Select Operation: ");
	 System.out.println("[1] Push");
	 System.out.println("[2] Pop");
	 System.out.println("[3] Peek");
	 System.out.println("[4] Exit");                 
         int choice = console.nextInt();
	 
              switch(choice) {
		case 1:
		   System.out.println("Enter a number to push.");
                   int tulak = console.nextInt();	
		   Stack.push(tulak);
                   System.out.println(Stack);
                   System.out.println("_________________________________________");
		   break;
		
		case 2:
		   Stack.pop();
                   System.out.println(Stack);
                   System.out.println("_________________________________________");
		   break;
		   
		case 3:
		   Object top = Stack.peek();
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
