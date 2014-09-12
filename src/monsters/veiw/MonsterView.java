package monsters.veiw;

import javax.swing.JOptionPane;

import monsters.controller.MonsterAppController;

public class MonsterView
{
	private MonsterAppController baseController;
	public MonsterView(MonsterAppController baseController)
	{
		this.baseController = baseController;
	}
	public void displayInformation()
	{
		JOptionPane.showMessageDialog(null, "I made a Keith");
		JOptionPane.showMessageDialog(null, "It's name is " + baseController.getMyMonster().getName());
		JOptionPane.showMessageDialog(null, baseController.getMyMonster().getName() + " tasted good");
		JOptionPane.showMessageDialog(null, "Now I am going to create Keith.2");
		JOptionPane.showMessageDialog(null, baseController.getMyMonster().getName() + " was and still is a sexy beast.");
		JOptionPane.showMessageDialog(null, baseController.getMyMonster().getName() + " has three beautiful hairs.");
		JOptionPane.showMessageDialog(null, "Keith has two extraordinary eyes.");
		JOptionPane.showMessageDialog(null, "Keith has two touchable arms");
		JOptionPane.showMessageDialog(null, "Keith has two model legs");
		JOptionPane.showMessageDialog(null, "Keith has one perfect nose");
		JOptionPane.showMessageDialog(null, "Keith has one pretty belly button");
		JOptionPane.showMessageDialog(null, "And Keith has one very approachable body");
				
		
	}
	
}
