package marshmallows.view;

import javax.swing.JOptionPane;

public class MarshmallowOutput
{
	public void displayMonsterConsole(String info)
	{
		System.out.println("My monster info is: " + info);
	}
	
	public void displayMonsterGUI(String info)
	{
		JOptionPane.showMessageDialog(null, "My monster information is:" + info);
	}	
	public void displayMonsterGUI1(String info)
	{
		JOptionPane.showMessageDialog(null, "How old is your monster?");
		
	}
	public void displayMonsterGUI2(String info)
	{
		JOptionPane.showMessageDialog(null, "What color is your monster?");
	}
}
