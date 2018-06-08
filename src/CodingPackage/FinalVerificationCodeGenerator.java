package CodingPackage;

public class FinalVerificationCodeGenerator
{
    public static String RandomCodeGenerator() 
    {
        
        String x="";
        CharRandGenerator c = new CharRandGenerator();
 
        x = x.concat(String.valueOf(c.generator()));
        x = x.concat(c.intGen());
        x = x.concat(String.valueOf(c.generator()));
        x = x.concat(c.intGen());
        
        return x;
    }
}
