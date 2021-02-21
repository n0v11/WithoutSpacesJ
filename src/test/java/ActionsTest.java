import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.Assert.assertEquals;

public class ActionsTest {

    @Test
    public void GoodString() {
        assertEquals("Hello, world!", Actions.DeleteExtraSpaces("Hello, world!")); }

    @Test
    public void AllStringOfSpaces(){
        assertEquals("", Actions.DeleteExtraSpaces("      "));
    }

    @Test
    public void StringWithoutSpaces(){
        assertEquals("Hello,world!", Actions.DeleteExtraSpaces("Hello,world!"));
    }

    @Test
    public void EmptyString(){
        assertEquals("", Actions.DeleteExtraSpaces(""));
    }

    @Test
    public void TwoAndMoreSpacesInOneString(){
        assertEquals("1 2 3 4 5", Actions.DeleteExtraSpaces("1   2 3   4          5"));}

    @Test
    public void SpacesAtStartAndEndOfTheString(){
        assertEquals("1 2", Actions.DeleteExtraSpaces("   1 2   "));
    }
}
