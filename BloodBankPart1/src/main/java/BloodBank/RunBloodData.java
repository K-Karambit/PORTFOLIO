package BloodBank;
import java.util.Scanner;
public class RunBloodData {
    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);       
        BloodData bt = new BloodData();
        BloodData rh = new BloodData();
        String input1;
        String input2;              
        System.out.println("Enter the blood type of patient: ");
        input1 = console.nextLine(); 
        System.out.println("Enter the Rhesus factor (+ or -): ");
        input2 = console.nextLine();
         if (input1.isEmpty() && input2.isEmpty()) {
                 input1 = bt.getBloodType(); 
                 input2 = rh.getRhFactor();
        }       
        System.out.println(input1 + input2 + " is added to the blood bank.");
        System.out.println("                                        ");   
        System.out.println("Enter the blood type of patient: ");
        input1 = console.nextLine();
        System.out.println("Enter the Rhesus factor (+ or -): ");
        input2 = console.nextLine();
         if (input1.isEmpty() && input2.isEmpty()) { 
                 input1 = bt.getBloodType(); 
                 input2 = rh.getRhFactor();
        }
        System.out.println(input1 + input2 + " is added to the blood bank.");       
}
}
