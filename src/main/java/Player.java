import java.util.ArrayList;
import java.util.List;

public class Player extends AbstractPlayer {
    private int value=0,turn;
    private String name;
    private List<Card> cardsOnHand;

    public Player(String name,int turn){
        System.out.printf("%s joined\n",name);
        this.name = name;
        this.turn = turn;
        this.cardsOnHand = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public int getTurn(){
        return this.turn;
    }

    @Override
    public void drawCard(Card card) {
        System.out.printf("%s draws a card\n",this.name);
        this.cardsOnHand.add(card);
        value += card.getTotalVal();
    }

    @Override
    public List<Card> getCardsOnHand() {
        return this.cardsOnHand;
    }

    @Override
    public int getHandValue() {
        return Math.abs(this.value) % 10;
    }
}
