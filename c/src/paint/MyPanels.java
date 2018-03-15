package paint;
import java.awt.BorderLayout;
import javax.swing.JFrame;

public class MyPanels extends JFrame{
	
	
public MyPanels()
{ 

		
		// North Panel
		NorthPanel jPanelNorth = new NorthPanel();
		add(jPanelNorth, BorderLayout.NORTH);
		
		// South Panel
		SouthPanel jps  = new SouthPanel();
		add(jps, BorderLayout.SOUTH);
		
		
		// East Panel
		EastPanel jpe = new EastPanel();
		add(jpe, BorderLayout.EAST);
		
		// West Panel
		WestPanel jpw = new WestPanel();
		add(jpw, BorderLayout.WEST);
		
		//Center Panel
		CenterPanel jpc = new CenterPanel();
		add(jpc, BorderLayout.CENTER);
		
		// Typing and Drawing Panel
		TypingAndDrawing jptc = new TypingAndDrawing();
		add(jptc, BorderLayout.CENTER);
		

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(1400,1400);
		setVisible(true);
		setTitle("PAINT");
		
}}



