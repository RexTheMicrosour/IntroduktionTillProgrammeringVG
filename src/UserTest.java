import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {

    @Test
    public void TestRowOutput(){
        Count count = new Count(5, 20);
        int expected = 5;

        count.setRow(5);

        int actual = count.getRow();

        assertEquals(expected, actual);
    }
    // Test for user output for rows

    
    @Test
    public void TestStop(){
        Count count = new Count(5, 20);
        boolean expected = false;

        boolean actual = count.checkStop("stop");

        assertEquals(expected, actual);
    }
    //Test if user has written stop

    @Test
    public void TestCharOutput(){
        Count count = new Count(5, 30);
        int expected = 30;

        count.setChar(30);

        int actual = count.getChar();

        assertEquals(expected, actual);


    }
    //Test for user output for characters
}
