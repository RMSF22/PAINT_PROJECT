package paint;

import java.awt.Color;

import javax.swing.JLabel;
import javax.swing.JPanel;

public class NorthPanel extends JPanel  
{
	 // Creating a welcome Label 
		private JLabel label = new JLabel("WELCOME TO THE DRAWING BOARD PAINT!");

		
		public NorthPanel()
		{
			
		setBackground(Color.LIGHT_GRAY);
		add(label); // adding the Label to the North Panel.
		
		}}

