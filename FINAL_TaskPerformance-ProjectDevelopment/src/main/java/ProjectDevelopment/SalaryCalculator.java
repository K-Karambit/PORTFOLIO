package ProjectDevelopment;
import java.util.Scanner;
public abstract class SalaryCalculator {
  private static String name;
  private static String PorF;
  public static void main(String[] args) {
    Scanner console = new Scanner(System. in );
    System.out.println("Enter the name of the Employee: ");
    name = console.nextLine();
    System.out.println("Are you a Part time or Full time? Press P for Part time and F for Full time.");
    PorF = console.nextLine();

    if (PorF.equals("F") || PorF.equals("f")) {
      fulltime.jobtype();
    }

    if (PorF.equals("P") || PorF.equals("P")) {
      Parttime.jobtype();
    }
  }

  public String getName() {
    return this.name;
  }
  public String getPorF() {
    return this.PorF;
  }
  public static class fulltime extends SalaryCalculator {
    public static float jobtype() {
      Scanner console = new Scanner(System. in );
      System.out.println("How much is your salary?");
      float salary = console.nextFloat();
      System.out.println("Hours of overtime.");
      int ot = console.nextInt();
      float s;
      if (ot == 0) {
        s = salary;
      }
      else {
        s = salary * ot;
      }
      System.out.println(" ");
      System.out.println("================================");
      System.out.println("Employee Name: " + name);
      if (PorF.equals("F") || PorF.equals("f")) {
        PorF = "Full time";
      }
      else {
        PorF = "Part time";
      }
      System.out.println("Job type: " + PorF);
      System.out.println("Salary: " + s);
      return s;
    }
  }
  public static class Parttime extends SalaryCalculator {
    public static float jobtype() {
      Scanner console = new Scanner(System. in );
      System.out.println("How much is your salary?");
      float salary = console.nextFloat();
      System.out.println("Number of hours work.");
      int work = console.nextInt();
      float vat = 20;
      float s = salary * work / vat; // kunyare may vat pag part timer
      System.out.println(" ");
      System.out.println("================================");
      System.out.println("Employee Name: " + name);
      if (PorF.equals("F") || PorF.equals("f")) {
        PorF = "Full time";
      }
      else {
        PorF = "Part time";
      }
      System.out.println("Job type: " + PorF);
      System.out.println("Salary: " + s);
      return s;
    }
  }
}