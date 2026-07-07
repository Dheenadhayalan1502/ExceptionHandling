
package AtmMachine;

import java.util.Scanner;
public class AtmMain  
{
   
    public static void main(String[] args) 
    {
        double balance=0;
        Scanner sc=new Scanner(System.in);
      
        System.out.println("enter the amount to be deposit");
        balance=sc.nextDouble();
       while(true)
       {
           System.out.println("1.View balance");
           System.out.println("2.Withdraw Amount");
           System.out.println("3.exit");
           System.out.println("enter the option");
           int option=sc.nextInt();
           switch(option)
           {
               case 1:
               {
                   System.out.println("your balance is :"+balance);
                   break;
               }
               case 2:
               {
                   
                   System.out.println("enter the amount to be deposited");
                   double amount=sc.nextDouble();
                   try
                   {
                       if(amount>balance)
                       {
                           throw new InsufficientBalanceException("withdra amount balace vida athigama iruku olyunga poi balance chechk pannu");
                           
                       }
                      balance-=amount;
                       System.out.println("withdrwa succesful "+amount);
                      
                       
                   }
                    catch(InsufficientBalanceException e)
                               {
                               System.out.println(e.getMessage());
                               
                               }
                   finally
                   {
                       System.out.println("Transaction completed");
                   }
                   break;
                  
               }
               case 3:
               {
                   System.out.println("exiting the program");
                   sc.close();
                   System.exit(0);
               }
               
           }
       }
        
        
    }
    
}
