import java.io.*;
import java.util.*;

public class Game {

  public static void main(String[] args) throws Exception {
            start();
    }
    public static void start(){
      BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
      
        // The random number generator used throughout
        RandomInterface r=new LinearCongruentialGenerator();
      
        // Ask whether to play a card game or a die game
      
       System.out.print("Card (c) or Die (d) game? ");
       
       String ans = "";
       
       try{
       ans=br.readLine();
      }catch(IOException e){System.out.println(e);}
        Factory.createInstance(ans);
      
    }
}

