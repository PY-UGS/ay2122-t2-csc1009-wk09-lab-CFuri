
import java.lang.Math;

public class RandomNumberTest {
    public boolean testPrimeNumber(int number)
    {
        
        for(int i = 2; i < (int)Math.sqrt(number)+1;i++)
        {
            if(number % i == 0)
            {
                System.out.println(number + " is not a prime number");
            return false;
            }
        }
        if(number == 1 || number == 0)
        {
            System.out.println(number+" is not a prime number");
            return false;
        }
        System.out.println(number + " is a prime number");
        return true;
    }
    public boolean inAsciiRange(char input,int lower, int upper)
    {
        if(input >= lower && input <= upper)
        {
            return true;
        }
        return false;
    }
}
