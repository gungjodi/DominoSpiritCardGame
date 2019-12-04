import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        Board board = new Board();
        List<Card> shuffledCards = CardValueGenerator.shuffleCards();
        board.setCardsOnBoard(shuffledCards);
        List<Player> players = new ArrayList<>();
        Dealer dealer = new Dealer("Dealer",0);
//
        for(int i=1;i<=1;i++){
            Player player = new Player("Player "+i,1);
            players.add(player);
            board.addPlayer(player);
        }

        board.playerDrawCard(players.get(0));

    }
}
