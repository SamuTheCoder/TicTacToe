import java.lang.System.*;
import java.util.IllegalFormatException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class JoguinhoGalo {

    final static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int opt = 0;
 
        while(opt != 3){
            int choosePlayer = 0; //Even - Player 1 | Odd - Player 2
            int play;
            
            System.out.println("WELCOME TO TIC TAC TOE");       
            System.out.println("MENU \n ---------------------------");
            System.out.println("1 - Play");
            System.out.println("2 - Alltime Stats");
            System.out.println("3 - Quit");
            
            System.out.print("Select an option: ");     
            opt = sc.nextInt();   
            while(opt < 1 || opt > 3){
                System.out.print("Opção Inválida, insira outra: ");
                opt = sc.nextInt();
            }

            if (opt == 1){
                TicTac game = new TicTac();
                
                while(game.IsOver()){
                    System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXX");

                    System.out.println("1|2|3");
                    System.out.println("------");
                    System.out.println("4|5|6");
                    System.out.println("------");
                    System.out.println("7|8|9");
                    
                    System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXX");
                    
                    game.PrintGame();

                    if(choosePlayer == 0) System.out.println("Player 1's time to play!");
                    else System.out.println("Player 2's time to play!");

                    System.out.print("Choose a play from 0 to 9:");
                    play = sc.nextInt();

                    game.Change(play, choosePlayer);                   
                    if(game.IsOver()) System.out.println("Player " + choosePlayer + " has won the game!");
                }          

            } else return;
        }
    }
}
