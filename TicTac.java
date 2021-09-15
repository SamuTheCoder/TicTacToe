public class TicTac{
    //Attributes
    static String up;
    static String mid;
    static String down;
    int points1;
    int points2;
    
    //Constructor
    public TicTac(){
        up = "1|2|3";
        mid = "4|5|6";
        down = "7|8|9";
        points1 = points2 = 0;
    }

    //PrintGame: Prints the game in the current situation
    static void PrintGame(){
        System.out.println(up);
        System.out.println("-----");
        System.out.println(mid);
        System.out.println("-----");
        System.out.println(down);
    } 

    //ChangeUp: Changes the upper line of the game, according to the play that was made
    static void ChangeUp(int x, ){
        if (x == 1){
            String sub = up.substring(1);
            up = ""
        }
    }
}