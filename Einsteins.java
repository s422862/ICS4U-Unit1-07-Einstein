/**
* This program caculates AND converts the amount of mass that the user enters into energy.
*
* @author  John Junior Omage
* @version 1.0
* @since   2020-09-15 
*/
import java.util.Scanner;

public class Einsteins{
  public static void main(String[] args) {
   
    System.out.println("Enter the mass of an object in kilograms");
   
    //declare constants and variables
    final double Speed_Light = 2.998e8;
    final double tera;
    double energy;
    double mass;
    final double kiloton;
   
    //read the mass from the console
    Scanner scan = new Scanner(System.in);
    mass = scan.nextFloat();
   
    //calculate the energy
    energy = (mass * (Math.pow(Speed_Light, 2)));
   
    //print the output on the console
    System.out.println("If " + mass + "kg of mass was converted to energy, it will produce "
          + energy + "J of energy");
   
    //Calculate the energy in Kiloton bombs
    tera = (energy * (Math.pow(10, -12)));
    kiloton = (tera * 0.239);
   
    //output to console
    System.out.println("Or this would be the equivalent of a " + kiloton + " kiloton bomb");
   
  }
 
}