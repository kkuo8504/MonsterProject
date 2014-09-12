package monsters.controller;

import monsters.model.MarshmallowMonster;
import monsters.veiw.MonsterView;

public class MonsterAppController
{
	private MonsterView myAppView;
	private MarshmallowMonster myMonster;
	private MarshmallowMonster otherMonster;

	public MonsterAppController()
	{
		myAppView = new MonsterView(this);
		myMonster = new MarshmallowMonster("Keith", 2.0, // Legs
				3.0, // Hair
				2, // Eyes
				1, // Nose
				2, // Arms
				true); // BellyButton
		otherMonster = new MarshmallowMonster("Htiek", 0.001, .2, 5, 0, 0, false);
	}

	public MarshmallowMonster getMyMonster()
	{
		return myMonster;
	}

	public void start()
	{
		myAppView.displayInformation();
	}
}
