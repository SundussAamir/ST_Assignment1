package stassi1;

public class STassi1 
{
    
    boolean isPalindrome(String input) {

        //Converting input to Lowercase and removing all white spaces
        input = input.toLowerCase().replaceAll("\\s+", "");

        //Length of input
        int length = input.length();

        //Check if non alpha-numeric string
        if (!input.matches("^([a-z0-9]+)?$")) {
            return false;
        }

        //Character by character comparision
        for (int i = 0; i < length / 2; i++) {
            if (input.charAt(i) != input.charAt(length - i - 1)) {
                return false;
            }
        }
        return true;
    }
    
    public static boolean main(String[] args) {

        STassi1 palindrome = new STassi1();

        String input = "Madam";

        if (palindrome.isPalindrome(input))
           return (true);
        else
            return (false);

    }

    
}
