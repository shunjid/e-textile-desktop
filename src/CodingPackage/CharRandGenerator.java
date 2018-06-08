package CodingPackage;

import java.util.Random;


public class CharRandGenerator
{
    Random random = new Random();
    
    public char generator()
    {
        String chars = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        
        return chars.charAt(random.nextInt(chars.length()));
    }
    
    public String intGen()
    {
        
        int rand_int = random.nextInt(1000);
        return String.valueOf(rand_int);
    }
}
