package CarSimulator;
import java.util.*;
public class CarTester 
{ 
 public static void main(String[] args) 
 { 
 Car ibiza = new Car(20); 

 
 Scanner in = new Scanner(System.in);
 
 System.out.println("Choose you fuel type. 1 - for gas, 2 for diesel ");
  int fueltype = in.nextInt();
  if (fueltype==1)
  {
    System.out.println("You have choose gas");

  }
  else if (fueltype==2)
  {
    System.out.println("You have choose diesel");
  }

  else {
    System.out.println("You have choose wrong number. Please restart the program.");

    Scanner QuitMethod = new Scanner(System.in);
System.out.print("Press Enter to quit...");
QuitMethod.nextLine();

    System.exit(0);
    }
    System.out.println("Enter remaining fuel ");
    double rifornimento = in.nextDouble();
    ibiza.addGas(rifornimento);
    System.out.println("Enter your trip length in kilometres");
    double km = in.nextDouble();
    ibiza.drive(km);
  System.out.println("Your remaining fuel is " + ibiza.getGas());
 } 
}