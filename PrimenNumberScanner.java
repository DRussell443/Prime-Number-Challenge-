import java.util.Scanner;

public class PrimenNumberScanner{
   
   public static void main(String[] args) {
   
      System.out.println("This program will scan whatever you ");// This line of code ask user for number
      Scanner kb= new Scanner(System.in);
      int num= kb.nextInt(); //This line of code will recieve the user input
      
      boolean prime= true;
      
      for(int i=2; i<num;i++){
      
         if(num%i==0){// this will see if the number is divisible by any other nuumber besides 1
         prime=false;
        
         }
      }
       if(prime== true)
       System.out.print("The number you entered is a prime number");
       
       else 
       System.out.print("The number you entered is not a prime number");
    }

}