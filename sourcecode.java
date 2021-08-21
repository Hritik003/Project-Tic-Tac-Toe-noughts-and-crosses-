package proj;
import java.util.Scanner;
import java.util.Random;

public class sourcecode {
    public static void main(String[] args) {
    	System.out.println("Welcome to the TIC TAC TOE game :) ");
		
    	char[][] Board = {{' ',' ',' '},
    	                  {' ',' ',' '},
    	                  {' ',' ',' '}}; 
    	
    	PrintBoard(Board);
    	Scanner in = new Scanner(System.in);
    	userinput(Board, in);
    	Random cp = new Random();
    	int compturn;
    	while(true)
    	{
    		 compturn = cp.nextInt(9)+1;
    		if(cellalreadyoccupied(Board, Integer.toString(compturn)))
    		{
    			break;
    		}
    		placemove( Board, Integer.toString(compturn),'O');
    		
    	}
    	PrintBoard(Board);	
    	
    	
	}//end main
    private static boolean cellalreadyoccupied(char[][] Board, String cell)
    {
    	switch(cell)
    	{
    	case "1":
			return (Board[0][0] == ' ');
		case "2":
			return (Board[0][1] == ' ');
		case "3":
			return (Board[0][2] == ' ');
		case "4":
			return (Board[1][0] == ' ');
		case "5":
			return (Board[1][1] == ' ');
		case "6":
			return (Board[1][2] == ' ');
		case "7":
			return (Board[2][0] == ' ');
		case "8":
			return (Board[2][1] == ' ');
		case "9":
			return (Board[2][2] == ' ');
		default:
			return false;
    	}
    }

	private static void userinput(char[][] Board, Scanner in) {
		System.out.println("whats your first move from 1-9?");
    	String userinput;
    	userinput = in.nextLine();
    	System.out.println(userinput);
    	placemove(Board, userinput,'X');
	}
	private static void placemove(char[][] Board, String xturn,char cross) {
		switch(xturn)
    	{
    	case "1":
    		Board[0][0] = cross;
    		break;
    	case "2":
    		Board[0][1] = cross;
    		break;
    	case "3":
    		Board[0][2] = cross;
    		break;
    	case "4":
    		Board[1][0] = cross;
    		break;
    	case "5":
    		Board[1][1] = cross;
    		break;
    	case "6":
    		Board[1][2] = cross;
    		break;
    	case "7":
    		Board[2][0] = cross;
    		break;
    	case "8":
    		Board[2][1] = cross;
    		break;
    	case "9":
    		Board[2][2] = cross;
    		break;
    	default:
    	    System.out.println(" :( ");
    	}
	}

	private static void PrintBoard(char[][] Board) {
		
    	System.out.println(Board[0][0] + "|" + Board[0][1] + "|" +Board[0][2] );
    	System.out.println("-+-+-");
    	System.out.println(Board[1][0] + "|" + Board[1][1] + "|" +Board[1][2] );
    	System.out.println("-+-+-");
    	System.out.println(Board[2][0] + "|" + Board[2][1] + "|" +Board[2][2] );
	}
}
 