package ChatBotProgram;
import java.util.Scanner;
public class ChatBot {
 
    public static void main(String[]args){
        Scanner console = new Scanner(System.in);
        System.out.println("Greetings from us, to our delightful customer...");
        System.out.println("How may we help you?");
        System.out.println("1 - FAQs");
        System.out.println("0 - Exit");       
        int choice1 = console.nextInt(); 
        
        if (choice1 == 1){
            String ask = "Kailangan to wag tanggalin";            
           do{       
            System.out.println("This is our frequently asked questions by our lovely clients...");
            System.out.println("1 - Grocery Store Contact Number.");
            System.out.println("2 - Grocery Store Location.");
            System.out.println("3 - Grocery Store Mode of Payments.");
            System.out.println("4 - Grocery Store Best items seller.");
            System.out.println("5 - Grocery Store Latest Stocks.");
            System.out.println("0 - Exit");
            int choice2 = console.nextInt(); 
            
            if (choice2 == 1){
                System.out.println("Contact Number: \n" +
                        "(+63)9123456789\n" +
                        "(+02)1345-6789"); 
                System.out.println(" "); 
                System.out.println("(Ask more? Yes or No)"); 
                ask = console.nextLine();              
            }          
            else if (choice2 == 2){
                System.out.println("Location: \n" +
                "Grocery Store Molino 3 Bacoor City, \n" +
                "Cavite Philippines."); 
                System.out.println(" "); 
                System.out.println("(Ask more? Yes or No)"); 
                ask = console.nextLine();           
            }         
            else if (choice2 == 3){
                System.out.println("Mode of Payments:\n" +
                        "GCash\n" +
                        "Paymaya\n" +
                        "Banko De Oro\n" +
                        "Bank of the Phillipine Island (BPI)\n" +
                        "Cash on Delivery (COD)"); 
                System.out.println(" "); 
                System.out.println("(Ask more? Yes or No)"); 
                ask = console.nextLine();               
            }
            else if (choice2 == 4){
                System.out.println("Best items seller:\n" +
                        "Almond Breeze Milk\n" +
                        "Bounty fresh eggs\n" +
                        "Maya Hotcake\n" +
                        "Lady's Choice Mayonnaise\n" +
                        "Nescaffe Classic");
                System.out.println(" "); 
                System.out.println("(Ask more? Yes or No)"); 
                ask = console.nextLine();                
            }
            else if (choice2 == 5){               
                System.out.println("Latest Stocks:\n" +
                        "Wilkins distilled\n" +
                        "Le Minerale");  
                System.out.println(" "); 
                System.out.println("(Ask more? Yes or No)"); 
                ask = console.nextLine();               
                }                           
            else{
                System.exit(0); 
            }
            do {                      
            ask = console.nextLine(); 
            if (ask.equals("No")){
                    System.exit(0);
                }
            }           
            while ("Yes".equals(ask));           
            }       
            while (true);
            }       
            else 
            {
              System.exit(0);  
            }          
    }
}
