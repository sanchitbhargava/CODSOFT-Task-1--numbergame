import java.util.Scanner;
public class number {

	


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int chances=7;
		int finals= 0;
	  boolean playAgain=true;
		System.out.println("welcome");
		System.out.println("hey your chances is about"+chances+"to win the game");
		while(playAgain) {
			int rand=getrandN(1,100);
			boolean guess= false;
			for(int i=0; i<chances; i++) {
				System.out.println("chance"+(i+1)+ "Enter your guess:");
				int user = sc.nextInt();
				if(user==rand ) {
					guess = true;
					finals+=1;
					System.out.println("you won");
					break;
				}
				else if (user>rand) {
					System.out.println("Too High");
				}
				else {
					System.out.println("Too Low");
				}
			}
			if(guess==false){
			    System.out.println("sorry you lost your chances. The number is "+rand );
			}
			System.out.println("do you want to play again(y/n)");
			String pA=sc.next();
			playAgain=pA.equalsIgnoreCase("y");
		}
		System.out.println("thanks to play ,hope you enjoy the game");
		System.out.println("here is your score" +finals);
    }
		public static int getrandN(int min, int max){
		    return(int)(Math.random()*(max-min+1)+min);
		    
		}
}

