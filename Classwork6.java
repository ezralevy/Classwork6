import java.util.Scanner;
public class Classwork6
{
    public static void main (String[] args)
    {
      Scanner scan= new Scanner (System.in);
       System.out.println ("ask me a random question (yes or no)");
      ;
     String userQuestion = scan.nextLine();
       double randNum =0;
       
           for(int i = 0; i < 1; i += 1)
     {
      randNum = (int)(Math.random()*3)+1;
      
     
    }
    if (randNum == 2)
    System.out.println ("Yes, it is decidedly so");
    if(randNum== 3) 
    System.out.println ("Perhaps");
    
    else
     System.out.println ("No, never");
    } 
    }
       
  
  