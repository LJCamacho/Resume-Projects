package errorHandling;

import java.util.*;
//import java.lang.*;

public class ErrorHandlingIntegers {
public static void main (String [] args){

 Scanner reader = new Scanner(System.in);
  int x;
  

  while(true){
  try{
  System.out.println("input an integer value from [1-10] ");
  x =  reader.nextInt();
  if((!(x >= 1 && x <= 10)))
         //Exception
	  	throw new Exception("try again!");
       

     break;
  }catch(InputMismatchException e) {
  	System.out.println(e+" try again!");
  	reader.nextLine();
    }catch (Exception e){
          System.out.println(e);
           reader.nextLine();
  }

  }
  System.out.println("------------------");

  System.out.println(plusplus(x));


}
 public static int plusplus(int n){
          return n+n;
  }
}