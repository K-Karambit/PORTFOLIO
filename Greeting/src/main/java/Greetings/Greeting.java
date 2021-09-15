package Greetings;
import java.util.Scanner;
import java.util.PriorityQueue;

public class Greeting {

    public static void main(String[] args) {
        Scanner nickname = new Scanner (System.in);
        PriorityQueue Pangalan;
        Pangalan = new PriorityQueue();
        System.out.println("Enter the nicknames of 4 of your classmates: ");
        int num = 4;
        for (int i = 1; i<=num; i++){
           String name = nickname.nextLine();
           Pangalan.add(name);
        }
        System.out.print("Press H to say Hi to each of them. \n");        
        while(true){
        nickname.nextLine();    
        System.out.println("Hi " + Pangalan.remove());
        if(Pangalan.isEmpty()){
            System.out.println("Done saying Hi");
            break;
        }
        }
    }
    
}