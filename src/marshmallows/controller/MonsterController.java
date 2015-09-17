package marshmallows.controller;


import marshmallows.model.MarshmallowMonster;
import marshmallows.view.MarshmallowOutput;
import java.util.Scanner;

public class MonsterController
{
	private MarshmallowMonster alexMonster;
	private MarshmallowOutput myOutput;
	private Scanner monsterScanner;
	
	public MonsterController()
	{
		int eyes = 2;
		double legs = 3;
		double hair = 3;
		int noses = 1;
		boolean hasBellyButton = false;
		String name = "Dog";
		
		monsterScanner = new Scanner(System.in);
		myOutput = new MarshmallowOutput();
		alexMonster = new MarshmallowMonster(name, eyes, noses, hair, legs, hasBellyButton);
	}
	
	public void start()
	{
		myOutput.displayMonsterInfo(alexMonster.toString());
		askQuestions();
		myOutput.displayMonsterInfo("New Monster Info " + alexMonster.toString());
	}
	
	private void askQuestions()
	{
		System.out.println("Type in a better name for the monster");
		String betterMonsterName = monsterScanner.next();
		alexMonster.setMonsterName(betterMonsterName);
		System.out.println("Type in a different number of eyes for the monster");
		int betterMonsterEyes = monsterScanner.nextInt();
		alexMonster.setMonsterEyes(betterMonsterEyes);
		System.out.println("Type in a different number of legs for the monster");
		double betterMonsterLegs = monsterScanner.nextDouble();
		alexMonster.setMonsterLegs(betterMonsterLegs);
		System.out.println("Type in a different amount of hair for the monster");
		double betterMonsterHair = monsterScanner.nextDouble();
		alexMonster.setMonsterHair(betterMonsterHair);
	}
	
	
}



