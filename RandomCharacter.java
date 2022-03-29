
import static org.junit.Assert.assertTrue;

import java.util.Random;
public class RandomCharacter {
    public char getRandomLowerCaseLetter(){
        Random r = new Random();
        int rint = r.nextInt(26);
        char lcasechar = (char)(rint+97);
        return lcasechar;
    }
    public char getRandomUpperCaseLetter(){
        Random r = new Random();
        int rint = r.nextInt(26);
        char ucasechar = (char)(rint+65);
        return ucasechar;
    }
    public char getRandomDigitCharacter(){
        Random r = new Random();
        int rint = r.nextInt(10);
        char rddigitchar = (char)(rint+48);
        return rddigitchar;
    }
    public char getRandomCharacter(){
        Random r = new Random();
        int rint = r.nextInt(3);
         char rdchar = 0;
        switch(rint){
            case 0:
            rdchar = getRandomLowerCaseLetter();
            break;
            case 1:
            rdchar = getRandomUpperCaseLetter();
            break;
            case 2:
            rdchar = getRandomDigitCharacter();
            break;
        }
       
        return rdchar;
    }
    public static void main(String[] args) {
        RandomNumberTest rt = new RandomNumberTest();
        RandomCharacter rc = new RandomCharacter();
        for(int i = 0; i < 15; i++)
        {
            char temp = rc.getRandomLowerCaseLetter();
            System.out.println(temp);
            assertTrue(temp + " did not meet the requirements",rt.inAsciiRange(temp, 97, 122));
        }
        System.out.println("_____________________________________________________________________________");
        for(int i = 0; i < 15; i++)
        {
            char temp = rc.getRandomUpperCaseLetter();
            System.out.println(temp);
            assertTrue(temp + " did not meet the requirements",rt.inAsciiRange(temp, 65, 90));
        }
        System.out.println("_____________________________________________________________________________");
        for(int i = 0; i < 15; i++)
        {
            char temp = rc.getRandomDigitCharacter();
            System.out.println(temp);
            assertTrue(temp + " did not meet the requirements",rt.inAsciiRange(temp, 48, 57));
        }
        System.out.println("_____________________________________________________________________________");
        for(int i = 0; i < 15; i++)
        {
            char temp = rc.getRandomCharacter();
            System.out.println(temp);
            assertTrue(temp + " did not meet the requirements",(rt.inAsciiRange(temp, 48, 57) || rt.inAsciiRange(temp, 65, 90) || rt.inAsciiRange(temp, 97, 122)));
        }
        System.out.println("_____________________________________________________________________________");
        /*for(int i = 0; i < 15; i++)
        {
            char temp = rc.getRandomDigitCharacter();
            String string = String.valueOf(temp);
            int val = Integer.parseInt(string);
            assertTrue(temp + " is a prime number",!rt.testPrimeNumber(val));
        }*/
        System.out.println("_____________________________________________________________________________");
        for(int i = 0; i < 15; i++)
        {
            char temp = rc.getRandomCharacter();
            String string = String.valueOf(temp);
            try{
                int val = Integer.parseInt(string);
                assertTrue(temp + " is a prime number",!rt.testPrimeNumber(val));
            }
            catch(NumberFormatException t)
            {
                System.out.println("Generated a non integer " + string);
            }
            
        }
        
    }
}
