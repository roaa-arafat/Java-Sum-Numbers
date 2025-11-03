
package edu.zuj.oop;
import java.util.Scanner;

public class w3_task1{
    public static void main(String[]args){
        Scanner s = new Scanner (System.in);
        System.out.print("Enter a number : ");
        int n=s.nextInt();
        
        System.out.println("1- The sum of ddd number");
        System.out.println("2- The sum of even number");
        System.out.println("3- The sum of prime number");
        System.out.println("4- The sum of ddd number and prime number");
        System.out.print("Enter your choice : ");
        int ch=s.nextInt();
      
        int even=0,odd=0,prime=0,both=0; 
       
        for (int i = 1; i <= n; i++) {
                System.out.print("Enter number"+i+": ");
                int y=s.nextInt();
                   
                    boolean isOdd=(y%2==1);
                    boolean isPrime=true;
                        if (y<2) {
                             isPrime=false;
                        }
                        else {
                            for (int j = 2; j < y; j++) {
                                if (y%j==0) {
                                   isPrime=false;
                                break;
                                }   
                            }    
                        }        
                        if (isOdd) {
                            odd+=y;
                        }
                        else {
                            even+=y;
                        }
                        if (isPrime) {
                             prime+=y;
                        }
                        if (isOdd && isPrime) {
                            both+=y;
                        }
        }   

        switch (ch) {
                case 1: 
                        System.out.println("The sum of ddd number : "+odd);
                break;
                case 2: 
                        System.out.println("The sum of even number : "+even);
                break;
                case 3: 
                         System.out.println("The sum of prime number : "+prime);
                break;
                case 4: 
                         System.out.println("The sum of ddd number and prime number : "+(prime +odd-both));
                break;
        default:
            System.out.println("Error");     
        }
   }
}
    
