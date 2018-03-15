package paint;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class TypingAndDrawing extends CenterPanel implements KeyListener{
	
	private FontMetrics fm;
	private static int fontSize = 30;
    Font font  = new Font("Serif", Font.BOLD,fontSize);
	private static Color fontColor;
	
	
	public static void setFontColor(Color c)
	{
		fontColor = c;
	}
	
	public static Color getFontColor()
	{
		return fontColor;
	}

	public TypingAndDrawing(){
		setFont(font); 
		fm = getFontMetrics(font); //space when typing
		addKeyListener(this); // Make center panel listen to typing
		
	}
	// Key Event when the mouse its click the Center Panel response to the keyboard Listener
	@Override
	public void keyTyped(KeyEvent e) 
{
		String s =String.valueOf(e.getKeyChar());
		Graphics g = getGraphics();
		g.setColor(fontColor); 
		g.drawString(s, lastX, lastY);
		record(lastX + fm.stringWidth(s),lastY);
}
    @Override
	public void keyPressed(KeyEvent e) 
{
}

	@Override
	public void keyReleased(KeyEvent e) 
{
}}

