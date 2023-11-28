package exercise2;

import java.util.Scanner;

public class main2 {

    public static void main(String[] args){

        Scanner userInput = new Scanner(System.in);
        System.out.println("Type a number, if it's between 0 and 3, I'll return it in characters");
        int typed1 = Integer.parseInt(userInput.nextLine());
        switch (typed1){
            case 0 :{
                System.out.println("zero");
                break;
            }case 1 :{
                System.out.println("one");
                break;
            }case 2 :{
                System.out.println("two");
                break;
            }case 3 :{
                System.out.println("three");
                break;
            } default : {
                System.out.println("Error");
            }
        }
        userInput.close();
    }
}
