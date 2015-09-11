package marshmallows.controller;


import marshmallows.model.MarshmallowMonster;
import marshmallows.view.MarshmallowOutput;

public class MonsterController
{
	private MarshmallowMonster alexMonster;
	private MarshmallowOutput myOutput;
	
	public MonsterController()
	{
		int eyes = 2;
		double legs = 3;
		double hair = 3;
		int noses = 1;
		boolean hasBellyButton = false;
		String name = "Dog";
		
		alexMonster = new MarshmallowMonster(name, eyes, noses, hair, legs, hasBellyButton);
	}
	
	public void start()
	{
		myOutput.displayMonsterInfo(alexMonster.toString());	
	}
}
