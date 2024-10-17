package first;

public class Classmega {
	public static void main(String[] args) {


     /*String tictactoe[][] = new String[3][3];
     
    
     
     tictactoe[0][0] = "X";
     tictactoe[0][1] = " ";
     tictactoe[0][2] = "X";
     tictactoe[1][1] = "O";
     tictactoe[1][0] = "X";
     tictactoe[1][2] = " ";
     tictactoe[2][0] = "O";
     tictactoe[2][1] = "O";
     tictactoe[2][2] = "X";
   
     for (int i = 0; i < 3; i++) {
    	 for(int e = 0; e < 3; e++) {
    		 
    		 System.out.print(tictactoe[i][e]);
    		 System.out.print(" ");*/
    	 }
    	
    	int field[] = new int[5] {
    	
    	
    	field[0] = 60;
    	field[1] = 6;
    	field[2] = 51;
    	field[3] = 63;
    	field[4] = 32;
    	
    	for(int i = 0; i<5; i++) {
    		int x = field[i];
    		field[i] = field[i+1];
    		field[i+1] =x;
    	};

     }
	
	}


