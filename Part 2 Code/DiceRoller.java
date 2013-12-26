public class DiceRoller{

	public static int RollDice(){
		// Simply rolls dice by geberating random number
		RandomInterface r=new LinearCongruentialGenerator();	
		int dieRoll=(int)(r.next() * 6) + 1;

		return dieRoll;

	}

}