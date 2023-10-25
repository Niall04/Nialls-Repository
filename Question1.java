import java.util.Scanner;
public class Question1 
{
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
      
        int option;
        
        System.out.println("1. Check if a number is prime ");
        System.out.println("2. List prime numbers in a range");
        System.out.println("3. press 3 to exit program");
        System.out.println("Choose an option (1 or 2 or 3): ");

        option = scan.nextInt();

        if (option == 1)
        {
            System.out.println("Enter a number:");
            int num = scan.nextInt();
            System.out.println(CheckPrime(num));
        }
        else if (option == 2)
        {
            System.out.println("Enter Start of range");
            int Start = scan.nextInt();
            System.out.println("Enter End of range");
            int End = scan.nextInt();
            System.out.println(List_Of_Primes(Start,End));
        }
        else
        {
            System.out.println("You exited the program.");
        }
        scan.close();
    }

    public static String CheckPrime(int num) 
    { 
        if (num <= 1) 
        {
            return (num + " is not a prime number"); 
        }
        for (int i = 2; i < num; i++) 
        {
            if (num % i == 0)  // if a number divides by two and dividees evenly prime rule
            {
                return (num + " is not a prime number");
            }
        }
        return (num + " is a prime number");
    }

    static String List_Of_Primes(int Start, int End)
    {
        String num = " ";
        for(int i = Start; i <= End; i++)
        {
            if(i == 2)
            {
                num = num + " " + i;
            }
            if(i == 3)
            {
                num = num + " " + i;
            }
            else
            {
                if(i % 2 == 0){ // any number that divide by these evenly then it is NOT Prime

                }else if(i % 3 == 0){

                }else if(i % 5 == 0){

                }
                else
                {
                     num = num + " " + i;
                }

                
            }
        }
        return ("Prime numbers in the range is: " + num);
    }

}
