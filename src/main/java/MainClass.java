import java.util.ArrayList;
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

        Player player1 = new Player("Player 1",1);
        Player player2 = new Player("Player 2",2);
        for(int i=0;i<3;i++){
            player1.drawCard(shuffledCards.get(0));
            System.out.printf("%d %d %d\n",player1.getCardsOnHand().get(i).getFirstVal(),player1.getCardsOnHand().get(i).getSecondVal(),shuffledCards.get(0).getTotalVal());
            shuffledCards.remove(0);
            player2.drawCard(shuffledCards.get(0));
            System.out.printf("%d %d %d\n",player2.getCardsOnHand().get(i).getFirstVal(),player2.getCardsOnHand().get(i).getSecondVal(),shuffledCards.get(0).getTotalVal());
            shuffledCards.remove(0);
        }
        if(player1.getHandValue()<player2.getHandValue()){
            System.out.printf("%s win!\n",player2.getName());
        }
        else if(player1.getHandValue()>player2.getHandValue()){
            System.out.printf("%s win!\n",player1.getName());
        }
        else {
            System.out.print("Draw!\n");
        }
    }
}
