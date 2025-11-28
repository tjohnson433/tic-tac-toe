package ticTacToe;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Interface extends JPanel implements ActionListener{
	
	//attributes
	private static JLabel myTurnLabel = new JLabel("Turn: X");
	private static GamePanel myGamePanel = new GamePanel();                               // screen1
		
	private static CardLayout cardlayout = new CardLayout();
	private static JPanel panelswitcher = new JPanel(cardlayout);
	private static JPanel winPanel = new JPanel();
	private static JLabel winLabel = new JLabel();
	
	private static JButton resetButton  =new JButton("Reset Game");
		
		//constructor
	public Interface() {
		
		// setting up the win panel
		
		
		winLabel.setText("YOU WINNNNNNNNNNNN");
		winLabel.setForeground(Color.black);
		winPanel.setBackground(Color.white);
		winPanel.add(winLabel);
			
		panelswitcher.add(myGamePanel, "Gamepanel");
		panelswitcher.add(winPanel, "Win Panel");

		this.setLayout(new BorderLayout());
		this.add(panelswitcher, BorderLayout.CENTER);
		this.add(myTurnLabel, BorderLayout.NORTH);
	
		myGamePanel.setActionListener(this);
	}
	
	
	
	public static void showWinPanel() {
		cardlayout.show(panelswitcher, "Win Panel");
		System.out.println("showWinPanel called");
	}
	
	
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		myTurnLabel.setText("Turn: " + myGamePanel.getTurn());
	}
}
