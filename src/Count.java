import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Count {

    private static String[] texts; //array
    private static int userRows;
    private int userChar;

    public Count (int myRows, int myChar) {
        userRows = myRows;
        userChar = myChar;

    }
    //Constructor

    public static int countRow(int actualRow) {
        actualRow++;
        userRows = actualRow;
        return userRows;

    }
    //Counter for rows
    public static int countChar(String userTxt){

        int charCount;
        charCount = userTxt.replace(" ", "").length();

        return charCount;
    }
    //Counter for characters
    public static int countWords(String userText){
        userText = userText.trim();


        String[] words = userText.split("\\s+"); // Splitting the string into words


        int wordCount = words.length; // Counting the number of words

        return wordCount;
    }
    //Counter for words
    public static String getLongestString() {
        List<String> strings = Arrays.asList(texts);
        String longest = strings.stream().
                max(Comparator.comparingInt(String::length)).get();
        int max = longest.length();

        return longest;
    }
    //create the longest word
    public static boolean checkStop(String A) {

        if (!A.equals("stop")) {
            return true;
        } else {
            return false;
        }
    }
    //Checking if user has written stop
    public static int getArrayLength()
    {
        return texts.length;
    }
    //Get the length of the array
    public void setWordArray(String input)
    {
        texts = input.split("\s");
    }
    //splitting the array
    public int getRow() {
        return userRows;
    }

    public void setRow(int newRow) {
        if (newRow >=1){
            userRows = newRow;
        }
    }
    public int getChar() {
        return userChar;
    }

    public void setChar(int newChar) {
        if (newChar >=1){
            userChar = newChar;
        }
    }
}




