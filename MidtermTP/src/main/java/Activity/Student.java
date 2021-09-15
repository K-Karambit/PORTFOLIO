package Activity;
public class Student{
   private int StudentID;
   private String name;
   private int age;
   public Student(){
       StudentID = 0;
       name = "'No name yet'";
       age = 0;
   }
   Student(int num1, String str, int num2){
       StudentID = num1;
       name = str;
       age = num2;
   }
   public int getID() {
       return StudentID;
   }
   public void setID(int ID) {
       this.StudentID = ID;
   }
   public String getname() {
       return name;
   }
   public void setname(String name) {
       this.name = name;
   }
   public int getage() {
       return age;
   }
   public void setage(int age) {
       this.age = age;
   } 
}
