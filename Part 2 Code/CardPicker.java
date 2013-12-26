public class CardPicker{
	
	public static int PickCard(){
		// Simply picks card by generating random number
		RandomInterface r=new LinearCongruentialGenerator();	
		int cardChoice=(int) (r.next() * cardList.size());
		
		return cardChoice;
		
	}
	
}