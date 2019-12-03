import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        int j=1;
        boolean pair = false;
        while (!pair){
            List<Card> shuffledCards = CardValueGenerator.shuffleCards();
            for (int i=0;i<3;i++){
                System.out.printf("%d. %d,%d = %d %s; ",j,shuffledCards.get(i).getFirstVal(), shuffledCards.get(i).getSecondVal(), shuffledCards.get(i).getTotalVal(),shuffledCards.get(i).isPair());
            }
            System.out.println("\n");
            pair = shuffledCards.get(0).isPair()&&shuffledCards.get(1).isPair()&&shuffledCards.get(2).isPair();
            j++;
        }
    }
}
