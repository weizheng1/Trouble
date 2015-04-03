import javax.swing.*;


public class Board {	
	private JFrame board;
	

	public Board (){
		board = new JFrame("Trouble");	
		board.setSize(700,700);
		board.setVisible(true);
	}

	private class Space extends JLabel {
		private Pieces p;
		private SpaceType type;
		
		
		
		public void setPiece(Pieces piece) {
	       this.p = piece;
	    }

	    public Pieces getPiece() {
	       return p;
	    }
	    
	
	}
}


