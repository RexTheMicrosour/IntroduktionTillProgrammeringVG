import java.util.Scanner;

public class Main {
    static int row_counter = 0; // Counter for rows
    static int char_counter = 0;


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in); //Scanner
        Count Array_InOut = new Count(row_counter, char_counter) ;

        String savedStrings = ""; // New string

        System.out.println("please write something,then press enter");
        System.out.println("If u want to quit, please write stop");

        while (true){

            String input = scan.nextLine(); // letting an user write to the program

            if (Count.checkStop(input))
            {
                savedStrings = savedStrings + input + " ";
                row_counter = Count.countRow(row_counter);

            }
            //if statement
            else {
                Array_InOut.setWordArray(savedStrings.trim());
                System.out.println("U have written: " + savedStrings);
                System.out.println("Number of characters: " + Count.countChar(savedStrings));
                System.out.println("The array is " + Count.getArrayLength() + " positions long");
                System.out.println("Ur longest word is: " + Count.getLongestString());
                System.out.println("Number of rows: " + row_counter);
                System.out.println("Number of words: " + Count.countWords(savedStrings));
                break;
            }
            //User output
        }
        //while loop
    }

}

