package com.bridgelabz.snake_and_ladder;

public class Snake_and_ladder {

	public static void main(String[] args)  {
		int Position = 0;
		System.out.println("Welcome into Snake and Ladder program !!");
		System.out.println("Your Starting Position is : " + Position);
		Dice();
	}
	public static void Dice(){
		int Dice = (int)Math.floor(Math.random()*10)%6+1;
		System.out.println("Your Dice Value is : " +Dice);
	}

}
		


