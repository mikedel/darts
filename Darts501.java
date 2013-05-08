 import javax.swing.*;
 import java.awt.*;
 
 public class Darts501 extends JFrame
 {
	int numPlayers, i;
	
	public Darts501()
	{
		this (2);
	}
	public Darts501(int num)
	{
		numPlayers = num;
		setLayout(new GridLayout(numPlayers*2, 10));
		for(i = 0; i < num; i++)
			add(new JLabel(JOptionPane.showInputDialog(null, "Please enter player " + (i+1) + "'s name: ")));//need to make this span 2 columns somehow (merge or something
		for(i = 0; i < num; i+=2)
			add(new JLabel("501"));
	
	
	}	
	
	public static void main(String args[])
	{
		int numPlayers = Integer.parseInt(JOptionPane.showInputDialog(null, "Please enter the number of players: "));
		Darts501 frame = new Darts501(numPlayers);
		frame.setTitle("Darts501");
		frame.setSize(800, 800);
		frame.setLocationRelativeTo(null); // Center the frame
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
		
		
	}
}