package stassi1;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sunduss KD
 */
public class STassi1Test {
    
    private STassi1 palindrome;
    private String input;

    @Before
    public void setUp() throws Exception {

        input = null;
        palindrome = new STassi1();

    }

    @After
    public void tearDown() throws Exception {

    }

    @Test(expected = NullPointerException.class)
    public void nullString() throws Exception {

        palindrome.isPalindrome(null);

    }

    @Test
    public void emptyString() throws Exception {

        input = "";

        assertTrue(palindrome.isPalindrome(input));

    }

    @Test
    public void invalidString() throws Exception {

        input = "Sunduss";
        
        assertFalse(palindrome.isPalindrome(input));
    }
    
    @Test
    public void validString() throws Exception {

        input = "No lemon no melon";

        assertTrue(palindrome.isPalindrome(input));
    }
    
    @Test
    public void singleChar() throws Exception {

        input = "S";

        assertTrue(palindrome.isPalindrome(input));

    }

    @Test
    public void punctuation() throws Exception {

        input = "A Man, A Plan, A Canal-Panama!";

        assertFalse(palindrome.isPalindrome(input));

    }

    @Test
    public void numerical() throws Exception {

        input = "12345qw54321";

        assertFalse(palindrome.isPalindrome(input));
    }

   
    @Test
    public void multipleSpaceTest() throws Exception {

        input = "MA      AM";

        assertTrue(palindrome.isPalindrome(input));

    }
}
