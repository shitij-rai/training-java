package com.techment.OopsAssignment;

interface Rewardable{
	
	int giveRewardPoints(int amount);
}

abstract class PrepaidCard{
	int cardNo;
	double availableBalance , swipeLimit;
	
	public PrepaidCard(int cardNo, double availableBalance, double swipeLimit) {
		super();
		this.cardNo = cardNo;
		this.availableBalance = availableBalance;
		this.swipeLimit = swipeLimit;
	}

	abstract boolean swipeCard(int amount);
	
	void rechargeCard(int amount) {
		System.out.println("--- CARD RECHARGED ---");
		availableBalance += amount*60;
	}
}

class TravelCard extends PrepaidCard implements Rewardable{
	
	int rewardPoints;
	
	public TravelCard(int cardNo, double availableBalance, double swipeLimit) {
		super(cardNo, availableBalance, swipeLimit);
	}

	boolean swipeCard(int amount) {
		
		if(amount<=availableBalance && amount<=swipeLimit) {
			availableBalance -= (amount*60 + (float)(amount*60)/20);
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "TravelCard [cardNo = " + cardNo + ", availableBalance = " + availableBalance + ", swipeLimit = " + swipeLimit + "]";
	}

	@Override
	public int giveRewardPoints(int amount) {
		
		rewardPoints += 5*((amount*60)/100);
		return rewardPoints;
	}
	
}

public class Question3 {

	public static void main(String[] args) {

		PrepaidCard card = new TravelCard(465798, 100000, 50000);
		Rewardable reward = new TravelCard(465798, 100000, 50000);
		
		System.out.println(card.toString());
		
		card.rechargeCard(50);
		System.out.println(card.toString());
		
		if(card.swipeCard(50))
			System.out.println("--- CARD SWIPED ---");
			System.out.println(card.toString());
			System.out.println("Reward points awarded :" + reward.giveRewardPoints(50));
		
		}

}
