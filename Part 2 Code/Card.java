import java.io.*;
import java.util.*;

public class Card implements FactoryInt{
	
	public  Card(){
		
	RandomInterface r=new LinearCongruentialGenerator();	
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

		// Play card game
		// Create a list of cards
	String cards[]={"AHrts", "2Hrts", "3Hrts", "4Hrts", "5Hrts", "6Hrts",
					"7Hrts", "8Hrts", "9Hrts", "10Hrts", "JHrts",
					"QHrts", "KHrts",
					"ADmnds", "2Dmnds", "3Dmnds", "4Dmnds", "5Dmnds",
					"6Dmnds", "7Dmnds", "8Dmnds", "9Dmnds", "10Dmnds",
					"JDmnds", "QDmnds", "KDmnds",
					"ASpds", "2Spds", "3Spds", "4Spds", "5Spds", "6Spds",
					"7Spds", "8Spds", "9Spds", "10Spds", "JSpds",
					"QSpds", "KSpds",
					"AClbs", "2Clbs", "3Clbs", "4Clbs", "5Clbs", "6Clbs",
					"7Clbs", "8Clbs", "9Clbs", "10Clbs", "JClbs",
					"QClbs", "KClbs"};
	ArrayList<String> cardList=new ArrayList<String> (Arrays.asList(cards));
	// Taking advantage of "generics" to tell the compiler all the elements will be Strings
	
	// Shuffle them
	for (int i=0; i<100; i++) {
	  // choose two random cards at random and swap them, 100 times
	  int firstIndex=((int) (r.next() * 52));
	  int secondIndex=((int) (r.next() * 52));
	
	  String temp=(String) cardList.get(firstIndex);
	  cardList.set(firstIndex, cardList.get(secondIndex));
	  cardList.set(secondIndex, temp); 
	}
	
	// Print out the result
	System.out.println(cardList);
	
	// The game: let user select two cards from the pack;
	// User wins if one of them is an Ace. 
	
	HashSet<String> cardsChosen=new HashSet<String>();
	
	for (int i=0; i<2; i++) {
	  System.out.println("Hit <RETURN> to choose a card");
	  try{
	  br.readLine();
  }catch(IOException e){System.out.println(e);}
	
	int cardChoice = CardPicker.PickCard();
	
	 // int cardChoice=(int) (r.next() * cardList.size());
	  System.out.println("You chose " + cardList.get(cardChoice));
	  cardsChosen.add(cardList.remove(cardChoice));
	}
	
	// Display the cards chosen and remaining cards
	System.out.println("Cards chosen: " + cardsChosen);
	System.out.println("Remaining cards: " + cardList);
	
	// Now see if (s)he has won!
	if (cardsChosen.contains("AHrts") || cardsChosen.contains("ADmnds") ||
		cardsChosen.contains("ASpds") || cardsChosen.contains("AClbs")) {
	  System.out.println("You won!");
	}
	else System.out.println("You lost!");	
}
}