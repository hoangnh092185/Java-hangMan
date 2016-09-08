import java.util.ArrayList;
import java.util.List;
import java.util.Random;



public class Hangman {
  String[] wordsArray = {"cat", "doggy", "mousecall", "horsefly"};
  Random runRandom = new Random();
  String userInput;
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

  public String[] createLetterComparison(String letter) {
    // String[] arrayHolder = {"c","a","t"};
    String[] blankHolder = {"-","-","-"};
     for(int i = 0; i<3; i++){
       if (letter.equals("a")){
            blankHolder[i].replaceAll("a");
        }
        
      }return blankHolder;
  }

}
