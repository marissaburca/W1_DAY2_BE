package exercise3;

import java.util.Scanner;

public class main3 {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Type a word, I'll return it in characters");
        String word = userInput.nextLine();
        char[] arrayWord = word.toCharArray();
        int i = 0;
        while (i < arrayWord.length && arrayWord[i] != ('q')) {
            System.out.println(arrayWord[i]+",");
            i++;
        }
    }
}
