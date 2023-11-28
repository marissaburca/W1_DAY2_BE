package exercise4;

import java.util.Scanner;

public class main4 {
    public static void main(String[] args){
        Scanner userInput = new Scanner(System.in);
        System.out.println("Type a number, I'll start a countdown from it");
        int typed3 = Integer.parseInt(userInput.nextLine());
        for(int i = typed3; i>= 0; i-- ){
            System.out.println(i);
        }
    }
}
