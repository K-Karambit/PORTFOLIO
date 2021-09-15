package FruitBasket;
import java.util.Scanner;
import java.util.Stack;
public class FruitBasket {
    public static void main(String [] args){
         Scanner console = new Scanner(System.in);
         Stack basket = new Stack();
         String A = "Apple", O = "Orange", M = "Mango", G = "Guava"  ;
         int num;
         System.out.println("Catch and eat any of these fruits: (Apple, Mango, Orange, Guava)");
         System.out.println("How many fruits would you like to catch?");
         num = console.nextInt();
         System.out.println("Choose a fruit to catch. Press A, O, M or G");        
         for(int i =1; i<=num; i++){            
             char fruits = console.next().charAt(0);
             System.out.println("Fruit " + i + " of " + num);
             switch(fruits){
                 case 'A' -> basket.push(A);
                 case 'M' -> basket.push(M);
                 case 'O' -> basket.push(O);
                 case 'G' -> basket.push(G);
                 default -> System.out.println("Fruit is not available");
             }
         }
         System.out.println("Your basket has: " + basket);
         System.out.println("Press E to eat a fruit");
         while (true){
             char E = console.next().charAt(0);
             if (E == 'E'){
                  basket.pop();
             }
             if(basket.isEmpty()){
             System.out.println("There are no more fruits to eat.");
             break;             
         }
             System.out.println("Fruit(s) in the basket are: " + basket);
             System.out.println("Press E to eat a fruit");
         }                 
}                                                                       
}
   
    
       

