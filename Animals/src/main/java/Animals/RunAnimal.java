package Animals;
import java.util.Scanner;
public class RunAnimal {
    public static void main(String [] args){
        Scanner console = new Scanner(System.in);           
        eat();
        sleep();
        makesound();                                 
        System.out.println("Choose an animal. Press B for bird, Press C for cat, Press D for Dog: ");
        String choose = console.nextLine();
        if(choose.equals("B") && choose.equalsIgnoreCase("b")){
            Bird bird = new Bird();
        }
        if(choose.equals("C") && choose.equalsIgnoreCase("c") ){
            Cat cat = new Cat();  
        }
        if(choose.equals("D") && choose.equalsIgnoreCase("d")){
            Dog dog = new Dog();
        }      
    }   
    static class Bird{
        Bird(){
        System.out.println("Birds love to eat seeds and sleep 10-12 hours a day.\n Tweet Tweet");
        }
    }
    static class Dog{
        Dog(){
        System.out.println("Dogs are playful and always love to eat.\n Woof Woof");
        }
    }
    static class Cat{
        Cat(){
        System.out.println("Cats are always soft and gentle with their hooman.\n Meow Meow");
        }
    }
    static void eat(){
    }
    static void sleep(){      
    }
    static void makesound(){       
    }        
}
