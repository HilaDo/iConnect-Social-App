package com.example.iconnect.Entities;

 
/**
 *
 * @author ABDELRAHMAN
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Verification {
 
    private static final Pattern CAPITAL_LETTER_PATTERN = Pattern.compile("[A-Z]");
    private static final Pattern SMALL_LETTER_PATTERN = Pattern.compile("[a-z]");
    private static final Pattern NUMBER_PATTERN = Pattern.compile("\\d");
    private static final Pattern SYMBOL_PATTERN = Pattern.compile("[^\\w\\s]");
    private static final Pattern EmailPattern = Pattern.compile("[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\\.[A-Za-z]{2,4}");
    public static boolean hasCapitalLetter(String string) {
        return CAPITAL_LETTER_PATTERN.matcher(string).find();
    }
 
    public static boolean hasSmallLetter(String string) {
        return SMALL_LETTER_PATTERN.matcher(string).find();
    }
 
    public static boolean hasNumber(String string) {
        return NUMBER_PATTERN.matcher(string).find();
    }
 
    public static boolean hasSymbol(String string) {
        return SYMBOL_PATTERN.matcher(string).find();
    }

    public static boolean hasAll(String string) {
        return hasCapitalLetter(string) && hasSmallLetter(string) && hasNumber(string) && hasSymbol(string);
    }
 
    public static boolean checkpassword(String password)
    {
 
        if (hasAll(password))
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static boolean checkemail(String email)
    {
        Matcher mat = EmailPattern.matcher(email);
        if(mat.matches())
        {
            return true;
        }

        return false;
    }
}
 