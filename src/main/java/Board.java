import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Board {
    public Player winner(List<Player> playerList){
        playerList.sort(Comparator.comparingInt(Player::getHandValue));
        return playerList.get(playerList.size()-1);
    }
}
