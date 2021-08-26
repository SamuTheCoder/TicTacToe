import java.lang.System.*;
import java.util.IllegalFormatException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class JoguinhoGalo {

    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int opt = 0;
        int choosePlayer = 0; //Even - Player 1 | Odd - Player 2
        System.out.println("WELCOME TO TIC TAC TOE");       
        System.out.println("MENU \n ---------------------------");
        System.out.println("1 - Play");
        System.out.println("2 - Alltime Stats");
        System.out.println("3 - Quit");
        System.out.print("Select an option: ");
        
        try{
            int option = sc.nextInt();
            opt = option;
            while(option < 1 || option > 3){
                System.out.print("Opção Inválida, insira outra: ");
                option = sc.nextInt();
                opt = option;
            }
        } catch(InputMismatchException e){
            System.out.println("Bro/Sis, there's only 3 options: 1, 2 or 3... 0_0 Choose one: ");               
        }

        if (opt == 1){
            TicTac game = new TicTac();
            System.out.println("1|2|3");
            System.out.println("------");
            System.out.println("4|5|6");
            System.out.println("------");
            System.out.println("7|8|9");
            
            System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXX");
            game.PrintGame();

            if(choosePlayer == 0 || choosePlayer % 2 == 0){
                 System.out.println("Player 1's time to play!");
                 if 
            }
        
            
        } else if (opt == 2){

        } else return;

    }
}
