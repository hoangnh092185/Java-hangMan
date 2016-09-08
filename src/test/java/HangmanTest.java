import org.junit.*;
import static org.junit.Assert.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;


public class HangmanTest {
  @Test
  public void createBlankArray_input_lengthOfWord(){
    Hangman hangmanInput = new Hangman();
    List<String> expected = new ArrayList<String>();
    expected.add("_");
    expected.add("_");
    assertEquals(expected, hangmanInput.createBlanksArray());
  }
  @Test public void createLettersArray_splitWordToIndividualsLetter_LettersArray(){
    Hangman hangmanInput = new Hangman();
    assertEquals({"c","a","t"}, hangmanInput.createLettersArray("cat"));
  }
}
