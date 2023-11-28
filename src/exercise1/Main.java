package exercise1;

import java.util.Scanner;

public class Main{

    /* esercizio 1.1 */
    public static boolean stringInput (String word){
        return word.length() % 2 == 0;
    }

    /* esercizio 1.2 */
    public static boolean leapYear (int year){
        if(year%4 == 0 ){
            if(year%100==0){
                return year % 400 == 0;
            } else {
                return true;
            }
        } else {
           return false;
        }
    }

    public static void main(String[] args) {
        /*import scanner per ricezione dati da utente*/
        Scanner userInput = new Scanner(System.in);
        /*chiedo e poi salvo dati ricevuti da utente*/
        System.out.println("Type a word, you will obtain true if it's even or false if it's odd");
        String word = userInput.nextLine();
        System.out.println( stringInput(word));

        System.out.println("Type a year and i will verify if it's a leap year");
        int choose1 = Integer.parseInt(userInput.nextLine());
        System.out.println(leapYear(choose1));

        userInput.close();
    }


}
