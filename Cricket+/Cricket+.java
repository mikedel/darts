 import javax.swing.*;
 import java.awt.*;
 
 public class Cricket+ extends JFrame
 {
	int numPlayers, i;
	
	public Cricket+()
	{
		this (2);
	}
	public Cricket+(int num)
	{
		numPlayers = num;
	}
	
	public void play()
	{
		
	
	
	
	
	}
	
	
	
	public static void main(String args[])
	{
		int numPlayers = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the number of players: "));
		Cricket+ frame = new Cricket+(numPlayers);
		frame.setTitle("Cricket+");
		frame.setSize(800, 800);
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		frame.play()
	}
}