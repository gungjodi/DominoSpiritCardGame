
import java.util.EventListener;
import java.util.List;

public class Dealer extends Player {
    public String name;
    public int turn;
    public Dealer(String name, int turn) {
        super(name, turn);
    }

    public void dealCard(List<Card> cardsOnBoard, Player player, Card card){
        cardsOnBoard.remove(0);
        player.drawCard(card);
    }
}
