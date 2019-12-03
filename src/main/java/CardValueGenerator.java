import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CardValueGenerator {
    public static List<Card> generateDeck(){
        List<Card> cardDeck = new ArrayList<>();
        int i = 0;
        int k = 0;
        cardDeck.add(new Card(0, 0));

        for (i = 1; i <= 6; i++)
        {
            for (k = 0; k <= 6; k++)
            {
                Card card = null;
                for (Card d : cardDeck)
                {
                    if (d.getFirstVal() == i && d.getSecondVal() == k || d.getFirstVal() == k && d.getSecondVal() == i)
                    {
                        card = d;
                    }
                }

                if (card == null)
                {
                    cardDeck.add(new Card(i, k));
                }
            }
        }
        return cardDeck;
    }

    public static List<Card> shuffleCards() {
        List<Card> shuffledCard = generateDeck();
        Collections.shuffle(shuffledCard);
        return shuffledCard;
    }
}