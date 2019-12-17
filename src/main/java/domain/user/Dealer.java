package domain.user;

import domain.card.Card;

import java.util.ArrayList;
import java.util.List;

/**
 * 게임 딜러를 의미하는 객체
 */
public class Dealer {
    private final List<Card> cards = new ArrayList<>();

    public Dealer() {
    }

    public int getNumberOfCards() {
        return cards.size();
    }

    public void addCard(Card card) {
        cards.add(card);
    }

    public void openOneCard() {
        System.out.println("딜러: " + cards.get(0));
    }

    public void showCards() {
        StringBuilder msg = new StringBuilder();
        msg.append("딜러 카드: ");
        for (Card card : cards) {
            msg.append(card + ", ");
        }
        System.out.println(msg.substring(0, msg.length() - 2));
    }

    public int calScore() {
        int score = 0;
        for (Card card : cards) {
            score += card.getScore();
        }
        return score;
    }

    public double doBalancing(double result) {
        double settlement = result;
        System.out.println("딜러: " + settlement);
        return settlement;
    }
}
