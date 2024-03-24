package poker;

import java.util.List;
import java.util.ArrayList;

public class PokerGame {
  public static void main(String[] args){
    Deck deck = new Deck();
    Hand hand = new Hand(deck);
    List<String> yourHand = new ArrayList<String>();
    hand.getHand().forEach(card -> 
      yourHand.add(card.getCard())
    );

    System.out.println("PokerGame: Start");
    System.out.println("YourHand:");
    System.out.println("「" + String.join(",", yourHand) + "」");

    System.out.println("◼︎◼︎◼︎◼︎◼︎" + "Debug" + "◼︎◼︎◼︎◼︎◼︎");
    deck.getDeck().forEach(card -> 
      System.out.println(card.getCard())
    );
    System.out.println("◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎");

  }
}