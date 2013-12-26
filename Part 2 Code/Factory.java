public class Factory implements FactoryInt{
	
	public static FactoryInt createInstance(String id){	
		
		// Creates an object dependent on input
		if(id.equals("c")){
			return new Card();
		}else if(id.equals("d")){
			return new Dice();
		}else{
			System.out.println("Input not understood");
			return null;
		}	
	}
}