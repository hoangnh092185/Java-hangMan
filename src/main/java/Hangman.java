import java.util.ArrayList;
import java.util.List;
import java.util.Random;



public class Hangman {
  String[] wordsArray = {"cat", "doggy", "mousecall", "horsefly"};
  Random runRandom = new Random();

  public String choseRandomWord(){
    String wordRandom = wordsArray[runRandom.nextInt(4)];
    return wordRandom;
  }

  public List<String> createBlanksArray(){
    String wordHolder = choseRandomWord();
    List<String> blanksFillWords = new ArrayList<String>();
    for(int i=0; i<wordHolder.length(); i++){
      blanksFillWords.add("_");
    }
    return blanksFillWords;
  }

  public String[] createLettersArray() {
    String wordHolder = choseRandomWord();
    String[] lettersArray = wordHolder.split("");
    return lettersArray;
  }
}
