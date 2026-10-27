package keyrun;
import java.util.Scanner;
import java.util.Random;

public class App {
    public static void main(String[] args) {
    	Scanner input = new Scanner(System.in);
    	Random rndm = new Random();
        String[] WORDS = {"Apple","River","Ocean","Shadow","Mountain","Breeze","Clock","Mirror","Planet","Forest","Castle","Candle","Thunder","Orbit","Whisper","Galaxy","Rocket","Canvas","Phoenix","Valley","Sunset","Compass","Velvet","Meadow","Engine","Diamond","Nomad","Echo","Harbor","Summit","Lantern","Volcano","Feather","Crystal","Lagoon","Falcon","Island","Marble","Oasis","Glacier","Horizon","Beacon","Spark","Blossom","Anchor","Prism","Raven","Nebula","Pebble","Tundra"};
        
        
        System.out.println("WRITE 'EXIT' TO EXIT THE GAME.");
        
        while(true){
        	int WORD_INDEX=rndm.nextInt(WORDS.length);
        	GETWORD(input,WORDS,WORD_INDEX);
        }
        
    }
    
    public static void GETWORD(Scanner input,String[] WORDS, int INDEX) {
    	String WORD = WORDS[INDEX];
    	
    	System.out.print("\n\nWord: "+WORD+"\n:");
    	String wordInp = input.nextLine();
    	
    	if(wordInp.equals("EXIT") || wordInp.equals("EXIT")) {
			System.exit(0);
		}
    	
    	while(!wordInp.equals(WORD)||wordInp.equals(WORD.toLowerCase())) {
    		
    		if(wordInp.equals("EXIT")||wordInp.equals("EXIT")) {
    			System.exit(0);
    		}
    		
    		System.out.print("\n\n\nINVALID WORD\nWord: "+WORD+"\n:");
        	wordInp = input.nextLine();
        	
        	if(wordInp.equals(WORD)) {
        		break;
        	}else {
        		continue;
        	}
    	}
    
    	System.out.println("Perfect !\n\n");
    }
    
}
