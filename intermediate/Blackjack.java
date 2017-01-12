
public class Blackjack {

	public static void main(String[] args) {
		
		Blackjack game1 = new Blackjack();
		System.out.println(game1.returnValue(18,21));
		System.out.println(game1.returnValue(20,18));
		System.out.println(game1.returnValue(22,22));
		
	}
	
	public int returnValue(int card1, int card2){

		int highestCard = 0;
		
		if (card1 <= 21){
			highestCard = card1;		
		}
		
		if (card2 <= 21 && card2 > highestCard){
			highestCard = card2;
		}
				
		return highestCard;
	}

}
