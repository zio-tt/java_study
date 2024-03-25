package poker;

import java.util.List;
import java.awt.*;

import poker.sub.Deck;
import poker.sub.Hand;

import java.util.ArrayList;

public class PokerGame extends Frame {
  private static String textField;
  private static Deck deck;
  private static Hand hand;
  private static List<String> yourHand;
  private static PokerGame pokerGame;

  public static void main(String[] args){
    // サブクラスの初期化
    initSubClass();
    drawInitHand();
    gameStart();

    // PokerGameのインスタンス作成と画面表示
    pokerGame = new PokerGame();
  }

  PokerGame() {
    super("PokerGame");
    setSize(400, 300);
    setLocationRelativeTo(null);

    // フローレイアウト（左上から流し込む）で表示
    setLayout(new FlowLayout());

    // ラベル（ゲームスタートの表示）
    setVisible(true);
  }

  /*
    System.out.println("PokerGame: Start");
    System.out.println("YourHand:");
    yourHand.forEach(card -> 
      System.out.print("[" + card + "] ")
    );
    System.out.println("");

    System.out.println("◼︎◼︎◼︎◼︎◼︎" + "Debug" + "◼︎◼︎◼︎◼︎◼︎");
    deck.getDeck().forEach(card -> 
      System.out.println(card.getCard())
    );
    System.out.println("◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎◼︎");
   */

  private static void initSubClass() {
    deck = new Deck();
    hand = new Hand(deck);
    yourHand = new ArrayList<String>();
  }

  private static void drawInitHand() {
    hand.getHand().forEach(card -> 
      yourHand.add(card.getCard())
    );
  }

  public static void gameStart() {
    // ゲーム開始宣言
    Label label = new Label(textField);
    add(label);
  }
}