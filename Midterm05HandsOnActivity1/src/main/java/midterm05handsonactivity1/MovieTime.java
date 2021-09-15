package midterm05handsonactivity1;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class MovieTime {
     public static void main(String[] args) {
         Scanner console = new Scanner(System.in);
         Queue movies = new LinkedList();
         Queue snacks = new LinkedList();
         int num = 3;
         System.out.println("What movies do you want to watch?");
         for(int i =1; i<=num; i++){  
             String mov = console.nextLine();
             System.out.println("Movies " + i + " of " + num + ": " + mov);
             movies.add(mov);
         }
         System.out.println("What snacks do you want to eat?.");
         for(int i =1; i<=num; i++){                        
             String sna = console.nextLine();
             System.out.println("Snacks " + i + " of " + num + ": " + sna);
             snacks.add(sna);
         }
          System.out.println("Movies to watch are: " + movies);
          System.out.println("Snacks available are: " + snacks);
          System.out.println("Press S everytime you finish a snack.");
          while (true){
          String eat = console.nextLine();
          if (eat.equals("S")){
              snacks.poll();
               System.out.println("deque " + snacks);
          }
          if (snacks.isEmpty()){
              System.out.println("No more snacks.");
          }
          }
}
}