package paint;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JComboBox;
import javax.swing.JPanel;

public class SouthPanel extends JPanel implements ActionListener
{
	
	JPanel sizeGroupPanel = new JPanel();

	//size of the Shapes, Pen and text
	private JComboBox Penbox;
	private JComboBox CircleBox;
	private JComboBox Rectbox;
	private JComboBox SquareBox;
	private JComboBox FontBox;
	
	private  String [] choosepensize = {"Pen","0","10","15","20","25","30"};
	private  String [] chooseCirclesize = {"Circle","15","25","30","35","40"};
	private  String [] chooseRectanglesize = {"Rectangle","15","25","30","35","40"};
	private  String [] chooseSquaresize = {"Square","15","25","30","35","40"};
	private  String [] chooseFontsize = {"Font","15", "25" , "30", "35", "40"};
	
	public SouthPanel()
	{
		
		setBackground(Color.LIGHT_GRAY);
		sizeGroupPanel.setBorder(BorderFactory.createTitledBorder("Size"));
		sizeGroupPanel.setBackground(Color.LIGHT_GRAY);
		add(sizeGroupPanel);
		
		Penbox = new JComboBox(choosepensize);
		Penbox.addActionListener(this);
		sizeGroupPanel.add(Penbox);
		
		CircleBox = new JComboBox(chooseCirclesize);
		CircleBox.addActionListener(this);
		sizeGroupPanel.add(CircleBox);
		
		Rectbox = new JComboBox(chooseRectanglesize);
		Rectbox.addActionListener(this);
		sizeGroupPanel.add(Rectbox);
		
		SquareBox = new JComboBox(chooseSquaresize);
		SquareBox.addActionListener(this);
		sizeGroupPanel.add(SquareBox);
		
		FontBox = new JComboBox(chooseFontsize);
		FontBox.addActionListener(this);
		sizeGroupPanel.add(FontBox);
	
	}

	// Action Listener for the event when the size of the shape are selected.
	@Override
	public void actionPerformed(ActionEvent e) {
	
		// Selecting  from the PenBox 
		if (Penbox.getSelectedItem() == "0")
			
		{
			CenterPanel.setPenSize(0);
			
			}
		
		if (Penbox.getSelectedItem() == "10")
		{
			CenterPanel.setPenSize(10);
			

		}
		if (Penbox.getSelectedItem() == "15")
		{
			CenterPanel.setPenSize(15);

		}
		if (Penbox.getSelectedItem() == "20")
		{
			CenterPanel.setPenSize(20);

		}
		if (Penbox.getSelectedItem() == "25")
		{
			CenterPanel.setPenSize(25);

		}
		if (Penbox.getSelectedItem() == "30")
		{
			CenterPanel.setPenSize(30);

		}// end Combo box
		
		
		//Selecting Circle Size
		
		if (CircleBox.getSelectedItem() == "15")
		{
			CenterPanel.setCircleSize(15);

		}
		if (CircleBox.getSelectedItem() == "25")
		{
			CenterPanel.setCircleSize(25);

		}
		if (CircleBox.getSelectedItem() == "30")
		{
			CenterPanel.setCircleSize(30);

		}
		if (CircleBox.getSelectedItem() == "35")
		{
			CenterPanel.setCircleSize(35);

		}
		if (CircleBox.getSelectedItem() == "40")
		{
			CenterPanel.setCircleSize(40);

		}// end circle Size 

		// selecting Rectangle Size
		
		if (Rectbox.getSelectedItem() == "15")
		{
			CenterPanel.setRectangleSize(15);;

		}
		if (Rectbox.getSelectedItem() == "25")
		{
			CenterPanel.setRectangleSize(25);

		}
		if (Rectbox.getSelectedItem() == "30")
		{
			CenterPanel.setRectangleSize(30);

		}
		if (Rectbox.getSelectedItem() == "35")
		{
			CenterPanel.setRectangleSize(35);

		}
		if (Rectbox.getSelectedItem() == "40")
		{
			CenterPanel.setRectangleSize(40);

		}// end Rectangle Size
		
		

		
		// Selecting Square Size
		if (SquareBox.getSelectedItem() == "15")
		{
			CenterPanel.setSquareSize(15);

		}
		if (SquareBox.getSelectedItem() == "25")
		{
			CenterPanel.setSquareSize(25);

		}
		if (SquareBox.getSelectedItem() == "30")
		{
			CenterPanel.setSquareSize(30);

		}
		if (SquareBox.getSelectedItem() == "35")
		{
			CenterPanel.setSquareSize(35);

		}
		if (SquareBox.getSelectedItem() == "40")
		{
			CenterPanel.setSquareSize(40);
			// end Square Size
		} 	
		
		
		
		//Selecting Font Size
		if(FontBox.getSelectedItem() == "15")
		{
			CenterPanel.setFontSize(15);
		}
		
		if(FontBox.getSelectedItem() == "25")
		{
			
			CenterPanel.setFontSize(25);
			
		}if(FontBox.getSelectedItem() == "30")
		{
			
			CenterPanel.setFontSize(30);
			
		}if(FontBox.getSelectedItem() == "35")
		{
			
			CenterPanel.setFontSize(35);
			
		}if(FontBox.getSelectedItem() == "40")
		{
			
			CenterPanel.setFontSize(40);
		}
		
		//End font size
		

	} // End Action Listener
}


