 package Activity;
import java.util.Scanner;
public class RunStudent {
    public static void main(String args[]){
        Scanner console = new Scanner(System.in);       
        Student myobj = new Student();                        
        String name;
        String input1;
        System.out.println("Student Name: "); 
        input1 = console.nextLine();        
        if (input1.isEmpty()){
        name = myobj.getname();          
             input1 = name;
        }       
        System.out.println("Student Name is: "+ input1);      
        
        System.out.println("Student Age: ");
              
        System.out.println("Student Age is: "+ myobj.getage());
        
        System.out.println("Student ID : ");
        
        System.out.printf("Student ID is: "+ myobj.getID());
        
    }       
}
    
   

