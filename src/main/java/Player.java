import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;

public class Player extends AbstractPlayer implements BoardObserver{
    private static final Logger LOGGER = LoggerFactory.getLogger(Player.class);
    private int value=0,turn;
    private String name;
    private List<Card> cardsOnHand;

    public Player(String name,int turn){
        LOGGER.info("{} joined\n",name);
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
        LOGGER.info("{} draws a card\n",this.name);
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

    @Override
    public void showCards() {
        this.getCardsOnHand().forEach(card -> {
            LOGGER.info("{} | {}, value : {}\n",card.getFirstVal(),card.getSecondVal(),card.getTotalVal());
        });
    }

    @Override
    public void callCard() {

    }

    @Override
    public void update(Player player) {

    }
}
