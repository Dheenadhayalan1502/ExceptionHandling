
package SmartLoginSystem;
import java.util.Scanner;
public class SystemMain 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int attempt=3;
        String username="dheena";
        String password="1234";
        while(true)
        {
            System.out.println("1.login");
            System.out.println("2.exit");
            System.out.println("enter  the option :");
            int option=sc.nextInt();
            sc.nextLine();
            switch(option)
            {
                case 1:
                {
                    try
                    {
                    if(attempt==0)
                    {
                        throw new AccountLockedException("Account Locked");
                    }
                    System.out.println("eneter your user name");
                    String user=sc.nextLine();
                    System.out.println("enter your passord");
                    String pass=sc.nextLine();
                    if(user.equals(username) && pass.equals(password))
                    {
                        System.out.println("login succesfully");
                        sc.close();
                        return;
                    }
                    else
                    {
                        attempt--;
                        System.out.println("invalid username and password");
                        if(attempt>0)
                        {
                            System.out.println("Remaining Attempt:"+attempt);
                            
                        }
                        else
                        {
                            throw new AccountLockedException("Account is locked");
                            
                        }
                        
                    }
                    }
                    catch(AccountLockedException e)
                    {
                        System.out.println(e.getMessage());
                        sc.close();
                        return;
                        
                    }
                    break;
                }
                case 2:
                {
                    System.out.println("exiting the program");
                    sc.close();
                    return;
                }
                        
                
            }
        }
        
    }
    
}
