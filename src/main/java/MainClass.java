import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        int j=1;
        List<Card> shuffledCards = CardValueGenerator.shuffleCards();
//        boolean pair = false;
//        while (!pair){
//            List<Card> shuffledCards = CardValueGenerator.shuffleCards();
//            System.out.printf("%d. ",j);
//            for (int i=0;i<3;i++){
//                System.out.printf("%d,%d = %d %s; \t\t",shuffledCards.get(i).getFirstVal(), shuffledCards.get(i).getSecondVal(), shuffledCards.get(i).getTotalVal(),shuffledCards.get(i).isPair());
//            }
//            System.out.println("\n");
//            pair = shuffledCards.get(0).isPair()&&shuffledCards.get(1).isPair()&&shuffledCards.get(2).isPair();
//            j++;
//        }
        List<Player> players = new ArrayList<>();
        for(int i=1;i<=5;i++){
            players.add(new Player("Player "+i,1));
        }
        for(int i=0;i<3;i++){
            for (Player player:players) {
                player.drawCard(shuffledCards.get(0));
                System.out.printf("%d %d %d\n",player.getCardsOnHand().get(i).getFirstVal(),player.getCardsOnHand().get(i).getSecondVal(),shuffledCards.get(0).getTotalVal());
                shuffledCards.remove(0);
            }
        }

        Board board = new Board();
        for (Player player:players) {
            System.out.printf("%s total value is %d\n",player.getName(),player.getHandValue());
        }
        System.out.printf("%s wins!",board.winner(players).getName());
    }
}
