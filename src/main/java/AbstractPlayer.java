import java.util.List;

public abstract class AbstractPlayer {
    public abstract void drawCard(Card card);
    public abstract List<Card> getCardsOnHand();
    public abstract int getHandValue();
}
