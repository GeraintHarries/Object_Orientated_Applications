import java.io.*;
import java.util.*;

public class Dice implements FactoryInt{
	
	public Dice(){
		
	RandomInterface r=new LinearCongruentialGenerator();
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		
	// Play die game. User wins if at least one of the die rolls is a 1
	  HashSet<Integer> numbersRolled=new HashSet<Integer>();
	
	  for (int i=0; i<2; i++) {
		System.out.println("Hit <RETURN> to roll the die");
		try{
		br.readLine();
	}catch(IOException e){System.out.println(e);}
		
		int dieRoll = DiceRoller.RollDice();
		
		//int dieRoll=(int)(r.next() * 6) + 1;
	
		System.out.println("You rolled " + dieRoll);
		numbersRolled.add(new Integer(dieRoll));
	  }
	
	  // Display the numbers rolled
	  System.out.println("Numbers rolled: " + numbersRolled);
	
	  // Now see if (s)he has won!
	  if (numbersRolled.contains(new Integer(1))) {
		System.out.println("You won!");
	  }else {System.out.println("You lost!");}
	}
}
