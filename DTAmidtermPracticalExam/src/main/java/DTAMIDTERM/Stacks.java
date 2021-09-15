package DTAMIDTERM;
import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.Scanner;
public class Stacks {
     public static void main(String[] args) {
         Scanner console = new Scanner(System.in);
         Queue books = new LinkedList();
         Stack Stack = new Stack();
         int num = 4;
         String book;
         System.out.println("Enter four book titles: ");
         for(int i = 1; i<=num; i++){  
             book = console.nextLine();
             Stack.push(book);
             System.out.println("Book " + i + ": " + book);               
         }
         System.out.println("New order of books: ");                  
         Object pop1, pop2, pop3, pop4;
         do{
         pop1 = Stack.pop();
         pop2 = Stack.pop();
         pop3 = Stack.pop();
         pop4 = Stack.pop();
         }
         while(Stack.equals(true));
         books.add(pop1);
         books.add(pop2);
         books.add(pop3);
         books.add(pop4);
         
         System.out.println(books); 
     }                    
}
     

