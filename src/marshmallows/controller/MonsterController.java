package marshmallows.controller;


import marshmallows.model.MarshmallowMonster;
import marshmallows.view.MarshmallowOutput;
import java.util.Scanner;

public class MonsterController
{
	private MarshmallowMonster alexMonster;
	private MarshmallowMonster userMonster;
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
		myOutput.displayMonsterConsole(alexMonster.toString());
		myOutput.displayMonsterGUI(alexMonster.toString());
		//this.makeUserMonster();
		//myOutput.displayMonsterGUI("New Monster Info " + userMonster.toString());
		myOutput.displayMonsterGUI1(alexMonster.toString());
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
	
	/**
	 * This method will get the information to create an instance of a MarshmallowMonster.
	 */
	private void makeUserMonster()
	{
		//Step One: Get variables
		String userName; //Declare a String type called userName.
		int userEyes; //Declare an int type called userEyes.
		int userNoseCount;
		double userLegs;
		double userHair;
		boolean userBellyButton;
		
		//Step two: Define variables by using Scanner to get user input.
		System.out.println("Type in your name for your monster.");
		userName = monsterScanner.next();
		System.out.println("Type in the number of eyes for your monster.");
		userEyes = monsterScanner.nextInt();
		System.out.println("Type in the number of noses for this monster");
		userNoseCount = monsterScanner.nextInt();
		System.out.println("How much hair does your monster have?");
		userHair = monsterScanner.nextDouble();
		System.out.println("How many legs?");
		userLegs = monsterScanner.nextDouble();
		System.out.println("Does it have a bellybutton?");
		userBellyButton = monsterScanner.nextBoolean();
		
		//Step three: Make a monster - use the Constructor! Remember that order of parameters matters!
		userMonster = new MarshmallowMonster(userName, userEyes, userNoseCount, userHair, userLegs, userBellyButton);
		
		
	}
}



