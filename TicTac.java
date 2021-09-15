public class TicTac{
    //Attributes
    /*static String up;
    static String mid;
    static String down;*/
    static char[][] positions;
    
    //Constructor
    public TicTac(){
        positions = new char[3][3];
    }

    //PrintGame: Prints the game in the current situation
    void PrintGame(){
        for(int rows = 0; rows < 3; rows++){
            for(int collumns = 0; collumns < 3; collumns++){
                System.out.print(positions[rows][collumns]);
                if(collumns != 2) System.out.print("|\n");
            }
            System.out.println("-----");
        }
    } 

    //ChangeUp: Changes the game, according to the play that was made
    void Change(int x, int player){
        switch(x){
            case 1:
                if(player == 0) positions[0][0] = 'X';
                else positions[0][0] = 'O';
                break;
            case 2:
                if(player == 0) positions[0][1] = 'X';
                else positions[0][1] = 'O';
                break;
            case 3:
                if(player == 0) positions[0][2] = 'X';
                else positions[0][2] = 'O';
                break;
            case 4:
                if(player == 0) positions[1][0] = 'X';
                else positions[1][0] = 'O';
                break;
            case 5:
                if(player == 0) positions[1][1] = 'X';
                else positions[1][1] = 'O';
                break;
            case 6:
                if(player == 0) positions[1][2] = 'X';
                else positions[1][2] = 'O';
                break;
            case 7:
                if(player == 0) positions[2][0] = 'X';
                else positions[2][0] = 'O';
                break;  
            case 8:
                if(player == 0) positions[2][1] = 'X';
                else positions[2][1] = 'O';
                break;
            case 9:
                if(player == 0) positions[2][2] = 'X';
                else positions[2][2] = 'O';
                break;  
        }

    }

    boolean IsOver(){
        if(positions[0][0] == positions[1][0] && positions[1][0] == positions[2][0]) return true;
        if(positions[0][1] == positions[1][1] && positions[1][1] == positions[2][1]) return true;
        if(positions[0][2] == positions[1][2] && positions[1][2] == positions[2][2]) return true;  
        
        if(positions[0][0] == positions[0][1] && positions[0][1] == positions[0][2]) return true;
        if(positions[1][0] == positions[1][1] && positions[1][1] == positions[1][2]) return true;
        if(positions[2][0] == positions[2][1] && positions[2][1] == positions[2][2]) return true;

        if(positions[0][0] == positions[1][1] && positions[1][1] == positions[2][2]) return true;
        if(positions[2][1] == positions[1][1] && positions[1][1] == positions[0][2]) return true;

        return false;
    }
}