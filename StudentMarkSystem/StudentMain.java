
package StudentMarkSystem;
import java.util.Scanner;
public class StudentMain 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        int mark=-1;
        while(true)
        {
            System.out.println("1.enter marks");
            System.out.println("2.display mark");
            System.out.println("3.exit");
            System.out.println("enter the option");
            int option=sc.nextInt();
            switch(option)
            {
                case 1:
                {
                    System.out.println("enter student marks");
                    int mark1=sc.nextInt();
                    try
                    {
                    if(mark1<0||mark1>100)
                    {
                        throw new IllegalArgumentException ("mark should between 0 and 100");
                        
                    }
                    else
                    {
                        mark=mark1;
                        System.out.println("mark stored successfully");
                    }
                    }
                    catch(IllegalArgumentException e)
                    {
                        System.out.println(e.getMessage());
                        
                    }
                    finally
                    {
                        System.out.println("operation completed");
                    }
                    break;
                           
                }
                case 2:
                {
                    if(mark==-1)
                    {
                        System.out.println("No  marks");
                    }
                    else
                    {
                        System.out.println("marks :"+mark);
                    }
                    break;
                    
                }
                case 3:
                {
                    sc.close();
                    return;
                }
            }
        }
        
    }
    
    
}
