import java.util.Scanner;

public class JonBot {
	public static void main(String[] args) {
		
        System.out.println("Hey Beautiful! This is the bubba bot!");
        talkToJon();
    }

    public static boolean talkToJon() {
    	
        boolean keepTalking = true;

        Scanner sc = new Scanner(System.in);
        
        System.out.println("As Jon walks in with his head held high looks at you and says 'Hey beautiful!'");
        
        System.out.println("How's your day?!");
        
        String hannahInput = sc.nextLine();
        
        if (hannahInput.endsWith("?")) {
        		System.out.println("Fuck Yeah!");
        } else {
        		System.out.println("I dont understand that question babe.");
        }
        
        System.out.println("Anything else babe? [yes/no]");
        
        String stillTalking = sc.nextLine();
        
        for (int i = 0; i < stillTalking.length(); i++) {
        		if (hannahInput.equalsIgnoreCase("yes")) {
        			return true;
        		} else if(hannahInput.equalsIgnoreCase("no")) {
        			return false;
        		}
        }
        return talkToJon();
    }
}
