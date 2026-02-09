package errorHandling;

//handle and protect MilePerGallon(double,double) method
//Give appropriate feedback such 'dividing by zero'


import java.util.Scanner;

public class MilesPerGallon{
public static void main (String [] args){

Scanner read = new Scanner(System.in);
double mile;
double gallon;



       while(true){
         try{

             System.out.println("Enter milage");
             mile = read.nextDouble();
            if(mile <= 0) throw new Exception(" try again!");
             
             System.out.println("Enter gallons");
             gallon = read.nextDouble();
             if(gallon <= 0) throw new Exception(" try again!");

             System.out.println();
             System.out.println("----------------------");


             System.out.println(MilePerGallon(mile,gallon));
             break;
         }catch(Exception e){
           System.out.println(e);
           read.nextLine();
         }
         
         }//end while





}

public static double MilePerGallon (double m, double g){
 //throw exception
 if (g == 0) throw new RuntimeException("invalid");
 return m/g;
}
}