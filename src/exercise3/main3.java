package exercise3;

import java.util.Scanner;

public class main3 {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);
        String word= "";
        do {
            System.out.println("Type a word, I'll return it in characters");
            word = userInput.nextLine();
            String[] arrayWord = word.split("");
            System.out.println(String.join(",", arrayWord));
        } while (!word.equals(":q"));
            userInput.close();
            System.out.println("Exit");

    }
}
